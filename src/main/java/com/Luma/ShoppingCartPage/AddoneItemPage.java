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

public class AddoneItemPage {
	public WebDriver driver;
	Action action = new Action();
	SoftAssert softassertProcess = new SoftAssert();

	public AddoneItemPage(WebDriver driver) {
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

	@FindBy(xpath = "//span[normalize-space()='Men']")
	private WebElement Men;

	@FindBy(xpath = "//a[contains(text(),'Jackets')]")
	private WebElement Jackets;

	@FindBy(xpath = " //img[@alt='Orion Two-Tone Fitted Jacket']")
	private WebElement productClick;

	@FindBy(id = "option-label-size-143-item-167")
	private WebElement SizeS;

	@FindBy(id = "option-label-color-93-item-60")
	private WebElement ColorYallow;

	@FindBy(id = "product-addtocart-button")
	private WebElement AddToCartButton;

	@FindBy(className = "counter-number")
	private WebElement Cart;
	
	@FindBy(className = "count")
	private WebElement AddCart;

	@FindBy(className = "price")
	private WebElement price;
	
	@FindBy(xpath = "/html/body/div[2]/header/div[1]/div/ul/li[2]/span/button")
	private WebElement Welcome;

	@FindBy(xpath = "/html/body/div[2]/header/div[1]/div/ul/li[2]/div/ul/li[3]/a")
	private WebElement SignOut;
	
	@FindBy(xpath = "//*[@id=\"minicart-content-wrapper\"]/div[2]/strong")
	private WebElement CountItemInCart;
	
	@FindBy(xpath = "//*[@id=\"mini-cart\"]/li/div/div/div[3]/div[2]/a")
	private WebElement Remove;
	
	@FindBy(xpath = "/html/body/div[3]/aside[2]/div[2]/footer/button[2]")
	private WebElement RemoveOk;
	
	public void CustomerLogin() throws Throwable {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);
		Base.takeScreenshot(null, driver);
		action.click(driver, SginIn);
		Base.takeScreenshot(null, driver);
		Thread.sleep(2000);
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
		softassertProcess.assertAll();
	}

	public void AddOneItemCart() throws Throwable {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		action.click(driver, Men);
		action.click(driver, Jackets);
		action.click(driver, productClick);
		Thread.sleep(3000);
		action.click(driver, SizeS);
		action.click(driver, ColorYallow);
		Thread.sleep(3000);
		action.click(driver, AddToCartButton);
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
		Double ExPriceTotal = 72.0;
		softassertProcess.assertEquals(Acfinal_price, ExPriceTotal);
		System.out.println("Successfully sign in");
		softassertProcess.assertAll();

	}

	public void SignOut() throws Throwable {
		Thread.sleep(3000);
		action.click(driver, Welcome);
		action.click(driver, SignOut);
		String AcOut = action.getCurrentURL(driver);
		System.out.println(	"Successfully sign out : " +AcOut);
		String ExpOut = "https://magento.softwaretestingboard.com/customer/account/logoutSuccess/";
		AssertJUnit.assertEquals(AcOut, ExpOut);
		softassertProcess.assertAll();
	}

	public void CheekCart() throws Throwable {
		Thread.sleep(3000);
		action.click(driver, Cart);
		Thread.sleep(3000);
		String AcCountCart = action.getText(AddCart);
		Thread.sleep(3000);
		String ExCountCart = "1";
		System.out.println("The number of items stored in cart : " + AcCountCart);
		softassertProcess.assertEquals(AcCountCart, ExCountCart);
		softassertProcess.assertAll();
	}
	public void Remove_item() throws Throwable {
	Thread.sleep(3000);
	action.click(driver, Remove);
	Thread.sleep(2000);
	action.click(driver, RemoveOk);
	Thread.sleep(3000);
	String AcCountItemInCart = action.getText(CountItemInCart);
	System.out.println(AcCountItemInCart);
	String ExCountItemInCart = "You have no items in your shopping cart.";
	AssertJUnit.assertEquals(AcCountItemInCart, ExCountItemInCart);
	}
}
