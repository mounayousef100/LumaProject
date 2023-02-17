package com.Luma.ShoppingCartTest;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.Luma.Base.Base;
import com.Luma.ShoppingCartPage.RemoveOneItemPage;

public class RemoveOneItemTest extends Base {
	public WebDriver driver;
	private RemoveOneItemPage removeOneItemPage;

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
	public void Remove_one_item() throws Throwable {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		removeOneItemPage = new RemoveOneItemPage(driver);
		removeOneItemPage.Remove_one_item_page();
	}
}
