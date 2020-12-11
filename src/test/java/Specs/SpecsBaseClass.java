package Specs;

import com.applitools.eyes.MatchLevel;
import com.applitools.eyes.StdoutLogHandler;
import com.applitools.eyes.selenium.Eyes;
import com.applitools.eyes.selenium.StitchMode;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

import static java.lang.Thread.sleep;

public class SpecsBaseClass extends SuperBaseClass {

    //public WebDriver driver;
    public Eyes eyes;
    //private Local l;

    @BeforeMethod()
    //@org.testng.annotations.Parameters(value = {"config", "environment"})
    //public void setUp(String config_file, String environment) throws Exception {
    public void InitializeTests(Method method) throws InterruptedException {
/*
        JSONParser parser = new JSONParser();
        JSONObject config = (JSONObject) parser.parse(new FileReader("src/test/java/Resources/conf/" + config_file));
        JSONObject envs = (JSONObject) config.get("environments");

        DesiredCapabilities capabilities = new DesiredCapabilities();

        Map<String, String> envCapabilities = (Map<String, String>) envs.get(environment);
        Iterat  or it = envCapabilities.entrySet().iterator();
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

        String username = System.getenv("sebastianviquez1");
        if (username == null) {
            username = (String) config.get("user");
        }

        String accessKey = System.getenv("szDfCvzz6f8QZE54aXkN");
        if (accessKey == null) {
            accessKey = (String) config.get("key");
        }

        if (capabilities.getCapability("browserstack.local") != null
                && capabilities.getCapability("browserstack.local") == "true") {
            l = new Local();
            Map<String, String> options = new HashMap<String, String>();
            options.put("key", accessKey);
            l.start(options);
        }

        driver = new RemoteWebDriver(new URL("https://sebastianviquez1:szDfCvzz6f8QZE54aXkN@hub-cloud.browserstack.com/wd/hub"), capabilities);
*/
        //driver = getDriver(method.getNam());
        driver = new ChromeDriver();
        //driver = new FirefoxDriver();
        //driver = new InternetExplorerDriver();
        //driver = new SafariDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //InitHelpers("https://test-web.akc.org/");
        //InitHelpers("https://www.akc.org/?test=true");
        //InitHelpers("https://devshop.akc.org/");
        InitHelpers("https://shop.akc.org/?test=true");
        InitPages();

        driver.get(driverHelper.baseUrl);
        driver.manage().window().maximize();
        sleep(2000);

        this.eyes = new Eyes();
        //this.eyes.setApiKey("z9croAylAJ31BCxQ9g0BdZE0ul770cXrtqRuwWv8A8g110");    //.ORG API KEY
        this.eyes.setApiKey("BPfSxtkBRJAMWYb8LGUn7G0DzwYdm8JiJPyed104Df5cs110");   //SHOP API KEY
        this.eyes.setLogHandler(new StdoutLogHandler());
        this.eyes.setForceFullPageScreenshot(true);
        this.eyes.setStitchMode(StitchMode.CSS);
        this.eyes.setMatchLevel(MatchLevel.LAYOUT);
        this.eyes.setSendDom(false); //RCA related

    }

    //@AfterMethod(alwaysRun = true)
    //public void tearDown() throws Exception {
        //driver.quit();
        //if (l != null) {
            //l.stop();

            @AfterMethod

            public void CleanUpDriver() {
            eyes.abortIfNotClosed();
            driver.close();
            driver.quit();

        }

    }


