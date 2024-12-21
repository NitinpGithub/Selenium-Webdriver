package PractiseForSeleniumAndTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardsEvent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://extendsclass.com/text-compare.html");
		WebElement txt1 = driver.findElement(By.xpath("//*[@id=\"result\"]/div[4]"));
		WebElement txt2 = driver.findElement(By.xpath("//*[@id=\"result\"]/div[5]"));
		Actions action = new Actions(driver);
		action.keyDown(txt1, Keys.CONTROL).sendKeys("a").sendKeys("c").build().perform();
		action.keyDown(txt2, Keys.CONTROL).sendKeys("a").sendKeys("v").build().perform();
		
		
		

	}

}
