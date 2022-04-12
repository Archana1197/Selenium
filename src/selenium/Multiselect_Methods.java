package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiselect_Methods {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ARCHANA\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/Dropdown.html");
		WebElement single = driver.findElement(By.xpath("//select[@id='dropdown1']"));
		Select s=new Select(single);
		//getoption//
		List<WebElement> options = s.getOptions();
		for (WebElement alloption : options) {
			System.out.println(alloption.getText());
		}
		//getAllSelectedOption//
		
			WebElement multi = driver.findElement(By.xpath("(//select)[6]"));
			Select sel=new Select(multi);
			//ismultiple//
			boolean multiple = sel.isMultiple();
			System.out.println(multiple);
			sel.selectByVisibleText("Appium");
			sel.selectByValue("1");
			sel.selectByIndex(4);
			List<WebElement> allSelectedOptions = sel.getAllSelectedOptions();
			for (WebElement alloption : allSelectedOptions) {
				System.out.println(alloption.getText());
			}
			//getfirstSelectedOption//
			WebElement firstSelectedOption = sel.getFirstSelectedOption();
			System.out.println(firstSelectedOption.getText());
		}
	
	
		
	
	
	
	}	
