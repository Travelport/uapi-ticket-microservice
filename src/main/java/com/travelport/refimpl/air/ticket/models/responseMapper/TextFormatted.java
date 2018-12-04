
package com.travelport.refimpl.air.ticket.models.responseMapper;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "value",
    "language",
    "textFormat"
})
public class TextFormatted {

    @JsonProperty("value")
    private String value;
    @JsonProperty("language")
    private String language;
    @JsonProperty("textFormat")
    private String textFormat;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public TextFormatted() {
    }

    /**
     * 
     * @param textFormat
     * @param value
     * @param language
     */
    public TextFormatted(String value, String language, String textFormat) {
        super();
        this.value = value;
        this.language = language;
        this.textFormat = textFormat;
    }

    @JsonProperty("value")
    public String getValue() {
        return value;
    }

    @JsonProperty("value")
    public void setValue(String value) {
        this.value = value;
    }

    @JsonProperty("language")
    public String getLanguage() {
        return language;
    }

    @JsonProperty("language")
    public void setLanguage(String language) {
        this.language = language;
    }

    @JsonProperty("textFormat")
    public String getTextFormat() {
        return textFormat;
    }

    @JsonProperty("textFormat")
    public void setTextFormat(String textFormat) {
        this.textFormat = textFormat;
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
