package Specs;

import com.applitools.eyes.RectangleSize;
import com.applitools.eyes.selenium.fluent.Target;
import org.testng.annotations.Test;

public class RetrievistVisualTests extends SpecsBaseClass {

    @Test
    public void RetrievistHomePage () {

        driver.navigate().to("https://test-commerce-content.pantheonsite.io/");
        eyes.open(driver, "Retrievist", "RetrievistHomePage", new RectangleSize(1420, 680));
        eyes.check("HomePage", Target.window());
        eyes.close();

    }

    @Test
    public void RetrievistReviews () {

        driver.navigate().to("https://test-commerce-content.pantheonsite.io/reviews/best-flea-tick-collars-dogs/");
        eyes.open(driver, "Retrievist", "Reviews", new RectangleSize(1420, 680));
        eyes.check("Review", Target.window());
        eyes.close();

    }

    @Test
    public void RetrievistFeatured () {

        driver.navigate().to("https://test-commerce-content.pantheonsite.io/featured/bedding/");
        eyes.open(driver, "Retrievist", "Featured", new RectangleSize(1420, 680));
        eyes.check("Feature", Target.window());
        eyes.close();

    }

    @Test
    public void RetrievistDeals () {

        driver.navigate().to("https://test-commerce-content.pantheonsite.io/products/");
        eyes.open(driver, "Retrievist", "Deals", new RectangleSize(1420, 680));
        eyes.check("Deals", Target.window());
        eyes.close();

    }

    @Test
    public void RetrievistEssentials () {

        driver.navigate().to("https://test-commerce-content.pantheonsite.io/essentials/bringing-home-a-new-puppy-essentials/");
        eyes.open(driver, "Retrievist", "Essentials", new RectangleSize(1420, 680));
        eyes.check("essentials", Target.window());
        eyes.close();

    }

    @Test
    public void RetrievistGiftGuides () {

        driver.navigate().to("https://test-commerce-content.pantheonsite.io/gift-guides/the-best-gifts-for-a-new-puppy/");
        eyes.open(driver, "Retrievist", "GiftGuides", new RectangleSize(1420, 680));
        eyes.check("giftguides", Target.window());
        eyes.close();

    }
    //

}
