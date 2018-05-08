package org.alchemy.testcases;

import org.alchemy.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HomePageTest extends TestBase {

	
	public HomePageTest()
	{
		super();
	}
	
	public void HomePageTitleTest()
	{
	
		Actions action = new Actions(driver);
		WebElement we = driver.findElement(By.xpath(""));
		action.moveToElement(we).build().perform();

	}
	
		
	
}
