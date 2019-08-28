package org.trident.leaftaps.leads.pages;

import org.trident.leaftaps.common.ProjectSpecficMethods;

public class MyHomePage extends ProjectSpecficMethods{
	public MyHomePage() {
		
	}
	public MyLeadsPage clickLead() {
		driver.findElementByLinkText("Leads").click();
		return new MyLeadsPage();

	}
	

}
