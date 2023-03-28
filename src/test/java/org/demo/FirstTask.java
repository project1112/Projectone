package org.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;



public class FirstTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\aaa\\MavenProject\\Drivers\\chromedriver.exe");
				WebDriverManager.chromedriver().setup();
				
				WebDriver driver = new ChromeDriver();
				driver.get("https://www.facebook.com/");
				driver.manage().window().maximize();
				
				WebElement username = driver.findElement(By.id("email"));
				username.sendKeys("Java");
				
				WebElement password = driver.findElement(By.id("pass"));
				password.sendKeys("Password");
				
				WebElement btn = driver.findElement(By.name("login"));
				btn.click();
	}

}
