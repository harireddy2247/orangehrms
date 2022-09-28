package functions;

import org.checkerframework.checker.units.qual.degrees;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.interactions.Actions;

import utils.Base;

public class Delemp extends Base {
	public static By checkbox=By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div[1]/div/div[1]");
    public static By delselbtn=By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[2]/div/div/button/i");
    public static By cnfdel= By.xpath("//*[@id=\"app\"]/div[3]/div/div/div/div[3]/button[2]");
////*[@id="app"]/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div[1]/div/div[1]
////*[@id="app"]/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div[2]/div/div[1]
public static void delemp() {
	int row= d.findElements(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div[1]")).size();
	for(int i=1;i<=row;i=i+2) {
		d.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div["+i+"]/div/div[1]")).click();
	}
	Actions a=new Actions(d);
	a.moveToElement(d.findElement(delselbtn)).perform();
	d.findElement(delselbtn).click();
	a.moveToElement(d.findElement(cnfdel)).perform();
	d.findElement(cnfdel).click();
	
	}
	
}