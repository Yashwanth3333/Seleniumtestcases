package com.maven.selenium;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Seleniumtest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","F:\\Devops\\chromedriver.exe");
		ChromeOptions chromeOptions = new ChromeOptions();
		WebDriver driver = new ChromeDriver(chromeOptions);
		System.out.println("Hi");
		driver.get("http://http://54.234.200.36:8888/addressbook/");
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		driver.findElement(By.className("v-button")).click();
		driver.findElement(By.id("gwt-uid-5")).sendKeys("Yashwanth");
		driver.findElement(By.id("gwt-uid-7")).sendKeys("gowd");
		driver.findElement(By.id("gwt-uid-9")).sendKeys("1111111111");
		driver.findElement(By.id("gwt-uid-11")).sendKeys("abc@gmail.com");
		driver.findElement(By.id("gwt-uid-13")).sendKeys("3/31/23,");
		driver.findElement(By.className("v-button-primary")).click();
		System.out.println("TestCase Executed");
		Thread.sleep(5000);
		//driver.quit();
	}

}


