package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElement_Vs_FindElements {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ARCHANA\\Desktop\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		//1//
		WebElement searchstore=driver.findElement(By.xpath("//*[@id=\"small-searchterms\"]"));
		searchstore.sendKeys("archu");
		//2//
		WebElement element=driver.findElement(By.className("footer-upper"));
		System.out.println(element.getText());
		//3//
		
		WebElement dup=driver.findElement(By.xpath("//*[@id=\"small-containers\"]"));
		
		//Findelements//
		List<WebElement> elements = driver.findElements(By.xpath("/html/body/div[6]/div[4]/div[1])"));
		System.out.println(elements.size());
		
		

	}

}
