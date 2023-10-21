package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText_Locator {
	public static void main(String[] args)throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.get("http://omayo.blogspot.com/"); // launch the webpage
		Thread.sleep(1000);
		
		// identify the webElement (open a popup window link)
driver.findElement(By.linkText("Open a popup window")).click(); // we've used complete text of webelement
Thread.sleep(2000);
driver.quit(); // close all the windows
 }
}
