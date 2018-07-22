package com.action;

import com.abstrac.model.LoanApplication;
import com.action.abstrac.AbstractPersistenceAwareAction;

/**
 * @author mgarber
 *
 */
public class ProcessApprovalAction extends AbstractPersistenceAwareAction {

	protected void doExecute(Object arg) throws Exception {
		LoanApplication application = (LoanApplication)arg;
		application.setStatus(LoanApplication.APPROVED);
		this.getPersistenceService().recordApproval(application);
	}

}
