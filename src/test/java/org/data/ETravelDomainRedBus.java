package org.data;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ETravelDomainRedBus {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Ganesh\\eclipse-workspace\\PracticeRepo\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();

		WebElement signin = driver.findElement(By.id("signin-block"));
		signin.click();

		driver.findElement(By.xpath("//li[text()='Sign In/Sign Up']")).click();
		
		// Handling Frame 
		driver.findElement(By.xpath("//i[@class='icon-close']")).click();

		// From loc.
		driver.findElement(By.id("src")).sendKeys("Chennai");

		// Destination loc.
		driver.findElement(By.id("dest")).sendKeys("Erode");
		
		//Calender for Date selection
		driver.findElement(By.id("onward_cal")).click();
		driver.findElement(By.xpath("//td[text()='12']")).click();

		//Clicking the search button
		driver.findElement(By.id("search_btn")).click();
		
		// for closing advertisement
		//driver.findElement(By.xpath("//i[@class='icon icon-close']")).click();
		
		System.out.println(" SUCCESSFULLY EXECUTED ");
	}
}
