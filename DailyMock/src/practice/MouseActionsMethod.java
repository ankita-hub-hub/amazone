package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActionsMethod {

	public static void main(String[] args) throws InterruptedException{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/gp/css/homepage.html?ref_=nav_youraccount_btn");
		WebElement account = driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
		WebElement order = driver.findElement(By.xpath("//span[text()='Your Account']"));
		Actions act=new Actions(driver);
		//act.moveToElement(account).moveToElement(order).click().build().perform();
		Thread.sleep(2000);
		act.moveToElement(account).perform();
		Thread.sleep(2000);
		act.moveToElement(order).perform();
		Thread.sleep(2000);
		act.click().perform();
	}

}
