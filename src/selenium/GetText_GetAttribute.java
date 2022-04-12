package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText_GetAttribute {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ARCHANA\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//GetAttribute//
		WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
		System.out.println(email.getAttribute("placeholder"));
		System.out.println(email.getAttribute("data-testid"));
		//GetText//
		WebElement loginButton = driver.findElement(By.xpath("//button[contains(@data-testid,'royal_login')]"));
		System.out.println(loginButton.getText());
		WebElement createaccount = driver.findElement(By.xpath("//a[contains(@data-testid,'open-registration')]"));
		System.out.println(createaccount.getText());
		
		

	}

}
