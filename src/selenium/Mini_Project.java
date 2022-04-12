package selenium;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Mini_Project {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ARCHANA\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Actions a=new Actions(driver);
		WebElement dresses = driver.findElement(By.xpath("(//a[@title='Dresses'])[2]"));
		a.moveToElement(dresses).build().perform();
        driver.findElement(By.xpath("(//a[text()='Evening Dresses'])[2]")).click();
    	WebElement printed=driver.findElement(By.xpath("((//a[@title='Printed Dress'])[2])"));
        printed.click();
        driver.findElement(By.xpath("//a[contains(@class,'plus product_quantity_up')]")).click();
        WebElement size = driver.findElement(By.xpath("//select[@id='group_1']"));
        Select s=new Select(size);
        s.selectByVisibleText("L");
        driver.findElement(By.xpath("//a[@id='color_24']")).click();
        driver.findElement(By.xpath("//button[@name='Submit']")).click();
        driver.findElement(By.xpath("//a[@title='Proceed to checkout']")).click();
        driver.findElement((By.xpath("(//a[@title='Proceed to checkout'])[2]"))).click();
        driver.findElement(By.id("email")).sendKeys("archanasubramanian1@gmail.com");
        driver.findElement(By.id("passwd")).sendKeys("archu@1197");
        driver.findElement(By.id("SubmitLogin")).click();
        driver.findElement(By.name("message")).sendKeys("please deliver this product as soon as possible");
        driver.findElement(By.name("processAddress")).click();
        driver.findElement(By.id("cgv")).click();
        driver.findElement(By.name("processCarrier")).click();
        driver.findElement(By.xpath("//a[@class='bankwire']")).click();
        driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,+300);");
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination=new File("C:\\Users\\ARCHANA\\eclipse-workspace\\selenium\\Screenshots\\miniproject.png");
		FileHandler.copy(source, destination);
		
		

	}

}
