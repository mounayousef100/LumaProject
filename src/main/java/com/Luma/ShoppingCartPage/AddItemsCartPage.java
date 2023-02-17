package com.Luma.ShoppingCartPage;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import com.Luma.ActionDriver.Action;

public class AddItemsCartPage {
	public WebDriver driver;
	Action action = new Action();
	public int numberOfTry = 5;
	SoftAssert softassertProcess = new SoftAssert();

	public AddItemsCartPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//span[normalize-space()='Men']")
	private WebElement Men;

	@FindBy(xpath = "(//a[contains(text(),'Hoodies & Sweatshirts')])[1]")
	private WebElement HoodiesSweatshirts;

	@FindBy(xpath = "//*[@id=\"maincontent\"]/div[3]/div[1]/div[3]/ol/li[2]/div/a/span/span/img")
	private WebElement productClick;

	@FindBy(id = "option-label-size-143-item-168")
	private WebElement SizeM;

	@FindBy(id = "option-label-color-93-item-58")
	private WebElement Colorred;

	@FindBy(id = "product-addtocart-button")
	private WebElement AddToCartButton;

	@FindBy(className = "counter-number")
	private WebElement Cart;

	@FindBy(className = "count")
	private WebElement AddCart;

	@FindBy(className = "price")
	private WebElement Totalprice;

	@FindBy(xpath = "//span[@class='minicart-price']//span[@class='price'][normalize-space()='$69.00']")
	private WebElement price;
	
	public void AddItemsCart() throws Throwable {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		action.click(driver, Men);
		action.click(driver, HoodiesSweatshirts);
		action.click(driver, productClick);
		for (int i = 0; i < numberOfTry; i++) {
			Thread.sleep(3000);
			action.click(driver, SizeM);
			action.click(driver, Colorred);
			Thread.sleep(3000);
			action.click(driver, AddToCartButton);
			Thread.sleep(3000);
		}

		Thread.sleep(3000);
		action.click(driver, Cart);
		Thread.sleep(3000);
		String AcCountCart = action.getText(AddCart);
		System.out.println("The add in cart :  "+ AcCountCart);
		Thread.sleep(3000);
		String ExCountCart = "5";
		softassertProcess.assertEquals(AcCountCart, ExCountCart);
		String Price = action.getText(price);
		String FinalPrice = Price.replaceAll("[$,]", "");
		Double Acfinal_price = Double.parseDouble(FinalPrice);
		System.out.println("The price :  "+ Acfinal_price);
		Double ExPriceTotal = 69.0;
		softassertProcess.assertEquals(Acfinal_price, ExPriceTotal);
		String totalPrice = action.getText(Totalprice);
		String Final = totalPrice.replaceAll("[$,]", "");
		Double Acfinal_total_price = Double.parseDouble(Final);
		System.out.println("The total price :  "+ Acfinal_total_price);
		Double ExPrice = 207.0;
		softassertProcess.assertEquals(Acfinal_total_price, ExPrice);
		softassertProcess.assertAll();
	}
}
