package PractiseForSeleniumAndTestNG;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import dev.failsafe.internal.util.Durations;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Waits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 
		 wait means it will Pause test script for some time before throwing NoSuchElementException
		 
		 Types - 
		 1. implicit wait - 
		 	> implicit wait tell the webdriver to the maximum wait for searching web element until thrown an exception
		 	> implicit wait is global wait and applicable for all webelement in script.
		 	> Scince implicit wait is applicable to all WebElement, we cant set any expected condition to locate element
		 	
		 2. Explicit wait - 
		 	> Explicit wait tell the webdriver to stop execution until perticular condition met or maximum time has passed
		 	> this is applicable for perticular webelement when we specified
		 	> this wait requied xpected condition to be specified for execution like "wait until element is enable"
		 	
		 3. Fluent wait - 
		 	> Fluent wait is type of wait that allow us to wait for maximum amount of waiting time for an element to apear.
		 	  with perodic wait to see if element is present 
		 	> this is more flexible than implicit wait and explicit wait becauset this wait let you define perodic frequency
		 	 and specific condition under which it wait.
		 
		 */
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("");
		
		// Implicit Wait
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		// Explicit wait
		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(""))).click();
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(2))
				.withMessage("")
				.ignoring(NoSuchElementException.class);
		
		

	}

}
