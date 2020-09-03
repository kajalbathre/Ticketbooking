package app.globalpackage;


import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

/*This is intended to be the root class from which all other test cases are extended.
Data is driving through excel 

  @author kajal Bathre */

public class Genericclass {
	public static WebDriver driver = null;
	public static WebDriver browser = null;
	public static String browserParentWindow = "";
	public static String browserChildWindow = "";
	public static String directoryPath = System.getProperty("user.dir");

	
	public static void initialize(String URL, String browserName) {

		if (browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}}
		
		public void selectByValue(WebElement element, String  value) {

			Select dropDown = new Select(element);
			dropDown.selectByValue(value);
		}

	}