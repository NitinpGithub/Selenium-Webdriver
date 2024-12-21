package TestNg;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Parameters1 {

	public static WebDriver driver;
	
	/* @Parameter
	  
	  If we want to pass anything to Test from .xml file 
	  then we can use parameters
	 */
	
	@Parameters("url")
	@BeforeMethod
	public void setup(String URL)
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(URL);
	}
	
	
	@Test(priority = 1)
	public void VarifyLoginWithValidCredential()
	{
		
		driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		
		String ActualTitle = driver.getTitle();
		System.out.println(ActualTitle);
		String ExpectedTitle = "Swag Labs";
		AssertJUnit.assertEquals(ActualTitle, ExpectedTitle);
	}
	
	
	/* @Optional Parameter
	  
	  If we didnt get value from .xml then use the optional value
	  
	 */
	
	/*
	 @Parameters("url")
	@BeforeMethod
	public void setup(@Optional("optional value") String URL)
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(URL);
	}
	
	
	@Test(priority = 1)
	public void VarifyLoginWithValidCredential()
	{
		
		driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		
		String ActualTitle = driver.getTitle();
		System.out.println(ActualTitle);
		String ExpectedTitle = "Swag Labs";
		AssertJUnit.assertEquals(ActualTitle, ExpectedTitle);
	} 
	 */
	 
	
}
