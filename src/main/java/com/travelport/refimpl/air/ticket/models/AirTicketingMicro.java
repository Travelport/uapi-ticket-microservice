package com.travelport.refimpl.air.ticket.models;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AirTicketingMicro {

	private static final Logger LOG = LoggerFactory.getLogger(AirTicketingMicro.class);

	private String traceId;
	
	private String locatorCode;
	
	private String pricingInfoRef;

	public String getTraceId() {
		return traceId;
	}

	public void setTraceId(String traceId) {
		this.traceId = traceId;
	}

	public String getLocatorCode() {
		return locatorCode;
	}

	public void setLocatorCode(String locatorCode) {
		this.locatorCode = locatorCode;
	}

	public String getPricingInfoRef() {
		return pricingInfoRef;
	}

	public void setPricingInfoRef(String pricingInfoRef) {
		this.pricingInfoRef = pricingInfoRef;
	}	
}