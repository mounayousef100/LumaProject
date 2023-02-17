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

public class MenJacketsPage {
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
	SoftAssert mysoft13 = new SoftAssert();
	public double minPrice = 70.0;
	public double maxPrice = 79.0;

	public MenJacketsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@id='ui-id-3']")
	private WebElement WhatsNew;

	@FindBy(xpath = "//*[@id=\"maincontent\"]/div[4]/div[2]/div/div/ul[1]/li[2]/a")
	private WebElement Jackets;

	@FindBy(className = "product-item-link")
	private List<WebElement> Search;

	@FindBy(xpath = "//*[@id=\"narrow-by-list\"]/div[1]/div[1]")
	private WebElement STYLE;

	@FindBy(xpath = "//*[@id=\"narrow-by-list\"]/div[1]/div[2]/ol/li[4]/a")
	private WebElement Hooded;

	@FindBy(xpath = "//*[@id=\"narrow-by-list\"]/div[1]/div[2]/ol/li[13]/a")
	private WebElement Pullover;

	@FindBy(xpath = "//*[@id=\"narrow-by-list\"]/div[2]/div[1]")
	private WebElement Size;

	@FindBy(xpath = "//*[@id=\"narrow-by-list\"]/div[2]/div[2]/div/div/a[2]/div")
	private WebElement SizeS;

	@FindBy(className = "swatch-option text selected")
	private List<WebElement> SearchSize;

	@FindBy(xpath = "//div[normalize-space()='Price']")
	private WebElement Price;

	@FindBy(xpath = "//*[@id=\"narrow-by-list\"]/div[3]/div[2]/ol/li[4]/a")
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

	@FindBy(xpath = "//*[@id=\"narrow-by-list\"]/div[5]/div[2]/ol/li[9]/a")
	private WebElement OptionMaterialSpandex;

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

	@FindBy(xpath = "//*[@id=\"narrow-by-list\"]/div[9]/div[1]")
	private WebElement NEW;

	@FindBy(xpath = "//*[@id=\"narrow-by-list\"]/div[9]/div[2]/ol/li[1]/a")
	private WebElement NEWYes;

	@FindBy(xpath = "//*[@id=\"narrow-by-list\"]/div[10]/div[1]")
	private WebElement SALE;

	@FindBy(xpath = "//*[@id=\"narrow-by-list\"]/div[10]/div[2]/ol/li[1]/a")
	private WebElement SALEYes;

	@FindBy(xpath = "//*[@id=\"narrow-by-list\"]/div[12]/div[1]")
	private WebElement CLIMATE;

	@FindBy(xpath = "//*[@id=\"narrow-by-list\"]/div[12]/div[2]/ol/li[4]/a")
	private WebElement Indoor;

	public void PantsPage() throws Throwable {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		action.click(driver, WhatsNew);
		action.click(driver, Jackets);
		Thread.sleep(3000);
		Base.takeScreenshot(null, driver);
		for (int i = 0; i < Search.size(); i++) {
			String result = Search.get(i).getText();
			boolean checkSearch = result.contains("Jackets");
			mysoft.assertEquals(checkSearch, true, "check All the items displayed contains Jackets .");
			mysoft.assertAll();
		}
	}

	public void CheckSTYLE() throws Throwable {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		action.click(driver, WhatsNew);
		action.click(driver, Jackets);
		action.click(driver, STYLE);
		action.click(driver, Hooded);
		Thread.sleep(3000);
		for (int i = 0; i < Search.size(); i++) {
			String result = Search.get(i).getText();
			boolean checkSearch = result.contains("Hood");
			mysoft2.assertEquals(checkSearch, true, "check All the items displayed contains STYLE Hooded .");
			mysoft2.assertAll();
		}
	}

	public void CheckSTYLE2() throws Throwable {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		action.click(driver, WhatsNew);
		action.click(driver, Jackets);
		action.click(driver, STYLE);
		action.click(driver, Pullover);
		Thread.sleep(3000);
		for (int i = 0; i < Search.size(); i++) {
			String result = Search.get(i).getText();
			boolean checkSearch = result.contains("Pullover");
			mysoft3.assertEquals(checkSearch, true, "check All the items displayed contains STYLE Pullover .");
			mysoft3.assertAll();
		}

	}

	public void CheckSize() throws Throwable {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		action.click(driver, WhatsNew);
		action.click(driver, Jackets);
		Thread.sleep(2000);
		action.click(driver, Size);
		action.click(driver, SizeS);
		Thread.sleep(3000);
		for (int i = 0; i < SearchSize.size(); i++) {
			String result = SearchSize.get(i).getText();
			boolean checkSearch = result.contains("S");
			mysoft4.assertEquals(checkSearch, true, "check All the items displayed Size S .");
			mysoft4.assertAll();
		}

	}

	public void CheckPrice() throws Throwable {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		action.click(driver, WhatsNew);
		action.click(driver, Jackets);
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
						"check All the items displayed price between $70.00 - $79.99 .");
				mysoft5.assertAll();
			} else {
				boolean checkSearch = false;
				mysoft5.assertEquals(checkSearch, true,
						"check All the items displayed price between $70.00 - $79.99 .");
				mysoft5.assertAll();
			}

		}

	}

	public void CheckColor() throws Throwable {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		action.click(driver, WhatsNew);
		action.click(driver, Jackets);
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
		action.click(driver, Jackets);
		Thread.sleep(2000);
		action.click(driver, Material);
		action.click(driver, OptionMaterialSpandex);
		Thread.sleep(3000);
		String result = NowShoppingfiltervalue.getText();
		boolean checkSearch = result.equalsIgnoreCase("Spandex");
		mysoft7.assertEquals(checkSearch, true, "check the displayed Now Shopping Material Spandex .");
		mysoft7.assertAll();
	}

	public void CheckECOCOLLECTION() throws Throwable {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		action.click(driver, WhatsNew);
		action.click(driver, Jackets);
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
		action.click(driver, Jackets);
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
		action.click(driver, Jackets);
		Thread.sleep(2000);
		action.click(driver, ERINRECOMMENDS);
		action.click(driver, ERINRECOMMENDSYes);
		Thread.sleep(3000);
		String result = NowShoppingfiltervalue.getText();
		boolean checkSearch = result.equalsIgnoreCase("Yes");
		mysoft10.assertEquals(checkSearch, true, "check the displayed Now Shopping ERIN RECOMMENDS Yes .");
		mysoft10.assertAll();
	}

	public void CheckNEW() throws Throwable {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		action.click(driver, WhatsNew);
		action.click(driver, Jackets);
		Thread.sleep(2000);
		action.click(driver, NEW);
		action.click(driver, NEWYes);
		Thread.sleep(3000);
		String result = NowShoppingfiltervalue.getText();
		boolean checkSearch = result.equalsIgnoreCase("Yes");
		mysoft11.assertEquals(checkSearch, true, "check the displayed Now Shopping ERIN RECOMMENDS Yes .");
		mysoft11.assertAll();
	}

	public void CheckSALE() throws Throwable {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		action.click(driver, WhatsNew);
		action.click(driver, Jackets);
		Thread.sleep(2000);
		action.click(driver, SALE);
		action.click(driver, SALEYes);
		Thread.sleep(3000);
		String result = NowShoppingfiltervalue.getText();
		boolean checkSearch = result.equalsIgnoreCase("Yes");
		mysoft12.assertEquals(checkSearch, true, "check the displayed Now Shopping SALE Yes .");
		mysoft12.assertAll();
	}

	public void CheckCLIMATE() throws Throwable {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		action.click(driver, WhatsNew);
		action.click(driver, Jackets);
		Thread.sleep(2000);
		action.click(driver, CLIMATE);
		action.click(driver, Indoor);
		Thread.sleep(3000);
		String result = NowShoppingfiltervalue.getText();
		boolean checkSearch = result.equalsIgnoreCase("Indoor");
		mysoft13.assertEquals(checkSearch, true, "check the displayed Now Shopping Indoor .");
		mysoft13.assertAll();
	}

}
