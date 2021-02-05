package com.sample;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sample {

	WebDriver driver;
	
	void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SatyanandamLankey\\Desktop\\Selenium Projects\\Selenium Jars\\Drivers\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://www.genesis.com/us/en/certified.html");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	driver.manage().deleteAllCookies();
	driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/div[1]/button/span")).click();
	
	String MainWindow=driver.getWindowHandle();		
	
    // To handle all new opened window.				
        Set<String> s1=driver.getWindowHandles();		
    Iterator<String> i1=s1.iterator();		
    		
    while(i1.hasNext())			
    {		
        String ChildWindow=i1.next();		
        		
        if(!MainWindow.equalsIgnoreCase(ChildWindow))			
        {    		
             
                // Switching to Child window
                driver.switchTo().window(ChildWindow);	                                                                                                           
               	driver.findElement(By.xpath("//*[@id=\"IPEinvL129158\"]/map/area[3]")).click();
		} else { continue;
		}}
		}
	
	void test1() {
		
		try
		{driver.findElement(By.xpath("//*[@id=\"zipcode\"]")).sendKeys("92709");
//		WebElement yearWE = driver.findElement(By.xpath("//*[@id=\"year\"]/section"));
//		//Select yearDD = new Select(yearWE);
//		//yearDD.selectByVisibleText("2019");
		
		WebElement yearWE = driver.findElement(By.xpath("//*[@id=\"yearDropdown\"]"));
		yearWE.click();
		driver.findElement(By.xpath("//section/ul/li[.='2020']")).click();
		}
		catch(Exception e)
		{
			if(e.getMessage().equals("org.openqa.selenium.ElementClickInterceptedException"))
			{
//				Alert alt = driver.switchTo().alert();
//				alt.dismiss();
				
			}
		}
		
				
		
	/*	WebElement modelWE = driver.findElement(By.xpath(//*[@id="model"]/div"));
				Select modelDD = new Select(yearDD);
				modelDD.deselectByIndex(3);*/
		
	}
	
	public static void main(String[] args) {
		Sample obj = new Sample();
		obj.launchBrowser();
		obj.test1();
	}

}
