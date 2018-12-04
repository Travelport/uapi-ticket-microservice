
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
    "value",
    "duration",
    "equipment"
})
public class IntermediateStop {

    @JsonProperty("value")
    private String value;
    @JsonProperty("duration")
    private String duration;
    @JsonProperty("equipment")
    private String equipment;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public IntermediateStop() {
    }

    /**
     * 
     * @param duration
     * @param value
     * @param equipment
     */
    public IntermediateStop(String value, String duration, String equipment) {
        super();
        this.value = value;
        this.duration = duration;
        this.equipment = equipment;
    }

    @JsonProperty("value")
    public String getValue() {
        return value;
    }

    @JsonProperty("value")
    public void setValue(String value) {
        this.value = value;
    }

    @JsonProperty("duration")
    public String getDuration() {
        return duration;
    }

    @JsonProperty("duration")
    public void setDuration(String duration) {
        this.duration = duration;
    }

    @JsonProperty("equipment")
    public String getEquipment() {
        return equipment;
    }

    @JsonProperty("equipment")
    public void setEquipment(String equipment) {
        this.equipment = equipment;
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
