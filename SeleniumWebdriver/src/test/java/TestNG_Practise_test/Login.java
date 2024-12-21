package TestNG_Practise_test;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login
{
	@Test
	public void VarifyLoginWithVAlidCredential()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/success");
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a/span[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a")).click();
		
		driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("np4026@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("Swapnali@2201");
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")).click();
		
		Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"logo\"]/h1/a")).isDisplayed());
		driver.quit();
		
	}
	
	@Test
	public void VarifyLoginWithInValidCredential()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/success");
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a/span[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a")).click();
		
		driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("np4026@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("Swapnali");
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")).click();
		
		Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"logo\"]/h1/a")).isDisplayed());
		driver.quit();
		
	}

}
