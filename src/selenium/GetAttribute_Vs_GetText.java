package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttribute_Vs_GetText {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ARCHANA\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://admin-demo.nopcommerce.com/login");
		
		//to clear the existing input from the input box and send the new key//
		
		WebElement inputbox=driver.findElement(By.id("Email"));
		inputbox.clear();
		inputbox.sendKeys("archana1@gmail.com");//
		
		//capturing the text from input box//
		System.out.println("get Attribute method:"+inputbox.getAttribute("value"));
		System.out.println("get Attribute method:"+inputbox.getAttribute("class"));
		System.out.println("get text method:"+inputbox.getText());
		
		//login button//
		
		WebElement login=driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/div[2]/div[1]/div/form/div[3]/button"));
		System.out.println(login.getText());
		
		

	}

}
