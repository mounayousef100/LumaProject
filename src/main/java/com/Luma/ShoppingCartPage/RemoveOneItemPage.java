package com.Luma.ShoppingCartPage;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.AssertJUnit;
import org.testng.asserts.SoftAssert;
import com.Luma.ActionDriver.Action;
import com.Luma.Base.Base;

public class RemoveOneItemPage {
	public WebDriver driver;
	Action action = new Action();
	SoftAssert softassertProcess = new SoftAssert();

	public RemoveOneItemPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "div[class='panel header'] li[data-label='or'] a")
	private WebElement SginIn;

	@FindBy(name = "login[username]")
	private WebElement EmailField;

	@FindBy(name = "login[password]")
	private WebElement PasswordField;

	@FindBy(xpath = "//fieldset[@class='fieldset login']//span[contains(text(),'Sign In')]")
	private WebElement SginInButton;

	@FindBy(xpath = "/html/body/div[2]/header/div[1]/div/ul/li[1]/span")
	private WebElement CheekWelcome;

	@FindBy(xpath = "/html/body/div[2]/header/div[1]/div/ul/li[2]/span/button")
	private WebElement Welcome;

	@FindBy(xpath = "//span[normalize-space()='Men']")
	private WebElement Men;

	@FindBy(xpath = "//a[contains(text(),'Pants')]")
	private WebElement Pants;

	@FindBy(xpath = " //img[@alt='Viktor LumaTech™ Pant']")
	private WebElement productClick;

	@FindBy(id = "option-label-size-143-item-175")
	private WebElement Size32;

	@FindBy(id = "option-label-color-93-item-58")
	private WebElement Colorred;

	@FindBy(id = "product-addtocart-button")
	private WebElement AddToCartButton;

	@FindBy(className = "counter-number")
	private WebElement Cart;

	@FindBy(className = "count")
	private WebElement AddCart;

	@FindBy(xpath = "//*[@id=\"minicart-content-wrapper\"]/div[2]/strong")
	private WebElement CountItemInCart;

	@FindBy(className = "price")
	private WebElement Totalprice;

	@FindBy(xpath = "//*[@id=\"mini-cart\"]/li/div/div/div[2]/div[1]/span/span")
	private WebElement price;

	@FindBy(xpath = "//*[@id=\"mini-cart\"]/li/div/div/div[3]/div[2]/a")
	private WebElement Remove;

	@FindBy(xpath = "/html/body/div[4]/aside[2]/div[2]/footer/button[2]")
	private WebElement RemoveOk;

	public void Remove_one_item_page() throws Throwable {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Base.takeScreenshot(null, driver);
		action.click(driver, SginIn);
		Base.takeScreenshot(null, driver);
		Thread.sleep(3000);
		String Email = "efgthyu@gmail.com";
		action.typestring(EmailField, Email);
		Thread.sleep(2000);
		String Password = "123mouna@";
		action.typestring(PasswordField, Password);
		Thread.sleep(2000);
		action.click(driver, SginInButton);
		Thread.sleep(3000);
		Base.takeScreenshot(null, driver);
		String actMassage = action.getText(CheekWelcome);
		String ExpectMassage = "Welcome, mouna yousef!";
		AssertJUnit.assertEquals(actMassage, ExpectMassage);
		Thread.sleep(4000);
		action.click(driver, Men);
		action.click(driver, Pants);
		action.click(driver, productClick);
		Thread.sleep(3000);
		action.click(driver, Size32);
		action.click(driver, Colorred);
		Thread.sleep(3000);
		action.click(driver, AddToCartButton);
		Thread.sleep(3000);
		Thread.sleep(3000);
		action.click(driver, Cart);
		Thread.sleep(3000);
		String AcCountCart = action.getText(AddCart);
		System.out.println("The add in cart :  " + AcCountCart);
		Thread.sleep(3000);
		String ExCountCart = "1";
		softassertProcess.assertEquals(AcCountCart, ExCountCart);
		String Price = action.getText(price);
		String FinalPrice = Price.replaceAll("[$,]", "");
		Double Acfinal_price = Double.parseDouble(FinalPrice);
		System.out.println("The price :  " + Acfinal_price);
		Double ExPrice = 46.0;
		softassertProcess.assertEquals(Acfinal_price, ExPrice);
		Thread.sleep(3000);
		action.click(driver, Remove);
		Thread.sleep(2000);
		action.click(driver, RemoveOk);
		Thread.sleep(3000);
		String AcCountItemInCart = action.getText(CountItemInCart);
		System.out.println(AcCountItemInCart);
		String ExCountItemInCart = "You have no items in your shopping cart.";
		AssertJUnit.assertEquals(AcCountItemInCart, ExCountItemInCart);
		softassertProcess.assertAll();
	
	}
}
