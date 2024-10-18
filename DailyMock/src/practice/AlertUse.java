package practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertUse {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		WebElement submit = driver.findElement(By.xpath("submit"));
		submit.click();
		
		Alert alt = driver.switchTo().alert();
		alt.getText();
		alt.accept();
		
		alt.getText();
		alt.accept();

	}

}
