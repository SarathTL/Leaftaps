package org.trident.leaftaps.leads.pages;

import org.trident.leaftaps.common.ProjectSpecficMethods;

public class MyLeadsPage extends ProjectSpecficMethods{
	
	public CreateLeadPage clickCreateLead() {
		driver.findElementByLinkText("Create Lead").click();
		return new CreateLeadPage();
	}
	

}
