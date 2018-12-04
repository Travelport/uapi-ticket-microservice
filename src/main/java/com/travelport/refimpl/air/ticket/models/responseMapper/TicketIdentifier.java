
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
    "objID",
    "TicketRef",
    "Identifier"
})
public class TicketIdentifier {

    @JsonProperty("objID")
    private String objID;
    @JsonProperty("TicketRef")
    private String ticketRef;
    @JsonProperty("Identifier")
    private Identifier identifier;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public TicketIdentifier() {
    }

    /**
     * 
     * @param objID
     * @param identifier
     * @param ticketRef
     */
    public TicketIdentifier(String objID, String ticketRef, Identifier identifier) {
        super();
        this.objID = objID;
        this.ticketRef = ticketRef;
        this.identifier = identifier;
    }

    @JsonProperty("objID")
    public String getObjID() {
        return objID;
    }

    @JsonProperty("objID")
    public void setObjID(String objID) {
        this.objID = objID;
    }

    @JsonProperty("TicketRef")
    public String getTicketRef() {
        return ticketRef;
    }

    @JsonProperty("TicketRef")
    public void setTicketRef(String ticketRef) {
        this.ticketRef = ticketRef;
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
