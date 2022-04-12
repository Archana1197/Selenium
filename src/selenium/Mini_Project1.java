package selenium;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Mini_Project1 {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ARCHANA\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com/index.php");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.id("username")).sendKeys("Archana1197");
		driver.findElement(By.id("password")).sendKeys("Archu@1197");
		driver.findElement(By.id("login")).click();
		WebElement location = driver.findElement(By.id("location"));
		Select s=new Select(location);
		s.selectByVisibleText("London");
		WebElement hotel = driver.findElement(By.id("hotels"));
		Select s1=new Select(hotel);
		s1.selectByVisibleText("Hotel Hervey");
		WebElement roomtype = driver.findElement(By.name("room_type"));
		Select s2=new Select(roomtype);
		s2.selectByVisibleText("Super Deluxe");
		Thread.sleep(3000);
		WebElement noofroom=driver.findElement(By.name("room_nos"));
		Select s3=new Select(noofroom);
		s3.selectByVisibleText("2 - Two");
		Thread.sleep(3000);
		WebElement fromdate=driver.findElement(By.name("datepick_in"));
		fromdate.clear();
		fromdate.sendKeys("2022-03-22");
		Thread.sleep(3000);
		WebElement todate=driver.findElement(By.name("datepick_out"));
		todate.clear();
		todate.sendKeys("2022-03-26");
		WebElement adultroom = driver.findElement(By.name("adult_room"));
		Select s4=new Select(adultroom);
		s4.selectByVisibleText("2 - Two");
		WebElement child = driver.findElement(By.name("child_room"));
		Select s5=new Select(child);
		s5.selectByVisibleText("1 - One");
	    driver.findElement(By.id("Submit")).click();
	    driver.findElement(By.name("radiobutton_0")).click();
	    driver.findElement(By.id("continue")).click();
	    driver.findElement(By.name("first_name")).sendKeys("Archana");
	    driver.findElement(By.name("last_name")).sendKeys("Archu");
	    driver.findElement(By.id("address")).sendKeys("Balaji Gardern,London");
	    driver.findElement(By.name("cc_num")).sendKeys("1234567891011123");
	    WebElement cardtype = driver.findElement(By.name("cc_type"));
	    Select s6=new Select(cardtype);
	    s6.selectByVisibleText("VISA");
	    WebElement expmonth = driver.findElement(By.name("cc_exp_month"));
	    Select s7=new Select(expmonth);
	    s7.selectByVisibleText("May");
	    WebElement expyear = driver.findElement(By.name("cc_exp_year"));
	    Select s8=new Select(expyear);
	    s8.selectByVisibleText("2022");
	    driver.findElement(By.name("cc_cvv")).sendKeys("1234");
	    driver.findElement(By.name("book_now")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.name("my_itinerary")).click();
	    TakesScreenshot ts=(TakesScreenshot)driver;
	    File source = ts.getScreenshotAs(OutputType.FILE);
	    File destination=new File("C:\\Users\\ARCHANA\\eclipse-workspace\\selenium\\Screenshots\\hotelbooking.png");
	    FileHandler.copy(source, destination);
	    driver.findElement(By.id("logout")).click();
	    
	}

}
