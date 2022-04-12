package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Registration {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ARCHANA\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		WebElement signin = driver.findElement(By.xpath("//a[@class='login']"));		
		signin.click();
	    WebElement emailid = driver.findElement(By.xpath("//input[@id='email_create']"));
	    emailid.sendKeys("archanasubramanian1@gmail.com");
	    driver.findElement(By.name("SubmitCreate")).click();
	    driver.findElement(By.xpath("//*[@id=\"id_gender2\"]")).click();
	    driver.findElement(By.id("customer_firstname")).sendKeys("Archana");
	    driver.findElement(By.id("customer_lastname")).sendKeys("S");
	    driver.findElement(By.id("passwd")).sendKeys("archu@1197");
	    WebElement day=driver.findElement(By.id("days"));
	    Select s=new Select(day);
	    s.selectByVisibleText("2");
	    WebElement months=driver.findElement(By.id("months"));
	    Select s1=new Select(months);
	    s1.selectByValue("January");
	    WebElement years = driver.findElement(By.id("years"));
	    Select s3=new Select(years);
	    s3.selectByVisibleText("1997");
	    driver.findElement(By.id("newsletter")).click();
	    
	}

}
