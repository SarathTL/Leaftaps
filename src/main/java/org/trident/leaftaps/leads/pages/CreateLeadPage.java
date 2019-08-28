package org.trident.leaftaps.leads.pages;

import org.openqa.selenium.By;
import org.trident.leaftaps.common.ProjectSpecficMethods;

public class CreateLeadPage extends ProjectSpecficMethods{
	public CreateLeadPage() {
		
	}
	public CreateLeadPage enterCompanyName(String companyName) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(companyName);
		return this;
	}
	public CreateLeadPage enterFirstName(String firstName) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstName);
		return this;
	}
	public CreateLeadPage enterLastName(String lastName) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastName);
		return this;
	}
	public ViewLeadPage clickCreateLeadButton() {
		driver.findElement(By.name("submitButton")).click();
		return new ViewLeadPage();

	}
	

}
