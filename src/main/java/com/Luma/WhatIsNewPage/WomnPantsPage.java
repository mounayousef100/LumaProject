package com.Luma.WhatIsNewPage;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;
import com.Luma.ActionDriver.Action;
import com.Luma.Base.Base;

public class WomnPantsPage {
	public WebDriver driver;
	Action action = new Action();
	SoftAssert mysoft = new SoftAssert();
	SoftAssert mysoft2 = new SoftAssert();
	SoftAssert mysoft3 = new SoftAssert();
	SoftAssert mysoft4 = new SoftAssert();
	SoftAssert mysoft5 = new SoftAssert();
	SoftAssert mysoft6 = new SoftAssert();
	SoftAssert mysoft7 = new SoftAssert();
	SoftAssert mysoft8 = new SoftAssert();
	SoftAssert mysoft9 = new SoftAssert();
	SoftAssert mysoft10 = new SoftAssert();
	SoftAssert mysoft11 = new SoftAssert();
	SoftAssert mysoft12 = new SoftAssert();
	public double minPrice = 30.0;
	public double maxPrice = 39.0;

	public WomnPantsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@id='ui-id-3']")
	private WebElement WhatsNew;

	@FindBy(xpath = "//main[@id='maincontent']//ul[1]//li[5]//a[1]")
	private WebElement Pants;

	@FindBy(className = "product-item-link")
	private List<WebElement> Search;

	@FindBy(xpath = "//*[@id=\"narrow-by-list\"]/div[1]/div[1]")
	private WebElement STYLE;

	@FindBy(xpath = "//div[@id='narrow-by-list']//div[1]//div[2]//ol[1]//li[1]//a[1]")
	private WebElement Capri;

	@FindBy(xpath = "//div[@id='narrow-by-list']//div[1]//div[2]//ol[1]//li[3]//a[1]")
	private WebElement Leggings;

	@FindBy(xpath = "//*[@id=\"narrow-by-list\"]/div[2]/div[1]")
	private WebElement Size;

	@FindBy(xpath = "//*[@id=\"narrow-by-list\"]/div[2]/div[2]/div/div/a[2]/div")
	private WebElement Size29;

	@FindBy(className = "swatch-option text selected")
	private List<WebElement> SearchSize;

	@FindBy(xpath = "//div[normalize-space()='Price']")
	private WebElement Price;

	@FindBy(xpath = "//*[@id=\"narrow-by-list\"]/div[3]/div[2]/ol/li[1]/a")
	private WebElement OptionPrice;

	@FindBy(className = "price-wrapper")
	private List<WebElement> SearchPrice;

	@FindBy(xpath = "//div[normalize-space()='Color']")
	private WebElement Color;

	@FindBy(xpath = "//*[@id=\"narrow-by-list\"]/div[4]/div[2]/div/div/a[1]/div")
	private WebElement OptionColorBlack;

	@FindBy(id = "option-label-color-93-item-49")
	private List<WebElement> SearchColor;

	@FindBy(xpath = "//div[normalize-space()='Material']")
	private WebElement Material;

	@FindBy(xpath = "//*[@id=\"narrow-by-list\"]/div[5]/div[2]/ol/li[1]/a")
	private WebElement OptionMaterialCocona;

	@FindBy(className = "filter-value")
	private WebElement NowShoppingfiltervalue;

	@FindBy(xpath = "//div[normalize-space()='Material']")
	private WebElement MaterialCotton;

	@FindBy(xpath = "//*[@id=\"narrow-by-list\"]/div[6]/div[1]")
	private WebElement EcoCollection;

	@FindBy(xpath = "//*[@id=\"narrow-by-list\"]/div[6]/div[2]/ol/li[1]/a")
	private WebElement EcoCollectionYes;

	@FindBy(xpath = "//*[@id=\"narrow-by-list\"]/div[7]/div[1]")
	private WebElement PERFORMANCEFABRIC;

	@FindBy(xpath = "//*[@id=\"narrow-by-list\"]/div[7]/div[2]/ol/li[1]/a")
	private WebElement PERFORMANCEFABRICYes;

	@FindBy(xpath = "//*[@id=\"narrow-by-list\"]/div[8]/div[1]")
	private WebElement ERINRECOMMENDS;

	@FindBy(xpath = "//*[@id=\"narrow-by-list\"]/div[8]/div[2]/ol/li[1]/a")
	private WebElement ERINRECOMMENDSYes;

	@FindBy(xpath = "//*[@id=\"narrow-by-list\"]/div[10]/div[1]")
	private WebElement SALE;

	@FindBy(xpath = "//*[@id=\"narrow-by-list\"]/div[10]/div[2]/ol/li[1]/a")
	private WebElement SALENo;

	@FindBy(xpath = "//*[@id=\"narrow-by-list\"]/div[12]/div[1]")
	private WebElement CLIMATE;

	@FindBy(xpath = "//*[@id=\"narrow-by-list\"]/div[12]/div[2]/ol/li[1]/a")
	private WebElement AllWeather;

	public void PantsPage() throws Throwable {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		action.click(driver, WhatsNew);
		action.click(driver, Pants);
		Thread.sleep(3000);
		Base.takeScreenshot(null, driver);
		System.out.println("check All the items displayed contains Pants .");
		for (int i = 0; i < Search.size(); i++) {
			String result = Search.get(i).getText();
			boolean checkSearch = result.contains("Pant");
			mysoft.assertEquals(checkSearch, true, "check All the items displayed contains  Pants.");
			mysoft.assertAll();
		}
	}

	public void CheckSTYLE() throws Throwable {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		action.click(driver, WhatsNew);
		action.click(driver, Pants);
		action.click(driver, STYLE);
		action.click(driver, Capri);
		Thread.sleep(3000);
		for (int i = 0; i < Search.size(); i++) {
			String result = Search.get(i).getText();
			boolean checkSearch = result.contains("Capri");
			mysoft2.assertEquals(checkSearch, true, "check All the items displayed contains STYLE Capri .");
			mysoft2.assertAll();
		}
	}

	public void CheckSTYLE2() throws Throwable {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		action.click(driver, WhatsNew);
		action.click(driver, Pants);
		action.click(driver, STYLE);
		action.click(driver, Leggings);
		Thread.sleep(3000);
		for (int i = 0; i < Search.size(); i++) {
			String result = Search.get(i).getText();
			boolean checkSearch = result.contains("Leggings");
			mysoft3.assertEquals(checkSearch, true, "check All the items displayed contains STYLE Leggings .");
			mysoft3.assertAll();
		}

	}

	public void CheckSize() throws Throwable {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		action.click(driver, WhatsNew);
		action.click(driver, Pants);
		Thread.sleep(2000);
		action.click(driver, Size);
		action.click(driver, Size29);
		Thread.sleep(3000);
		for (int i = 0; i < SearchSize.size(); i++) {
			String result = SearchSize.get(i).getText();
			boolean checkSearch = result.contains("29");
			mysoft4.assertEquals(checkSearch, true, "check All the items displayed Size 29 .");
			mysoft4.assertAll();
		}

	}

	public void CheckPrice() throws Throwable {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		action.click(driver, WhatsNew);
		action.click(driver, Pants);
		Thread.sleep(2000);
		action.click(driver, Price);
		action.click(driver, OptionPrice);
		Thread.sleep(3000);
		for (int i = 0; i < SearchPrice.size(); i++) {
			String result = SearchPrice.get(i).getText();
			String FinalPrice = result.replaceAll("[$,]", "");
			Double FinalResult = Double.parseDouble(FinalPrice);
			if (FinalResult >= minPrice && FinalResult <= maxPrice) {
				boolean checkSearch = true;
				mysoft5.assertEquals(checkSearch, true,
						"check All the items displayed price between $30.00 - $39.99 .");
				mysoft5.assertAll();
			} else {
				boolean checkSearch = false;
				mysoft5.assertEquals(checkSearch, true,
						"check All the items displayed price between $30.00 - $39.99 .");
				mysoft5.assertAll();
			}

		}

	}

	public void CheckColor() throws Throwable {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		action.click(driver, WhatsNew);
		action.click(driver, Pants);
		Thread.sleep(2000);
		action.click(driver, Color);
		action.click(driver, OptionColorBlack);
		Thread.sleep(3000);
		for (int i = 0; i < SearchColor.size(); i++) {
			String result = SearchColor.get(i).getAttribute("class");
			boolean checkSearch = result.contains("selected");
			mysoft6.assertEquals(checkSearch, true, "check the items displayed selected Black color .");
			mysoft6.assertAll();
		}
	}

	public void CheckMaterial() throws Throwable {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		action.click(driver, WhatsNew);
		action.click(driver, Pants);
		Thread.sleep(2000);
		action.click(driver, Material);
		action.click(driver, OptionMaterialCocona);
		Thread.sleep(3000);
		String result = NowShoppingfiltervalue.getText();
		boolean checkSearch = result.equalsIgnoreCase("Cocona® performance fabric");
		mysoft7.assertEquals(checkSearch, true,
				"check the displayed Now Shopping Material Cocona® performance fabric .");
		mysoft7.assertAll();
	}

	public void CheckECOCOLLECTION() throws Throwable {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		action.click(driver, WhatsNew);
		action.click(driver, Pants);
		Thread.sleep(2000);
		action.click(driver, EcoCollection);
		action.click(driver, EcoCollectionYes);
		Thread.sleep(3000);
		String result = NowShoppingfiltervalue.getText();
		boolean checkSearch = result.equalsIgnoreCase("Yes");
		mysoft8.assertEquals(checkSearch, true, "check the displayed Now Shopping Eco Collection Yes .");
		mysoft8.assertAll();
	}

	public void CheckPERFORMANCEFABRIC() throws Throwable {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		action.click(driver, WhatsNew);
		action.click(driver, Pants);
		Thread.sleep(2000);
		action.click(driver, PERFORMANCEFABRIC);
		action.click(driver, PERFORMANCEFABRICYes);
		Thread.sleep(3000);
		String result = NowShoppingfiltervalue.getText();
		boolean checkSearch = result.equalsIgnoreCase("Yes");
		mysoft9.assertEquals(checkSearch, true, "check the displayed Now Shopping PERFORMANCE FABRIC Yes .");
		mysoft9.assertAll();
	}

	public void CheckERINRECOMMENDS() throws Throwable {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		action.click(driver, WhatsNew);
		action.click(driver, Pants);
		Thread.sleep(2000);
		action.click(driver, ERINRECOMMENDS);
		action.click(driver, ERINRECOMMENDSYes);
		Thread.sleep(3000);
		String result = NowShoppingfiltervalue.getText();
		boolean checkSearch = result.equalsIgnoreCase("Yes");
		mysoft10.assertEquals(checkSearch, true, "check the displayed Now Shopping ERIN RECOMMENDS Yes .");
		mysoft10.assertAll();
	}

	public void CheckSALE() throws Throwable {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		action.click(driver, WhatsNew);
		action.click(driver, Pants);
		Thread.sleep(2000);
		action.click(driver, SALE);
		action.click(driver, SALENo);
		Thread.sleep(3000);
		String result = NowShoppingfiltervalue.getText();
		boolean checkSearch = result.equalsIgnoreCase("No");
		mysoft11.assertEquals(checkSearch, true, "check the displayed Now Shopping SALE No .");
		mysoft11.assertAll();
	}

	public void CheckCLIMATE() throws Throwable {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		action.click(driver, WhatsNew);
		action.click(driver, Pants);
		Thread.sleep(2000);
		action.click(driver, CLIMATE);
		action.click(driver, AllWeather);
		Thread.sleep(3000);
		String result = NowShoppingfiltervalue.getText();
		boolean checkSearch = result.equalsIgnoreCase("All-Weather");
		mysoft12.assertEquals(checkSearch, true, "check the displayed Now Shopping All-Weather .");
		mysoft12.assertAll();
	}

}
