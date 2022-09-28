package functions;

import java.util.concurrent.TimeUnit;

import org.checkerframework.checker.units.qual.degrees;
import org.openqa.selenium.By;

import utils.Base;

public class Login extends Base {
	
	public static By unb= By.name("username");
	public static By passbox= By.name("password");
	public static By lgnbtn= By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button");
	
	
	
	public static void login(String un,String pass) {
		d.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		d.findElement(unb).sendKeys(un);
		d.findElement(passbox).sendKeys(pass);
		d.findElement(lgnbtn).click();
	}

}
