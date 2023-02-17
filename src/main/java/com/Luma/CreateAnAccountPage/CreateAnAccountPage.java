package com.Luma.CreateAnAccountPage;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.AssertJUnit;
import com.Luma.Base.Base;
import com.Luma.ActionDriver.Action;
import com.github.javafaker.Faker;

public class CreateAnAccountPage {
	public WebDriver driver;
	Faker faker = new Faker();
	Action action = new Action();

	public CreateAnAccountPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "/html/body/div[2]/header/div[1]/div/ul/li[3]/a")
	private WebElement CreateAnAccount;

	@FindBy(name = "firstname")
	private WebElement FirstNameField;

	@FindBy(name = "lastname")
	private WebElement LastNameField;

	@FindBy(name = "email")
	private WebElement EmailField;

	@FindBy(name = "password")
	private WebElement PasswordField;

	@FindBy(name = "password_confirmation")
	private WebElement ConfirmPasswordField;

	@FindBy(css = "button[title='Create an Account'] span")
	private WebElement CreateAnAccountButton;

	@FindBy(xpath = "//*[@id=\"maincontent\"]/div[1]/div[2]/div/div/div")
	private WebElement CheekMassage;

	public void CreateAnAccount() throws Throwable {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Base.takeScreenshot(null, driver);
		action.click(driver, CreateAnAccount);
		Base.takeScreenshot(null, driver);
		Thread.sleep(2000);
		Base.takeScreenshot(null, driver);
		String firstName = faker.name().firstName();
		action.typestring(FirstNameField, firstName);
		String LirstName = faker.name().lastName();
		action.typestring(LastNameField, LirstName);
		String Emailaddress = firstName.toLowerCase() + LirstName.toLowerCase() + "@gmail.com";
		action.typestring(EmailField, Emailaddress);
		String Password = faker.number().toString();
		action.typestring(PasswordField, Password);
		action.typestring(ConfirmPasswordField, Password);
		action.click(driver, CreateAnAccountButton);
		Base.takeScreenshot(null, driver);
		Thread.sleep(4000);
		String actMassage = action.getText(CheekMassage);
		String ExpectMassage = "Thank you for registering with Fake Online Clothing Store.";
		AssertJUnit.assertEquals(actMassage, ExpectMassage);

	}

}
