package Practise1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HAndleSlider {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/slider/");
		driver.switchTo().frame(0);
		WebElement resizableElement = driver.findElement(By.xpath("//*[@id=\"slider\"]/span"));
		Actions action = new Actions(driver);
		action.dragAndDropBy(resizableElement,100,100).perform();

	}

}
