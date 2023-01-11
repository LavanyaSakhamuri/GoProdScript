/*
 *Description: Control Functions library 
'Author :Sunanda Tirunagari and Ankit Kumar
 */

package utility;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.SessionId;

/*import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;*/

public class Constant {
	
	//*********omt parameters need to change before execution of each scenario**********//
	/*
	 * public static String ScenarioName = "OMT_Acqui_FTA_CompletedProd"; //public
	 * static String OMT_FlowID = "ReservationRenewal_PhysicalStock"; public static
	 * String FlowType = "FTA"; public static String AssignOrderTL = "FTA_Acqui_TL";
	 * public static String OMT_RegAddressType="House"; public static String
	 * OMT_DispoFirstTime="Manual Case Creation";//after placing an order the status
	 * of order in omt dashboard public static String Email_GO =
	 * "mamatha.a@globe.com.ph"; public static String OrderSubType="";
	 */
	
	public static String ScenarioName = "OMT_Renewal_CompletedProd";
	//public static String OMT_FlowID = "ReservationRenewal_PhysicalStock";
	public static String FlowType = "Renewal";
	public static String AssignOrderTL = "Renewal_TL";
	public static String OMT_RegAddressType="House";
	public static String OMT_DispoFirstTime="For Resevation";//after placing an order the status of order in omt dashboard
	public static String Email_GO = "mamatha.a@globe.com.ph";
	public static String OrderSubType="";

		
		//*********************************************************//
		
		// ***************OMT******************//
		public static String RowValue = "2";
		public static String RowValue_FlowDetails = "2";

		public static int Login_NetworkIDColm = 3;
		public static int Login_PasswordColm = 4;

		public static int FlowIdColumnValue = 30;
		public static int OrderRefID = 4;
		// public static String ORDERID="4";
		public static int PaymentMenthod = 14;
		public static int ScenarioColumn = 1;
		public static int TimeStamp = 2;
		public static int CustomerDetails = 29;
		public static int OrderState = 5;

		
		
		public static int AgentName = 5;


		public static String BSSorderID = "764532";
		public static String BSSorderCaseID = "43725";
		public static String MobilenUmb = "09270000112";
		public static String CustFAID = "452738";
		public static String CustBAID = "829384";
		public static String CustContactID = "09270000133";
		public static String DeliveryCaseID="12345";

		
		public static String ForVerification="For Verification";
		public static String ForOrderCreation = "For Order Creation";

		public static String OrderCreated = "Order Created";

		public static String OngoingVerification = "ONGOING VERIFICATION";

		public static String Renewal_Completed="Renewal Completed";
		
		public static String PreOrderWithStock="Pre-Order With Stock";
		
		public static String Approved = "Approved";

		public static String RequestPayment = "Request Payment";

		public static String ReservedPhysicalStock = "Reserved Physical Stock";

		public static String AwaitingPayment = "Awaiting Payment";

		public static String DateLinkSeeding = "07/25/2022";

		public static String ReservationID = "9845673216";
		public static String ReservationID1 = "98456732160";

		public static String PayementRef_happypath = "free";

		public static String PayementRef_NONhappypath = "Pending";

		public static String StatusPay_happypath = "Paid";
		
		public static String ForPickup = "For Pickup";
		
		public static String ForActivated = "ForActivated";
		
		public static String ReservedVirtuallStock = "Reserved Virtual Stock";

		public static String ForProcessing = "For Processing";

		public static String Processed = "Processed";
		
		public static String PreorderWithStock ="Pre-order With Stock";
		
		public static String PreorderWithoutStock ="Pre-order Without Stock";
  
		public static String ForDispatch ="For Dispatch";
		
		public static String Cancelled = "Cancelled";

		public static String ForDelivery = "For Delivery";

		public static String Delivered = "Delivered";

		public static String Activated = "Activated";

		public static String Completed = "Completed";

		public static String ForActivation="For Activation";
		
		public static String ForCompliancePOFC = "For Compliance - POFC";
		public static String ForCompliancePOID_POFC = "For Compliance - POID/POFC";
		public static String ForCompliancePOID = "For Compliance - POID";
		public static String ForRedelivery2 = "For Redelivery2";
		public static String ForRedelivery1 = "For Redelivery1";

