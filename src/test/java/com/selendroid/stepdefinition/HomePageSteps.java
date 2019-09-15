package com.selendroid.stepdefinition;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.IOException;

import com.selendroid.init.InitTest;
import com.selendroid.locators.ConfirmRegistrationPageObjects;
import com.selendroid.locators.HomePageObjects;
import com.selendroid.locators.NewRegistrationPageObjects;
import com.selendroid.utilities.CommonFunctions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomePageSteps extends InitTest {

	HomePageObjects hp = null;
	NewRegistrationPageObjects rp = null;
	ConfirmRegistrationPageObjects cp = null;
	CommonFunctions comFun = null;

	@Before
	public void beforeMethod() throws IOException {
		setUpEnvironment();
		openApplication();
		comFun = new CommonFunctions(driver);
	}

	@After
	public void afterMethod() {
		driver.quit();
	}

	@Given("^Open the Test App$")
	public void OpenApplication() throws Throwable {
		hp = new HomePageObjects(driver);
	}

	@When("^The CheckBox is tapped$")
	public void tapOnCheckBox() throws Throwable {
		hp.clickCheckBox();
	}

	@Then("^CheckBox should be in unselected state$")
	public void checkCheckBoxState() throws Throwable {
		assertTrue(!hp.checkBoxIsSelected());

	}

	@When("^The TextView is tapped$")
	public void tapOnTextView() throws Throwable {
		hp.clickTextView();
	}

	@When("^The ToastButton is tapped$")
	public void tapOnToastButton() throws Throwable {
		hp.clickToastButton();
	}

	@When("^New User icon is tapped$")
	public void tapOnNewUsericon() throws Throwable {
		rp = hp.clickNewRegBttn();
	}

	@When("^The PopupButton is tapped$")
	public void tapOnPopUpButton() throws Throwable {
		hp.clickToastButton();
	}

	@When("^Insert New user details as \"(.*)\", \"(.*)\", \"(.*)\", \"(.*)\" and tap on submit button$")
	public void insertUserDetailsAndSubmit(String name, String userName, String email, String pwd) throws Throwable {

		rp.clearTypeUserName(userName);
		rp.clearTypeEmailText(email);
		rp.clearTypePwdText(pwd);
		rp.clearTypeNameText(name);

		comFun.HideKeyBoard(driver);

		if (rp.addsCkBox.isSelected() != true) {
			rp.selectCkBoxAdds();
		}

		cp = rp.clickNewRegBttn();
	}
	
	@When("^Tap on Confirm button$")
	public void tapOnConfirmButton() throws Throwable {
		hp = cp.clickFinalRegisterBttn();

	}

	@Then("^Text should be displayed as \"(.*)\"$")
	public void verifyTextMsg(String txtMsg) throws Throwable {
		assertTrue(hp.getVisibleText().equals(txtMsg));
	}

	@Then("^ToastMsg Should be displayed as \"(.*)\"$")
	public void verifyToastMsg(String expectedToastMsg) throws Throwable {
		String toastMsg = comFun.readToastMsg();
		assertTrue(toastMsg.contains(expectedToastMsg));
	}

	@Then("^Popup Msg Should be displayed as \"(.*)\"$")
	public void verifyPopUpMsg(String popUpMsg) throws Throwable {
		assertTrue(hp.getVisibleText().equals(popUpMsg));
	}
	
	@Then("^User details should be populated correctly on verify screen as \"(.*)\", \"(.*)\", \"(.*)\", \"(.*)\"$")
	public void verifyUserDetails(String name, String userName, String email, String pwd) throws Throwable {
		assertEquals(cp.getTextNameVerText(), name);
		assertEquals(cp.getTextUserNameVerText(), userName);
		assertEquals(cp.getTextEmailVerText(), email);
		assertEquals(cp.getTextPasswordVerText(), pwd);
	}
	
	@Then("^Homepage should be displayed$")
	public void verifyHomePage() throws Throwable {
		assertTrue(hp.appTitle.isDisplayed());
	}

}
