package com.cg.ssms.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.ssms.dao.SessionDAO;
import com.cg.ssms.dto.Sessions;

@Service("sessionservice")
@Transactional
public class SessionServiceImpl implements SessionService{

		@Autowired
		SessionDAO sessiondao;																				
		
		@Override
		public List<Sessions> getSessionDetails() {
			// TODO Auto-generated method stub
			return sessiondao.getSessionDetails(); 												
		}

}
