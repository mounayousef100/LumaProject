package com.Luma.CreateAnAccountTest;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.Luma.Base.Base;
import com.Luma.CreateAnAccountPage.CreateAnAccountPage;

public class CreateAnAccountTest extends Base {
	public WebDriver driver;
	CreateAnAccountPage createAnAccountPage = new CreateAnAccountPage(driver);

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
	public void CreateAnAccount04() throws Throwable {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		createAnAccountPage = new CreateAnAccountPage(driver);
		createAnAccountPage.CreateAnAccount();

	}

}
