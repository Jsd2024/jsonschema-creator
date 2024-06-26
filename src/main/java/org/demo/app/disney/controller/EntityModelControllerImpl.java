package org.demo.app.disney.controller;

import org.demo.app.disney.service.EntityModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class EntityModelControllerImpl implements EntityModelController{
    @Autowired
    EntityModelService entityModelService;

    @Override
    @RequestMapping(value = "/jsonSchemaList",produces={"application/json; charset=UTF-8"})
    public List<Map<String, String>> populateJsonSchemaListFromEntityModels() {
        List<Map<String, String>> jsonSchemaList = entityModelService.publishJsonSchemaList();
//
//        List<Map<String, String>> jsonSchemaList = new ArrayList<>();
////        Map<String, String> map = new HashMap<>();
////        String sch = "{\r\n  \"$schema\" : \"https://json-schema.org/draft/2020-12/schema\",\r\n  \"type\" : \"object\",\r\n  \"properties\" : {\r\n    \"ageCode\" : {\r\n      \"type\" : \"string\"\r\n    },\r\n    \"ageName\" : {\r\n      \"type\" : \"string\"\r\n    },\r\n    \"ageType\" : {\r\n      \"type\" : \"string\"\r\n    },\r\n    \"ageTypeDescription\" : {\r\n      \"type\" : \"string\"\r\n    },\r\n    \"maxAge\" : {\r\n      \"type\" : \"string\"\r\n    },\r\n    \"minAge\" : {\r\n      \"type\" : \"string\"\r\n    }\r\n  },\r\n  \"required\" : [ \"ageCode\", \"ageName\", \"ageType\", \"ageTypeDescription\", \"maxAge\", \"minAge\" ]\r\n}";
////        String sch1= sch.replaceAll("[\\n\\r]", "");
////        String sch2= sch1.replace("\\", "");
////        map.put("Age", sch2.trim());
//
//
////      List<Map<String, JsonNode>> jsonObjectList = new ArrayList<>();
//        Map<String, String> map = new HashMap<>();
//        String sch = "{\r\n  \"$schema\" : \"https://json-schema.org/draft/2020-12/schema\",\r\n  \"type\" : \"object\",\r\n  \"properties\" : {\r\n    \"ageCode\" : {\r\n      \"type\" : \"string\"\r\n    },\r\n    \"ageName\" : {\r\n      \"type\" : \"string\"\r\n    },\r\n    \"ageType\" : {\r\n      \"type\" : \"string\"\r\n    },\r\n    \"ageTypeDescription\" : {\r\n      \"type\" : \"string\"\r\n    },\r\n    \"maxAge\" : {\r\n      \"type\" : \"string\"\r\n    },\r\n    \"minAge\" : {\r\n      \"type\" : \"string\"\r\n    }\r\n  },\r\n  \"required\" : [ \"ageCode\", \"ageName\", \"ageType\", \"ageTypeDescription\", \"maxAge\", \"minAge\" ]\r\n}";
//        String sch1= sch.replaceAll("[\\n\\r]", "");
//        String sch2= sch1.replace("\\", "");
//        String sch3= StringEscapeUtils.unescapeJson(sch2);
//
//
//        JsonObject jsonObject = new JsonObject(sch3);
//        map.put("Age", jsonObject.getJson().toString().replace("\\", ""));
//
//
//        List<Map<String, String> > jsonSchemamapList = new ArrayList<>();
//        jsonSchemamapList.add(map);
//
//        return map;

        return jsonSchemaList;
    }


}
