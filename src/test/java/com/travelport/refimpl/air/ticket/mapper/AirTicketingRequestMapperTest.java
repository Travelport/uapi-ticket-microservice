package com.travelport.refimpl.air.ticket.mapper;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.travelport.refimpl.air.ticket.models.Request;
import com.travelport.refimpl.air.ticket.models.ReservationLocator;
import com.travelport.refimpl.air.ticket.models.TicketSummary;
import com.travelport.schema.air_v45_0.AirTicketingReq;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AirTicketingRequestMapperTest {

  @Autowired
  AirTicketingRequestMapper airTicketingRequestMapper;
  
  ReservationLocator reservationLocator = new ReservationLocator("abcd",null,null);
  TicketSummary ticketSummary = 
      new TicketSummary("12345",null,null,null,null,null
          ,reservationLocator,null,null,null,null);
  Request request = new Request(ticketSummary);
  
  @Test
  public void testAirTicketingRequestMapper() {
    AirTicketingReq airTicketingReq = airTicketingRequestMapper.getAirTicketing(request);
    
    assertEquals(airTicketingReq.getAirReservationLocatorCode().getValue(), "abcd");
    assertEquals(airTicketingReq.getTraceId(), "12345");
  }

}
