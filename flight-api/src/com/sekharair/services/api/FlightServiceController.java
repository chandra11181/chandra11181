package com.sekharair.services.api;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sekharair.services.dao.FlightReservationDao;
import com.sekharair.services.dao.FlightScheduleDao;
import com.sekharair.services.domain.FlightReservationDomain;
import com.sekharair.services.domain.FlightScheduleDomain;
import com.sekharair.services.model.FlightReservation;
import com.sekharair.services.model.FlightReservationRequest;
import com.sekharair.services.model.FlightReservationResponse;
import com.sekharair.services.model.FlightSchedule;
import com.sekharair.services.model.FlightScheduleRequest;
import com.sekharair.services.model.FlightScheduleResponse;

@RestController 
public class FlightServiceController {

	@RequestMapping(method=RequestMethod.POST, value ="getSchedule", produces=MediaType.APPLICATION_XML_VALUE, consumes = MediaType.APPLICATION_XML_VALUE)
	public FlightScheduleResponse getScheduleXML(@RequestBody FlightScheduleRequest flightScheduleRequest){
		return getSchedule(flightScheduleRequest);
		
	}
	
	@RequestMapping(method=RequestMethod.POST, value ="getSchedule", produces=MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public FlightScheduleResponse getScheduleJSON(@RequestBody FlightScheduleRequest flightScheduleRequest){
		return getSchedule(flightScheduleRequest);
	}
	
	private FlightScheduleResponse getSchedule(FlightScheduleRequest flightScheduleRequest){
		FlightScheduleDao flightScheduleDao = new FlightScheduleDao();
		
		FlightScheduleResponse flightScheduleResponse = new FlightScheduleResponse();
		flightScheduleResponse.setFlightSchedule(new FlightSchedule());
		
		FlightScheduleDomain flightScheduleDomain = flightScheduleDao.gettiming(flightScheduleRequest.getScheduleCode());
		
		if(flightScheduleDomain != null) {
			flightScheduleResponse.getFlightSchedule().setScheduleCode(flightScheduleDomain.getScheduleCode());
			flightScheduleResponse.getFlightSchedule().setFlightID(flightScheduleDomain.getFlightID());
			flightScheduleResponse.getFlightSchedule().setAircraftCode(flightScheduleDomain.getAircraftCode());
			flightScheduleResponse.getFlightSchedule().setOriginCode(flightScheduleDomain.getOriginCode());
			flightScheduleResponse.getFlightSchedule().setDestinationCode(flightScheduleDomain.getDestinationCode());
			flightScheduleResponse.getFlightSchedule().setDepartureTime(flightScheduleDomain.getDepartureTime());
			flightScheduleResponse.getFlightSchedule().setArrivalTime(flightScheduleDomain.getArrivalTime());
		}
		return flightScheduleResponse;
	}
	
	
}
