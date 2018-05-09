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
	
	@FindBy(xpath="//span[@class='dxnb-ghtext' and contains(Text(),'Masters')]")
	WebElement Masters;
	
	@FindBy(xpath="//span[@class='dx-vam dx-wrap' and  contains(text(),'Risk Master')]")
	WebElement RiskMaster;
	
	@FindBy(xpath="//span[@class='dxnb-ghtext' and contains(Text(),'Mapping')]")
	WebElement Mapping;
	
	@FindBy(xpath="//label[@id='ctl00_lblName' and contains(text(),'Priyanka')]")
	WebElement userNameLable;
	
	@FindBy(xpath="//span[@class='dxnb-ghtext' and contains(text(),'Masters')]")
	WebElement MastersLink;

//	@FindBy(xpath="//div[@class='dxnb-headerCollapsed menuselected']")
//	WebElement MouseHover;
	
	@FindBy(xpath="//div[@id='ctl00_ASPxNavBar1_GHC0']")
	WebElement MouseHover;
	
	@FindBy(xpath="")
	WebElement RiskMasterPage;
	
	
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
	
	public void verifyclickOnMastersLink()
	{
		Actions action = new Actions(driver);
		action.moveToElement(MouseHover).build().perform();
		List<WebElement> HomePageMenu = driver.findElements(By.xpath("//div[@id='ctl00_divnav']"));
		
		System.out.println(HomePageMenu.toString());
		//MastersLink.click();
		//return new MastersPage();
	}
	
	
	
	
//	public ContactsPage clickOnContactsLink(){
//		contactsLink.click();
//		return new ContactsPage();
//	}
//	
//	
//	
//	public void clickOnNewContactLink(){
//		Actions action = new Actions(driver);
//		action.moveToElement(contactsLink).build().perform();
//		newContactLink.click();
//		
//	}
	
//	public String validateMastersPageTitle()
//	{
//		Actions action = new Actions(driver);
//		WebElement we = driver.findElement(By.xpath("//span[@class='dxnb-ghtext' and contains(Text(),'Masters')]"));
//		action.moveToElement(we).build().perform();
//		return driver.getTitle();
//	}
	
	public void clickOnRiskMaster()
	{
		//return RiskMasterPage;
	}



//	private  RiskMasterPage() {
//		
//	}
	
}
