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
import java.util.concurrent.TimeUnit;


public class SpecsBaseClass extends SuperBaseClass {

    //public WebDriver driver;
    public Eyes eyes;

    @BeforeMethod()
        public void InitializeTests(Method method) {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("headless");

        //Map<String, String> mobileEmulation = new HashMap<>();
        //mobileEmulation.put("deviceName", "iPhone 8");
        //options.setExperimentalOption("mobileEmulation", mobileEmulation);

        //driver = getDriver(method.getNam());
        driver = new ChromeDriver();
        //driver = new FirefoxDriver();
        //driver = new InternetExplorerDriver();
        //driver = new SafariDriver();

        InitHelpers("https://test-web.akc.org/");
        //InitHelpers("https://www.akc.org/?test=true");
        //InitHelpers("https://devshop.akc.org/");
        //InitHelpers("https://shop.akc.org/?test=true");
        InitPages();

        driver.get(driverHelper.baseUrl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        this.eyes = new Eyes();
        this.eyes.setApiKey("z9croAylAJ31BCxQ9g0BdZE0ul770cXrtqRuwWv8A8g110");    //.ORG API KEY
        //this.eyes.setApiKey("BPfSxtkBRJAMWYb8LGUn7G0DzwYdm8JiJPyed104Df5cs110");   //SHOP API KEY
        this.eyes.setLogHandler(new StdoutLogHandler());
        this.eyes.setForceFullPageScreenshot(true);
        this.eyes.setStitchMode(StitchMode.CSS);
        this.eyes.setMatchLevel(MatchLevel.LAYOUT);
        this.eyes.setSendDom(false); //RCA related

    }

    @AfterMethod()
        public void CleanUpDriver() {
            eyes.abortIfNotClosed();
            //driver.close();
            driver.quit();

        }

    }






