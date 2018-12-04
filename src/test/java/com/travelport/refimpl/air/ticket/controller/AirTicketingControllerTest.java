package com.travelport.refimpl.air.ticket.controller;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.travelport.refimpl.air.ticket.models.Request;
import com.travelport.refimpl.air.ticket.models.TicketSummary;
import com.travelport.refimpl.air.ticket.models.responseMapper.Response;
import com.travelport.refimpl.air.ticket.models.responseMapper.TicketIdResponse;
import com.travelport.refimpl.air.ticket.services.AirTicketingService;

@RunWith(SpringRunner.class)
@WebMvcTest(AirTicketingController.class)
public class AirTicketingControllerTest {

  @Autowired
  private MockMvc mvc;
  
  @MockBean
  AirTicketingService mockAirTicketingService;
  @Test
  public void testDefaultControllerResponse() throws Exception {
    // Setup Mock vars and behavior
    TicketIdResponse ticketIdResponse = 
        new TicketIdResponse(null,"7A5E2B4E0A076477B3D001584DA5E8A7"
            ,"7A5E2B4E0A076477B3D001584DA5E8A7",null,null,null,null,null);
    Response mockResponse = new Response(ticketIdResponse);
    Request request = new Request();
    Mockito.when(mockAirTicketingService.getAirTicketing(Mockito.any(Request.class))).thenReturn(mockResponse);
    
    // Call MockMvc and Assert the response has the appropriate values
    mvc.perform(MockMvcRequestBuilders.post("/AirTicketing").accept(MediaType.APPLICATION_JSON)
        .contentType(MediaType.APPLICATION_JSON).content(asJsonString(request)))
    .andExpect(MockMvcResultMatchers.status().isOk())
    .andExpect(MockMvcResultMatchers.jsonPath("$.TicketIdResponse.transactionId")
        .value("7A5E2B4E0A076477B3D001584DA5E8A7"))
    .andExpect(MockMvcResultMatchers.jsonPath("$.TicketIdResponse.traceId")
        .value("7A5E2B4E0A076477B3D001584DA5E8A7"));
  }

  public static String asJsonString(final Object obj) {
    try {
      final ObjectMapper mapper = new ObjectMapper();
      final String jsonContent = mapper.writeValueAsString(obj);
      return jsonContent;
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }
}
