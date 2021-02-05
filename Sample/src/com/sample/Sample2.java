package com.sample;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class Sample2 {
WebDriver driver;
void startBrowser() {
	//String driverPath=System.getProperty("user.home");
	//System.setProperty("webdriver.chrome.driver", driverPath+"\\chromedriver.exe");
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\SatyanandamLankey\\Desktop\\Selenium Projects\\Genesis_Practice\\chromedriver.exe");
	driver = new ChromeDriver();
	}
void launchApp() {
	driver.get("https://www.genesis.com/us/en/genesis.html");
	driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
}

	void selectModel() {
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/section[1]/div/header/div/div/div/div[2]/div[1]/a[7]/span")).click();
		//Mouse over on 2021 vehicles
		WebElement models2021 = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/section[1]/div/header/div/div/div/div[2]/div[2]/nav/div[1]/div[1]/ul/li[2]/a"));
		Actions act = new Actions(driver);
		act.moveToElement(models2021).build().perform();
		//click on 2021 G70 vehicle
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/section[1]/div/header/div/div/div/div[2]/div[2]/nav/div[1]/div[1]/ul/li[2]/ul/li[1]/a")).click();
	}
	void buildYourar() {
		try {
			driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/div[1]/button/span")).click();
		}finally { 
			// click on Build your Genesis G70
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/section/section[1]/div[1]/div/section/div[3]/a[1]/span")).click();
	}
		
		// Openion Popup
//		@FindBy(xpath="//*[@id=\"IPEinvL129158\"]/map/area[3]")
//		private WebElement No_btn;
//		
//		public void closeOpinion_popup(){
//		JavascriptExecutor executor = (JavascriptExecutor)driver;
//		executor.executeScript("arguments[0].click();", No_btn);
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[46]/div/div[1]/div/div[4]/div/div/div[2]/button/span")).click();
		
			driver.findElement(By.xpath("//*[@id=\"zip\"]")).sendKeys("92708");
			driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[46]/div/div[1]/div/div[7]/div/form/div[2]/div/button/span")).click();			
			driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[46]/div/div[1]/div/div[5]/div[2]/div/div[2]/div[1]/button[1]/span")).click();
			driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[46]/div/div[1]/div/div[5]/div[2]/div/div[5]/div[2]/div[2]/button/span")).click();
			driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[46]/div/div[1]/div/div[5]/div[2]/div/div[4]/div[2]/div[2]/button/span")).click();
			driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[46]/div/div[1]/div/div[5]/div[2]/div/div[2]/div[1]/div/div/div/div[2]/button/span")).click();
			driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[46]/div/div[1]/div/div[5]/div/div[2]/ul[1]/li[3]/div/div[2]/div[2]/span[1]")).click();
			driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[46]/div/div[1]/div/div[5]/button/span[1]")).click();
			driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[46]/div/div[1]/div/div[5]/div[2]/div/div[3]/div[2]/div[2]/button/span")).click();
			driver.close();  //*[@id="app"]/div[1]/div[46]/div/div[1]/div/div[4]/div[2]/div/div[5]/div[2]/div[2]/button/span"}
		
	}
	
	
	public static void main(String[] args) {
		Sample2 obj = new Sample2();
		obj.startBrowser();
		obj.launchApp();
		obj.selectModel();
		obj.buildYourar();
	}

}
