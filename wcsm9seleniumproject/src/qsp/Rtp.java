package qsp;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Rtp {

	public static void main(String[] args) throws InterruptedException{
		
    Scanner	sc=new Scanner(System.in);
	System.out.println("Enter the Browser Name!!");
	String browsername = sc.next();
	
	if(browsername.equalsIgnoreCase("chrome"))
	{
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
        Thread.sleep(3000);
	    driver.close();
	}
	
	else if(browsername.equalsIgnoreCase("Firefox"))
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.close();
	}
	
	else if(browsername.equalsIgnoreCase("Edge"))
	{

        WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.close();
	}
	
	else
	{
		System.out.println("Enter valid Browser Name");
	}
		
	}

}
