package Practise1;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Wait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		/* Implicit wait
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		driver.findElement(By.xpath("//*[@id=\"HTML34\"]/div[1]/div/button")).click();
		driver.findElement(By.xpath("//*[@id=\"myDropdown\"]/a[3]")).click();
		
		*/
		
		/*
		
		Explicite Wait - WebDriver Wait
		
		
		driver.findElement(By.xpath("//*[@id=\"HTML34\"]/div[1]/div/button")).click();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement gmailOption = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"myDropdown\"]/a[3]")));
		gmailOption.click();
		
		*/
		
		// fluent wait
		
		driver.findElement(By.xpath("//*[@id=\"HTML34\"]/div[1]/div/button")).click();
		
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(1))
				.ignoring(NoSuchElementException.class);
		WebElement gmailOption = wait.until(new Function<WebDriver, WebElement>()
				{

					public WebElement apply(WebDriver driver)
					{
						return driver.findElement(By.linkText("Gmail"));
					}
			
				});
		
		gmailOption.click();
	}

}
