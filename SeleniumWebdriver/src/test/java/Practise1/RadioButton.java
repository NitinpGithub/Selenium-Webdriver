package Practise1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButton {

	public static void main(String[] args) {

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.singaporeair.com/en_UK/in/home?gad_source=1&gclid=Cj0KCQjwt4a2BhD6ARIsALgH7Dr5xF0FKRJMu20wJNIyL4rNTNFwaBchW9HmKlf3diEjzKStfo-dfWkaAkOoEALw_wcB&gclsrc=aw.ds#/book/bookflight");
		
		Actions actions = new Actions(driver);
		WebElement radio = driver.findElement(By.id("redeemFlights"));
		actions.moveToElement(radio).perform();
		

	}

}
