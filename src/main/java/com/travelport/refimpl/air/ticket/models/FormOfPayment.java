
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
    "id",
    "FormOfPaymentRef",
    "Identifier"
})
public class FormOfPayment {

    @JsonProperty("@type")
    private String type;
    @JsonProperty("id")
    private String id;
    @JsonProperty("FormOfPaymentRef")
    private String formOfPaymentRef;
    @JsonProperty("Identifier")
    private Identifier identifier;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public FormOfPayment() {
    }

    /**
     * 
     * @param id
     * @param formOfPaymentRef
     * @param type
     * @param identifier
     */
    public FormOfPayment(String type, String id, String formOfPaymentRef, Identifier identifier) {
        super();
        this.type = type;
        this.id = id;
        this.formOfPaymentRef = formOfPaymentRef;
        this.identifier = identifier;
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

    @JsonProperty("FormOfPaymentRef")
    public String getFormOfPaymentRef() {
        return formOfPaymentRef;
    }

    @JsonProperty("FormOfPaymentRef")
    public void setFormOfPaymentRef(String formOfPaymentRef) {
        this.formOfPaymentRef = formOfPaymentRef;
    }

    @JsonProperty("Identifier")
    public Identifier getIdentifier() {
        return identifier;
    }

    @JsonProperty("Identifier")
    public void setIdentifier(Identifier identifier) {
        this.identifier = identifier;
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
