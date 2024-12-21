package Practise1;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TakeScreenShot {

	public static void main(String[] args) throws IOException {
		
		Date currentDate = new Date();
		String ScreenShotFileName = currentDate.toString().replace(" ", "-").replace(":","-");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		
		File takesScreenSchot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(takesScreenSchot, new File(".//ScreenShot/"+ ScreenShotFileName +".png"));

	}

}
