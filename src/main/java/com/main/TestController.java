package com.main;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abstrac.model.LoanApplication;
import com.config.LoanProcessRuleEngine;
import com.rule.abstrac.SpringRuleEngine;

@RestController
public class TestController {
	
	@Value("${test}")
	private String test;
	
	@GetMapping("/hello")
	public String test(HttpServletResponse response) throws Exception	{
		
		System.out.println("\n\n ###### test String is " + test);
		
		SpringRuleEngine engine = LoanProcessRuleEngine.getEngine("SharkysExpressLoansApplicationProcessor");
		LoanApplication application = new LoanApplication();
		application.setFirstName("John");
		application.setLastName("Doe");
		application.setStateCode("TX");
		application.setExpences(4500);
		application.setIncome(7000);
		engine.processRequest(application);
		
		return "What's up !!!!";
	}

}
