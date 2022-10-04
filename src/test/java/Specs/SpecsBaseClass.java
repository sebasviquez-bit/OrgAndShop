package Specs;

import com.applitools.eyes.MatchLevel;
import com.applitools.eyes.StdoutLogHandler;
import com.applitools.eyes.selenium.Eyes;
import com.applitools.eyes.selenium.StitchMode;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.lang.reflect.Method;
import java.time.Duration;


public class SpecsBaseClass extends SuperBaseClass {

    //public WebDriver driver;

    @BeforeMethod()
        public void InitializeTests(Method method) {

        ChromeOptions options = new ChromeOptions();
        //options.addArguments("headless");
        //options.addArguments("--incognito"); //This is being use as a fix for "unknown error: cannot determine loading status" on v103. FYI
        //options.addArguments("disable-dev-shm-usage");

        //Map<String, String> mobileEmulation = new HashMap<>();
        //mobileEmulation.put("deviceName", "iPhone 8");
        //options.setExperimentalOption("mobileEmulation", mobileEmulation);

        //driver = getDriver(method.getNam());
        driver = new ChromeDriver(options);
        //driver = new FirefoxDriver();
        //driver = new InternetExplorerDriver();
        //driver = new SafariDriver();


        InitHelpers("https://test-web.akc.org/");
        //InitHelpers("https://dev-web.akc.org/");

        InitPages();

        driver.get(driverHelper.baseUrl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        this.eyes = new Eyes();
        this.eyes.setApiKey("z9croAylAJ31BCxQ9g0BdZE0ul770cXrtqRuwWv8A8g110");    //.ORG API KEY
        //this.eyes.setApiKey("BPfSxtkBRJAMWYb8LGUn7G0DzwYdm8JiJPyed104Df5cs110");   //SHOP API KEY
        //this.eyes.setConfiguration(VisualGridConfig.getGrid());
        this.eyes.setLogHandler(new StdoutLogHandler());
        this.eyes.setForceFullPageScreenshot(true);
        this.eyes.setStitchMode(StitchMode.CSS);
        this.eyes.setMatchLevel(MatchLevel.CONTENT);
        this.eyes.setSendDom(true); //RCA related

    }


    @AfterMethod()
        public void CleanUpDriver() {

            eyes.abortIfNotClosed();
            //driver.close();
            driver.quit();

        }

}






