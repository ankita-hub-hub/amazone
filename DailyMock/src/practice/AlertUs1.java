package practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertUs1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
		WebElement button = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		button.click();
		Thread.sleep(2000);
		Alert alt = driver.switchTo().alert();
		alt.accept();

	}

}
