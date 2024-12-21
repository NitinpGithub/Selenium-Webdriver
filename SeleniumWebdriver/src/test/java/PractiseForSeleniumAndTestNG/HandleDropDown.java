package PractiseForSeleniumAndTestNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropDown {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://trytestingthis.netlify.app/");
		driver.manage().window().maximize();
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='option']"));
		
		
		/*Select selectDropdown = new Select(dropdown);
		selectDropdown.selectByIndex(1);
		Thread.sleep(1000);
//		selectDropdown.selectByValue("Option 1");
//		Thread.sleep(1000);
		selectDropdown.selectByVisibleText("Option 3");
		*/
		
		Select selectDropdown = new Select(dropdown);
		List<WebElement> all = selectDropdown.getOptions();
		for(WebElement option:all)
		{
			System.out.println(option.getText());
		}
		

		
	}

}
