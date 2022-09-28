package Testscripts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.Reporter;
import org.testng.annotations.Test;

import functions.Delemp;
import functions.Login;
import functions.Logout;
import log4j.Log;
import utils.Base;

public class TC003 {
	@Test
	public void login()throws Exception {
		DOMConfigurator.configure("log4j.xml");
		Base.openapp();
		Login.login("Admin","admin123" );
		Delemp.delemp();
		Thread.sleep(3000);
		Logout.logout();
		Base.closeapp();
		Reporter.log("employee deleted");
		Log.info("employee deleted");
	}

}
