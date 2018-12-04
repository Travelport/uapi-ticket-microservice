
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
    "TicketIdentifier",
    "transactionId",
    "traceId",
    "Result",
    "Identifier",
    "NextSteps",
    "ReferenceList",
    "SettlementAuthorizationCode"
})
public class TicketIdResponse {

    @JsonProperty("TicketIdentifier")
    private TicketIdentifier ticketIdentifier;
    @JsonProperty("transactionId")
    private String transactionId;
    @JsonProperty("traceId")
    private String traceId;
    @JsonProperty("Result")
    private List<Result> result;
    @JsonProperty("Identifier")
    private Identifier identifier;
    @JsonProperty("NextSteps")
    private NextSteps nextSteps;
    @JsonProperty("ReferenceList")
    private List<ReferenceList> referenceList = null;
    @JsonProperty("SettlementAuthorizationCode")
    private String settlementAuthorizationCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public TicketIdResponse() {
    }

    /**
     * 
     * @param result
     * @param transactionId
     * @param ticketIdentifier
     * @param referenceList
     * @param traceId
     * @param identifier
     * @param nextSteps
     * @param settlementAuthorizationCode
     */
    public TicketIdResponse(TicketIdentifier ticketIdentifier, String transactionId, String traceId, List<Result> result, Identifier identifier, NextSteps nextSteps, List<ReferenceList> referenceList, String settlementAuthorizationCode) {
        super();
        this.ticketIdentifier = ticketIdentifier;
        this.transactionId = transactionId;
        this.traceId = traceId;
        this.result = result;
        this.identifier = identifier;
        this.nextSteps = nextSteps;
        this.referenceList = referenceList;
        this.settlementAuthorizationCode = settlementAuthorizationCode;
    }

    @JsonProperty("TicketIdentifier")
    public TicketIdentifier getTicketIdentifier() {
        return ticketIdentifier;
    }

    @JsonProperty("TicketIdentifier")
    public void setTicketIdentifier(TicketIdentifier ticketIdentifier) {
        this.ticketIdentifier = ticketIdentifier;
    }

    @JsonProperty("transactionId")
    public String getTransactionId() {
        return transactionId;
    }

    @JsonProperty("transactionId")
    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    @JsonProperty("traceId")
    public String getTraceId() {
        return traceId;
    }

    @JsonProperty("traceId")
    public void setTraceId(String traceId) {
        this.traceId = traceId;
    }

    @JsonProperty("Result")
    public List<Result> getResult() {
        return result;
    }

    @JsonProperty("Result")
    public void setResult(List<Result> result) {
        this.result = result;
    }

    @JsonProperty("Identifier")
    public Identifier getIdentifier() {
        return identifier;
    }

    @JsonProperty("Identifier")
    public void setIdentifier(Identifier identifier) {
        this.identifier = identifier;
    }

    @JsonProperty("NextSteps")
    public NextSteps getNextSteps() {
        return nextSteps;
    }

    @JsonProperty("NextSteps")
    public void setNextSteps(NextSteps nextSteps) {
        this.nextSteps = nextSteps;
    }

    @JsonProperty("ReferenceList")
    public List<ReferenceList> getReferenceList() {
        return referenceList;
    }

    @JsonProperty("ReferenceList")
    public void setReferenceList(List<ReferenceList> referenceList) {
        this.referenceList = referenceList;
    }

    @JsonProperty("SettlementAuthorizationCode")
    public String getSettlementAuthorizationCode() {
        return settlementAuthorizationCode;
    }

    @JsonProperty("SettlementAuthorizationCode")
    public void setSettlementAuthorizationCode(String settlementAuthorizationCode) {
        this.settlementAuthorizationCode = settlementAuthorizationCode;
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
