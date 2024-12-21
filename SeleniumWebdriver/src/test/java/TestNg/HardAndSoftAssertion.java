package TestNg;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;


public class HardAndSoftAssertion 
{
	@Test 
	public void HardAndSoftAssert()
	{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		
		/* If our test case is failed then rest of the code will not execute.
		To avoid that issue we have to use soft assert by creating SoftAssert class object
		and by using that object reference we have to call SoftAssert class method like 
		SoftAssert.assertEqual()
		*/
		
		SoftAssert softAssert = new SoftAssert();
		String title = "Register1";
		String title1 = driver.getTitle();
		softAssert.assertEquals(title, title1);
		
		String URL = "https://demo.automationtesting.in/Register.html";
		String currentUrl = driver.getCurrentUrl();
		
		Assert.assertEquals(URL, currentUrl);
		
		driver.quit();
		softAssert.assertAll();
	}
}
