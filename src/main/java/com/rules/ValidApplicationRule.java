package com.rules;

import com.abstrac.model.LoanApplication;
import com.rule.abstrac.AbstractRule;

/**
 * @author mgarber
 *
 */
public class ValidApplicationRule extends AbstractRule {

	protected boolean makeDecision(Object arg) throws Exception {
		LoanApplication application = (LoanApplication) arg;
		if(application.getExpences() == 0 ||
				application.getFirstName() == null ||
				application.getIncome() == 0 ||
				application.getLastName() == null ||
				application.getStateCode() == null) {
			application.setStatus(LoanApplication.INSUFFICIENT_DATA);
			return false;
		}
		return true;						
	}

}
