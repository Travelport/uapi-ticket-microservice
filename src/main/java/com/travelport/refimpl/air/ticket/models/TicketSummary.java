
package com.travelport.refimpl.air.ticket.models;

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
    "objID",
    "TicketRef",
    "status",
    "numberOfTicketsIssued",
    "Identifier",
    "PersonName",
    "ReservationLocator",
    "FormOfPayment",
    "FlightSegment",
    "ValidDateRange",
    "TicketPrice"
})
public class TicketSummary {

    @JsonProperty("objID")
    private String objID;
    @JsonProperty("TicketRef")
    private String ticketRef;
    @JsonProperty("status")
    private String status;
    @JsonProperty("numberOfTicketsIssued")
    private Integer numberOfTicketsIssued;
    @JsonProperty("Identifier")
    private Identifier identifier;
    @JsonProperty("PersonName")
    private PersonName personName;
    @JsonProperty("ReservationLocator")
    private ReservationLocator reservationLocator;
    @JsonProperty("FormOfPayment")
    private List<FormOfPayment> formOfPayment = null;
    @JsonProperty("FlightSegment")
    private List<FlightSegment> flightSegment = null;
    @JsonProperty("ValidDateRange")
    private ValidDateRange validDateRange;
    @JsonProperty("TicketPrice")
    private TicketPrice ticketPrice;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public TicketSummary() {
    }

    /**
     * 
     * @param numberOfTicketsIssued
     * @param status
     * @param ticketPrice
     * @param flightSegment
     * @param validDateRange
     * @param objID
     * @param formOfPayment
     * @param reservationLocator
     * @param identifier
     * @param personName
     * @param ticketRef
     */
    public TicketSummary(String objID, String ticketRef, String status, Integer numberOfTicketsIssued, Identifier identifier, PersonName personName, ReservationLocator reservationLocator, List<FormOfPayment> formOfPayment, List<FlightSegment> flightSegment, ValidDateRange validDateRange, TicketPrice ticketPrice) {
        super();
        this.objID = objID;
        this.ticketRef = ticketRef;
        this.status = status;
        this.numberOfTicketsIssued = numberOfTicketsIssued;
        this.identifier = identifier;
        this.personName = personName;
        this.reservationLocator = reservationLocator;
        this.formOfPayment = formOfPayment;
        this.flightSegment = flightSegment;
        this.validDateRange = validDateRange;
        this.ticketPrice = ticketPrice;
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

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    @JsonProperty("numberOfTicketsIssued")
    public Integer getNumberOfTicketsIssued() {
        return numberOfTicketsIssued;
    }

    @JsonProperty("numberOfTicketsIssued")
    public void setNumberOfTicketsIssued(Integer numberOfTicketsIssued) {
        this.numberOfTicketsIssued = numberOfTicketsIssued;
    }

    @JsonProperty("Identifier")
    public Identifier getIdentifier() {
        return identifier;
    }

    @JsonProperty("Identifier")
    public void setIdentifier(Identifier identifier) {
        this.identifier = identifier;
    }

    @JsonProperty("PersonName")
    public PersonName getPersonName() {
        return personName;
    }

    @JsonProperty("PersonName")
    public void setPersonName(PersonName personName) {
        this.personName = personName;
    }

    @JsonProperty("ReservationLocator")
    public ReservationLocator getReservationLocator() {
        return reservationLocator;
    }

    @JsonProperty("ReservationLocator")
    public void setReservationLocator(ReservationLocator reservationLocator) {
        this.reservationLocator = reservationLocator;
    }

    @JsonProperty("FormOfPayment")
    public List<FormOfPayment> getFormOfPayment() {
        return formOfPayment;
    }

    @JsonProperty("FormOfPayment")
    public void setFormOfPayment(List<FormOfPayment> formOfPayment) {
        this.formOfPayment = formOfPayment;
    }

    @JsonProperty("FlightSegment")
    public List<FlightSegment> getFlightSegment() {
        return flightSegment;
    }

    @JsonProperty("FlightSegment")
    public void setFlightSegment(List<FlightSegment> flightSegment) {
        this.flightSegment = flightSegment;
    }

    @JsonProperty("ValidDateRange")
    public ValidDateRange getValidDateRange() {
        return validDateRange;
    }

    @JsonProperty("ValidDateRange")
    public void setValidDateRange(ValidDateRange validDateRange) {
        this.validDateRange = validDateRange;
    }

    @JsonProperty("TicketPrice")
    public TicketPrice getTicketPrice() {
        return ticketPrice;
    }

    @JsonProperty("TicketPrice")
    public void setTicketPrice(TicketPrice ticketPrice) {
        this.ticketPrice = ticketPrice;
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
