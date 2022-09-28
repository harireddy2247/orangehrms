package functions;
import utils.Base;
import org.checkerframework.checker.units.qual.degrees;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import io.opentelemetry.semconv.trace.attributes.SemanticAttributes.NetHostConnectionSubtypeValues;

public class Addemp extends Base{
	public static By addempbtn=By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[1]/button");
	public static By fnb=By.name("firstName");
	public static By mnb=By.name("middleName");
	public static By lnb=By.name("lastName");
	public static By eidb=By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[2]/div/div/div[2]/input");
	public static By savebtn=By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/button[2]");	
	
	public static void addemp(String fn,String mn,String ln,String eid) {
		d.findElement(addempbtn).click();
		d.findElement(fnb).sendKeys(fn);
		d.findElement(mnb).sendKeys(mn);
		d.findElement(lnb).sendKeys(ln);
		d.findElement(eidb).sendKeys(Keys.BACK_SPACE);
		d.findElement(eidb).sendKeys(Keys.BACK_SPACE);
		d.findElement(eidb).sendKeys(Keys.BACK_SPACE);
		d.findElement(eidb).sendKeys(Keys.BACK_SPACE);
		d.findElement(eidb).sendKeys(eid);
		d.findElement(savebtn).click();
		
	}
	

}
