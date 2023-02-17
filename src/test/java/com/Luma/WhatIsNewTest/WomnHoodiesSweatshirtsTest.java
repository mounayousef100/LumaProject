package com.Luma.WhatIsNewTest;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.Luma.Base.Base;
import com.Luma.WhatIsNewPage.WomnHoodiesSweatshirtsPage;

public class WomnHoodiesSweatshirtsTest extends Base {
	public WebDriver driver;
	private WomnHoodiesSweatshirtsPage womnHoodies;

	@BeforeMethod
	public void OpenPage() throws IOException, InterruptedException {
		driver = intializEDriver();
		driver.get(prop.getProperty("url"));
	}

	@AfterMethod
	public void Clouser() {
		 driver.quit();
	}

	@Test(priority = 1)
	public void HoodiesSweatshirtsPage() throws Throwable {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 womnHoodies = new WomnHoodiesSweatshirtsPage(driver);
		 womnHoodies.HoodiesSweatshirtsPage();
	}

	@Test(priority = 2)
	public void OptionSTYLE() throws Throwable {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 womnHoodies = new WomnHoodiesSweatshirtsPage(driver);
		 womnHoodies.CheckSTYLE();

	}

	@Test(priority = 3)
	public void OptionSTYLE2() throws Throwable {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 womnHoodies = new WomnHoodiesSweatshirtsPage(driver);
		 womnHoodies.CheckSTYLE2();

	}

	@Test(priority = 4)
	public void OptionSize() throws Throwable {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 womnHoodies = new WomnHoodiesSweatshirtsPage(driver);
		 womnHoodies.CheckSize();

	}

	@Test(priority = 5)
	public void OptionPrice() throws Throwable {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 womnHoodies = new WomnHoodiesSweatshirtsPage(driver);
		 womnHoodies.CheckPrice();

	}

	@Test(priority = 6)
	public void OptionColor() throws Throwable {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 womnHoodies = new WomnHoodiesSweatshirtsPage(driver);
		 womnHoodies.CheckColor();

	}
	@Test(priority = 7)
	public void OptionMaterial() throws Throwable {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 womnHoodies = new WomnHoodiesSweatshirtsPage(driver);
		 womnHoodies.CheckMaterial();

	}

	@Test(priority = 8)
	public void OptionECOCOLLECTION() throws Throwable {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 womnHoodies = new WomnHoodiesSweatshirtsPage(driver);
		 womnHoodies.CheckECOCOLLECTION();

	}

	@Test(priority = 9)
	public void OptionPERFORMANCEFABRIC() throws Throwable {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 womnHoodies = new WomnHoodiesSweatshirtsPage(driver);
		 womnHoodies.CheckPERFORMANCEFABRIC();

	}

	@Test(priority = 10)
	public void OptionERINRECOMMENDS() throws Throwable {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 womnHoodies = new WomnHoodiesSweatshirtsPage(driver);
		 womnHoodies.CheckERINRECOMMENDS();

	}

	@Test(priority = 11)
	public void OptionSALE() throws Throwable {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 womnHoodies = new WomnHoodiesSweatshirtsPage(driver);
		 womnHoodies.CheckSALE();

	}

	@Test(priority = 12)
	public void OptionCLIMATE() throws Throwable {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 womnHoodies = new WomnHoodiesSweatshirtsPage(driver);
		 womnHoodies.CheckCLIMATE();

	}

}
