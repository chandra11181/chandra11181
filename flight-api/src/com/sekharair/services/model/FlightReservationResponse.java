package com.sekharair.services.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class FlightReservationResponse {
    @XmlElement
	private FlightReservation flightReservation;
    
    public FlightReservation getFlightReservation(){
    	return flightReservation;
    }
	
    public void setFlightReservation(FlightReservation flightReservation){
    	this.flightReservation = flightReservation;
    }
    
}
