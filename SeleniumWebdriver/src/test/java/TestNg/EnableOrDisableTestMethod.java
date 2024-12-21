
package TestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

//@Ignore
public class EnableOrDisableTestMethod 
{
	
public static WebDriver driver;
	
	/*
	 If we want to make Test Method enable or disable then we have to add 
	 enabled Annotation after @Test like (@Test (enabled=true/false))
	 
	 There is another Annotation to make Test Method enable or disable
	 we have to add @Ignore Annotation on the top of @Test Annotation 
	 
	 To make Ignore all methods at class level then we have to make
	 @ignore at class level like, we can add @Ignore Annotation at
	 Top of Run All
	 
	 If we want to make @Ignore at package level then we have to add
	 @Ignore Annotation at top of package name, but for that we have to first 
	 create package-info.java. for that Right click on the the current package
	 and click new -> click Package -> without changing any information
	 just mark check box of package-info.java and then finish. 
	 after that at top of package information add @Ignore Annotation and 
	 then import
	 
	 */

	@AfterMethod
	public void tearDown() {
		driver.quit();

	}

	@BeforeMethod
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/v1/");
	}

	@Ignore 
	@Test//(priority = 1,enabled=false)
	public void VarifyLoginWithValidCredential() {

		driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();

		String ActualTitle = driver.getTitle();
		System.out.println(ActualTitle);
		String ExpectedTitle = "Swag Labs";
		Assert.assertEquals(ActualTitle, ExpectedTitle);
	}

	@Test(priority = 2)
	public void VarifyLoginWithValidUsernameAndInvalidPassword() {

		driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce1");
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();

		String ActualError = driver.findElement(By.xpath("//*[@id=\"login_button_container\"]/div/form/h3")).getText();
		System.out.println(ActualError);
		String ExpectedError = "Epic sadface: Username and password do not match any user in this service";
		Assert.assertEquals(ActualError, ExpectedError);
	}
}
