package PractiseForSeleniumAndTestNG;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.salesforce.com/in/");
		driver.findElement(By.xpath("//*[@id=\"1682325589592_4ma\"]/div[1]/article/div[2]/div/pbc-button[1]/a")).click();
		Set<String> allWindow = driver.getWindowHandles();
		
		Iterator<String> itr = allWindow.iterator();
		String parentWindow = itr.next();
		String childWindow = itr.next();
		
		System.out.println(childWindow);
		
		driver.switchTo().window(childWindow);
		System.out.println(driver.getTitle());
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"UserFirstName-SCHP\"]")).sendKeys("Nitin");
		driver.findElement(By.xpath("//*[@id=\"UserLastName-vpwe\"]")).sendKeys("Patil");
		

	}

}
