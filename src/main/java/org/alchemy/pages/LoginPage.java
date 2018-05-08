package org.alchemy.pages;

import org.alchemy.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage extends TestBase {

	
	public LoginPage()
	{
		PageFactory.initElements(driver, this) ;
	}
	
	
	@FindBy(name="txtLogin")
	WebElement username;
	
	@FindBy(name="txtPassword")
	WebElement password;
	
	@FindBy(xpath="//input[@type='submit' and @name='btnlogin']")
	WebElement loginBtn;
	
	@FindBy(xpath="//img[@id='imgControls']")
	WebElement HdfcErgoImage;
	//Actions:
			public String validateLoginPageTitle(){
				return driver.getTitle();
			}
			
			public boolean validateHdfcErgoImage(){
				return HdfcErgoImage.isDisplayed();
			}
			
			public HomePage login(String un, String pwd){
				username.sendKeys(un);
				password.sendKeys(pwd);
				loginBtn.click();
//				    JavascriptExecutor js = (JavascriptExecutor)driver;
//				    js.executeScript("arguments[0].click();", loginBtn);
			    	
				return new HomePage();
			}	
	
	
	
	
}
