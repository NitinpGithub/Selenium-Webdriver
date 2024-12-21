package Practise1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		Actions action = new Actions(driver);
		
//		driver.findElement(By.xpath("//*[@id=\"HTML33\"]/div[1]/input[1]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"HTML33\"]/div[1]/input[1]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"HTML33\"]/div[1]/input[2]")).click();
//		Thread.sleep(2000);
		WebElement radio = driver.findElement(By.xpath(""));
		action.moveToElement(radio).perform();
		

	}

}
