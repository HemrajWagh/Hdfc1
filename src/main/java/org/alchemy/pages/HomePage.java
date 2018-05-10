package org.alchemy.pages;

import java.util.List;

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
	
	@FindBy(xpath=".//*[@id='ctl00_ASPxNavBar1_GHC1']/a/span")
	WebElement Masters;
	
	@FindBy(xpath="//span[@class='dx-vam dx-wrap' and  contains(text(),'Risk Master')]")
	WebElement RiskMaster;
	
	@FindBy(xpath="//span[@class='dxnb-ghtext' and contains(Text(),'Mapping')]")
	WebElement Mapping;
	
	@FindBy(xpath="//label[@id='ctl00_lblName' and contains(text(),'Priyanka')]")
	WebElement userNameLable;
	
	@FindBy(xpath=".//*[@id='ctl00_ASPxNavBar1_GHC1']/a/span")
	WebElement MastersLink;
	
	@FindBy(xpath="//div[@id='ctl00_divnav']")
	WebElement MouseHover;
	
	@FindBy(xpath=".//*[@id='ctl00_ASPxNavBar1_I1i8_T']/span")
	WebElement RiskMasterLink;
	
	@FindBy(xpath=".//*[@id='ctl00_btnAddNew_CD']/span")
	WebElement AddNewRecordRisk;
	
	public HomePage(){
		PageFactory.initElements(driver,this);
	}
	
	
	
	public String validateHomePageTitle()
	{		
		return driver.getTitle();
	}
	
	public boolean verifyCorrectUserName()
	{
		return  userNameLable.isDisplayed();
	}
	
	
	public MastersPage verifyclickOnMastersLink() throws InterruptedException
	{
		Actions action = new Actions(driver);
		action.moveToElement(MouseHover).build().perform();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		
		String newwindowhandle = driver.getWindowHandle();
		
		MastersLink.click();
		Thread.sleep(2000);
		return new MastersPage();
	}
	
	
	
	public  RiskMastersPage verifyclickOnRiskMastersLink() throws InterruptedException
	{
		Actions action = new Actions(driver);
		action.moveToElement(MouseHover).build().perform();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		
		String newwindowhandle = driver.getWindowHandle();
		MastersLink.click();
		Thread.sleep(2000);
		RiskMasterLink.click();
		Thread.sleep(2000);
		
		return new RiskMastersPage();
		
	}
	
	
	public void clickOnRiskMastersLink() throws InterruptedException
	{
		Actions action = new Actions(driver);
		action.moveToElement(MouseHover).build().perform();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		
		String newwindowhandle = driver.getWindowHandle();
		MastersLink.click();
		Thread.sleep(2000);
		RiskMasterLink.click();
		Thread.sleep(2000);
	}
	
	public void addNewRecordRisk() throws InterruptedException
	{
		Actions action = new Actions(driver);
		action.moveToElement(MouseHover).build().perform();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		}
		
		String newwindowhandle = driver.getWindowHandle();
		MastersLink.click();
		Thread.sleep(2000);
		RiskMasterLink.click();
		Thread.sleep(2000);
		AddNewRecordRisk.click();
		Thread.sleep(5000);
	}
	
 	public void enterRiskId()
 	{
 		
 	}
	

	
}
