package Practise1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class HandlingMultipleWindow {
	static Set<String> multipleWindow;
	static WebDriver driver;
	static String xpath1=null;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		String parentWindow = driver.getWindowHandle();

		driver.findElement(By.linkText("Open a popup window")).click();
		//driver.findElement(By.linkText("Blogger")).click();

		multipleWindow = driver.getWindowHandles();
		

//		Iterator<String> itr = multipleWindow.iterator();
//
//		while (itr.hasNext())
//		{
//			String win = itr.next();
//
//			driver.switchTo().window(win);
//
//			if (driver.getTitle().equals("New Window")) 
//			{
//				String text = driver.findElement(By.className("example")).getText();
//				System.out.println(text);
//				driver.close();
//				break;
//			}
//			
//		}
//		
//		Iterator<String> itr1 = multipleWindow.iterator();
//		while(itr1.hasNext())
//		{
//			String win1 = itr1.next();
//			driver.switchTo().window(win1);
//			
//			if(driver.getTitle().equals("Blogger.com - Create a unique and beautiful blog easily."))
//			{
//				driver.findElement(By.xpath("/html/body/header/div[1]/div[2]/a[1]/span")).click();
//				driver.close();
//				break;
//			}
//
//		}
		
		String title1 = "New Window";
		String title2 = "Blogger.com - Create a unique and beautiful blog easily.";
		xpath1 = "/html/body/div";
		reusableWindow(title1);

		driver.switchTo().window(parentWindow);
		
		driver.findElement(By.xpath("//*[@id=\"BlogSearch1_form\"]/form/table/tbody/tr/td[1]/input")).sendKeys("nitin patil");
		driver.close();	

	}
	public static void reusableWindow(String title)
	{
		Iterator<String> itr = multipleWindow.iterator();
		
		while(itr.hasNext())
		{
			String win = itr.next();
			driver.switchTo().window(win);
			if(driver.getTitle().equals(title))
			{
				System.out.println(title);
			}

		}
		
	}

}
