package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLinkTextLocator {
	public static void main(String[] args) throws InterruptedException {
		
	WebDriver driver=new ChromeDriver(); // launch the browser
	Thread.sleep(1000);
	driver.manage().window().maximize();
	Thread.sleep(1000);
	
	driver.get("http://omayo.blogspot.com/"); // launch the webApplication
	Thread.sleep(1000);
	
	// identify the webElement(open a popup window link)
	driver.findElement(By.partialLinkText("Open a popup")).click(); // we've used partial text
	
	Thread.sleep(2000);
	driver.quit(); // close all the windows
	}

}
