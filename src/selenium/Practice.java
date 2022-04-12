package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ARCHANA\\Desktop\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/register");
		//isDisplayed and isEnabled//
		WebElement searchstore=driver.findElement(By.id("small-searchterms"));
		System.out.println("Display status:"+searchstore.isDisplayed());//True
		System.out.println("Enable status:"+searchstore.isEnabled());
		//isselected//
		WebElement male=driver.findElement(By.xpath("//*[@id=\"gender-male\"]"));
		WebElement female=driver.findElement(By.xpath("//*[@id=\"gender-female\"]"));
		male.click();
		System.out.println("selected status:"+male.isSelected());//True
		System.out.println("selected status:"+female.isSelected());//False
		female.click();
		System.out.println("selected status:"+male.isSelected());//False
		System.out.println("selected status:"+female.isSelected());//True
		driver.manage().window().maximize();
		System.out.println("Title of the webpage:"+driver.getTitle());
		System.out.println("the URL of the webpage:"+driver.getCurrentUrl());
	
		
		
		
		

	}

}
