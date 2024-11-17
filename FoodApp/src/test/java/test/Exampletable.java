package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Exampletable {

	WebDriver driver; 
	
	
	@Given("user open the browser  navigate to login pages")
	public void user_open_the_browser_navigate_to_login_page() {
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		
	   	}

	@When("Enter the (.*) and (.*)$")
	public void enter_the_invalid_login_my_data(String username,String password) {
		WebElement css = driver.findElement(By.cssSelector("input[class=\"inputtext _55r1 _6luy\"]"));
		css.sendKeys(username);
		
		WebElement passw = driver.findElement(By.id("pass"));
		passw.sendKeys(password132324);
		
	    
	}

	@And("click on login button on loginpages")
	public void click_on_login_button_on_loginpage() {
		driver.findElement(By.name("login")).click();

	    
	}

	@Then("user should not succesffully login into applications")
	public void user_should_not_succesffully_login_into_application() {
		driver.close();
	   
	}


}
