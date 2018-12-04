package com.travelport.refimpl.air.ticket.mapper;

import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import com.travelport.refimpl.air.ticket.models.responseMapper.Response;
import com.travelport.refimpl.air.ticket.models.responseMapper.Result;
import com.travelport.refimpl.air.ticket.models.responseMapper.TicketIdResponse;
import com.travelport.refimpl.air.ticket.models.responseMapper.Warning;
import com.travelport.schema.air_v45_0.AirTicketingRsp;
import com.travelport.schema.air_v45_0.TicketFailureInfo;
import com.travelport.schema.common_v45_0.ResponseMessage;

/**
 * The Class AirTicketingResponseMapper.
 */
@Component
public class AirTicketingResponseMapper {

  /** The Constant LOG. */
  private static final Logger LOG = LoggerFactory.getLogger(AirTicketingResponseMapper.class);

  /**
   * Instantiates a new air ticketing response mapper.
   */
  public AirTicketingResponseMapper() {

  }

  /**
   * Return air ticket.
   *
   * @param airTicketingRsp the air ticketing rsp
   * @return the response
   */
  public Response returnAirTicket(AirTicketingRsp airTicketingRsp) {
    Response response = new Response();

    response.setTicketIdResponse(mapTicketIdResponse(airTicketingRsp));
    return response;
  }

  /**
   * Map ticket id response.
   *
   * @param airTicketingRsp the air ticketing rsp
   * @return the ticket id response
   */
  private TicketIdResponse mapTicketIdResponse(AirTicketingRsp airTicketingRsp) {
    LOG.debug("Entered mapTicketIdResponse");

    TicketIdResponse ticketIdResponse = new TicketIdResponse();
    ticketIdResponse.setTransactionId(airTicketingRsp.getTransactionId());
    ticketIdResponse.setTraceId(airTicketingRsp.getTraceId());

    ticketIdResponse.setResult(mapResults(airTicketingRsp));

    return ticketIdResponse;
  }

  /**
   * Map results.
   *
   * @param airTicketingRsp the air ticketing rsp
   * @return the list
   */
  private List<Result> mapResults(AirTicketingRsp airTicketingRsp) {
    LOG.debug("Entered mapResults");

    List<ResponseMessage> responseMessages = airTicketingRsp.getResponseMessage();
    List<TicketFailureInfo> ticketFailureInfos = airTicketingRsp.getTicketFailureInfo();
    List<Result> results = new ArrayList<Result>();
    for (int i = 0; i < responseMessages.size(); i++) {

      Result result = new Result();

      if (responseMessages.get(i).getCode() != null) {
        result.setStatus(responseMessages.get(i).getValue().toString());
      }
      result.setWarning(mapWarnings(ticketFailureInfos));
      results.add(result);
    }
    return results;
  }

  /**
   * Map warnings.
   *
   * @param ticketFailureInfos the ticket failure infos
   * @return the list
   */
  private List<Warning> mapWarnings(List<TicketFailureInfo> ticketFailureInfos) {
    LOG.debug("Entered mapWarnings");

    List<Warning> warnings = new ArrayList<Warning>();
    for (int i = 0; i < ticketFailureInfos.size(); i++) {

      Warning warning = new Warning();

      if (ticketFailureInfos.get(i).getMessage() != null) {
        warning.setMessage(ticketFailureInfos.get(i).getMessage());
        warning.setStatusCode(Integer.parseInt(ticketFailureInfos.get(i).getCode().toString()));
      }
      warnings.add(warning);
    }
    return warnings;
  }
}
