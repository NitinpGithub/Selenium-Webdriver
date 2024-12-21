package Practise1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class first {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys("Accenture");
		driver.manage().window().maximize();
		
	}

}
