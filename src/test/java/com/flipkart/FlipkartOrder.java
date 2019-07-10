package com.flipkart;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Selenium.Utilities.chrome;
import Selenium.Utilities.dataparsing;

public class FlipkartOrder {
	locators objelements;

	WebDriver driver;
	WebDriverWait wait;
	chrome ch;
	Logger Log = Logger.getLogger(FlipkartOrder.class.getName());

	@BeforeSuite
	public void setup() {
		ch = new chrome();
		driver = ch.getDriverINstance();
	}

	@Test(priority = 0)
	public void launch() {
		ch.test("https://www.flipkart.com/");
		Log.info("Test is starting");
	}

	@Test
	public void placeorder() throws IOException {
		objelements = PageFactory.initElements(driver, locators.class);
		objelements.popupclose();
		Log.info("Pop is closed");
		locators local = new locators();

		// print logs

		local.entertext("Apple iPhone X");
		local.click_button();

		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		local.iphone();
		List<WebElement> options = driver.findElements(By.xpath("//div[@class='_3wU53n']"));
		System.out.println("Size of Autosuggest box is" + options.size());
		Log.info("print the size of elemnts in textbox");
		for (WebElement a : options) {
			System.out.println("values are:" + a.getText());
		}
		Log.info("printing text in textbox");

		// Navigating to another tab and click on cart button
		System.out.println(driver.getWindowHandles());
		for (String handle1 : driver.getWindowHandles()) {
			driver.switchTo().window(handle1);
		}
		local.cartbutton();
		local.placeorder();
		String username = dataparsing.userid();
		String password = dataparsing.password();
		local.enteremail(username);
		local.continueclick();
		local.enterpassword(password);
		local.login();

		// Adding Address
		local.addadress();
		local.address_name("Promobi");
		local.address_address("ProMobi 1st Floor, Plot no. 65, Sector 44, Near Huda City Centre, Gurugram");

	}

	// Quit Browser

	@AfterSuite
	public void terminate() {
		driver.quit();
	}
}
