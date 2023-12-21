package StepDefenation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class firstrun {
	WebDriver driver;
	
	@Given("Login Application using credentials")
	public void login_application_using_credentials(){
		
		driver = new ChromeDriver();
		
		
		
		System.out.println(" Second page");
	    
	}

	@When("Click Login button")
	public void click_login_button() {
		
		System.out.println(" Thrid page");
	   
	}

}
