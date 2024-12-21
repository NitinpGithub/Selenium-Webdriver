package PractiseForSeleniumAndTestNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
		driver.manage().window().maximize();
		
		
		List<WebElement> rowNum = driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr"));
		List<WebElement> colNum = driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr/th"));
		
		for(int i=2;i<=rowNum.size();i++)
		{
			for(int j=1;j<=colNum.size();j++)
			{
				System.out.print(driver.findElement(By.xpath("//table[@id=\"customers\"]/tbody/tr["+ i +"]/td["+ j +"]")).getText()+"  ");
			}
			System.out.println();
		}
	}

}
