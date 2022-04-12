package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Methods {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ARCHANA\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/register");
		//isDisplayed//
		WebElement searchstore = driver.findElement(By.xpath("//input[@id='small-searchterms']"));
		boolean displayed = searchstore.isDisplayed();
		System.out.println("Display status:"+displayed);
		//isEnabled//
        boolean enabled = searchstore.isEnabled();
        System.out.println("Enable status:"+enabled);
        //isSelected//
        WebElement male = driver.findElement(By.xpath("//input[@name='Gender']"));
        WebElement female = driver.findElement(By.xpath("//input[@id='gender-female']"));
        male.click();
        System.out.println("Selected status of male:"+male.isSelected());
        System.out.println("Selected status of female:"+female.isSelected());
        Thread.sleep(2000);
        female.click();
        System.out.println("Selected status of male:"+male.isSelected());
        System.out.println("Selected status of female:"+female.isSelected());
       
       
        
        
        

	}

}
