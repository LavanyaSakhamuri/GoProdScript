package globeOnline_CommonMethods;

import java.io.FileReader;
import java.net.URL;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;

//import com.browserstack.local.Local;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import utility.Control;

//import utility.Constant;

public class SetDriver {
    public WebDriver driver;
   // private Local l;

    @BeforeMethod(alwaysRun = true)
    @org.testng.annotations.Parameters(value = { "config", "environment" })
    @SuppressWarnings("unchecked")
    public void setUp(String config_file, String environment) throws Exception {
        JSONParser parser = new JSONParser();
        JSONObject config = (JSONObject) parser.parse(new FileReader("src/test/resources/conf/" + config_file));
        JSONObject envs = (JSONObject) config.get("environments");

        DesiredCapabilities capabilities = new DesiredCapabilities();

        Map<String, String> envCapabilities = (Map<String, String>) envs.get(environment);
        Iterator it = envCapabilities.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry) it.next();
            capabilities.setCapability(pair.getKey().toString(), pair.getValue().toString());
        }

        Map<String, String> commonCapabilities = (Map<String, String>) config.get("capabilities");
        it = commonCapabilities.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry) it.next();
            if (capabilities.getCapability(pair.getKey().toString()) == null) {
                capabilities.setCapability(pair.getKey().toString(), pair.getValue().toString());
            }
        }

        String username = System.getenv("BROWSERSTACK_USERNAME");
        if (username == null) {
            username = (String) config.get("user");
        }

        String accessKey = System.getenv("BROWSERSTACK_ACCESS_KEY");
        if (accessKey == null) {
            accessKey = (String) config.get("key");
        }
        
        if (capabilities.getCapability("local") != null && capabilities.getCapability("local") == "true") {
        	//Map<String, String> options = new HashMap<String, String>();

//        	System.setProperty("webdriver.chrome.driver", System.getenv("C:\\GonlineScript\\GlobeOnline_Lambda")+"chromedrivermy.exe");
//        	System.setProperty("webdriver.chrome.driver", System.getProperty("C:\\GonlineScript\\GlobeOnline_Lambda")+"\\chromedrivermy.exe");

        	//System.setProperty("webdriver.chrome.driver", System.getenv("DriverPath")+"chromedriver.exe");
        	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\chromedriver.exe");
        	ChromeOptions options = new ChromeOptions();
			DesiredCapabilities desiredCapabilities = DesiredCapabilities.chrome();
			//options.addArguments("user-data-dir=< path of the folder >"); 
			options.addArguments("user-data-dir=C:\\ChromeData");
			desiredCapabilities.setCapability(ChromeOptions.CAPABILITY, options);
			//Constant.driver= new ChromeDriver(options);
    		driver = new ChromeDriver(options);    		
        }else { 
        	capabilities.setCapability("geoLocation","US");

        	driver = new RemoteWebDriver(
                    new URL("http://" + username + ":" + accessKey + "@" + config.get("server") + "/wd/hub"), capabilities);
           
        }
        DriverManager.setWebDriver(driver);

		DriverManager.getDriver().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		DriverManager.getDriver().manage().window().maximize();
		DriverManager.getDriver().manage().deleteAllCookies();

    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() throws Exception {
        driver.quit();
        Control.GeneratePDFReport();

      /*  if (l != null) {
            l.stop();
        }*/
    }
}
