package com.cg.ssms.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.cg.ssms.dto.Sessions;

@Repository("sessiondao")
public class SessionDAOImpl implements SessionDAO{
	
		@PersistenceContext
		EntityManager em;																										
	
		@SuppressWarnings("unchecked")
		@Override
		public List<Sessions> getSessionDetails() {
			// TODO Auto-generated method stub
			Query queryGet = em.createQuery("FROM Sessions");																			
			List<Sessions> sessionDetails = queryGet.getResultList();																		
			return sessionDetails;																																	
		}

}
