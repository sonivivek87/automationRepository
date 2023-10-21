package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentOnXpath {
	public static void main(String[] args) throws InterruptedException {
/*launch flipkart,close popup window, search mobiles in search-textbox,click on search icon,then print the price of 2nd option*/
		
	WebDriver driver=new ChromeDriver(); // launch the browser and upcasted
	
	driver.manage().window().maximize(); //maximize the browser
	
	Thread.sleep(2000);
	
	driver.get("https://www.flipkart.com/"); //launch web application
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//span[text()='✕']")).click(); // close the popup window
	Thread.sleep(2000);
	
	driver.findElement(By.name("q")).sendKeys("mobiles"); //search for mobiles in search textbox
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//button[@aria-label='Search for Products, Brands and More']")).click(); //click on search icon
	
	
	}

}
