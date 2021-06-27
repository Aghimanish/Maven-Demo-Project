package com.nagarro.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.nagarro.services.AdditionService;

@Controller
public class CalculationController {
	
	@RequestMapping(value="add")
	public ModelAndView getAdditionResult(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView modelAndView = new ModelAndView();
		 
		int num1 = Integer.parseInt(request.getParameter("num1"));
		int num2 = Integer.parseInt(request.getParameter("num2"));
		
		AdditionService additionService = new AdditionService();
		int result = additionService.addNumbers(num1, num2);
		
		modelAndView.addObject("result", result);
		modelAndView.setViewName("calculation-result");
		return modelAndView;
		
	}
}
