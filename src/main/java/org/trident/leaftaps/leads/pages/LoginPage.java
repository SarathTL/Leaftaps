package org.trident.leaftaps.leads.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.trident.leaftaps.common.ProjectSpecficMethods;

public class LoginPage extends ProjectSpecficMethods{
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	@CacheLookup
	@FindBy(how=How.ID,using="username") WebElement eleUsername;
	@FindBy(how=How.ID,using="password") WebElement elePassword;
	@FindBy(how=How.CLASS_NAME, using="decorativeSubmit")
	WebElement eleLoginButton;
	public LoginPage enterUsername(String username) {
		eleUsername.sendKeys(username);
		return this;
	}
	public LoginPage enterPassword(String password) {
		elePassword.sendKeys(password);
		return this;

	}
	public HomePage clickLoginButton() {
		eleLoginButton.click();
		return new HomePage();
	}

}
