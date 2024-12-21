package Practise1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		/*
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"post-2646\"]/div[2]/div/div/div/p/select"));
		Select select = new Select(dropdown);
		select.selectByIndex(0);
		select.selectByValue("ALB");
		select.selectByVisibleText("Armenia");
		*/
		
		driver.get("https://demoqa.com/select-menu");
		WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"selectMenuContainer\"]/div[7]/div/div/div/div[2]/div/svg/path"));
		Select select = new Select(dropdown);
		List<WebElement> AllSelectItem = select.getAllSelectedOptions();
		
		System.out.println(AllSelectItem.size());
		Thread.sleep(1000);
		select.deselectByIndex(1);
		

	}

}
