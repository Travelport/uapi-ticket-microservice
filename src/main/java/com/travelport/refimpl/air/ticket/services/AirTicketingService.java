/*
 * 
 */
package com.travelport.refimpl.air.ticket.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.travelport.refimpl.air.ticket.connector.AirTicketingConnector;
import com.travelport.refimpl.air.ticket.mapper.AirTicketingRequestMapper;
import com.travelport.refimpl.air.ticket.mapper.AirTicketingResponseMapper;
import com.travelport.refimpl.air.ticket.models.Request;
import com.travelport.refimpl.air.ticket.models.responseMapper.Response;
import com.travelport.schema.air_v45_0.AirTicketingReq;
import com.travelport.schema.air_v45_0.AirTicketingRsp;

/**
 * The Class AirTicketingService.
 */
@Service
public class AirTicketingService {

  /** The Constant LOG. */
  private static final Logger LOG = LoggerFactory.getLogger(AirTicketingService.class);

  /** The air ticketing request mapper. */
  @Autowired
  AirTicketingRequestMapper airTicketingRequestMapper;

  @Autowired
  AirTicketingResponseMapper airTicketingResponseMapper;

  /** The air ticketing connector. */
  @Autowired
  AirTicketingConnector airTicketingConnector;

  /**
   * Gets the air ticketing.
   *
   * @param request the request
   * @return the air ticketing
   */
  public Response getAirTicketing(Request request) {
    LOG.debug("Model sent to mapper to get a response");
    AirTicketingReq airTicketingReq = airTicketingRequestMapper.getAirTicketing(request);
    Response response = new Response();
    AirTicketingRsp airTicketingRsp = airTicketingConnector.airTicketingConnector(airTicketingReq);
    response = airTicketingResponseMapper.returnAirTicket(airTicketingRsp);
    return response;
  }
}
