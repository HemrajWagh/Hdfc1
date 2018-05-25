package org.alchemy.pages;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.alchemy.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public  class HomePage extends TestBase {
	

	
	public static
	@FindBy(xpath="//span[@id='ctl00_ContentPlaceHolder1_lblWish']")
	WebElement WelComeText;
	
	@FindBy(xpath="//span[@class='dxnb-ghtext' and contains (text(),'Home') ]")
	public static
	WebElement Home;
	
	@FindBy(xpath=".//*[@id='ctl00_ASPxNavBar1_GHC1']/a/span")
	public static
	WebElement Masters;
	
	@FindBy(xpath="//span[@class='dx-vam dx-wrap' and  contains(text(),'Risk Master')]")
	public static
	WebElement RiskMaster;
	
	@FindBy(xpath="//span[@class='dxnb-ghtext' and contains(Text(),'Mapping')]")
	public static
	WebElement Mapping;
	
	@FindBy(xpath="//label[@id='ctl00_lblName' and contains(text(),'Rutik')]")
	public static
	WebElement userNameLable;
	
	@FindBy(xpath=".//*[@id='ctl00_ASPxNavBar1_GHC1']/a/span")
	static
	WebElement MastersLink;
	
	@FindBy(xpath="//div[@id='ctl00_divnav']")
	public static
	WebElement MouseHover;
	
	@FindBy(xpath=".//*[@id='ctl00_ASPxNavBar1_I1i8_T']/span")
    static
	WebElement RiskMasterLink;
	
	
	@FindBy(xpath=".//*[@id='ctl00_btnAddNew_CD']/span")
	public static
	WebElement AddNewRecordRisk;
	
	@FindBy(xpath="")
	WebElement enterNewRecordRisk;
	
	@FindBy(xpath="  ")
	WebElement RiskDetails;

	
	@FindBy(xpath="//span[@class='dx-vam dx-wrap' and contains(text(),'KCI Master')]")
	public static
	WebElement KCIMaster;
	
	
	
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
	
 	public void enterRiskId(String NRisk) throws InterruptedException
 	{
 		
		Actions action = new Actions(driver);
	action.moveToElement(MouseHover).build().perform();
	try {			
		Thread.sleep(3000);
		} catch (InterruptedException e) {
		}
		
		String newwindowhandle = driver.getWindowHandle();
		driver.switchTo().window(newwindowhandle);
		MastersLink.click();
		Thread.sleep(2000);
		RiskMasterLink.click();
		Thread.sleep(2000);
		AddNewRecordRisk.click();
		Thread.sleep(2000);
 //		String newwindowhandle1 = driver.getWindowHandle();
  //	driver.switchTo().window(newwindowhandle1);
		System.out.println(newwindowhandle);
	//	System.out.println(newwindowhandle1);
		driver.findElement(By.xpath(".//*[@id='ASPxCallbackPanel1_riskrefid_I']")).sendKeys(NRisk);
		Thread.sleep(5000);
		enterNewRecordRisk.sendKeys(NRisk);
		
 	}
 	

 	public KCIMasterPage verifyClickOnKCIMasterLink() throws InterruptedException
 	{
 		
 		Actions action = new Actions(driver);
 		action.moveToElement(MouseHover).build().perform();
 		try {			
 			Thread.sleep(3000);
 			} catch (InterruptedException e) {
 			}
 			
 			String newwindowhandle = driver.getWindowHandle();
 			driver.switchTo().window(newwindowhandle);
 			MastersLink.click();
 			Thread.sleep(2000);
 			KCIMaster.click();
 			return new KCIMasterPage();
 	}
	
 	public static void ClickOnKCIMasterLink() throws InterruptedException
 	{
 		Thread.sleep(3000);
 		Actions action = new Actions(driver);
 		action.moveToElement(MouseHover).build().perform();
 		try {			
 			Thread.sleep(3000);
 			} catch (InterruptedException e) {
 			}
 			
 			String newwindowhandle = driver.getWindowHandle();
 			driver.switchTo().window(newwindowhandle);
 			MastersLink.click();
 			Thread.sleep(2000);
 			KCIMaster.click();
 	}
 	
	
}
