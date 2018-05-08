package org.alchemy.pages;

import org.alchemy.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends TestBase {

	
	@FindBy(xpath="//span[@id='ctl00_ContentPlaceHolder1_lblWish']")
	WebElement WelComeText;
	
	@FindBy(xpath="//span[@class='dxnb-ghtext' and contains (text(),'Home') ]")
	WebElement Home;
	
	@FindBy(xpath="//span[@class='dxnb-ghtext' and contains(Text(),'Masters')]")
	WebElement Master;
	
	@FindBy(xpath="//span[@class='dxnb-ghtext' and contains(Text(),'Mapping')]")
	WebElement Mapping;
	
	
	public HomePage(){
		PageFactory.initElements(driver,this);
	}
	
	
	
	public void validateHomePage()
	{
		Actions action = new Actions(driver);
		WebElement we = driver.findElement(By.xpath(""));
		action.moveToElement(we).build().perform();
		
	}
	
	public String validateMastersPageTitle()
	{
		Actions action = new Actions(driver);
	WebElement we = driver.findElement(By.xpath(""));
	action.moveToElement(we).build().perform();
		return driver.getTitle();
	}
	
	
	
}
