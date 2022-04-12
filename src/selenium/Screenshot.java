package selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ARCHANA\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");
		ChromeOptions ch=new ChromeOptions();
		ch.addArguments("Incognito");
		WebDriver driver=new ChromeDriver(ch);
		driver.get("https://www.facebook.com");
		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		email.sendKeys("archana1@gmail.com");
		WebElement password = driver.findElement(By.xpath("//input[@id='pass']"));
		password.sendKeys("123456");
		WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
		login.click();
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination=new File("C:\\Users\\ARCHANA\\eclipse-workspace\\selenium\\Screenshots\\pic1.png");
		FileHandler.copy(source, destination);
		
		
		

	
	}

}