		public static String ForRedelivery3 = "For Redelivery3";

		public static String PostDet_Transactiondate = "05262022";

		public static String PostDet_PayId = "3472892";

		public static String PostDet_PostingRemarks = "4327156";

		public static String PostDet_InvoiceID = "56831854842";
		


		public static String CheckigMNPStatus = "CheckigMNPStatus";
		
		public static String PortingUnderView = "PortingUnderView";
		
		public static String PortingReqStatusSuccess = "PortingReqStatusSuccess";
		
		public static String PortingReqStatusPeding = "PortingReqStatusPeding";
		
		public static String PortingReqStatusFailed = "PortingReqStatusFailed";
		
		
		
//		public static String OngoingVerification = "ONGOING VERIFICATION";
		
	
	// public static final String TestDataFilePath = "NF_WebTool.xlsx";
	public static final String TestDataFilePath = "OMT.xlsx";
	public static final String Environment = "SIT";
	public static final String Browser = "Chrome";
//	public static final String PropertiesFilePath = TestDataFilePath;
	public static int SeqID = 1;
	public static int StepIndex = 0;
	public static int TestStepIndex = 0;
	public static int StepStatus = 0;
	public static int TestCaseIndex = 0;
	public static int TestCaseNumber = 0;
	public static int PassedCases = 0;
	public static int FailedCases = 0;
	public static int RowNo = 0;
	public static int lastTestCaseNumber = -1;
	public static boolean atleastOneFailure = false;
	public static boolean testFailed = false;
	public static HashMap<String, HashMap<String, String>> TestData_All = new HashMap<String, HashMap<String, String>>();
	public static HashMap<String, String> TestData1 = new HashMap<String, String>();
	public static HashMap<String, HashMap<String, String>> Map = new HashMap<String, HashMap<String, String>>();
	public static HashMap<String, HashMap<String, String>> Map2 = new HashMap<String, HashMap<String, String>>();

	public static LinkedHashMap<String,String> LinkedMap = new LinkedHashMap<>();
	
	//public static final int defaultBrowserTimeOut = 15;
	public static String Qrcodetext = null;
	//public static String UserStoryName = null;
	//public static String ResultFilePath = null;
	public static String ScreenshotFolderName = "Screenshot";
	public static String PageName = "screenshotpage";
	public static String locator = "screenshotlocator";
	public static String RecentScreenshot = null;
	public static WebDriver driver = null;
//	public static AppiumDriver driver = null;
//	public static AndroidDriver<MobileElement> driver = null;
	public static List<WebElement> webelements;
	public static boolean DefaultoptionalFlag = true;
	public static boolean NF_AddOperationFlag = true;

	public static final String path_to_python_scripts = "D:\\PDF_SolutionComp\\PDF_SolutionComp\\";
	public static final String Device_Type = "PC";

	//public static URL url = null;
	public static SessionId sid = null;

	public static String SheetName = null;
	public static String StepParameters_Flag = "n";
	public static String Messagetypes = "";
	public static final String DriverPath = "D:\\TechM\\WedDriver\\";
	public static String Reward = "";
	public static int iCol;
	
	public static String GCashNum1 = "9270002678";
	public static String promo = "UAT_Testing_10OFF";

	
	
	public static String ADA5_Testdata = "09270009589";
	public static String ADA8_Testdata = "09270009582"; 
	
	public static String ReferenceNo;
	
	public static String PreorderWaitlistADA_TestData = "09270009626";
	public static String PreorderWaitlistRenewal_TestData = "09270009596";
	public static String device = "Apple iPhone 13 Pro Max";
	
	public static String ReservationADA_TestData = "09171194728";
	public static String ReservationFTA_TestData = "09270009569";
	public static String deviceUsed = "Xiaomi Redmi 9C";
	
	public static String ReservationRenewal_TestData = "09270009588";
	public static String ResRenewaldevice = "Samsung Galaxy M23";
	public static String deviceStartWord = "Samsung";

	
	/**********************************************************************************************************************************************/
	



	
	
	
	
	
	//***************OMT******************//
	
	
	
	
	public static String senderList="8080,2652,2882,9451926523,2916,2884,AutoLoadMAX,GLOBE,3373";//comma seperated values
	
	
	public static float smsPercentageMatch=0.70f;
	
