package com.test.one;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class TestClass2 {
	
	@Test
	public void sampleTest() throws MalformedURLException
	{
	DesiredCapabilities dc = DesiredCapabilities.chrome();
	dc.setPlatform(Platform.LINUX);
	 
	RemoteWebDriver driver=new RemoteWebDriver(new URL("http://192.168.99.100:32768/wd/hub/"), dc);
	driver.get("https://www.google.com");
	System.out.println("navigated successfully ....!");
	driver.quit();
	
	}

}
