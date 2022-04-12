package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css_Locators {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ARCHANA\\Desktop\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//Tag and ID//
		//driver.findElement(By.cssSelector("input#email")).sendKeys("archanasubramanian1@gmail.com");
		//Tag and class//
		//driver.findElement(By.cssSelector("input.inputtext")).sendKeys("archanasubramanian1@gmail.com");
		//Tag and Attribute//
		//driver.findElement(By.cssSelector("input[name=email]")).sendKeys("archanasubramanian1@gmail.com");
		
		//Tag,class and attribute//
		driver.findElement(By.cssSelector("input.inputtext[name=email]")).sendKeys("archanasubramanian1@gmail.com");;
		driver.findElement(By.cssSelector("input.inputtext[name=pass]")).sendKeys("arararar");
		driver.findElement(By.name("login")).click();
		driver.manage().window().maximize();
	}

}
