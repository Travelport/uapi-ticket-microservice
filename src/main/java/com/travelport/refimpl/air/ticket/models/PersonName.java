
package com.travelport.refimpl.air.ticket.models;

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
    "@type",
    "Prefix",
    "Given",
    "Middle",
    "Surname"
})
public class PersonName {

    @JsonProperty("@type")
    private String type;
    @JsonProperty("Prefix")
    private String prefix;
    @JsonProperty("Given")
    private String given;
    @JsonProperty("Middle")
    private String middle;
    @JsonProperty("Surname")
    private String surname;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public PersonName() {
    }

    /**
     * 
     * @param given
     * @param prefix
     * @param surname
     * @param type
     * @param middle
     */
    public PersonName(String type, String prefix, String given, String middle, String surname) {
        super();
        this.type = type;
        this.prefix = prefix;
        this.given = given;
        this.middle = middle;
        this.surname = surname;
    }

    @JsonProperty("@type")
    public String getType() {
        return type;
    }

    @JsonProperty("@type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("Prefix")
    public String getPrefix() {
        return prefix;
    }

    @JsonProperty("Prefix")
    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    @JsonProperty("Given")
    public String getGiven() {
        return given;
    }

    @JsonProperty("Given")
    public void setGiven(String given) {
        this.given = given;
    }

    @JsonProperty("Middle")
    public String getMiddle() {
        return middle;
    }

    @JsonProperty("Middle")
    public void setMiddle(String middle) {
        this.middle = middle;
    }

    @JsonProperty("Surname")
    public String getSurname() {
        return surname;
    }

    @JsonProperty("Surname")
    public void setSurname(String surname) {
        this.surname = surname;
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
