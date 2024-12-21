package PractiseForSeleniumAndTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestedDropdowm {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//input[@class='Pke_EE']")).click();
		WebElement from = driver.findElement(By.xpath("//input[@class='Pke_EE']"));
		from.click();
		from.sendKeys("T");
		from.sendKeys(Keys.ARROW_DOWN);
		from.sendKeys(Keys.ENTER);

	}

}
