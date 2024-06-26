package org.demo.app.disney.service;

import com.fasterxml.jackson.databind.*;
import com.github.victools.jsonschema.generator.*;
import lombok.extern.slf4j.Slf4j;
import org.demo.app.disney.model.*;
import org.springframework.stereotype.Service;

import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.time.Instant;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

@Slf4j
@Service
public class EntityModelServiceImpl implements EntityModelService {

    /**
     * @return
     */

    @org.jetbrains.annotations.NotNull
    private static SchemaGenerator getSchemaGenerator() {
        SchemaGeneratorConfigBuilder configBuilder = new SchemaGeneratorConfigBuilder(SchemaVersion.DRAFT_2020_12, OptionPreset.PLAIN_JSON);

        configBuilder.forFields().withRequiredCheck(field -> field.getAnnotationConsideringFieldAndGetter(Nullable.class) == null).withArrayUniqueItemsResolver(scope -> scope.getType().getErasedType() == (List.class) ? true : null);

        configBuilder.forMethods().withRequiredCheck(method -> method.getAnnotationConsideringFieldAndGetter(NotNull.class) != null);

        configBuilder.forTypesInGeneral()
                .withArrayUniqueItemsResolver(scope -> scope.getType().getErasedType() == (List.class) ? true : null)
                .withDefaultResolver(scope -> scope.getType().getErasedType() == List.class ? Collections.EMPTY_LIST : null)
                .withDefaultResolver(scope -> scope.getType().getErasedType() == Date.class ? Date.from(Instant.now()) : null)
                .withEnumResolver(scope -> scope.getType().getErasedType().isEnum() ? Stream.of(scope.getType().getErasedType().getEnumConstants()).map(v -> ((Enum<?>) v).name()).collect(toList()) : null);

        SchemaGeneratorConfig config = configBuilder.with(Option.EXTRA_OPEN_API_FORMAT_VALUES).build();

        SchemaGenerator generator = new SchemaGenerator(config);
        return generator;
    }




    @Override
    public List<Map<String, String>> publishJsonSchemaList() {
        List<Class> classList = new LinkedList<>(invokeAllEntityModels("org.demo.app.disney.model"));
        ObjectMapper mapper = new ObjectMapper();

        List<Map<String, String>> jsonSchemaList = classList.stream()
                .map(clazz -> {
                    SchemaGenerator generator = getSchemaGenerator();
                    JsonNode jsonSchemaInd = generator.generateSchema(clazz);
                    Map<String, String> mapJsonSchema = new HashMap<>();

//                    String one = jsonSchemaInd.toPrettyString();
//                    String two = one.replaceAll("[\\r\\n]","");
//                    String three = two.replace("\\","");
                    mapJsonSchema.put(
                            clazz.getSimpleName(),
                            jsonSchemaInd.toPrettyString());
                    return mapJsonSchema;
                })
                .toList();




        return jsonSchemaList;
    }



    private Set<Class> invokeAllEntityModels(String packageName) {
        Set<Class> classList = new TreeSet<>();
        //List.of(Affiliation.class, ChannelMap.class, ClientConfigData.class, CommissionGroup.class, Dine.class, DiscountGroup.class, DPE.class, MagicalExtras.class, MarketingOffer.class, Miscellaneous.class, ModificationRule.class, PAT.class, Product.class, Room.class, Show.class, TaxScheme.class, Ticket.class);
        InputStream stream = ClassLoader.getSystemClassLoader()
                .getResourceAsStream(packageName.replaceAll("[.]", "/"));
        BufferedReader reader = new BufferedReader(new InputStreamReader(stream));
        classList = reader.lines()
                .filter(line -> line.endsWith(".class"))
                .map(line -> getClass(line, packageName))
                .filter(Objects::nonNull)
                .collect(Collectors.toSet());


        return (classList);
    }

    private Class getClass(String className, String packageName) {
        try {
            Class classNameGenerated = null;
            if (!(className.contains("$") || className.contains("Builder"))) {
                classNameGenerated = Class.forName(packageName + "."
                        + className.substring(0, className.lastIndexOf('.')));
            }
            return classNameGenerated;
        } catch (ClassNotFoundException e) {
            log.info("Exception in Class Not Found: " + e.getException());
        }
        return null;
    }
}
