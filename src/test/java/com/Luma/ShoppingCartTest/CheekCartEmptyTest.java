package com.Luma.ShoppingCartTest;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.Luma.Base.Base;
import com.Luma.ShoppingCartPage.CheekCartEmpty;

public class CheekCartEmptyTest extends Base {
	public WebDriver driver;
	CheekCartEmpty cheekCartEmpty ;

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
	public void Cheek_cart_empty() throws Throwable {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		cheekCartEmpty = new CheekCartEmpty(driver);
		cheekCartEmpty.Cheek_cart_empty();

	}

}
