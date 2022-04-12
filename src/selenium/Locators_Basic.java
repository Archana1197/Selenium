package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_Basic {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ARCHANA\\Desktop\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		//class//
		int sliders=driver.findElements(By.className("homeslider-description")).size();
		System.out.println(sliders);
		//tagName//
		int links=driver.findElements(By.tagName("a")).size();
		System.out.println(links);
		
		

	}

}
