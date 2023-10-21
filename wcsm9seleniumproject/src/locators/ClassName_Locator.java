package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassName_Locator {
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.google.com/");
	Thread.sleep(2000);
	
	//switch the control to active element
	driver.switchTo().activeElement().sendKeys("Joey Tribbiani",Keys.ENTER);
	
	// identify symbol and click
	driver.findElement(By.className("lNPNe")).click();
	//note: className locator is used to identify multiple webElements on a web page 
	
	}

}
