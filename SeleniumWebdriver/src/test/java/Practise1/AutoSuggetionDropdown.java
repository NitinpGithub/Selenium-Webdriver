package Practise1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSuggetionDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		
		//driver.findElement(By.xpath("//*[@id=\"top-banner\"]/div[2]/div/div/div/div/div[2]/div[1]/div[1]/label")).click();
		//driver.findElement(By.xpath("//*[@id=\"top-banner\"]/div[2]/div/div/div/div/div[2]/div[1]/div[1]/div[1]/div/div/div/input")).sendKeys("pune");
		//driver.findElement(By.xpath("//*[@id=\"top-banner\"]/div[2]/div/div/div/div/div[2]/div[1]/div[1]/div[1]/div/div/div/input")).sendKeys(Keys.ARROW_DOWN);
		//driver.findElement(By.xpath("//*[@id=\"top-banner\"]/div[2]/div/div/div/div/div[2]/div[1]/div[1]/div[1]/div/div/div/input")).sendKeys(keys.ENTER);
	}

}
