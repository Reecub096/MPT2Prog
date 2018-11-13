package com.cg.ssms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cg.ssms.dto.Sessions;
import com.cg.ssms.service.SessionService;

@Controller
public class SessionController {
	
		@Autowired
		SessionService sessionservice;																								
		
		@RequestMapping(value = "home", method = RequestMethod.GET)   						
		public ModelAndView showSessions() {
				List<Sessions> sessionData = sessionservice.getSessionDetails();          					
				return new ModelAndView("ScheduledSessions", "data", sessionData);				
		}
		
		
		
		
		
		
		@RequestMapping(value = "Success", method = RequestMethod.GET)						//
		public ModelAndView displaySessions(@RequestParam("sessionName") String sName)		
		{
			return new ModelAndView("Success", "ename" , 	sName);											
		}
}
