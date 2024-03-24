package Pages;

import Helpers.DriverHelper;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BreedSelectorTool {

    @FindBy(xpath = "//a[contains(text(),\"Let's Go\")]")
    WebElement LetsGoButton;

    @FindBy(css = "body > div:nth-child(6) > div > form > div.breed-selector-tool__question__scrollable > div.breed-selector-tool__question__choices > div:nth-child(2) > label > span.checkbox__visual-input")
    WebElement EasyTrainable;

    @FindBy(css = "body > div:nth-child(7) > div > form > div.breed-selector-tool__question__scrollable > div.breed-selector-tool__question__choices > div:nth-child(1) > label > span.checkbox__visual-input")
    WebElement HighlyTrainable;

    @FindBy(css = "body > div:nth-child(6) > div > form > div.breed-selector-tool__question__scrollable > div.breed-selector-tool__question__choices > div:nth-child(3) > label")
    WebElement Trainable;

    @FindBy(css = "body > div:nth-child(6) > div > form > div.breed-selector-tool__question__scrollable > div.breed-selector-tool__question__choices > div:nth-child(1) > label")
    WebElement VeryHighEnergy;

    @FindBy(css = "body > div:nth-child(6) > div > form > div.breed-selector-tool__question__scrollable > div.breed-selector-tool__question__choices > div:nth-child(3) > label")
    WebElement Moderate;

    @FindBy(css = "body > div:nth-child(6) > div > form > div.breed-selector-tool__question__scrollable > div.breed-selector-tool__question__choices > div:nth-child(5) > label")
    WebElement NoPreference;

    @FindBy(css = "body > div:nth-child(6) > div > form > div.breed-selector-tool__question__scrollable > div.breed-selector-tool__question__choices > div:nth-child(5) > label > span.form-label")
    WebElement EveryDay;

    @FindBy(css = "body > div:nth-child(6) > div > form > div.breed-selector-tool__question__scrollable > div.breed-selector-tool__question__choices > div:nth-child(1) > label")
    WebElement VeryVocal;

    @FindBy(css = "body > div:nth-child(6) > div > form > div.breed-selector-tool__question__scrollable > div.breed-selector-tool__question__choices > div:nth-child(3) > label")
    WebElement SomeBarking;

    @FindBy(css = "body > div:nth-child(6) > div > form > div.breed-selector-tool__question__scrollable > div.breed-selector-tool__question__choices > div:nth-child(2) > label")
    WebElement Large;

    @FindBy(css = "body > div:nth-child(6) > div > form > div.breed-selector-tool__question__scrollable > div.breed-selector-tool__question__choices > div:nth-child(3) > label")
    WebElement Medium;

    @FindBy(css = "body > div:nth-child(6) > div > form > div.breed-selector-tool__question__scrollable > div.breed-selector-tool__question__subquestions > div:nth-child(1) > div > div:nth-child(1) > label")
    WebElement OwnDogYes;

    @FindBy(css = "body > div:nth-child(6) > div > form > div.breed-selector-tool__question__scrollable > div.breed-selector-tool__question__subquestions > div:nth-child(2) > div > div:nth-child(2) > label")
    WebElement ChildrenHomeNo;

    @FindBy(css = "body > div:nth-child(6) > div > form > div.breed-selector-tool__question__scrollable > div.breed-selector-tool__question__subquestions > div:nth-child(3) > div > div:nth-child(1) > label")
    WebElement AnimalsHomeYes;

    @FindBy(css = "body > div:nth-child(6) > div > form > div.breed-selector-tool__question__scrollable > div.breed-selector-tool__question__subquestions > div:nth-child(3) > div > div.breed-selector-tool__question__subquestion.breed-selector-tool__question__subquestion--optional > div > div:nth-child(2) > label")
    WebElement Cat;

    @FindBy(css = "body > div:nth-child(6) > div > form > div.breed-selector-tool__question__scrollable > div.breed-selector-tool__question__subquestions > div:nth-child(4) > div > div:nth-child(2) > label")
    WebElement SmallYardHouse;

    @FindBy(css = "body > div:nth-child(6) > div > form > div.breed-selector-tool__question__scrollable > div.breed-selector-tool__question__subquestions > div:nth-child(5) > div > div:nth-child(1) > label")
    WebElement Time1to5h;

    @FindBy(css = "body > div:nth-child(6) > div > form > div.breed-selector-tool__question__scrollable > div.breed-selector-tool__question__subquestions > div:nth-child(6) > div > div:nth-child(1) > label")
    WebElement ActivityLevelAdventure;

    @FindBy(css = "body > div:nth-child(6) > div > form > div.breed-selector-tool__question__scrollable > div.breed-selector-tool__question__subquestions > div:nth-child(6) > div > div:nth-child(1) > label")
    WebElement AdventureLover;

    @FindBy(css = "body > div:nth-child(6) > div > form > div.breed-selector-tool__question__scrollable > div.breed-selector-tool__question__subquestions > div:nth-child(7) > div > div:nth-child(2) > label")
    WebElement AllergenDogNo;

    @FindBy(css = "body > div:nth-child(6) > div > form > nav > a.button")
    WebElement ContinueButton;

    @FindBy(css = "body > div:nth-child(6) > div > form > nav > a.button")
    WebElement SeeResults;

    @FindBy(css = "body > div:nth-child(6) > div > div > div.breed-selector-tool__results__content > div > div.breed-selector-tool__results__content-wrap__title-line > h1")
    WebElement Top5Match;

    @FindBy(css = "body > div:nth-child(6) > div > div > div.breed-selector-tool__results__content > div > div.breed-selector-tool__results__content-wrap__title-line > a")
    WebElement ChangeMyAnswers;

    @FindBy(css = "body > div:nth-child(6) > div > div > div.breed-selector-tool__results__content > div > div.breed-selector-tool__results__content-wrap__breed-main-info > div.breed-selector-tool__results__content-wrap__breed-main-info__name > a > h2")
    WebElement BreedNameResult;

    @FindBy(css = "body > div:nth-child(6) > div > div > div.breed-selector-tool__results__content > div > div.breed-selector-tool__results__content-wrap__breed-main-info > div.breed-selector-tool__results__content-wrap__breed-main-info__button > a")
    WebElement FindPuppies;

    @FindBy(css = "#a268951c-b028-44ad-99ed-5af71765e083")
    WebElement BottomBanner;

    @FindBy(css = "body > div.fancybox-overlay.fancybox-overlay-fixed")
    WebElement PupUpBanner;

    WebDriver driver;

    // Constructor
    public BreedSelectorTool(WebDriver _driver) {
        driver = _driver;
        PageFactory.initElements(driver, this);

    }

    public void VerifyBreedSelectorTool() {

        driver.navigate().to("https://test-web.akc.org/breed-selector-tool/");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(LetsGoButton));
        HiddeBanner();
        LetsGoButton.click();
        HideBanner1();
        EasyTrainable.click();
        Trainable.click();
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("scroll(0, 500);");
        ContinueButton.click();
        HideBanner1();
        VeryHighEnergy.click();
        Moderate.click();
        ContinueButton.click();
        jse.executeScript("scroll(0, 500);");
        NoPreference.click();
        ContinueButton.click();
        EveryDay.click();
        ContinueButton.click();
        VeryVocal.click();
        SomeBarking.click();
        ContinueButton.click();
        Large.click();
        Medium.click();
        ContinueButton.click();
        OwnDogYes.click();
        wait.until(ExpectedConditions.elementToBeClickable(ChildrenHomeNo)).click();
        wait.until(ExpectedConditions.elementToBeClickable(AnimalsHomeYes)).click();
        wait.until(ExpectedConditions.elementToBeClickable(Cat)).click();
        wait.until(ExpectedConditions.elementToBeClickable(SmallYardHouse)).click();
        wait.until(ExpectedConditions.elementToBeClickable(Time1to5h)).click();
        wait.until(ExpectedConditions.elementToBeClickable(ActivityLevelAdventure)).click();
        wait.until(ExpectedConditions.elementToBeClickable(AllergenDogNo)).click();
        wait.until(ExpectedConditions.elementToBeClickable(SeeResults)).click();
        wait.until(ExpectedConditions.visibilityOf(Top5Match));
        wait.until(ExpectedConditions.elementToBeClickable(ChangeMyAnswers));
        wait.until(ExpectedConditions.elementToBeClickable(BreedNameResult));
        wait.until(ExpectedConditions.elementToBeClickable(FindPuppies));

    }

    public void VerifyBreedSelectorTool2 () {

        driver.navigate().to("https://test-web.akc.org/breed-selector-tool/");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(LetsGoButton));
        HiddeBanner();
        LetsGoButton.click();
        HighlyTrainable.click();
        //New path...
    }

    public void HiddeBanner() {

        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("arguments[0].style.visibility='hidden'", BottomBanner);

    }

    public void HideBanner1() {

        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].style.visibility='hidden'", PupUpBanner);

    }


}


