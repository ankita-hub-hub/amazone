package practice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshotcode {

	public static void main(String[] args) throws IOException {
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com/");
		mySs(driver);
		driver.get("https://www.google.co.in/?gfe_rd=cr&dcr=0&ei=61ZnWpH-K8aL8Qffv4X4Cw");
		mySs(driver);	
		
	}
	
	public static void mySs(WebDriver driver) throws IOException
	{
		TakesScreenshot t=(TakesScreenshot)driver;
		File src = t.getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\DELL\\Desktop\\ScreenShot\\ss.jpg");
		FileHandler.copy(src, dest);

	}

}
