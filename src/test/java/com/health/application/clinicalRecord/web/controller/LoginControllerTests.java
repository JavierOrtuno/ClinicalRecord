package com.health.application.clinicalRecord.web.controller;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.springframework.web.servlet.ModelAndView;

public class LoginControllerTests {
	
	@Test
    public void testHandleRequestView() throws Exception{		
        LoginController controller = new LoginController();
        ModelAndView modelAndView = controller.handleRequest(null, null);		
        assertEquals("login", modelAndView.getViewName());
        assertNotNull(modelAndView.getModel());
    }
}
