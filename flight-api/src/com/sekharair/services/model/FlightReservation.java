package com.sekharair.services.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;
import java.sql.Timestamp;
import java.util.Date;



@XmlAccessorType(XmlAccessType.FIELD)
public class FlightReservation {

	@XmlElement
	private String reservationId;	
	@XmlElement
	private String passengerId;
	@XmlElement
	private String passengerName;
	@XmlElement
	private Date dateOfBirth;
	@XmlElement
	private int passengerAge;
	@XmlElement
	private Date bookingDate;
	@XmlElement
	private Date travellingDate;
	@XmlElement
	private String originCode;
	@XmlElement
	private String destinationCode;
	
	
	public String getReservationId() {
		return reservationId;
	}
	public void setReservationId(String reservationId) {
		this.reservationId = reservationId;
	}
	public String getPassengerId() {
		return passengerId;
	}
	public void setPassengerId(String passengerId) {
		this.passengerId = passengerId;
	}
	public String getPassengerName() {
		return passengerName;
	}
	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public int getPassengerAge() {
		return passengerAge;
	}
	public void setPassengerAge(int passengerAge) {
		this.passengerAge = passengerAge;
	}
	public Date getBookingDate() {
		return bookingDate;
	}
	public void setBookingDate(Date bookingDate) {
		this.bookingDate = bookingDate;
	}
	public Date getTravellingDate() {
		return travellingDate;
	}
	public void setTravellingDate(Date travellingDate) {
		this.travellingDate = travellingDate;
	}
	public String getOriginCode() {
		return originCode;
	}
	public void setOriginCode(String originCode) {
		this.originCode = originCode;
	}
	public String getDestinationCode() {
		return destinationCode;
	}
	public void setDestinationCode(String destinationCode) {
		this.destinationCode = destinationCode;
	}
	@Override
	public String toString() {
		return "FlightReservation [reservationId=" + reservationId + ", passengerId=" + passengerId + ", passengerName="
				+ passengerName + ", dateOfBirth=" + dateOfBirth + ", passengerAge=" + passengerAge + ", bookingDate="
				+ bookingDate + ", travellingDate=" + travellingDate + ", originCode=" + originCode
				+ ", destinationCode=" + destinationCode + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bookingDate == null) ? 0 : bookingDate.hashCode());
		result = prime * result + ((dateOfBirth == null) ? 0 : dateOfBirth.hashCode());
		result = prime * result + ((destinationCode == null) ? 0 : destinationCode.hashCode());
		result = prime * result + ((originCode == null) ? 0 : originCode.hashCode());
		result = prime * result + passengerAge;
		result = prime * result + ((passengerId == null) ? 0 : passengerId.hashCode());
		result = prime * result + ((passengerName == null) ? 0 : passengerName.hashCode());
		result = prime * result + ((reservationId == null) ? 0 : reservationId.hashCode());
		result = prime * result + ((travellingDate == null) ? 0 : travellingDate.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FlightReservation other = (FlightReservation) obj;
		if (bookingDate == null) {
			if (other.bookingDate != null)
				return false;
		} else if (!bookingDate.equals(other.bookingDate))
			return false;
		if (dateOfBirth == null) {
			if (other.dateOfBirth != null)
				return false;
		} else if (!dateOfBirth.equals(other.dateOfBirth))
			return false;
		if (destinationCode == null) {
			if (other.destinationCode != null)
				return false;
		} else if (!destinationCode.equals(other.destinationCode))
			return false;
		if (originCode == null) {
			if (other.originCode != null)
				return false;
		} else if (!originCode.equals(other.originCode))
			return false;
		if (passengerAge != other.passengerAge)
			return false;
		if (passengerId == null) {
			if (other.passengerId != null)
				return false;
		} else if (!passengerId.equals(other.passengerId))
			return false;
		if (passengerName == null) {
			if (other.passengerName != null)
				return false;
		} else if (!passengerName.equals(other.passengerName))
			return false;
		if (reservationId == null) {
			if (other.reservationId != null)
				return false;
		} else if (!reservationId.equals(other.reservationId))
			return false;
		if (travellingDate == null) {
			if (other.travellingDate != null)
				return false;
		} else if (!travellingDate.equals(other.travellingDate))
			return false;
		return true;
	}
	
	
	
	
	
}
