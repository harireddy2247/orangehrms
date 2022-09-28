package utils;

import org.checkerframework.checker.units.qual.degrees;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	public static WebDriver d;
	public static void openapp() {
		System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver.exe");
		d=new ChromeDriver();
		d.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
public static void closeapp() {
	d.close();
}

}
