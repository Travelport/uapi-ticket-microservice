
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
    "supplierCode",
    "supplierName"
})
public class ReservationLocator {

    @JsonProperty("value")
    private String value;
    @JsonProperty("supplierCode")
    private String supplierCode;
    @JsonProperty("supplierName")
    private String supplierName;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public ReservationLocator() {
    }

    /**
     * 
     * @param supplierName
     * @param value
     * @param supplierCode
     */
    public ReservationLocator(String value, String supplierCode, String supplierName) {
        super();
        this.value = value;
        this.supplierCode = supplierCode;
        this.supplierName = supplierName;
    }

    @JsonProperty("value")
    public String getValue() {
        return value;
    }

    @JsonProperty("value")
    public void setValue(String value) {
        this.value = value;
    }

    @JsonProperty("supplierCode")
    public String getSupplierCode() {
        return supplierCode;
    }

    @JsonProperty("supplierCode")
    public void setSupplierCode(String supplierCode) {
        this.supplierCode = supplierCode;
    }

    @JsonProperty("supplierName")
    public String getSupplierName() {
        return supplierName;
    }

    @JsonProperty("supplierName")
    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
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
