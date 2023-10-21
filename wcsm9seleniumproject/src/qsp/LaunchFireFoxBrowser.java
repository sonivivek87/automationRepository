package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFireFoxBrowser {
	public static void main(String[] args) throws InterruptedException {
		
// we need to create an object for FirefoxDriver(c) and upcast it to WebDriver(I)
		
	   WebDriver driver=new FirefoxDriver();
	   driver.manage().window().maximize();// to maximize the browser
	   System.out.println("Firefox is open!");
	    
// to provide delay before closing the browser using sleep() method of Thread class which is static class
	    Thread.sleep(3000);  //// it throws checked exception
	    
// to close the browser using close() method of WebDriver Interface 
	    driver.close();
	    System.out.println("Firefox is closed !!");
	}

	
}
