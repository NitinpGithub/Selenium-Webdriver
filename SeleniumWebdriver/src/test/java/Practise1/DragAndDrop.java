package Practise1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDrop {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(0);
		Actions action = new Actions(driver);
		WebElement draggable = driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
		WebElement Droppable = driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
		action.dragAndDrop(draggable, Droppable).build().perform();
		

	}

}
