package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchEdgeBrowser {
	public static void main(String[] args) throws InterruptedException {
		
	// to launch Edge browser we need to create object for EdgeDriver(c) and upcast it to WebDriver(I)
		
	WebDriver	driver=new EdgeDriver();
	driver.manage().window().maximize();// to maximize the browser
		System.out.println("Edge is open!");
		
// to provide delay before closing the browser using sleep() method of Thread class which is static class
	 Thread.sleep(3000);	// it throws checked exception
	 
// to close the browser using close method of WebDriver Interface
	 driver.close();
	 System.out.println("Edge browser is closed !!");
	}

}
