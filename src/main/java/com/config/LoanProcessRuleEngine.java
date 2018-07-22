package com.config;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rule.abstrac.SpringRuleEngine;

/**
 * @author mgarber
 *
 */
public class LoanProcessRuleEngine extends SpringRuleEngine {
	public static final SpringRuleEngine getEngine(String name) {
		//ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("SpringRuleEngineContext.xml");
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("SpringRuleEngineContext.xml");
		
		return (SpringRuleEngine) context.getBean(name);
	}
}
