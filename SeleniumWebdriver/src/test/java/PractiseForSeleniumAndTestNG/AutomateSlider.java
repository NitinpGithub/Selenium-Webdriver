package PractiseForSeleniumAndTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AutomateSlider {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/slider/");
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"content\"]/iframe")));
		WebElement slider = driver.findElement(By.xpath("//*[@id=\"slider\"]/span"));
		Actions action = new Actions(driver);
		action.dragAndDropBy(slider, 120, 100).build().perform();
		

	}

}
