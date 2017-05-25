package com.sekharair.services.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.cfg.Environment;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.sekharair.services.domain.FlightReservationDomain;


public class FlightReservationDao {
	
	private SessionFactory factory;
	public FlightReservationDomain getFlightReservation(String reservationId){
		FlightReservationDomain flightReservation = new FlightReservationDomain();
		flightReservation.setReservationId(reservationId);
		try {
			factory = new Configuration().configure().buildSessionFactory();
			
		}catch(Throwable ex){
			System.err.println("Failed to create SessionFactory Object."+ ex);
			throw new ExceptionInInitializerError(ex);
		}
		Session session = factory.openSession();
		
		try{
			flightReservation =(FlightReservationDomain) session.get(FlightReservationDomain.class, reservationId);
		}catch(HibernateException e){
			e.printStackTrace();
		}
		finally{
			session.close();
		}
		return flightReservation;
	}

	public static void main (String[] args){
	}
}
