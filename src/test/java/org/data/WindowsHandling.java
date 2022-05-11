package org.data;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandling {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Ganesh\\eclipse-workspace\\PracticeRepo\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();

		WebElement btnclose = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		btnclose.click();

		
		WebElement searchbtn = driver.findElement(By.xpath("//input[@type='text']"));
		searchbtn.sendKeys("iphone");
		
		WebElement clicksearch = driver.findElement(By.xpath("//button[@type='submit']"));
		clicksearch.click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		driver.findElement(By.xpath("//div[text()='APPLE iPhone 11 (Purple, 64 GB)']")).click();
		
		String ParentId = driver.getWindowHandle();
		System.out.println(ParentId);
		
		Set<String> AllWindowId = driver.getWindowHandles();
		System.out.println(AllWindowId);
		
		for (String eachId : AllWindowId) {
			if (!eachId.equals(ParentId)) {
				driver.switchTo().window(eachId);
			}
		}
		driver.findElement(By.xpath("//button[@type='button']")).click();
		
		System.out.println(" SUCCESSFULLY EXECUTED ");
	}
}
