package com.action;

import com.abstrac.model.LoanApplication;
import com.action.abstrac.AbstractPersistenceAwareAction;

/**
 * @author mgarber
 *
 */
public class ProcessRejectionAction extends AbstractPersistenceAwareAction {

	protected void doExecute(Object arg) throws Exception {
		LoanApplication application = (LoanApplication) arg;
		if(LoanApplication.INSUFFICIENT_DATA.equals(application.getStatus()))
			this.getPersistenceService().recordIncomplete(application);
		else
			this.getPersistenceService().recordRejection(application);

	}

}
