package Practise1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PrintAllLink {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		/* Print link 
		List<WebElement> allLink = driver.findElements(By.tagName("link"));
		for(int i=0;i<allLink.size();i++)
		{
			System.out.println(allLink.get(i).getAttribute("href"));
			System.out.println(allLink.get(i).getText());
		}
		*/
		
		/*	Print multiple selection options or all options from dropdown
		
		List<WebElement> allLink = driver.findElements(By.tagName("option"));
		for(int i=0;i<allLink.size();i++)
		{
			//System.out.println(allLink.get(i).getAttribute("value"));
			System.out.println(allLink.get(i).getText());
		}
		 */
		

	}

}
