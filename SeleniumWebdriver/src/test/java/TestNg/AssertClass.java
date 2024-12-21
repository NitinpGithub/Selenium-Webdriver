package TestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class AssertClass {
	
	@Test 
	public void titleCheck()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		String title = "Register";
		String title1 = driver.getTitle();
		System.out.println(title);
		System.out.println(title1);
		//Assert.assertEquals(title, title1);
		Assert.assertEquals(title, title1);
		
		driver.quit();
	}

}
