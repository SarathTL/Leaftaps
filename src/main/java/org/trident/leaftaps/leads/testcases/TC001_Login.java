package org.trident.leaftaps.leads.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.trident.leaftaps.common.ProjectSpecficMethods;
import org.trident.leaftaps.leads.pages.LoginPage;

public class TC001_Login extends ProjectSpecficMethods{
	@BeforeClass
	public void setData() {
		excelFileName="TC001";
		System.out.println("TC001_Login");
	}
	@Test(dataProvider="fetchData")
	public void runTC001(String username, String password, String companyName, 
			String firstName, String lastName) {
		LoginPage page = 
				new LoginPage();
		page.enterUsername(username)
		.enterPassword(password)
		.clickLoginButton()
		.clickCRMSFA()
		.clickLead()
		.clickCreateLead()
		.enterCompanyName(companyName)
		.enterFirstName(firstName)
		.enterLastName(lastName)
		.clickCreateLeadButton();

	}

}
