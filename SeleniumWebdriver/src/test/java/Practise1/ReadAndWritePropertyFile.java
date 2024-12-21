package Practise1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadAndWritePropertyFile {

	public static void main(String[] args) throws IOException {

		Properties prop = new Properties();

//		// Read in Property file
//		FileInputStream fis = new FileInputStream(
//				"C:\\Users\\SWAPNALI\\Desktop\\Selenium\\SeleniumWebdriver\\src\\main\\resources\\Properties\\TEstData.properties");
//		prop.load(fis);
//		System.out.println(prop.getProperty("browser"));

		// Write in Property file
		FileOutputStream fos = new FileOutputStream(
				"C:\\Users\\SWAPNALI\\Desktop\\Selenium\\SeleniumWebdriver\\src\\main\\resources\\Properties\\TEstData.properties");
		prop.setProperty("browser", "edge");

	}

}