	public static int smsWaitingTime=30; //in seconds
	
	public static int sleepTimeBeforeCheckingMessages=120000;//milliseconds
	public static String WorkSpace = System.getProperty("user.dir");
	public static String ProjectName = "GlobeOne";
	public static String gCash_number = "09496755579"; 
	public static String insufficient_gCash_number = "09058121416"; 
	public static String url = "https://onlinepreprod.globe.com.ph/"; 
	
	//public static  LinkedHashMap<String,String> dataMap = new LinkedHashMap<>();
	
	public static ThreadLocal<LinkedHashMap<String, String>> dataMap =new ThreadLocal<LinkedHashMap<String, String>>();
	public static ThreadLocal<LinkedHashMap<String, Integer>> dataMap1 =new ThreadLocal<LinkedHashMap<String, Integer>>();

	public static HashMap<String, HashMap<String, String>> Map3 = new HashMap<String,HashMap<String,String>>();
	public static HashMap<String, HashMap<String, String>> Map4 = new HashMap<String,HashMap<String,String>>();
	//private static LinkedHashMap<String, Integer> Map1 = new LinkedHashMap<>();


	/*
	 * ***********************************************************
	 * System Parameters - shall NOT be modified by END users
	 * ***********************************************************
	*/

	public static String ipToListen=null;
	

	public static final String Brand[] = null;

	public static boolean MultipleTCInOneMethod = false;

	public static int MaxDriverTimeOut =30;
	public static String UserStoryName = null;
	public static String ResultFilePath = null;
	public static String strScenarioDesc=null;
	public static String strExpectedResult=null;
	public static String strActualResult=null;
	public static WebDriver driver_w = null;
    public static WebElement webelement;	
	
	public static int flag_init=0;
	public static String lastSMSTime="";
	public static long youtubeElapsedTime=0;
	public static long updatedStartTime=0;
	public static boolean timerRunning=false;
	
	//this is only for critical func, like checking balance, turning on/off internet, making voice call
	public static int retryOnFailureCount=3;
	
	public static int numberOfFreeMessages=0;
	
	public static WebElement youtubeScreen=null;
	public static int youtubeX=-1;
	public static int youtubeY=-1;
	public static String lastReadSMSFileName="";
	
	
	public static int comparisonType=2;//ignore tagged texts
	public static String dynamicLine="";
	public static float numberOfFreetexts=0;
	
	public static double lastSmsOrUssdTime=0;
	public static boolean flagMultipleMessages=false;
	
	
	public static float lastSmsPercentMatch=0.0f;
	public static boolean flagOnlySpecificSenders=true;
	
	
	public static String textViewerPackageName="com.example.hp_pc.simpletextviewer";
	public static String textViewerActivityName="com.example.hp_pc.simpletextviewer.MainActivity";
	public static String[] specificSenderList=senderList.split(",");
	public static int numberOfExpectedSms=1;
	public static int numberOfExpectedReply=1;
	public static int maxNumberOfColumns=50;
	public static int globalRowNumber=0;
	public static int lastRepliedRowNumber=0;
	public static String brandType="Regular";
	public static boolean alreadyWaited=false;
	public static String commandPullSS = "adb shell input keyevent 4";
	public static String commandPullSSS = "adb shell input touchscreen swipe 830 1120 530 1120";

	public static boolean flag = true;

	public static boolean Broadband = false;

	public static boolean SGTier1 = false;

	public static int scrolLimit=0;

	public static String midX;

	public static String Failures;

	public static boolean paperlessBillinhDisabled = false;

	public static boolean GoGreen = false;

	public static int defaultBrowserTimeOut = 30;
	 
	public static int defaultBrowserTimeOut1 = 5;
	
	public static int NumberOfTriesToDownloadApp = 3;
	
	public static boolean BillGenerated = true;
	
	public static int MinDriverTimeOut = 2;

	public static boolean AppLaunched = false;
	public static HashMap<String, HashMap<String, String>> labelMap = new HashMap<String, HashMap<String, String>>();
	public static String UnitNo ;
	public static String FirstName;
	public static String StreetName;
	public static String Province;
	public static String City;
	public static String Barangay;
	public static String ZipCode;
	public static String Platform;

	//public static Object driver;
	
	
}
