package Practise1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyBoardsEvents {

	public static void main(String[] args)
	{
		
			
			WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://extendsclass.com/text-compare.html");
		WebElement CopyFrom = driver.findElement(By.xpath("//*[@id=\"dropZone\"]/div[2]/div/div[6]"));
		WebElement PasteTo = driver.findElement(By.xpath("//*[@id=\"dropZone2\"]/div[2]/div/div[6]"));
		
		Actions action = new Actions(driver);
		action.keyDown(CopyFrom, Keys.CONTROL).sendKeys("a").sendKeys("c").build().perform();
		action.keyDown(PasteTo, Keys.CONTROL).sendKeys("a").sendKeys("v").build().perform();
		

	}

}
