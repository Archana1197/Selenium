package selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;

public class JavaScriptExecutorDemo {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ARCHANA\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");
		ChromeOptions ch=new ChromeOptions();
		ch.addArguments("Incognito");
		WebDriver driver=new ChromeDriver(ch);
		driver.get("https://www.amazon.com");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		WebElement currencycoverter = driver.findElement(By.xpath("//a[text()='Amazon Currency Converter']"));
		js.executeScript("arguments[0].scrollIntoView();",currencycoverter);
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,-10500);");
		Thread.sleep(4000);
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination=new File("C:\\Users\\ARCHANA\\eclipse-workspace\\selenium\\Screenshots\\pic2.png");
		FileHandler.copy(source, destination);
		





	}

}
