package AllConcepts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownConcepts {
	
	static void Login() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		WebElement username = 
				driver.findElement(By.xpath("//input[@name='username']"));
		username.sendKeys("Admin");
		WebElement password = 
				driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	
		/*
		 * Alert alertbox = driver.switchTo().alert(); alertbox.accept();
		 */
		
		
		
	}
	

	public static void main(String[] args)  {
		
		
				
	}


}
