package selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Window_Handling {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ARCHANA\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in");
		Actions a=new Actions(driver);
		WebElement best = driver.findElement(By.xpath("(//a[text()='Best Sellers'])[1]"));
        a.contextClick(best).build().perform();
        Robot r=new Robot();
        r.keyPress(KeyEvent.VK_DOWN);
        r.keyRelease(KeyEvent.VK_DOWN);
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);
        WebElement mobiles= driver.findElement(By.xpath("//a[text()='Mobiles']"));
        a.contextClick(mobiles).build().perform();
        r.keyPress(KeyEvent.VK_DOWN);
        r.keyRelease(KeyEvent.VK_DOWN);
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);
        WebElement customerservice = driver.findElement(By.xpath("//a[text()='Customer Service']"));
		a.contextClick(customerservice).build().perform();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		WebElement elect = driver.findElement(By.xpath("//a[text()=' Electronics ']"));
		a.contextClick(elect).build().perform();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		WebElement fashion = driver.findElement(By.xpath("//a[text()='Fashion']"));
		a.contextClick(fashion).build().perform();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		Set<String> ids = driver.getWindowHandles();
		for (String id : ids) {
			System.out.println(driver.switchTo().window(id));
			String title = driver.switchTo().window(id).getTitle();
		    System.out.println(title);
	
		    if(title.equals("Amazon Fashion: Clothing, Footwear and Accessories online for Men, Women and Kids")||
title.equals("Electronics Store: Buy Electronics products Online at Best Prices in India at Amazon.in")||title.equals("Help - Amazon Customer Service")
||title.equals("Mobile Phones: Buy New Mobiles Online at Best Prices in India | Buy Cell Phones Online - Amazon.in")
||title.equals("Amazon.in Bestsellers: The most popular items on Amazon"))
		    {
			driver.close();
				
			}
		}
				
				
		
		
		
		
        
	}

}
