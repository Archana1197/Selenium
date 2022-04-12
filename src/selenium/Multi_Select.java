package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multi_Select {
	public static void main(String[] args) {

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ARCHANA\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://chercher.tech/practice/dropdowns");
	WebElement multi = driver.findElement(By.xpath("//select[@id='second']"));
	//ismultiple//
	Select s=new Select(multi);
	boolean multiple = s.isMultiple();
	System.out.println(multiple);
	//getoption//
	List<WebElement> options = s.getOptions();
	for (WebElement alloption : options) {
		System.out.println(alloption.getText());
		
	}
	//getAllSelectedOption//
	s.selectByVisibleText("Burger");
	s.selectByValue("donut");
	List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
	for (WebElement allselected : allSelectedOptions) {
		System.out.println(allselected.getText());
		
	}
	//getFirstSelectedOption//
	WebElement firstSelectedOption = s.getFirstSelectedOption();
	System.out.println(firstSelectedOption.getText());
	
	
}

}


