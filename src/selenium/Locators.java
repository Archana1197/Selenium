package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ARCHANA\\Desktop\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");//launching website//
		driver.manage().window().maximize();//maximize the window//
		driver.findElement(By.id("search_query_top")).sendKeys("T-shirts");//by id//
		driver.findElement(By.name("submit_search")).click();//by name//
	    driver.findElement(By.linkText("Printed Chiffon Dress")).click();//linktext//
		driver.findElement(By.partialLinkText("Chiffon Dress")).click();//partial linktext//
		
}

}
