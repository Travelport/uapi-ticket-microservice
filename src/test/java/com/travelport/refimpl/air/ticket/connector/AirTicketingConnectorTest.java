package com.travelport.refimpl.air.ticket.connector;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.travelport.service.air_v45_0.AirService;
import com.travelport.service.air_v45_0.AirTicketingPortType;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AirTicketingConnectorTest {

  @Autowired
  AirTicketingConnector airTicketingConnector;
  @Test
  public void airTicketingConnectorConstructorTest() {
    assertTrue(airTicketingConnector.airTicketingPortType instanceof AirTicketingPortType);
    assertTrue(airTicketingConnector.airService instanceof AirService);
  }

}
