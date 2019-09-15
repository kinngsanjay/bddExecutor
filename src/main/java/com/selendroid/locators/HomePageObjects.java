package com.selendroid.locators;

import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class HomePageObjects {
	
	AndroidDriver<AndroidElement> driver;

    public HomePageObjects(AndroidDriver<AndroidElement> driver)

    {
        this.driver = driver;
    }
   
    
    @AndroidFindBy(id = "io.selendroid.testapp:id/input_adds_check_box")
    public WebElement checkBox;
    
    @AndroidFindBy(id = "android:id/title")
    public WebElement appTitle;
    
    @AndroidFindBy(id = "io.selendroid.testapp:id/showToastButton")
    public WebElement displayToast;
    
    @AndroidFindBy(id = "io.selendroid.testapp:id/showPopupWindowButton")
    public WebElement displayPopup;
    
    @AndroidFindBy(id = "io.selendroid.testapp:id/visibleButtonTest")
    public WebElement textViewButton;
    
    @AndroidFindBy(id = "io.selendroid.testapp:id/showPopupWindowButton")
    public WebElement popUpButton;
    
    @AndroidFindBy(id = "io.selendroid.testapp:id/visibleTextView")
    public WebElement visibleTextView;
    
    @AndroidFindBy(id = "io.selendroid.testapp:id/visibleTestArea")
    public WebElement popUpMsg;
    
    @AndroidFindBy(id = "io.selendroid.testapp:id/startUserRegistration")
    public WebElement newRegBttn;
    
    
    public void clickToastButton()
    {
    	displayToast.click();
    }
    
    public void clickCheckBox()
    {
    	checkBox.click();
    }
    
    public void clickDisplayPopup()
    {
    	displayPopup.click();
    }
    
    public boolean checkBoxIsSelected()
    {
    	return checkBox.isSelected();
    }

	public void clickTextView() {
		textViewButton.click();
	}
	
	public void clickPopUpButton()
    {
		popUpButton.click();
    }
	
	public String getVisibleText() {
		return visibleTextView.getText();
	}
	
	public String getPopUpMsgText() {
		return popUpMsg.getText();
	}
	
	public NewRegistrationPageObjects clickNewRegBttn()
    {
    	newRegBttn.click();
    	NewRegistrationPageObjects rp= new NewRegistrationPageObjects(driver);
    	return rp;
    }

}
