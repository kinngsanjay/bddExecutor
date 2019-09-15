package com.selendroid.locators;

import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class ConfirmRegistrationPageObjects {

	AndroidDriver<AndroidElement> driver;

	public ConfirmRegistrationPageObjects(AndroidDriver<AndroidElement> driver)
	{
		this.driver = driver;
	}

	@AndroidFindBy(id = "io.selendroid.testapp:id/label_name_data")
	public WebElement nameVerText;
	
	@AndroidFindBy(id = "io.selendroid.testapp:id/label_username_data")
	public WebElement userNameVerText;
	
	@AndroidFindBy(id = "io.selendroid.testapp:id/label_email_data")
	public WebElement emailVerText;
	
	@AndroidFindBy(id = "io.selendroid.testapp:id/label_preferedProgrammingLanguage_data")
	public WebElement progDataVerText;
	
	@AndroidFindBy(id = "io.selendroid.testapp:id/label_acceptAdds_data")
	public WebElement acceptAddsVerText;
	
	@AndroidFindBy(id = "io.selendroid.testapp:id/label_password_data")
	public WebElement passwordVerText;

	@AndroidFindBy(id = "io.selendroid.testapp:id/buttonRegisterUser")
	public WebElement finalRegisterBttn;

	public String getTextNameVerText() {
		return nameVerText.getText();
	}

	public String getTextPasswordVerText() {
		return passwordVerText.getText();
	}

	public String getTextUserNameVerText() {
		return userNameVerText.getText();
	}

	public String getTextEmailVerText() {
		return emailVerText.getText();
	}

	public String getTextLangVerText() {
		return progDataVerText.getText();
	}

	public String getTextAcceptAddsVerText() {
		return acceptAddsVerText.getText();
	}

	public HomePageObjects clickFinalRegisterBttn() {
		finalRegisterBttn.click();
		HomePageObjects hp = new HomePageObjects(driver);
		return hp;
	}

}
