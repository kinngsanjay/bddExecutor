package com.selendroid.locators;

import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class NewRegistrationPageObjects {
	
	AndroidDriver<AndroidElement> driver;

    public NewRegistrationPageObjects(AndroidDriver<AndroidElement> driver)
    {
        this.driver = driver;
    }
    
    @AndroidFindBy(id = "io.selendroid.testapp:id/inputUsername")
    public WebElement userNameText;
    
    @AndroidFindBy(accessibility = "email of the customer")
    public WebElement emailText;
    
    @AndroidFindBy(id = "io.selendroid.testapp:id/inputPassword")
    public WebElement pwdText;
    
    @AndroidFindBy(id = "io.selendroid.testapp:id/inputName")
    public WebElement nameText;
    
    @AndroidFindBy(id="io.selendroid.testapp:id/input_adds")
    public WebElement addsCkBox;
    
    @AndroidFindBy(id="io.selendroid.testapp:id/btnRegisterUser")
    public WebElement registerBttn;
    
    public void clearTypeUserName(String text)
    {
    	userNameText.clear();
    	userNameText.sendKeys(text);
    }
    public void clearTypeEmailText(String text)
    {
    	emailText.clear();
    	emailText.sendKeys(text);
    }
    public void clearTypePwdText(String text)
    {
    	pwdText.clear();
    	pwdText.sendKeys(text);
    }
    public void clearTypeNameText(String text)
    {
    	nameText.clear();
    	nameText.sendKeys(text);
    }
    
    public void selectCkBoxAdds() {
		addsCkBox.click();
	}
    
    public ConfirmRegistrationPageObjects clickNewRegBttn()
    {
    	registerBttn.click();
    	ConfirmRegistrationPageObjects cp= new ConfirmRegistrationPageObjects(driver);
    	return cp;
    }


}
