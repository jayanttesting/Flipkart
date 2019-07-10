package com.flipkart;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Selenium.Utilities.dataparsing;

public class locators {

	@FindBy(name = "q")
	static WebElement framelocator;

	@FindBy(xpath = "//button[@type='submit' and @class='vh79eN']")
	WebElement searchbutton;

	@FindBy(xpath = "((//div[contains(text(),'iPhone')])[4]//parent::div)[1]/../..")
	static WebElement iphone_spacegrey;

	@FindBy(xpath = "//button[@class='_2AkmmA _2Npkh4 _2MWPVK']")
	WebElement Addtocart;

	@FindBy(xpath = "//button[@class='_2AkmmA _29YdH8']")
	WebElement popup;

	@FindBy(xpath = "//span[contains(text(),'Place Order')]")
	static WebElement order;

	@FindBy(xpath = "//button[@class='vh79eN']")
	static WebElement button;

	@FindBy(xpath = "//input[@class='_2zrpKA _14H79F']")
	static WebElement email;

	@FindBy(xpath = "//button[@class='_2AkmmA _1poQZq _7UHT_c']")
	static WebElement continuebutton;

	@FindBy(xpath = "//button[@class='_2AkmmA _2Npkh4 _2MWPVK']")
	static WebElement gotocart;

	@FindBy(xpath = "//input[@class='_2zrpKA _3v41xv _14H79F']")
	static WebElement password;

	@FindBy(xpath = "//img[@class='_2hT5Bw']")
	static WebElement addnewaddress;

	@FindBy(xpath = " //input[@name='name']")
	static WebElement inputname;

	@FindBy(xpath = " //textarea[@name='addressLine1']")
	static WebElement inoputaddress;

	@FindBy(xpath = "//button[@class='_2AkmmA _1poQZq _7UHT_c']")
	static WebElement loginbutton;

	public static void entertext(String str) {
		framelocator.sendKeys(str);
	}

	public static void click_button() {
		button.click();
	}

	public void searchbutton() {
		searchbutton.click();
	}

	public static void iphone() {
		iphone_spacegrey.click();
	}

	public void cart() {
		Addtocart.click();
	}

	public void popupclose() {
		popup.click();
	}

	public static void placeorder() {
		order.click();
	}

	public static void enteremail(String str) {
		email.sendKeys(str);
	}

	public static void continueclick() {
		continuebutton.click();
	}

	public static void cartbutton() {
		gotocart.click();
	}

	public static void enterpassword(String str) {
		password.sendKeys(str);
	}

	public static void addadress() {
		addnewaddress.click();
	}

	public static void address_name(String str) {
		inputname.sendKeys(str);
	}

	public static void address_address(String str) {
		inoputaddress.sendKeys(str);
	}

	public static void login() {
		loginbutton.click();
	}

}
