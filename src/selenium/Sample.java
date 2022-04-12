package selenium;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Sample {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ARCHANA\\Desktop\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		  driver.get("https://demoqa.com/droppable/");		
		  WebElement source = driver.findElement(By.id("draggable"));
		  Actions a=new Actions(driver);
		  WebElement target = driver.findElement(By.id("droppable"));
		  a.dragAndDrop(source, target).build().perform();
		  
		     
		        
		
		
		
	
		
		
		
		
		
		
	}
	
}


