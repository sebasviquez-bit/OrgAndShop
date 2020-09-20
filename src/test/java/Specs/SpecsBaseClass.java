package Specs;

import com.applitools.eyes.MatchLevel;
import com.applitools.eyes.StdoutLogHandler;
import com.applitools.eyes.selenium.Eyes;
import com.applitools.eyes.selenium.StitchMode;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import static java.lang.Thread.sleep;

public class SpecsBaseClass extends SuperBaseClass {

        //public EyesRunner runner;
        public Eyes eyes;


    @BeforeMethod
    //@org.testng.annotations.Parameters(value= {"browser", "platform", "version"})
    public void InitializeTests(Method method) throws MalformedURLException, InterruptedException {
    //public void setUp(String browser, String version, String platform) throws Exception {
/*
            DesiredCapabilities caps = new DesiredCapabilities();
            //caps.setCapability("browserstack.local", "true");
            caps.setCapability("acceptSslCerts", "true");

        caps.setCapability("os", "OS X");
        caps.setCapability("os_version", "Catalina");
        caps.setCapability("browser", "Safari");
        caps.setCapability("browser_version", "13.0");
        caps.setCapability("browserstack.local", "false");
        caps.setCapability("browserstack.selenium_version", "3.14.0");

        driver = new RemoteWebDriver(new URL("https://sebastianviquez1:szDfCvzz6f8QZE54aXkN@hub-cloud.browserstack.com/wd/hub"), caps);

                //driver = (RemoteWebDriver) new Augmenter().augment(driver);
                //File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
                //FileUtils.copyFile(srcFile, new File("/Users/user/Downloads/screenshot.jpg"));

        //driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), caps); DOCKER
*/
                //driver = getDriver(method.getNam());
                driver = new ChromeDriver();
                //driver = new FirefoxDriver();
                //driver = new InternetExplorerDriver();
                //driver = new SafariDriver();
                driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

                InitHelpers("https://test-web.akc.org/");
                //InitHelpers("https://www.akc.org/?test=true");
                //InitHelpers("https://devshop.akc.org/");
                InitHelpers("https://shop.akc.org/");
                InitPages();

                driver.get(driverHelper.baseUrl);
                driver.manage().window().maximize();
                sleep(1000);

                this.eyes = new Eyes();
                //this.eyes.setApiKey("z9croAylAJ31BCxQ9g0BdZE0ul770cXrtqRuwWv8A8g110");    //.ORG API KEY
                this.eyes.setApiKey("BPfSxtkBRJAMWYb8LGUn7G0DzwYdm8JiJPyed104Df5cs110");   //SHOP API KEY
                this.eyes.setLogHandler(new StdoutLogHandler());
                this.eyes.setForceFullPageScreenshot(true);
                this.eyes.setStitchMode(StitchMode.CSS);
                this.eyes.setMatchLevel(MatchLevel.LAYOUT);
                this.eyes.setSendDom(false); //RCA related

            }

            @AfterMethod
            public void CleanUpDriver () {

                //this.driver.get(this.driver.getCurrentUrl()+"?test=true");
                eyes.abortIfNotClosed();
                driver.close();
                driver.quit();

            }

 }
