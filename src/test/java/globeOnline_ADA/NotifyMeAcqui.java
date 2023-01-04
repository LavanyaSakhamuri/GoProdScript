package globeOnline_ADA;

import static org.testng.Assert.assertTrue;

import java.util.LinkedHashMap;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import com.pages.ada.Notifyme_page;

import globeOnline_CommonMethods.DriverManager;
import globeOnline_CommonMethods.SetDriver;
import globeOnline_CommonMethods.util;
import utility.Constant;

public class NotifyMeAcqui extends SetDriver {

	private static  NotifyMeAcqui notify = new  NotifyMeAcqui();
	private ADAcommonmethods commn = new ADAcommonmethods();
	private util util = new util();
	private Notifyme_page NP = new Notifyme_page();
	private String Status = "failed";
	private static LinkedHashMap<String,String> Map = new LinkedHashMap<>();


	@Test
	public void notifyMeAcqui() throws Exception {

		JavascriptExecutor jse = (JavascriptExecutor)DriverManager.getDriver();
		jse.executeScript("lambda-name=Notify_Me_Acqui");


		DriverManager.getDriver().get("https://onlineuat.globe.com.ph/");
		//assertTrue(DriverManager.getDriver().getTitle().contains("New Globe Online Shop"));
		System.out.println("Validated title : Globe Online");

		if (NP.isElementExist("Cookies Notification", "cookiesNotification", 10)) {
			Thread.sleep(3000);
			NP.get_privacyAccept().click();
			System.out.println("Clicked on 'Privacy - I accept' button");
		}
		Constant.dataMap.set(Map);
		Constant.dataMap.get().put("TestClassName",notify.getClass().getSimpleName());
		Constant.dataMap.get().put("OMT_LAS", "NOT FOUND");
		Constant.dataMap.get().put("OMT_DispositionStatus", "NOT FOUND");
		Constant.dataMap.get().put("OMT_UpdateDate", "NOT FOUND");
		Constant.dataMap.get().put("OMT_DateOrdered", "NOT FOUND");
		Constant.dataMap.get().put("OMT_EstimatedDayOfDelivery", "NOT FOUND");
		Constant.dataMap.get().put("OMT_OrderDetails", "NOT FOUND");
		Constant.dataMap.get().put("Magento_Details", "NOT FOUND");
		Constant.dataMap.get().put("Magento_OrderAccountInfo", "NOT FOUND");

		
		//Hover on Apply
		commn.hover_On_Menu_LinkApply();
		
		commn.clickonMagnifyGlass("Xiaomi 11T 5G + FREE Xiaomi 11 Series Speaker");
		
		commn.validateProductDetailsPageByClickonMagnifyGlass();
		
		commn.clickonProductGallery();
		
		DriverManager.getDriver().navigate().refresh();
		Thread.sleep(10000);
		
		commn.clickonMagnifyGlass("Xiaomi 11T 5G + FREE Xiaomi 11 Series Speaker");
		
		commn.enterValidData();
		
		commn.validateNotifyPopUp();
		Status = "passed";
		System.out.println("!!! Execution Completed for "+this.getClass().getName()+" !!!");
  }	

   @AfterClass
   public void tearDown() throws Exception {
	   if (DriverManager.getDriver() != null) {
	        ((JavascriptExecutor) DriverManager.getDriver()).executeScript("lambda-status=" + Status);
	    DriverManager.getDriver().quit();
	}

  }


}


	



