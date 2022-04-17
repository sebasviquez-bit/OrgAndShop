package Specs;

import com.applitools.eyes.selenium.BrowserType;
import com.applitools.eyes.selenium.Configuration;
import com.applitools.eyes.visualgrid.model.DeviceName;
import com.applitools.eyes.visualgrid.model.ScreenOrientation;

public class VisualGridConfig {

    public static Configuration getGrid() {
        Configuration vgConfig = new Configuration();

        //Browsers
                vgConfig.addBrowser(1420, 680, BrowserType.CHROME);
                vgConfig.addBrowser(1024, 786, BrowserType.FIREFOX);
                vgConfig.addBrowser(1420, 680, BrowserType.SAFARI);
                vgConfig.addBrowser(1420, 680, BrowserType.EDGE);

       //Devices
                vgConfig.addDeviceEmulation(DeviceName.iPhone6_7_8_Plus, ScreenOrientation.PORTRAIT);
                vgConfig.addDeviceEmulation(DeviceName.Galaxy_S5, ScreenOrientation.PORTRAIT);
                vgConfig.addDeviceEmulation(DeviceName.iPad_Pro, ScreenOrientation.PORTRAIT);

                return vgConfig;

    }
}
