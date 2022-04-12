package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropDown {

	public static void main(String[] args) throws Exception  {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ARCHANA\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.opencart.com/index.php?route=account/register");
		WebElement country = driver.findElement(By.id("input-country"));
		Select drpcountry=new Select(country);
		//drpcountry.selectByVisibleText("Aruba");
		//Thread.sleep(2000);
		//drpcountry.selectByValue("10");
		//Thread.sleep(2000);
		//drpcountry.selectByIndex(14);
		
		//select the element without using select methods//
		
		List<WebElement> alloptions = drpcountry.getOptions();
		
		for(WebElement option:alloptions)
		{
		if(option.getText().equals("Fiji"))
		{
			option.click();
			break;
		}
			
		}
			
		}
			
		

	}


