package functions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import utils.Base;

public class Logout extends Base {

	public static By userprofbtn=By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span/i");
	public static By lgoutbtn=By.linkText("Logout");
	
	
	public  static void logout() {
		d.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		d.findElement(userprofbtn).click();
		d.findElement(lgoutbtn).click();
		
	}
}
