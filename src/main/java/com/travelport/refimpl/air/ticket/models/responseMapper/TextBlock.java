
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
    "title",
    "id",
    "TextFormatted"
})
public class TextBlock {

    @JsonProperty("@type")
    private String type;
    @JsonProperty("title")
    private String title;
    @JsonProperty("id")
    private String id;
    @JsonProperty("TextFormatted")
    private List<TextFormatted> textFormatted = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public TextBlock() {
    }

    /**
     * 
     * @param id
     * @param title
     * @param textFormatted
     * @param type
     */
    public TextBlock(String type, String title, String id, List<TextFormatted> textFormatted) {
        super();
        this.type = type;
        this.title = title;
        this.id = id;
        this.textFormatted = textFormatted;
    }

    @JsonProperty("@type")
    public String getType() {
        return type;
    }

    @JsonProperty("@type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("TextFormatted")
    public List<TextFormatted> getTextFormatted() {
        return textFormatted;
    }

    @JsonProperty("TextFormatted")
    public void setTextFormatted(List<TextFormatted> textFormatted) {
        this.textFormatted = textFormatted;
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
