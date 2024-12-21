package Practise1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AuthenticationPopUp {
	public static String username = "admin";
	public static String password = "admin";

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://"+username+":"+password+"@the-internet.herokuapp.com/basic_auth");
		//https://the-internet.herokuapp.com/basic_auth

	}

}
