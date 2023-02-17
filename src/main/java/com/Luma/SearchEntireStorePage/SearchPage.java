package com.Luma.SearchEntireStorePage;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import com.Luma.ActionDriver.Action;
import com.Luma.Base.Base;

public class SearchPage {
	public WebDriver driver;
	Action action = new Action();
	SoftAssert mysoft = new SoftAssert();

	public SearchPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "q")
	private WebElement SearchStore;

	@FindBy(className = "product-item-link")
	private List<WebElement> Search;

	public void Search() throws Throwable {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		action.removeCSSStyle();

		action.typestring(SearchStore, "jacket for women");
		SearchStore.sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		Base.takeScreenshot(null, driver);

		for (int i = 0; i < Search.size(); i++) {
			String result = Search.get(i).getText();
			boolean checkSearch = result.contains("Jacket");
			mysoft.assertEquals(checkSearch,true, "check Search successfully");
			mysoft.assertAll();
		}
	}

}
