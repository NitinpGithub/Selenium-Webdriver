package TestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class Annotations {
	
	/* Annotation of TestNg are mainly used for control the flow of execution of tests 
	  
	  Types - 
	  
	  @Test
	  @BeforeMethod
	  @AfterMethod
	  @BeforeClass
	  @AfterClass
	  @BeforeTest
	  @AfterTest
	  @BeforeSuite
	  @AfterSuite
	  @BeforeGroup
	  @AfterGroup
	  @DataProvider
	  @Parameters
	  @Factory
	  @Ignore
	  @Listeners
	  
	  */
	
	public static WebDriver driver;
	
	@AfterMethod 
	public void tearDown()
	{
		driver.quit();
	
	}
	
	@BeforeMethod
	public void setup()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/v1/");
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
		Assert.assertEquals(ActualTitle, ExpectedTitle);
	}
	
	@Test(priority = 2)
	public void VarifyLoginWithValidUsernameAndInvalidPassword()
	{
		
		driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce1");
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		
		String ActualError = driver.findElement(By.xpath("//*[@id=\"login_button_container\"]/div/form/h3")).getText();
		System.out.println(ActualError);
		String ExpectedError = "Epic sadface: Username and password do not match any user in this service";
		Assert.assertEquals(ActualError, ExpectedError);
	}
	
	@Test(priority = 3)
	public void VarifyLoginWithInvalidUsernameAndValidPassword()
	{
		
		driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user123");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		
		String ActualError = driver.findElement(By.xpath("//*[@id=\"login_button_container\"]/div/form/h3")).getText();
		System.out.println(ActualError);
		String ExpectedError = "Epic sadface: Username and password do not match any user in this service";
		Assert.assertEquals(ActualError, ExpectedError);
	}
	

}
