package com.Luma.ShoppingCartTest;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.Luma.Base.Base;
import com.Luma.ShoppingCartPage.AddTwoItemPage;

public class AddTwoItemTest extends Base {
	public WebDriver driver;
	AddTwoItemPage addTwoItemPage;

	@BeforeMethod
	public void OpenPage() throws IOException, InterruptedException {
		driver = intializEDriver();
		driver.get(prop.getProperty("url"));
	}

	@AfterMethod
	public void Clouser() {
		 driver.quit();
	}

	@Test()
	public void AddTwoItem() throws Throwable {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		addTwoItemPage = new AddTwoItemPage(driver);
		addTwoItemPage.Add_two_item();

	}

}
