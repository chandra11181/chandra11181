package com.sekharair.services.model;

import java.sql.Timestamp;
import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlAccessorType(XmlAccessType.FIELD)
public class FlightSchedule {

	@XmlElement
	private String scheduleCode;
	@XmlElement
	private String flightID;
	@XmlElement
	private String aircraftCode;
	@XmlElement
	private String originCode;
	@XmlElement
	private String destinationCode;
	@XmlElement
	private Date departureTime;
	@XmlElement
	private Date arrivalTime;
	public String getScheduleCode() {
		return scheduleCode;
	}
	public void setScheduleCode(String scheduleCode) {
		this.scheduleCode = scheduleCode;
	}
	public String getFlightID() {
		return flightID;
	}
	public void setFlightID(String flightID) {
		this.flightID = flightID;
	}
	public String getAircraftCode() {
		return aircraftCode;
	}
	public void setAircraftCode(String aircraftCode) {
		this.aircraftCode = aircraftCode;
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
	public Date getDepartureTime() {
		return departureTime;
	}
	public void setDepartureTime(Date departureTime) {
		this.departureTime = departureTime;
	}
	public Date getArrivalTime() {
		return arrivalTime;
	}
	public void setArrivalTime(Date arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	@Override
	public String toString() {
		return "timing [scheduleCode=" + scheduleCode + ", flightID=" + flightID + ", aircraftCode=" + aircraftCode
				+ ", originCode=" + originCode + ", destinationCode=" + destinationCode + ", departureTime="
				+ departureTime + ", arrivalTime=" + arrivalTime + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((aircraftCode == null) ? 0 : aircraftCode.hashCode());
		result = prime * result + ((arrivalTime == null) ? 0 : arrivalTime.hashCode());
		result = prime * result + ((departureTime == null) ? 0 : departureTime.hashCode());
		result = prime * result + ((destinationCode == null) ? 0 : destinationCode.hashCode());
		result = prime * result + ((flightID == null) ? 0 : flightID.hashCode());
		result = prime * result + ((originCode == null) ? 0 : originCode.hashCode());
		result = prime * result + ((scheduleCode == null) ? 0 : scheduleCode.hashCode());
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
		FlightSchedule other = (FlightSchedule) obj;
		if (aircraftCode == null) {
			if (other.aircraftCode != null)
				return false;
		} else if (!aircraftCode.equals(other.aircraftCode))
			return false;
		if (arrivalTime == null) {
			if (other.arrivalTime != null)
				return false;
		} else if (!arrivalTime.equals(other.arrivalTime))
			return false;
		if (departureTime == null) {
			if (other.departureTime != null)
				return false;
		} else if (!departureTime.equals(other.departureTime))
			return false;
		if (destinationCode == null) {
			if (other.destinationCode != null)
				return false;
		} else if (!destinationCode.equals(other.destinationCode))
			return false;
		if (flightID == null) {
			if (other.flightID != null)
				return false;
		} else if (!flightID.equals(other.flightID))
			return false;
		if (originCode == null) {
			if (other.originCode != null)
				return false;
		} else if (!originCode.equals(other.originCode))
			return false;
		if (scheduleCode == null) {
			if (other.scheduleCode != null)
				return false;
		} else if (!scheduleCode.equals(other.scheduleCode))
			return false;
		return true;
	}
	
		
}
