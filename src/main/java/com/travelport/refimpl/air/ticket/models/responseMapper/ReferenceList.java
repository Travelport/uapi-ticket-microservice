
package com.travelport.refimpl.air.ticket.models.responseMapper;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "@type",
    "id",
    "TextBlock"
})
public class ReferenceList {

    @JsonProperty("@type")
    private String type;
    @JsonProperty("id")
    private String id;
    @JsonProperty("TextBlock")
    private List<TextBlock> textBlock = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public ReferenceList() {
    }

    /**
     * 
     * @param id
     * @param textBlock
     * @param type
     */
    public ReferenceList(String type, String id, List<TextBlock> textBlock) {
        super();
        this.type = type;
        this.id = id;
        this.textBlock = textBlock;
    }

    @JsonProperty("@type")
    public String getType() {
        return type;
    }

    @JsonProperty("@type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("TextBlock")
    public List<TextBlock> getTextBlock() {
        return textBlock;
    }

    @JsonProperty("TextBlock")
    public void setTextBlock(List<TextBlock> textBlock) {
        this.textBlock = textBlock;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
