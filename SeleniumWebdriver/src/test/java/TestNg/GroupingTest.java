package TestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

//@Test(groups="all")
public class GroupingTest {
	
	/*
	  if we want to make group of the test case then we have to mention
	  @Test(priority=1,groups{"smoke","regression","sanity"})
	  
	  By creating textNg.xml file we can call these group
	  
	  <?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">
<suite name="Suite">
	<test thread-count="5" name="LoginTest">
		<groups>
			<run>
				<include name="smoke" />
			</run>
		</groups>
		<classes>
			<class name="TestNg.GroupingTest"></class>
		</classes>
	</test> 
</suite> 

Also we can run theser group in global level for that we have to 
add group tag after <suite> tag like

<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">
<suite name="Suite">
<groups>
			<run>
				<include name="smoke" />
			</run>
		</groups>
		
	<test thread-count="5" name="LoginTest">
		
		<classes>
			<class name="TestNg.GroupingTest"></class>
		</classes>
	</test> 
</suite> 

We can make group of groups using <define name="daily_build"/> tag

<groups>
<define name="daily_build"/>
<run>
<include name=""/>
</run>
</groups>

when we make all method in group like @Test(groups="all") for all method
then , no need to add these "all" tag for each and every method
for this we can make "all" for global level in class then we have to add
@Test(groups="all")
Run All

public class <class name>
{

}
	 */
	public static WebDriver driver;
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

	@Test(priority = 1)
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

	@Test(priority = 3)
	public void VarifyLoginWithInvalidUsernameAndValidPassword() {

		driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user123");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();

		String ActualError = driver.findElement(By.xpath("//*[@id=\"login_button_container\"]/div/form/h3")).getText();
		System.out.println(ActualError);
		String ExpectedError = "Epic sadface: Username and password do not match any user in this service";
		Assert.assertEquals(ActualError, ExpectedError);
	}

}
