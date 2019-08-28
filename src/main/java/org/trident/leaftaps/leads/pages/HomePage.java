package org.trident.leaftaps.leads.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.trident.leaftaps.common.ProjectSpecficMethods;

public class HomePage extends ProjectSpecficMethods{
	public HomePage() {
		
	}
	@FindAll({@FindBy(how=How.LINK_TEXT, using="CRM/SFA"),
				@FindBy(how=How.LINK_TEXT, using = "crm")})
	WebElement eleCRMSFA;
	
	public MyHomePage clickCRMSFA() {
		eleCRMSFA.click();
		return new MyHomePage();

	}
	

}
