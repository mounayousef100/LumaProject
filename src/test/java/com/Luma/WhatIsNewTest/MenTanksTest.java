package com.Luma.WhatIsNewTest;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.Luma.Base.Base;
import com.Luma.WhatIsNewPage.MenTanksPage;

public class MenTanksTest extends Base{
	public WebDriver driver;
	private MenTanksPage menTanksPage;

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
		menTanksPage = new MenTanksPage(driver);
		menTanksPage.PantsPage();
	}

	@Test(priority = 2)
	public void OptionSTYLE() throws Throwable {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		menTanksPage = new MenTanksPage(driver);
		menTanksPage.CheckSTYLE();

	}

	@Test(priority = 3)
	public void OptionSTYLE2() throws Throwable {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		menTanksPage = new MenTanksPage(driver);
		menTanksPage.CheckSTYLE2();

	}

	@Test(priority = 4)
	public void OptionSize() throws Throwable {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		menTanksPage = new MenTanksPage(driver);
		menTanksPage.CheckSize();

	}

	@Test(priority = 5)
	public void OptionPrice() throws Throwable {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		menTanksPage = new MenTanksPage(driver);
		menTanksPage.CheckPrice();

	}

	@Test(priority = 6)
	public void OptionColor() throws Throwable {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		menTanksPage = new MenTanksPage(driver);
		menTanksPage.CheckColor();

	}
	@Test(priority = 7)
	public void OptionMaterial() throws Throwable {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		menTanksPage = new MenTanksPage(driver);
		menTanksPage.CheckMaterial();

	}

	@Test(priority = 8)
	public void OptionECOCOLLECTION() throws Throwable {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		menTanksPage = new MenTanksPage(driver);
		menTanksPage.CheckECOCOLLECTION();

	}

	@Test(priority = 9)
	public void OptionPERFORMANCEFABRIC() throws Throwable {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		menTanksPage = new MenTanksPage(driver);
		menTanksPage.CheckPERFORMANCEFABRIC();

	}

	@Test(priority = 10)
	public void OptionERINRECOMMENDS() throws Throwable {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		menTanksPage = new MenTanksPage(driver);
		menTanksPage.CheckERINRECOMMENDS();

	}
	
	@Test(priority = 11)
	public void OptionSNEW() throws Throwable {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		menTanksPage = new MenTanksPage(driver);
		menTanksPage.CheckNEW();

	}

	@Test(priority = 12)
	public void OptionSALE() throws Throwable {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		menTanksPage = new MenTanksPage(driver);
		menTanksPage.CheckSALE();

	}

	@Test(priority = 13)
	public void OptionCLIMATE() throws Throwable {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		menTanksPage = new MenTanksPage(driver);
		menTanksPage.CheckCLIMATE();

	}
}
