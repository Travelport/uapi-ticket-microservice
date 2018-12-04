package com.travelport.refimpl.air.ticket.controller;

import javax.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.travelport.refimpl.air.ticket.models.Request;
import com.travelport.refimpl.air.ticket.models.responseMapper.Response;
import com.travelport.refimpl.air.ticket.services.AirTicketingService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * The Class AirTicketingController.
 */
@RestController
@Api(value = "AirTicketing Microservice")
public class AirTicketingController {

  /** The air ticketing service. */
  @Autowired
  private AirTicketingService airTicketingService;

  /**
   * Instantiates a new air ticketing controller.
   *
   * @param airTicketingService the air ticketing service
   */
  @Autowired
  AirTicketingController(AirTicketingService airTicketingService) {
    this.airTicketingService = airTicketingService;
  }

  /** The Constant LOG. */
  private static final Logger LOG = LoggerFactory.getLogger(AirTicketingController.class);

  /**
   * Index.
   *
   * @param request the request
   * @return the response
   */
  @ApiOperation(value = "Maps the model to a AirTicketingReq and executes a UAPI request",
      response = Response.class)
  @RequestMapping(value = "/AirTicketing", method = RequestMethod.POST)
  public Response index(@Valid @RequestBody Request request) {
    LOG.debug("Enter air ticketing controller, map to /AirTicketing");

    Response response = airTicketingService.getAirTicketing(request);

    return response;
  }
}
