package PractiseForSeleniumAndTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingLerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("/html/body/button")).click();
		String txt = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		System.out.println(txt);

	}

}
