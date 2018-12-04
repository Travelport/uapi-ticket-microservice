package com.travelport.refimpl.air.ticket.mapper;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.travelport.refimpl.air.ticket.models.responseMapper.Response;
import com.travelport.schema.air_v45_0.AirTicketingRsp;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AirTicketingResponseMapperTest {

  @Autowired
  AirTicketingResponseMapper airTicketingResponseMapper;
  
  AirTicketingRsp airTicketingRsp = new AirTicketingRsp();
  
  @Test
  public void testAirTicketingResponseMapper() {
    airTicketingRsp.setTransactionId("7A5E2B4E0A076477B3D001584DA5E8A7");
    airTicketingRsp.setTraceId("7A5E2B4E0A076477B3D001584DA5E8A7");

    Response response = airTicketingResponseMapper.returnAirTicket(airTicketingRsp);
    
    assertEquals(response.getTicketIdResponse().getTransactionId()
        ,"7A5E2B4E0A076477B3D001584DA5E8A7");
    assertEquals(response.getTicketIdResponse().getTraceId()
        ,"7A5E2B4E0A076477B3D001584DA5E8A7");
  }

}
