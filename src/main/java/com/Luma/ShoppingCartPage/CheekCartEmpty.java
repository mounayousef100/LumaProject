package com.Luma.ShoppingCartPage;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.AssertJUnit;
import com.Luma.ActionDriver.Action;
import com.Luma.Base.Base;

public class CheekCartEmpty {
	public WebDriver driver;
	Action action = new Action();

	public CheekCartEmpty(WebDriver driver) {
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

	@FindBy(xpath = "/html/body/div[2]/header/div[2]/div[1]/a")
	private WebElement Cart;

	@FindBy(xpath = "//*[@id=\"minicart-content-wrapper\"]/div[2]/strong")
	private WebElement CountItemInCart;

	@FindBy(xpath = "/html/body/div[2]/header/div[1]/div/ul/li[2]/span/button")
	private WebElement Welcome;

	@FindBy(xpath = "/html/body/div[2]/header/div[1]/div/ul/li[2]/div/ul/li[3]/a")
	private WebElement SignOut;

	public void Cheek_cart_empty() throws Throwable {
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
		Base.takeScreenshot(null, driver);
		action.click(driver, Cart);
		Thread.sleep(5000);
		String AcCountItemInCart = action.getText(CountItemInCart);
		System.out.println(AcCountItemInCart);
		String ExCountItemInCart = "You have no items in your shopping cart.";
		AssertJUnit.assertEquals(AcCountItemInCart, ExCountItemInCart);
		action.click(driver, Welcome);
		action.click(driver, SignOut);
		Base.takeScreenshot(null, driver);
		Thread.sleep(2000);
		String AcOut = action.getCurrentURL(driver);
		System.out.println(AcOut);
		String ExpOut = "https://magento.softwaretestingboard.com/customer/account/logoutSuccess/";
		AssertJUnit.assertEquals(AcOut, ExpOut);
	}

}
