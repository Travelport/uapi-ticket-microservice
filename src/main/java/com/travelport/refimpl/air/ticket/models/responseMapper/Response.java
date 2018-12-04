
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
    "TicketIdResponse"
})
public class Response {

    @JsonProperty("TicketIdResponse")
    private TicketIdResponse ticketIdResponse;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Response() {
    }

    /**
     * 
     * @param ticketIdResponse
     */
    public Response(TicketIdResponse ticketIdResponse) {
        super();
        this.ticketIdResponse = ticketIdResponse;
    }

    @JsonProperty("TicketIdResponse")
    public TicketIdResponse getTicketIdResponse() {
        return ticketIdResponse;
    }

    @JsonProperty("TicketIdResponse")
    public void setTicketIdResponse(TicketIdResponse ticketIdResponse) {
        this.ticketIdResponse = ticketIdResponse;
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
