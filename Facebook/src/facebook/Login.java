package facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) throws InterruptedException{
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		//TC=login to facebook
		//user name
		//WebElement userName = driver.findElement(By.xpath("//input[@type='text']"));
		//userName.sendKeys("patawarankita@gmail.com");
		
		//password
		//WebElement password = driver.findElement(By.xpath("//input[contains(@class,'inputtext _9npi inputtext _9npi')]"));
	//	password.sendKeys("Anku");
		
		//Login Button
		//WebElement login = driver.findElement(By.xpath("//button[text()='Log in']"));
		//login.click();
		Thread.sleep(2000);
		
		
		//TC=Click on forgotton password
		//forgot Password
		//WebElement forgottonPassword = driver.findElement(By.linkText("Forgotten account?"));
		//forgottonPassword.click();
		
		//Email Text box
		//WebElement emailId = driver.findElement(By.xpath("//input[@type='text']"));
		//emailId.sendKeys("patawarankita@gmail.com");
		
		//search Button
		//WebElement search = driver.findElement(By.xpath("//button[@class='_42ft _4jy0 _9nq0 textPadding20px _4jy3 _4jy1 selected _51sy']"));
		//search.click();
		
		//TC=Click on sign up and proceed
		
		//click on sign up
		WebElement signUp = driver.findElement(By.xpath("//a[text()='Sign up for Facebook']"));
		signUp.click();
		
		
		

	}

}
