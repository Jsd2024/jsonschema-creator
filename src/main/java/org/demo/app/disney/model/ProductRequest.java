package org.demo.app.disney.model;

import java.sql.Timestamp;
import java.util.List;

public class ProductRequest {
    private List<String> productCodes;
    private List<String> productTemplateCodes;
    private String productSetCode;
    private List<String> clients;
    private List<String> attributeWithValue;
    private List<String> clientAttributeValues;

    private String clientAttributeName;
    private String statusCode;
    private String classificationCode;
    private Timestamp salesStart;
    private Timestamp salesEnd;

    private Timestamp usageStart;
    private Timestamp usageEnd;
    private Timestamp createdFrom;
    private Timestamp createdTo;
    private Timestamp modifiedFrom;
    private Timestamp modifiedTo;
    private boolean hasChannelMap;
    private List<String> channelMapCodes;


}
