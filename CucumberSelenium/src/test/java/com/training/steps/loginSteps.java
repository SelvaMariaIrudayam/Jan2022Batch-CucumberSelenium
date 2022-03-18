package com.training.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class loginSteps {
	WebDriver driver;
	//WebElement user;
	//WebElement pass;

	@Given("Open the chrome and launch the application")
	public void open_the_chrome_and_launch_the_application() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://login.salesforce.com");
	}

	@When("Enter the Username and Password")
	public void enter_the_username_and_password() throws Exception {
		Thread.sleep(1000);
	WebElement	 user = driver.findElement(By.id("username"));
		user.sendKeys("sel@tekarch.com");
WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys("JeffJeff2727*");
	}

	@Then("Reset the credential")
	public void reset_the_credential() {
		//user.clear();
		//pass.clear();
	}
	@Given("user navigates to the website javatpoint.com")
	public void user_navigates_to_the_website_javatpoint_com() {
	    System.out.println("hi you are at javatPoint");
	}
	@Given("there user logs in through Login Window by using Username as {string} and Password as {string}")
	public void there_user_logs_in_through_login_window_by_using_username_as_and_password_as(String string, String string2) {
		 System.out.println("hi you are at javatPoint");
	}
	@Then("login must be successful.")
	public void login_must_be_successful() {
		 System.out.println("hi you are at javatPoint");
	}




}
