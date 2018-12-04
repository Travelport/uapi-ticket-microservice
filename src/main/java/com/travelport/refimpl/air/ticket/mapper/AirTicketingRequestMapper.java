package com.travelport.refimpl.air.ticket.mapper;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;
import com.travelport.refimpl.air.ticket.controller.AirTicketingController;
import com.travelport.refimpl.air.ticket.models.Request;
import com.travelport.refimpl.air.ticket.models.ReservationLocator;
import com.travelport.refimpl.air.ticket.models.TicketSummary;
import com.travelport.schema.air_v45_0.AirReservationLocatorCode;
import com.travelport.schema.air_v45_0.AirTicketingReq;
import com.travelport.schema.common_v45_0.BillingPointOfSaleInfo;

/**
 * The Class AirTicketingRequestMapper.
 */
@Component
@EnableConfigurationProperties
@ConfigurationProperties("air")
public class AirTicketingRequestMapper {

  /** The Constant LOG. */
  private static final Logger LOG = LoggerFactory.getLogger(AirTicketingRequestMapper.class);

  /** The branch. */
  @Value("${air.branch}")
  private String branch;

  /**
   * Instantiates a new air ticketing request mapper.
   */
  public AirTicketingRequestMapper() {

  }

  /**
   * Gets the air ticketing.
   *
   * @param request the request
   * @return the air ticketing
   */
  public AirTicketingReq getAirTicketing(Request request) {

    AirTicketingReq airTicketingReq = new AirTicketingReq();
    TicketSummary ticketSummary = request.getTicketSummary();
    ReservationLocator reservationLocator = ticketSummary.getReservationLocator();

    airTicketingReq.setTargetBranch(branch);
    airTicketingReq.setBillingPointOfSaleInfo(mapBillingPointOfSale());
    airTicketingReq.setTraceId(ticketSummary.getObjID());
    airTicketingReq.setAirReservationLocatorCode(mapAirReservationLocatorCode(reservationLocator));

    return airTicketingReq;
  }

  /**
   * Map air reservation locator code.
   *
   * @param reservationLocator the reservation locator
   * @return the air reservation locator code
   */
  private AirReservationLocatorCode mapAirReservationLocatorCode(
      ReservationLocator reservationLocator) {
    AirReservationLocatorCode airReservationLocatorCode = new AirReservationLocatorCode();
    airReservationLocatorCode.setValue(reservationLocator.getValue());

    return airReservationLocatorCode;
  }

  /**
   * Map billing point of sale.
   *
   * @return the billing point of sale info
   */
  private BillingPointOfSaleInfo mapBillingPointOfSale() {
    LOG.debug("Entered mapBillingPointOfSale");
    BillingPointOfSaleInfo bpos = new BillingPointOfSaleInfo();
    bpos.setOriginApplication("UAPI");
    return bpos;
  }
}
