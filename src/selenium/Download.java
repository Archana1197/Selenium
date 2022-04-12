package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Download {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ARCHANA\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://leafground.com/pages/download.html");
		driver.findElement(By.xpath("//a[text()='Download Excel']")).click();
		Thread.sleep(2000);
        driver.findElement(By.xpath("//a[text()='Download PDF']")).click();
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Download Text']")).click();
		driver.navigate().back();
	
		

	}

}
