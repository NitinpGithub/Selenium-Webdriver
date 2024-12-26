package Practise1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class first {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");
		WebDriver driver = new ChromeDriver(options);
		System.out.println("Chrome is running");
		driver.get("https://www.google.co.in/");
		System.out.println("URL opned");
		driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys("Accenture");
		System.out.println("Accenture word sent");
		driver.manage().window().maximize();
		System.out.println("Window maximize");
		
	}

}
