package org.trident.leaftaps.leads.pages;

import org.trident.leaftaps.common.ProjectSpecficMethods;

public class ViewLeadPage extends ProjectSpecficMethods{
	public ViewLeadPage() {
		
	}
	public void clickCRMSFA() {
		driver.findElementByLinkText("CRM/SFA")
		.click();

	}
	

}
