
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
    "TicketSummary"
})
public class Request {

    @JsonProperty("TicketSummary")
    private TicketSummary ticketSummary;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Request() {
    }

    /**
     * 
     * @param ticketSummary
     */
    public Request(TicketSummary ticketSummary) {
        super();
        this.ticketSummary = ticketSummary;
    }

    @JsonProperty("TicketSummary")
    public TicketSummary getTicketSummary() {
        return ticketSummary;
    }

    @JsonProperty("TicketSummary")
    public void setTicketSummary(TicketSummary ticketSummary) {
        this.ticketSummary = ticketSummary;
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
