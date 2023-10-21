package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {
/* find/locate the webElements of login page of instagram by using contains()
	------------------------------------------------------------------------*/
	public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
	driver.get("https://www.instagram.com/");
	Thread.sleep(2000);
	
	// identify usernametextbox and pass the input value
	driver.findElement(By.xpath("//input[contains(@name,'username')]")).sendKeys("admin");
	
	//identify passwordtextbox and pass the input value
	driver.findElement(By.xpath("//input[contains(@name,'password')]")).sendKeys("admin123");
	
	/*identify login button and click. note- login button activates after entering the valid input values of username and password */
	driver.findElement(By.xpath("//div[contains(text(),'Log in')] ")).click();
	Thread.sleep(2000);
	
	driver.quit();	
	}
}
