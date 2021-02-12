package Specs;

import com.applitools.eyes.selenium.Eyes;
import com.browserstack.local.Local;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.FileReader;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class SpecsBrowserStack extends SuperBaseClass {

    private Local l;
    public Eyes eyes;

    @BeforeMethod(alwaysRun = true)
    @org.testng.annotations.Parameters(value = {"config", "environment"})
    public void setUp(String config_file, String environment) throws Exception {
        JSONParser parser = new JSONParser();
        JSONObject config = (JSONObject) parser.parse(new FileReader("src/test/java/resources/conf/" + config_file));
        JSONObject envs = (JSONObject) config.get("environments");

        DesiredCapabilities caps = new DesiredCapabilities();

        Map<String, String> envCapabilities = (Map<String, String>) envs.get(environment);
        Iterator it = envCapabilities.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry) it.next();
            caps.setCapability(pair.getKey().toString(), pair.getValue().toString());
        }

        Map<String, String> commonCapabilities = (Map<String, String>) config.get("capabilities");
        it = commonCapabilities.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry) it.next();
            if (caps.getCapability(pair.getKey().toString()) == null) {
                caps.setCapability(pair.getKey().toString(), pair.getValue().toString());
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

        String app = System.getenv("ORGTestSuite");
        if (app != null && !app.isEmpty()) {
            caps.setCapability("app", app);
        }

        if (caps.getCapability("browserstack.local") != null && caps.getCapability("browserstack.local") == "true") {
            l = new Local();
            Map<String, String> options = new HashMap<String, String>();
            options.put("key", accessKey);
            l.start(options);
        }

        driver = new RemoteWebDriver(new URL("https://sebastianviquez1:szDfCvzz6f8QZE54aXkN@hub.browserstack.com/wd/hub"), caps);

        InitPages();
        InitHelpers("https://www.akc.org/?test=true");
        driver.get(driverHelper.baseUrl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        }



    @AfterMethod(alwaysRun = true)
    public void tearDown() throws Exception {
        if (driver != null) {
            driver.quit();
            if (l != null) l.stop();
        }
    }

/*
    public static void main() throws Exception {

        WebDriver driver;
        Local l;

        String username = System.getenv("sebastianviquez1");
        String access_key = System.getenv("szDfCvzz6f8QZE54aXkN");

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("browser", "Firefox");
        caps.setCapability("browser_version", "40.0");
        caps.setCapability("os", "Windows");
        caps.setCapability("os_version", "8.1");
        caps.setCapability("browserstack.local", true);

        l = new Local();
        HashMap<String, String> options = new HashMap<String, String>();
        options.put("key", access_key);
        //options.put("only", "localhost,80,0");
        //options.put("forcelocal", "");
        //options.put("proxyHost", "127.0.0.1");
        //options.put("proxyPort", "8118");
        //options.put("xyz", "qwerty");
        l.start(options);

        System.out.println("Starting session");
        driver = new RemoteWebDriver(new URL("https://sebastianviquez1:szDfCvzz6f8QZE54aXkN@hub-cloud.browserstack.com/wd/hub"), caps);
        System.out.println("Started session");

        driver.get("http://localhost");
        System.out.println("Process is running : " + l.isRunning());
        System.out.println("Page title is: " + driver.getTitle());

        driver.quit();
        l.stop();
    }

 */


}





