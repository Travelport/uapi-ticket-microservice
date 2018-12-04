package com.travelport.refimpl.air.ticket.connector;

import javax.xml.ws.BindingProvider;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import com.travelport.schema.air_v45_0.AirTicketingReq;
import com.travelport.schema.air_v45_0.AirTicketingRsp;
import com.travelport.service.air_v45_0.AirFaultMessage;
import com.travelport.service.air_v45_0.AirService;
import com.travelport.service.air_v45_0.AirTicketingPortType;

/**
 * The Class AirTicketingConnector.
 */
@Component
public class AirTicketingConnector {

  /** The Constant LOG. */
  private static final Logger LOG = LoggerFactory.getLogger(AirTicketingConnector.class);
  
  /** The username. */
  @Value("${air.username}")
  private String username;

  /** The password. */
  @Value("${air.password}")
  private String password;

  /** The endpoint. */
  @Value("${air.endpoint}")
  private String endpoint;

  /** The branch. */
  @Value("${air.branch}")
  private String branch;

  /** The air ticketing port type. */
  public AirTicketingPortType airTicketingPortType;
  
  /** The air service. */
  public AirService airService;

  /**
   * Instantiates a new air ticketing service contract.
   */
  @Autowired
  public AirTicketingConnector() {
    this.airService = new com.travelport.service.air_v45_0.AirService();
    this.airTicketingPortType = airService.getAirTicketingPort();
  }
  /**
   * Air ticketing connector.
   *
   * @param airTicketingRequest the air ticketing request
   * @return the air ticketing rsp
   */
  public AirTicketingRsp airTicketingConnector(AirTicketingReq airTicketingRequest) {
    LOG.debug("Username: " + username);
    LOG.debug("Endpoint: " + endpoint);
    LOG.debug("Branch: " + branch);
    addParametersToProvider((BindingProvider) airTicketingPortType);
    AirTicketingRsp airTicketingResponse = new AirTicketingRsp();

    try {
      airTicketingResponse = airTicketingPortType.service(airTicketingRequest);
    } catch (AirFaultMessage e) {
      e.printStackTrace();
    }
    return airTicketingResponse;
  }
  
  /**
   * Adds the parameters to provider.
   *
   * @param provider the provider
   */
  protected void addParametersToProvider(BindingProvider provider) {
    provider.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, endpoint);
    provider.getRequestContext().put(BindingProvider.USERNAME_PROPERTY, username);
    provider.getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, password);
    provider.getRequestContext().put("schema-validation-enabled", "false");
  }
}
