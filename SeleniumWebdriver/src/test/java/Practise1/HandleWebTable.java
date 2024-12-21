package Practise1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleWebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		//driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[]/td[]"));
		List<WebElement> Row = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/thead/tr/th"));
		
		for(int i=1;i<=5;i++)
		{
			System.out.print(driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/thead/tr/th["+ i +"]")).getText()+"   ");
		}
		System.out.println();
		for(int i=1;i<=26;i++)
		{
			for(int j=1;j<=5;j++)
			{
				System.out.print(driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr["+ i +"]/td["+ j + "]")).getText()+"   ");
				
			}
			System.out.println();
		}

	}

}
