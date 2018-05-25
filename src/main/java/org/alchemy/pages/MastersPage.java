package org.alchemy.pages;

import org.alchemy.Utility.Utility;
import org.alchemy.Utility.captureFailTestScreenshot;
import org.alchemy.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MastersPage extends TestBase {

	public static 
	@FindBy(xpath="//td[@class='dxgv' and contains(text(),'01fcbbec-9f60-4cde-a21f-ab0e075912fd')]")
	WebElement DoubleClick;
	
	//td[@class='dxgv' and contains (text(),'127')]
	
	
	
	public MastersPage()
	{
		PageFactory.initElements(driver,this);
	}
	
	
	public static void clickOnViewDatailsOfMasters() throws InterruptedException
	{
		System.out.println("start masterpage");
	
		Thread.sleep(2000);
		
		Actions action = new Actions(driver);
		Utility.captureScreenshot(driver, "MouseHover");
		action.moveToElement(HomePage.MouseHover).build().perform();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		
		String newwindowhandle = driver.getWindowHandle();
		Utility.captureScreenshot(driver, "newwindowhandle");
		System.out.println("click on risk master1");
		HomePage.MastersLink.click();
		Utility.captureScreenshot(driver, "MasterLinkclick");
		Thread.sleep(2000);
		HomePage.RiskMasterLink.clear();
		Utility.captureScreenshot(driver, "RiskMasterLinkClicked");
		Actions action1 = new Actions(driver);
		Utility.captureScreenshot(driver, "viewDetails");
		action1.moveToElement(DoubleClick).doubleClick().build().perform();
	}
	
}
