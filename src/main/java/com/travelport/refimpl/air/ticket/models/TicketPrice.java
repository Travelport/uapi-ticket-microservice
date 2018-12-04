
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
    "currencyCode",
    "Base",
    "TotalTaxes",
    "TotalFees",
    "TotalPrice",
    "VendorCurrencyTotal",
    "FiledAmount"
})
public class TicketPrice {

    @JsonProperty("@type")
    private String type;
    @JsonProperty("id")
    private String id;
    @JsonProperty("currencyCode")
    private String currencyCode;
    @JsonProperty("Base")
    private Integer base;
    @JsonProperty("TotalTaxes")
    private Integer totalTaxes;
    @JsonProperty("TotalFees")
    private Integer totalFees;
    @JsonProperty("TotalPrice")
    private Integer totalPrice;
    @JsonProperty("VendorCurrencyTotal")
    private VendorCurrencyTotal vendorCurrencyTotal;
    @JsonProperty("FiledAmount")
    private FiledAmount filedAmount;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public TicketPrice() {
    }

    /**
     * 
     * @param id
     * @param currencyCode
     * @param totalFees
     * @param totalTaxes
     * @param vendorCurrencyTotal
     * @param base
     * @param type
     * @param filedAmount
     * @param totalPrice
     */
    public TicketPrice(String type, String id, String currencyCode, Integer base, Integer totalTaxes, Integer totalFees, Integer totalPrice, VendorCurrencyTotal vendorCurrencyTotal, FiledAmount filedAmount) {
        super();
        this.type = type;
        this.id = id;
        this.currencyCode = currencyCode;
        this.base = base;
        this.totalTaxes = totalTaxes;
        this.totalFees = totalFees;
        this.totalPrice = totalPrice;
        this.vendorCurrencyTotal = vendorCurrencyTotal;
        this.filedAmount = filedAmount;
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

    @JsonProperty("currencyCode")
    public String getCurrencyCode() {
        return currencyCode;
    }

    @JsonProperty("currencyCode")
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    @JsonProperty("Base")
    public Integer getBase() {
        return base;
    }

    @JsonProperty("Base")
    public void setBase(Integer base) {
        this.base = base;
    }

    @JsonProperty("TotalTaxes")
    public Integer getTotalTaxes() {
        return totalTaxes;
    }

    @JsonProperty("TotalTaxes")
    public void setTotalTaxes(Integer totalTaxes) {
        this.totalTaxes = totalTaxes;
    }

    @JsonProperty("TotalFees")
    public Integer getTotalFees() {
        return totalFees;
    }

    @JsonProperty("TotalFees")
    public void setTotalFees(Integer totalFees) {
        this.totalFees = totalFees;
    }

    @JsonProperty("TotalPrice")
    public Integer getTotalPrice() {
        return totalPrice;
    }

    @JsonProperty("TotalPrice")
    public void setTotalPrice(Integer totalPrice) {
        this.totalPrice = totalPrice;
    }

    @JsonProperty("VendorCurrencyTotal")
    public VendorCurrencyTotal getVendorCurrencyTotal() {
        return vendorCurrencyTotal;
    }

    @JsonProperty("VendorCurrencyTotal")
    public void setVendorCurrencyTotal(VendorCurrencyTotal vendorCurrencyTotal) {
        this.vendorCurrencyTotal = vendorCurrencyTotal;
    }

    @JsonProperty("FiledAmount")
    public FiledAmount getFiledAmount() {
        return filedAmount;
    }

    @JsonProperty("FiledAmount")
    public void setFiledAmount(FiledAmount filedAmount) {
        this.filedAmount = filedAmount;
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
