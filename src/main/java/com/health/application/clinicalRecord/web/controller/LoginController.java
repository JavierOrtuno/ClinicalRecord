package com.health.application.clinicalRecord.web.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
	protected final Log logger = LogFactory.getLog(getClass());

	@RequestMapping(value="/login.html")
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
		
        logger.info("Returning Login View");
        
        return new ModelAndView("login");
    }
	
	@RequestMapping(value="/welcome.html")
    public ModelAndView handleRequestSecured(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
		
		String userName = "MY USER";
        logger.info("Returning Login View");
        
        
        return new ModelAndView("secured/welcome", "userName", userName);
    }
}