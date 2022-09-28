package Testscripts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.Reporter;
import org.testng.annotations.Test;

import functions.Login;
import functions.Logout;
import log4j.Log;
import utils.Base;

public class TC001 {
	@Test
	public static void login() {
		DOMConfigurator.configure("log4j.xml");
		Base.openapp();
		Login.login("Admin","admin123");
		Logout.logout();
		Base.closeapp();
		Reporter.log("login and logout success");
		Log.info("login and logout success");
		
	}
	

}
