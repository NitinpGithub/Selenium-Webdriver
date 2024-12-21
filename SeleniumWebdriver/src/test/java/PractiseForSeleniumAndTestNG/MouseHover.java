package PractiseForSeleniumAndTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get(
				"https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_5szpgfto9i_e&adgrpid=155259813593&hvpone=&hvptwo=&hvadid=713930225169&hvpos=&hvnetw=g&hvrand=17545940199318877111&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9301536&hvtargid=kwd-64107830&hydadcr=14452_2402225&gad_source=1");
		WebElement element = driver.findElement(By.xpath("//*[@id=\"nav-link-accountList-nav-line-1\"]"));

		Actions action = new Actions(driver);
		// action.moveToElement(element).build().perform();

//		action.moveToElement(driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[3]"))).click().build().perform();
//		driver.navigate().back();

//		action.moveToElement(driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"))).click()
//				.sendKeys("pen drive").doubleClick().build().perform();
		
		action.moveToElement(driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"))).contextClick().build().perform();

	}

}
