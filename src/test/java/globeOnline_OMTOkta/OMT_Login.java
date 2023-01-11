package globeOnline_OMTOkta;

import static org.junit.Assert.assertTrue;
import org.openqa.selenium.By;
import com.pages.omt.ACQUI_omt_page;
//import globeOnline_FTA.Constant;
import globeOnline_CommonMethods.*;

import utility.*;

public class OMT_Login extends SetDriver {
	private util util = new util();
	
	private ACQUI_omt_page OMTAcqui = new ACQUI_omt_page();
	
	
	
	private By UserName = By.xpath("//input[@name='username' or @id='okta-signin-username']");
	private By Password = By.xpath("//input[@name='password']");
	private By UserName1 = By.xpath("//input[@name='identifier']");
	private By Password1 = By.xpath("//input[@name='credentials.passcode']");
	

	public void OMT_Role_Login(String FlowType, String role) throws Exception {

		Thread.sleep(1000);
		if (OMTAcqui.isElementExist("OKTA Account", "AccountBtn", 20)) {
			 if (OMTAcqui.isClickable("AccountBtn", 5)) {
				 OMTAcqui.clickOnElement("OKTA Account", "AccountBtn", "AccountBtn");	
				 OMTAcqui.clickOnElement("OKTA SignIn", "OKTA_AccSignIn", "OKTA_AccSignIn");
			 }		
		}

		if (OMTAcqui.isElementExist("OKTA SSO button", "OKTA_SSO_Btn", 20)) {
			Generic.WriteTestData("User should be able to access OMT application", "", "",
					"User should be able to access OMT application", "User is able to access OMT application",
					"Passed");
			Thread.sleep(4000);
			Control.takeScreenshot();
			OMTAcqui.clickOnElement("OKTA_SSO", "OKTA_SSO_Btn", "OKTA_SSO_Btn");
		}
		// Login as Team Lead
		String username = util.ReadFromExcel(role, "LoginDetails", Constant.Login_NetworkIDColm);
		String password = util.ReadFromExcel(role, "LoginDetails", Constant.Login_PasswordColm);

		if (OMTAcqui.isElementExist("UserName1", "UserName1", 10)) {
			DriverManager.getDriver().findElement(UserName1).clear();
			DriverManager.getDriver().findElement(UserName1).sendKeys(username);
			Thread.sleep(1000);
			DriverManager.getDriver().findElement(Password1).sendKeys(password);
			Thread.sleep(1000);
			if (OMTAcqui.isElementExist("OMT_Keep me signed in", "KeepMeSignedIn", 10)) {
				DriverManager.getDriver().findElement(OMTAcqui.KeepMeSignedIn).click();
			}
			Generic.WriteTestData("User should be able to enter username & password", "", "", "User should be able to enter username & password","User is able to enter username & password", "Passed");
			Thread.sleep(4000);
		    Control.takeScreenshot();
			OMTAcqui.clickOnElement("Signin Button", "SignIn_Btn", "SignIn_Btn");
			Thread.sleep(2000);

		} else {
			DriverManager.getDriver().findElement(UserName).sendKeys(username);
			OMTAcqui.clickOnElement("Next Button", "Next_Btn", "Next_Btn");
			Thread.sleep(1000);
			// input[@id='remind-me-later-button']
			DriverManager.getDriver().findElement(Password).sendKeys(password);
			Thread.sleep(4000);
			OMTAcqui.clickOnElement("Verify Button", "Verify_Btn", "Verify_Btn");
		}

		if (OMTAcqui.isElementExist("Get Okta Notification", "OKTA_Notif", 10)) {
			Generic.WriteTestData("User should be able to access OMT application", "", "",
					"User should be able to access OMT application", "User is able to access OMT application",
					"Passed");
			Thread.sleep(4000);
			Control.takeScreenshot();
			OMTAcqui.clickOnElement("Get Okta push Notification", "OKTA_Notif", "OKTA_Notif");

		}
		Thread.sleep(5000);
		assertTrue(DriverManager.getDriver().getTitle().contains("Orders Portal"));
		Generic.WriteTestData("User should be able to access Header Order Portal", "", "",
				"User should be able to access OMT application", "User is able to access OMT application", "Passed");
		Thread.sleep(4000);
		Control.takeScreenshot();
		System.out.println("Validated title : Orders Portal");

	}

}
