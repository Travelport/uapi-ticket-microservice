
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
    "@type",
    "StatusCode",
    "Message",
    "ErrorSummary"
})
public class Error {

    @JsonProperty("@type")
    private String type;
    @JsonProperty("StatusCode")
    private Integer statusCode;
    @JsonProperty("Message")
    private String message;
    @JsonProperty("ErrorSummary")
    private List<ErrorSummary> errorSummary = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Error() {
    }

    /**
     * 
     * @param message
     * @param statusCode
     * @param errorSummary
     * @param type
     */
    public Error(String type, Integer statusCode, String message, List<ErrorSummary> errorSummary) {
        super();
        this.type = type;
        this.statusCode = statusCode;
        this.message = message;
        this.errorSummary = errorSummary;
    }

    @JsonProperty("@type")
    public String getType() {
        return type;
    }

    @JsonProperty("@type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("StatusCode")
    public Integer getStatusCode() {
        return statusCode;
    }

    @JsonProperty("StatusCode")
    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }

    @JsonProperty("Message")
    public String getMessage() {
        return message;
    }

    @JsonProperty("Message")
    public void setMessage(String message) {
        this.message = message;
    }

    @JsonProperty("ErrorSummary")
    public List<ErrorSummary> getErrorSummary() {
        return errorSummary;
    }

    @JsonProperty("ErrorSummary")
    public void setErrorSummary(List<ErrorSummary> errorSummary) {
        this.errorSummary = errorSummary;
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
