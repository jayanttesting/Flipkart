package com.flipkart;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Selenium.Utilities.dataparsing;

public class locators {

	@FindBy(name = "q")
	WebElement framelocator;

	@FindBy(xpath = "//button[@type='submit' and @class='vh79eN']")
	WebElement searchbutton;

	@FindBy(xpath = "((//div[contains(text(),'iPhone')])[4]//parent::div)[1]/../..")
	WebElement iphone_spacegrey;

	@FindBy(xpath = "//button[@class='_2AkmmA _2Npkh4 _2MWPVK']")
	WebElement Addtocart;

	@FindBy(xpath = "//button[@class='_2AkmmA _29YdH8']")
	WebElement popup;

	@FindBy(xpath = "//span[contains(text(),'Place Order')]")
	WebElement order;

	@FindBy(xpath = "//button[@class='vh79eN']")
	WebElement button;

	@FindBy(xpath = "//input[@class='_2zrpKA _14H79F']")
	WebElement email;

	@FindBy(xpath = "//button[@class='_2AkmmA _1poQZq _7UHT_c']")
	WebElement continuebutton;

	@FindBy(xpath = "//button[@class='_2AkmmA _2Npkh4 _2MWPVK']")
	WebElement gotocart;

	@FindBy(xpath = "//input[@class='_2zrpKA _3v41xv _14H79F']")
	WebElement password;

	@FindBy(xpath = "//img[@class='_2hT5Bw']")
	WebElement addnewaddress;

	@FindBy(xpath = " //input[@name='name']")
	WebElement inputname;

	@FindBy(xpath = " //textarea[@name='addressLine1']")
	WebElement inoputaddress;

	@FindBy(xpath = "//button[@class='_2AkmmA _1poQZq _7UHT_c']")
	WebElement loginbutton;

	public void entertext(String str) {
		framelocator.sendKeys(str);
	}

	public void click_button() {
		button.click();
	}

	public void searchbutton() {
		searchbutton.click();
	}

	public void iphone() {
		iphone_spacegrey.click();
	}

	public void cart() {
		Addtocart.click();
	}

	public void popupclose() {
		popup.click();
	}

	public void placeorder() {
		order.click();
	}

	public void enteremail(String str) {
		email.sendKeys(str);
	}

	public void continueclick() {
		continuebutton.click();
	}

	public void cartbutton() {
		gotocart.click();
	}

	public void enterpassword(String str) {
		password.sendKeys(str);
	}

	public void addadress() {
		addnewaddress.click();
	}

	public void address_name(String str) {
		inputname.sendKeys(str);
	}

	public void address_address(String str) {
		inoputaddress.sendKeys(str);
	}

	public void login() {
		loginbutton.click();
	}

}
