package Specs;

import com.applitools.eyes.RectangleSize;
import com.applitools.eyes.selenium.fluent.Target;
import org.testng.annotations.Test;

public class MPStageVisualTests extends SpecsBaseClass {

    @Test
    public void MPHomePage () {

        driver.navigate().to("https://stage.marketplace.akc.org/");
        eyes.open(driver, "MP", "MPHomePage");
        eyes.check("MPHomePage", Target.window());
        eyes.close();

    }

    @Test
    public void MPFindPuppyPage () {

        driver.navigate().to("https://stage.marketplace.akc.org/search-puppies");
        eyes.open(driver, "MP", "PuppyPage");
        eyes.check("PuppyPage", Target.window());
        eyes.close();

    }

    @Test
    public void MPPoodleBreedPage () {

        driver.navigate().to("https://stage.marketplace.akc.org/puppies/poodle?");
        eyes.open(driver, "MP", "PoodleBreedPage");
        eyes.check("PoodleBreedPage", Target.window());
        eyes.close();

    }

    @Test
    public void MPResourcesPuppy () {

        driver.navigate().to("https://stage.marketplace.akc.org/about-akc-marketplace");
        eyes.open(driver, "MP", "ResourcesPuppy");
        eyes.check("ResourcesPuppy", Target.window());
        eyes.close();

    }

    @Test
    public void MPAdvertise () {

        driver.navigate().to("https://stage.marketplace.akc.org/advertise/breeders");
        eyes.open(driver, "MP", "AdvertiseLitterPage");
        eyes.check("Advertise", Target.window());
        eyes.close();

    }

    @Test
    public void MPFindGroomersPage () {

        driver.navigate().to("https://stage.marketplace.akc.org/search-groomers");
        eyes.open(driver, "MP", "FindGroomersPage");
        eyes.check("FindGroomersPage", Target.window());
        eyes.close();

    }


    @Test
    public void MPGroomersList () {

        driver.navigate().to("https://stage.marketplace.akc.org/groomers?");
        eyes.open(driver, "MP", "GroomersList");
        eyes.check("GroomersList", Target.window());
        eyes.close();

    }

    @Test
    public void MPTrainers () {

        driver.navigate().to("https://stage.marketplace.akc.org/trainers");
        eyes.open(driver, "MP", "trainers");
        eyes.check("trainers", Target.window());
        eyes.close();

    }


}
