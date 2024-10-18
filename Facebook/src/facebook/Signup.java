package facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Signup {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/login/");

		WebElement signUp = driver.findElement(By.xpath("//a[text()='Sign up for Facebook']"));
		signUp.click();
		
		WebElement firstName = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		firstName.sendKeys("Ankita");
		
		WebElement lastName = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		lastName.sendKeys("patawar");
		
		WebElement email = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
		email.sendKeys("apatawar2@gmail.com");
		
		WebElement mobNo = driver.findElement(By.xpath("(//input[@type='text'])[4]"));
		mobNo.sendKeys("9021728640");
		
		WebElement newPass = driver.findElement(By.xpath("//input[@type='password']"));
		newPass.sendKeys("anku28");
		
		WebElement date = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		
		WebElement month = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		
		WebElement year = driver.findElement(By.xpath("//select[@name='birthday_year']"));
		
		WebElement female = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
		female.click();
		
		driver.findElement(By.xpath("//button[text()='Sign Up']")).click();
	}

}
