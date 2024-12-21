package Practise1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class newWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		driver.findElement(By.xpath("//*[@id=\"ta1\"]")).sendKeys("nitin patil");
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://tutorialsninja.com/demo/");
		driver.findElement(By.xpath("//*[@id=\"search\"]/input")).sendKeys("Lenevo");
		
		
		
		

	}

}
