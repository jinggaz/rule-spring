package com.action;

import com.abstrac.model.LoanApplication;

/**
 * @author mgarber
 *
 */
public class MockLoanApplicationPersistence implements
		LoanApplicationPersistenceInterface {

	public void recordApproval(LoanApplication application) throws Exception {
	}

	public void recordRejection(LoanApplication application) throws Exception {
	}

	public void recordIncomplete(LoanApplication application) throws Exception {
	}

}
