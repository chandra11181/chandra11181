package com.sekharair.services.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)

public class FlightReservationRequest {
	
	@XmlElement
	private String reservationId;
	
	public String getReservationId(){
		return reservationId;
	}

		public void setReservationId(String reservationId){
			this.reservationId = reservationId;
		}
}
