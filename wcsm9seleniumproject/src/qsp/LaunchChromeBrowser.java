package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChromeBrowser {
	public static void main(String[] args) throws InterruptedException {
		
	// to launch Chrome browser we need to create an object of ChromeDriver(c) class and upcast to Webdriver interface
		WebDriver driver=new ChromeDriver();    // it will launch/open the browser
	
// to maximise the browser
	driver.manage().window().maximize();
    System.out.println("chrome is open !!");
		
	// to provide some delay before closing the browser using sleep method of Thread class(static class)
		Thread.sleep(3000);  // it throws checked exception
		
		//to close the browser using close method of WebDriver Interface
		driver.close();
		System.out.println("Chrome is closed !!");
	}

}

