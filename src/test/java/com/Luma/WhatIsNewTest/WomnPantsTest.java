package com.Luma.WhatIsNewTest;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.Luma.Base.Base;
import com.Luma.WhatIsNewPage.WomnPantsPage;

public class WomnPantsTest extends Base {
	public WebDriver driver;
	private WomnPantsPage womnPantsPage;

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
	public void PantsPage() throws Throwable {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		womnPantsPage = new WomnPantsPage(driver);
		womnPantsPage.PantsPage();
	}

	@Test(priority = 2)
	public void OptionSTYLE() throws Throwable {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		womnPantsPage = new WomnPantsPage(driver);
		womnPantsPage.CheckSTYLE();

	}

	@Test(priority = 3)
	public void OptionSTYLE2() throws Throwable {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		womnPantsPage = new WomnPantsPage(driver);
		womnPantsPage.CheckSTYLE2();

	}

	@Test(priority = 4)
	public void OptionSize() throws Throwable {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		womnPantsPage = new WomnPantsPage(driver);
		womnPantsPage.CheckSize();

	}

	@Test(priority = 5)
	public void OptionPrice() throws Throwable {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		womnPantsPage = new WomnPantsPage(driver);
		womnPantsPage.CheckPrice();

	}

	@Test(priority = 6)
	public void OptionColor() throws Throwable {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		womnPantsPage = new WomnPantsPage(driver);
		womnPantsPage.CheckColor();

	}

	@Test(priority = 7)
	public void OptionMaterial() throws Throwable {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		womnPantsPage = new WomnPantsPage(driver);
		womnPantsPage.CheckMaterial();

	}

	@Test(priority = 8)
	public void OptionECOCOLLECTION() throws Throwable {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		womnPantsPage = new WomnPantsPage(driver);
		womnPantsPage.CheckECOCOLLECTION();

	}

	@Test(priority = 9)
	public void OptionPERFORMANCEFABRIC() throws Throwable {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		womnPantsPage = new WomnPantsPage(driver);
		womnPantsPage.CheckPERFORMANCEFABRIC();

	}

	@Test(priority = 10)
	public void OptionERINRECOMMENDS() throws Throwable {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		womnPantsPage = new WomnPantsPage(driver);
		womnPantsPage.CheckERINRECOMMENDS();

	}

	@Test(priority = 11)
	public void OptionSALE() throws Throwable {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		womnPantsPage = new WomnPantsPage(driver);
		womnPantsPage.CheckSALE();

	}

	@Test(priority = 12)
	public void OptionCLIMATE() throws Throwable {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		womnPantsPage = new WomnPantsPage(driver);
		womnPantsPage.CheckCLIMATE();

	}

}
