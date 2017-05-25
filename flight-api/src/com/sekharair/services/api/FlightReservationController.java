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
public class FlightReservationController {

	@RequestMapping(method=RequestMethod.POST, value ="getReservation", produces=MediaType.APPLICATION_XML_VALUE, consumes = MediaType.APPLICATION_XML_VALUE)
	public FlightReservationResponse getReservationXML(@RequestBody FlightReservationRequest flightReservationRequest){
		return getReservation(flightReservationRequest);
		
	}
		private FlightReservationResponse getReservation(FlightReservationRequest flightReservationRequest){
			FlightReservationDao flightReservationDao = new FlightReservationDao();
			
			FlightReservationResponse flightReservationResponse = new FlightReservationResponse();
			flightReservationResponse.setFlightReservation(new FlightReservation());
			
			FlightReservationDomain flightReservationDomain = flightReservationDao.getFlightReservation(flightReservationRequest.getReservationId());
			
			if(flightReservationDomain != null) {
				flightReservationResponse.getFlightReservation().setReservationId(flightReservationDomain.getReservationId());
				flightReservationResponse.getFlightReservation().setPassengerId(flightReservationDomain.getPassengerId());
				flightReservationResponse.getFlightReservation().setPassengerName(flightReservationDomain.getPassengerName());
				flightReservationResponse.getFlightReservation().setDateOfBirth(flightReservationDomain.getDateOfBirth());
				flightReservationResponse.getFlightReservation().setPassengerAge(flightReservationDomain.getPassengerAge());
				flightReservationResponse.getFlightReservation().setBookingDate(flightReservationDomain.getBookingDate());
				flightReservationResponse.getFlightReservation().setTravellingDate(flightReservationDomain.getTravellingDate());
				flightReservationResponse.getFlightReservation().setOriginCode(flightReservationDomain.getOriginCode());
				flightReservationResponse.getFlightReservation().setDestinationCode(flightReservationDomain.getDestinationCode());				
			}
			return flightReservationResponse;
		}
}
