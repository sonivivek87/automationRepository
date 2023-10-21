package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Facebook_Automate {
	public static void main(String[] args) throws InterruptedException {
		
		// to close/to handle the popup notification 
	ChromeOptions co=new ChromeOptions();
	co.addArguments("--disable-notifications");
		
	WebDriver driver=new ChromeDriver(co); // launch the chrome browser
	Thread.sleep(2000);
	driver.manage().window().maximize();
	
	driver.get("https://en-gb.facebook.com/"); // launch the webpage
	Thread.sleep(1000); //provided delay
	
	//identify web element (email address/phone number)  of facebook
	driver.findElement(By.id("email")).sendKeys("9575372486");
	
	Thread.sleep(1000);
	
	//identify webelement(password) of facebook
	driver.findElement(By.name("pass")).sendKeys("2507198900");
	
	Thread.sleep(1000);
	
	// identify webelement(login) of facebook
	driver.findElement(By.name("login")).click();
	
	driver.findElement(By.xpath("//*[@preserveAspectRatio='xMidYMid slice' and @style='height:40px;width:40px'][1]")).click();
	
	//driver.findElement(By.xpath("//*[@id=\"mount_0_0_20\"]/div/div[1]/div/div[2]/div[5]/div[2]/div/div[2]/div[1]/div[1]/div/div/div/div/div/div/div/div/div[1]/div/div/div[1]/div[2]/div/div[5]/div/div[1]/div[2]/div/div/div/div/span[@class]")).click();)
	driver.findElement(By.xpath("//span[text()='Log out']")).click();
	}
}
