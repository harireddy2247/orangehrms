package Testscripts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.Reporter;
import org.testng.annotations.Test;

import functions.Addemp;
import functions.Login;
import functions.Logout;
import log4j.Log;
import utils.Base;

public class TC002 {
	@Test
	public  void addemployee() throws Exception {
		DOMConfigurator.configure("log4j.xml");
		Base.openapp();
		Login.login("Admin","admin123");
		Addemp.addemp("pedda", "gudda","satish","2248");
		Thread.sleep(3000);
		Logout.logout();
		Base.closeapp();
		Reporter.log("employee added");
		Log.info("employee added");
	}
		}

