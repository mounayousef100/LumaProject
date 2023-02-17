package com.Luma.ShoppingCartTest;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.Luma.Base.Base;
import com.Luma.ShoppingCartPage.AddoneItemPage;

public class AddoneItemTest extends Base {
	public WebDriver driver;
	private AddoneItemPage addoneItemPage;

	@BeforeMethod
	public void OpenPage() throws IOException, InterruptedException {
		driver = intializEDriver();
		driver.get(prop.getProperty("url"));
	}

	@AfterMethod
	public void Clouser() {
		 driver.quit();
	}

	@Test
	public void Add_one_itemCart() throws Throwable {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		addoneItemPage = new AddoneItemPage(driver);
		addoneItemPage.CustomerLogin();
		addoneItemPage.AddOneItemCart();
		addoneItemPage.SignOut();
		addoneItemPage.CustomerLogin();
		addoneItemPage.CheekCart();
		addoneItemPage.Remove_item();
	}
}
