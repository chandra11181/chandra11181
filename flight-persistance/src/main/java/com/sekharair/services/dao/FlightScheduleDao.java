package com.sekharair.services.dao;


import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.sekharair.services.domain.FlightScheduleDomain;


public class FlightScheduleDao {
	
	private SessionFactory factory;
	
	public FlightScheduleDomain gettiming(String scheduleCode){
		FlightScheduleDomain flightSchedule = new FlightScheduleDomain();
		flightSchedule.setScheduleCode(scheduleCode);
		try{
			factory = new Configuration().configure().buildSessionFactory();
			
			
		}catch(Throwable ex){
			System.err.println("Failed to create SessionFactory Object."+ ex);
			throw new ExceptionInInitializerError(ex);
		}
		Session session = factory.openSession();
		
		try{
			flightSchedule = (FlightScheduleDomain) session.get(FlightScheduleDomain.class, scheduleCode);
			
		}catch (HibernateException e){
			e.printStackTrace();
		}
		finally{
			session.close();
		}
		
		return flightSchedule;
		
	}

	public static void main (String[] args){
	}
}
