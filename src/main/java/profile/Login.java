package profile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login {
	
public static WebDriver driver;
	
	@Given("^valid url$")
	//give valid url
	public void url() throws Exception{
		System.setProperty("webdriver.chrome.driver","F:\\Prasanna\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		
	}
	// enter valid credentials
	@When("^valid id & pass$")
	public void credintials() throws Exception {
		driver.findElement(By.name("email")).sendKeys("kumarklr5@gmailcom");
		driver.findElement(By.name("pass")).sendKeys("KUMAR@0302");
		
	}
	// click on ogin
	@Then("^click on liogin$")
	public void login() throws Exception {
		driver.findElement(By.id("u_0_2")).click();
		
	}

}
