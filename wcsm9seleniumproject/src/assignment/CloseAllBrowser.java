package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseAllBrowser {

/*	how to close all the browsers/windows
---------------------------------------------*/
	
	public static void main(String[] args) throws InterruptedException {
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 Thread.sleep(2000);
	 
	 driver.get("http://omayo.blogspot.com/");
	 Thread.sleep(1000);
	
	 driver.findElement(By.xpath("//a[text()='Open a popup window']")).click();
	 Thread.sleep(3000);
	 driver.quit();
	}

}
