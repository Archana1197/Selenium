package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ARCHANA\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Static.html");
		driver.manage().window().maximize();
		WebElement img1 = driver.findElement(By.xpath("//img[@id='angular']"));
		WebElement img2 = driver.findElement(By.xpath("//img[@id='mongo']"));
		WebElement img3 = driver.findElement(By.xpath("//img[@id='node']"));
		WebElement target = driver.findElement(By.xpath("//div[@id='droparea']"));
		Actions a=new Actions(driver);
		a.dragAndDrop(img1, target).build().perform();
		a.dragAndDrop(img2, target).build().perform();
		a.dragAndDrop(img3, target).build().perform();
		

	}

}
