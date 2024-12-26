package TestNg;
import java.time.Duration;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.*;
import org.testng.annotations.Test;

import MyListeners.AllListeners;
import io.github.bonigarcia.wdm.WebDriverManager;

@Listeners(AllListeners.class)
public class DataProvider1{

	WebDriver driver;

	@BeforeMethod
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/v1/index.html");
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	@Test(dataProvider="getTestData",invocationCount=5)//,dataProviderClass=DataProviderClass1.class)
	//public void VarifyLoginWithInValidCredential(String username,String password) {
	public void VarifyLoginWithInValidCredential(String[] str) {
		driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys(str[0]);
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(str[1]);
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		//Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a/svg/path")).isDisplayed());
		Assert.assertEquals("Sauce Labs Backpack", driver.findElement(By.xpath("//*[@id=\"item_4_title_link\"]/div")).getText());
		driver.findElement(By.xpath("//*[@id=\"menu_button_container\"]/div/div[3]/div/button")).click();
		driver.findElement(By.xpath("//*[@id=\"logout_sidebar_link\"]")).click();

	}
	/* if we want to use method name for dataprovider then we can change 
	DataProvider name like given below
	
	and this name we can pass to dataProvider when we can use these value
	*/
	
	/*
	 Suppose ther are more number of data to be pass to method like
	 username,password,DBO,conformPassword
	 
	 At that time we have to use Parameter Array
	 
	 like, we can keep @DataProvider as it is
	 
	 but we have to change @Test method like
	 public void VarifyLoginWithInValidCredential(String [] str)
	 {
	    driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys(str[0]);
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(str[1]);
	 }
	 */
	// single class can contain multiple data provider
	@DataProvider(name="getTestData")
	public String[][] LoginData()
	{
		String[][] data = 
			{ 
				{"standard_user","secret_sauce"},
				{"problem_user","secret_sauce"},
				{"performance_glitch_user","secret_sauce"}
			};
		return data;
	}
}
