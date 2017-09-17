package com.test.one;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class TestClass2 {
	
	@Test
	public void sampleTest() throws MalformedURLException
	{
	DesiredCapabilities dc = DesiredCapabilities.chrome();
	dc.setPlatform(Platform.LINUX);
	 
	RemoteWebDriver driver=new RemoteWebDriver(new URL("http://ec2-54-153-101-150.us-west-1.compute.amazonaws.com:32768/wd/hub/"), dc);
	driver.get("https://www.google.com");
	System.out.println("navigated successfully ....!");
	List<WebElement> objLinks = driver.findElements(By.xpath("//a"));
	
	for(WebElement ele : objLinks)
	{
		System.out.println("Link name is : -" + ele.getText());
	}
	driver.quit();
	}

}
