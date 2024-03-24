package Pages;
import Helpers.DriverHelper;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class CompareBreeds {

    @FindBy(css = "#site-header > div > div.desktop-header > div > div.primary-nav > nav > a:nth-child(1)")
    WebElement breeds;

    @FindBy(css = "#dog-breeds > div:nth-child(2) > div > div > div > ul > li:nth-child(2) > a")
    WebElement breedscompa;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[2]/main/div[3]/div")
    WebElement breedscompmessage;

    @FindBy(css = "body > div.breed-select-wrap > div > div > div.page-layout > main > div.breed-comparison-theme-wrap > div.breed-comparison-select-and-breed-data > div.breed-comparison-wrap.js-breed-comparison-row-top > div:nth-child(1) > div.breed-comparison-select > div.breed-comparison-select__top")
    WebElement select1;

    @FindBy(css = "body > div.breed-select-wrap > div > div > div.page-layout > main > div.breed-comparison-theme-wrap > div.breed-comparison-select-and-breed-data > div.breed-comparison-wrap.js-breed-comparison-row-top > div:nth-child(1) > div.breed-comparison-select > div.breed-comparison-select__bottom > div.breed-comparison-select-breeds > div.breed-comparison-select-breeds__option.breed-comparison-select-breeds__option-23195")
    WebElement affens;

    @FindBy(css = "body > div.breed-select-wrap > div > div > div.page-layout > main > div.breed-comparison-theme-wrap > div.breed-comparison-select-and-breed-data > div.breed-comparison-wrap.js-breed-comparison-row-top > div:nth-child(1) > div.breed-comparison-image-wrap > div.breed-comparison-image > div.breed-comparison-image-content-wrap > img")
    WebElement affenspic;

    @FindBy(css = "body > div.breed-select-wrap > div > div > div.page-layout > main > div.breed-comparison-theme-wrap > div.breed-comparison-select-and-breed-data > div.breed-comparison-wrap.js-breed-comparison-row-top > div:nth-child(2) > div.breed-comparison-select.breed-comparison-select_closed > div.breed-comparison-select__top > img")
    WebElement select2;

    @FindBy(css = "body > div.breed-select-wrap > div > div > div.page-layout > main > div.breed-comparison-theme-wrap > div.breed-comparison-select-and-breed-data > div.breed-comparison-wrap.js-breed-comparison-row-top > div:nth-child(2) > div.breed-comparison-select > div.breed-comparison-select__bottom > div.breed-comparison-select-breeds > div.breed-comparison-select-breeds__option.breed-comparison-select-breeds__option-23239")
    WebElement akita;

    @FindBy(css = "body > div.breed-select-wrap > div > div > div.page-layout > main > div.breed-comparison-theme-wrap > div.breed-comparison-select-and-breed-data > div.breed-comparison-wrap.js-breed-comparison-row-top > div:nth-child(2) > div.breed-comparison-image-wrap > div.breed-comparison-image > div.breed-comparison-image-content-wrap > img")
    WebElement akitapic;

    @FindBy(css = "body > div.breed-select-wrap > div > div > div.page-layout > main > div.breed-comparison-theme-wrap > div.breed-comparison-select-and-breed-data > div.breed-comparison-wrap.js-breed-comparison-row-top > div:nth-child(3) > div.breed-comparison-select.breed-comparison-select_closed > div.breed-comparison-select__top > img")
    WebElement select3;

    @FindBy(css = "body > div.breed-select-wrap > div > div > div.page-layout > main > div.breed-comparison-theme-wrap > div.breed-comparison-select-and-breed-data > div.breed-comparison-wrap.js-breed-comparison-row-top > div:nth-child(3) > div.breed-comparison-select > div.breed-comparison-select__bottom > div.breed-comparison-select-breeds > div.breed-comparison-select-breeds__option.breed-comparison-select-breeds__option-23453")
    WebElement beagle;

    @FindBy(css = "body > div.breed-select-wrap > div > div > div.page-layout > main > div.breed-comparison-theme-wrap > div.breed-comparison-select-and-breed-data > div.breed-comparison-wrap.js-breed-comparison-row-top > div:nth-child(3) > div.breed-comparison-image-wrap > div.breed-comparison-image > div.breed-comparison-image-content-wrap > img")
    WebElement beaglepic;

    @FindBy(css = "body > div.breed-select-wrap > div > div > div.page-layout > main > div.breed-comparison-theme-wrap > div.breed-comparison-select-and-breed-data > div.breed-comparison-wrap.js-breed-comparison-row-top > div:nth-child(4) > div.breed-comparison-select.breed-comparison-select_closed > div.breed-comparison-select__top > img")
    WebElement select4;

    @FindBy(css = "body > div.breed-select-wrap > div > div > div.page-layout > main > div.breed-comparison-theme-wrap > div.breed-comparison-select-and-breed-data > div.breed-comparison-wrap.js-breed-comparison-row-top > div:nth-child(4) > div.breed-comparison-select > div.breed-comparison-select__bottom > div.breed-comparison-select-breeds > div.breed-comparison-select-breeds__option.breed-comparison-select-breeds__option-23758")
    WebElement boxer;

    @FindBy(css = "body > div.breed-select-wrap > div > div > div.page-layout > main > div.breed-comparison-theme-wrap > div.breed-comparison-select-and-breed-data > div.breed-comparison-wrap.js-breed-comparison-row-top > div:nth-child(4) > div.breed-comparison-image-wrap > div.breed-comparison-image > div.breed-comparison-image-content-wrap > img")
    WebElement boxerpic;

    @FindBy(css = "body > div.breed-select-wrap > div > div > div.page-layout > main > div.breed-comparison-theme-wrap > div.breed-comparison-select-and-breed-data > div.breed-comparison-wrap.js-breed-comparison-row-top > div:nth-child(5) > div.breed-comparison-select.breed-comparison-select_closed > div.breed-comparison-select__top > img")
    WebElement select5;

    @FindBy(css = "body > div.breed-select-wrap > div > div > div.page-layout > main > div.breed-comparison-theme-wrap > div.breed-comparison-select-and-breed-data > div.breed-comparison-wrap.js-breed-comparison-row-top > div:nth-child(5) > div.breed-comparison-select > div.breed-comparison-select__bottom > div.breed-comparison-select-breeds > div.breed-comparison-select-breeds__option.breed-comparison-select-breeds__option-23840")
    WebElement bullterrier;

    @FindBy(css = "body > div.breed-select-wrap > div > div > div.page-layout > main > div.breed-comparison-theme-wrap > div.breed-comparison-select-and-breed-data > div.breed-comparison-wrap.js-breed-comparison-row-top > div:nth-child(5) > div.breed-comparison-image-wrap > div.breed-comparison-image > div.breed-comparison-image-content-wrap > img")
    WebElement bullterrierpic;

    @FindBy(css = "body > div.breed-select-wrap > div > div > div.page-layout > main > div.breed-comparison-wrap-button > a")
    WebElement breedcompbutton;

    @FindBy(xpath = "//body/div[11]/div[1]/div[1]/div[2]/main[1]/div[4]/div[2]/div[2]/div[2]/div[1]/div[1]/div[3]")
    WebElement personality;

    @FindBy(css = "body > div.breed-results-wrap.breed-results-wrap-comparison > div:nth-child(3) > div > div > main > div.breed-results-comparison.js-breed-results-comparison > div > div:nth-child(5) > div:nth-child(1)")
    WebElement perso1;

    @FindBy(css = "body > div.breed-results-wrap.breed-results-wrap-comparison > div:nth-child(3) > div > div > main > div.breed-results-comparison.js-breed-results-comparison > div > div:nth-child(5) > div:nth-child(2) > span")
    WebElement perso2;

    @FindBy(css = "body > div.breed-results-wrap.breed-results-wrap-comparison > div:nth-child(3) > div > div > main > div.breed-results-comparison.js-breed-results-comparison > div > div:nth-child(5) > div:nth-child(3) > span")
    WebElement perso3;

    @FindBy(css = "body > div.breed-results-wrap.breed-results-wrap-comparison > div:nth-child(3) > div > div > main > div.breed-results-comparison.js-breed-results-comparison > div > div:nth-child(5) > div:nth-child(4) > span")
    WebElement perso4;

    @FindBy(css = "body > div.breed-results-wrap.breed-results-wrap-comparison > div:nth-child(3) > div > div > main > div.breed-results-comparison.js-breed-results-comparison > div > div:nth-child(5) > div:nth-child(5) > span")
    WebElement perso5;

    @FindBy(xpath = "//body/div[11]/div[1]/div[1]/div[2]/main[1]/div[4]/div[2]/div[2]/div[2]/div[1]/div[1]/div[6]")
    WebElement poprank;

    @FindBy(css = "body > div.breed-select-wrap > div > div > div.page-layout > main > div.breed-comparison-theme-wrap > div.breed-comparison-select-and-breed-data > div.breed-comparison-wrap-table > div.breed-comparison-wrap-table-inner > div > div > div:nth-child(8) > div:nth-child(1)")
    WebElement poprank1;

    @FindBy(css = "body > div.breed-select-wrap > div > div > div.page-layout > main > div.breed-comparison-theme-wrap > div.breed-comparison-select-and-breed-data > div.breed-comparison-wrap-table > div.breed-comparison-wrap-table-inner > div > div > div:nth-child(8) > div:nth-child(2)")
    WebElement poprank2;

    @FindBy(css = "body > div.breed-select-wrap > div > div > div.page-layout > main > div.breed-comparison-theme-wrap > div.breed-comparison-select-and-breed-data > div.breed-comparison-wrap-table > div.breed-comparison-wrap-table-inner > div > div > div:nth-child(8) > div:nth-child(3)")
    WebElement poprank3;

    @FindBy(css = "body > div.breed-select-wrap > div > div > div.page-layout > main > div.breed-comparison-theme-wrap > div.breed-comparison-select-and-breed-data > div.breed-comparison-wrap-table > div.breed-comparison-wrap-table-inner > div > div > div:nth-child(8) > div:nth-child(4)")
    WebElement poprank4;

    @FindBy(css = "body > div.breed-select-wrap > div > div > div.page-layout > main > div.breed-comparison-theme-wrap > div.breed-comparison-select-and-breed-data > div.breed-comparison-wrap-table > div.breed-comparison-wrap-table-inner > div > div > div:nth-child(8) > div:nth-child(4)")
    WebElement poprank5;

    @FindBy(xpath = "//body/div[11]/div[1]/div[1]/div[2]/main[1]/div[4]/div[2]/div[2]/div[2]/div[1]/div[1]/div[9]")
    WebElement group;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[2]/main/div[4]/div[2]/div[2]/div[2]/div/div/div[11]/div[1]/a")
    WebElement group1;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[2]/main/div[4]/div[2]/div[2]/div[2]/div/div/div[11]/div[2]/a")
    WebElement group2;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[2]/main/div[4]/div[2]/div[2]/div[2]/div/div/div[11]/div[3]/a")
    WebElement group3;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[2]/main/div[4]/div[2]/div[2]/div[2]/div/div/div[11]/div[4]/a")
    WebElement group4;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[2]/main/div[4]/div[2]/div[2]/div[2]/div/div/div[11]/div[5]/a")
    WebElement group5;

    @FindBy(xpath = "//body/div[11]/div[1]/div[1]/div[2]/main[1]/div[4]/div[2]/div[2]/div[2]/div[1]/div[1]/div[12]")
    WebElement size;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[2]/main/div[4]/div[2]/div[2]/div[2]/div/div/div[14]/div[1]")
    WebElement size1;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[2]/main/div[4]/div[2]/div[2]/div[2]/div/div/div[14]/div[2]")
    WebElement size2;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[2]/main/div[4]/div[2]/div[2]/div[2]/div/div/div[14]/div[3]")
    WebElement size3;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[2]/main/div[4]/div[2]/div[2]/div[2]/div/div/div[14]/div[4]")
    WebElement size4;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[2]/main/div[4]/div[2]/div[2]/div[2]/div/div/div[14]/div[5]")
    WebElement size5;

    @FindBy(xpath = "/html[1]/body[1]/div[11]/div[1]/div[1]/div[2]/main[1]/div[4]/div[2]/div[2]/div[2]/div[1]/div[1]/div[14]/div[1]/div[1]")
    WebElement lifexp;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[2]/main/div[4]/div[2]/div[2]/div[2]/div/div/div[17]/div[1]")
    WebElement lifexp1;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[2]/main/div[4]/div[2]/div[2]/div[2]/div/div/div[17]/div[2]")
    WebElement lifexp2;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[2]/main/div[4]/div[2]/div[2]/div[2]/div/div/div[17]/div[3]")
    WebElement lifexp3;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[2]/main/div[4]/div[2]/div[2]/div[2]/div/div/div[17]/div[4]")
    WebElement lifexp4;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[2]/main/div[4]/div[2]/div[2]/div[2]/div/div/div[17]/div[5]")
    WebElement lifexp5;

    @FindBy(xpath = "//body/div[11]/div[1]/div[1]/div[2]/main[1]/div[4]/div[2]/div[2]/div[2]/div[1]/div[1]/div[18]")
    WebElement charac;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[2]/main/div[4]/div[2]/div[2]/div[2]/div/div/div[20]/div[1]")
    WebElement charac1;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[2]/main/div[4]/div[2]/div[2]/div[2]/div/div/div[20]/div[2]")
    WebElement charac2;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[2]/main/div[4]/div[2]/div[2]/div[2]/div/div/div[20]/div[3]")
    WebElement charac3;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[2]/main/div[4]/div[2]/div[2]/div[2]/div/div/div[20]/div[4]")
    WebElement charac4;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[2]/main/div[4]/div[2]/div[2]/div[2]/div/div/div[20]/div[5]")
    WebElement charac5;

    @FindBy(xpath = "//body/div[11]/div[1]/div[1]/div[2]/main[1]/div[4]/div[2]/div[2]/div[2]/div[1]/div[1]/div[21]")
    WebElement trainab;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[2]/main/div[4]/div[2]/div[2]/div[2]/div/div/div[23]/div[1]")
    WebElement trainab1;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[2]/main/div[4]/div[2]/div[2]/div[2]/div/div/div[23]/div[2]")
    WebElement trainab2;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[2]/main/div[4]/div[2]/div[2]/div[2]/div/div/div[23]/div[3]")
    WebElement trainab3;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[2]/main/div[4]/div[2]/div[2]/div[2]/div/div/div[23]/div[4]")
    WebElement trainab4;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[2]/main/div[4]/div[2]/div[2]/div[2]/div/div/div[23]/div[5]")
    WebElement trainab5;

    @FindBy(xpath = "//body/div[11]/div[1]/div[1]/div[2]/main[1]/div[4]/div[2]/div[2]/div[2]/div[1]/div[1]/div[24]")
    WebElement coatlength;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[2]/main/div[4]/div[2]/div[2]/div[2]/div/div/div[26]/div[1]")
    WebElement coatlength1;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[2]/main/div[4]/div[2]/div[2]/div[2]/div/div/div[26]/div[2]")
    WebElement coatlength2;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[2]/main/div[4]/div[2]/div[2]/div[2]/div/div/div[26]/div[3]")
    WebElement coatlength3;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[2]/main/div[4]/div[2]/div[2]/div[2]/div/div/div[26]/div[4]")
    WebElement coatlength4;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[2]/main/div[4]/div[2]/div[2]/div[2]/div/div/div[26]/div[5]")
    WebElement coatlength5;

    @FindBy(xpath = "//body/div[11]/div[1]/div[1]/div[2]/main[1]/div[4]/div[2]/div[2]/div[2]/div[1]/div[1]/div[27]")
    WebElement groom;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[2]/main/div[4]/div[2]/div[2]/div[2]/div/div/div[29]/div[1]")
    WebElement groom1;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[2]/main/div[4]/div[2]/div[2]/div[2]/div/div/div[29]/div[2]")
    WebElement groom2;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[2]/main/div[4]/div[2]/div[2]/div[2]/div/div/div[29]/div[3]")
    WebElement groom3;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[2]/main/div[4]/div[2]/div[2]/div[2]/div/div/div[29]/div[4]")
    WebElement groom4;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[2]/main/div[4]/div[2]/div[2]/div[2]/div/div/div[29]/div[5]")
    WebElement groom5;

    @FindBy(xpath = "//body/div[11]/div[1]/div[1]/div[2]/main[1]/div[4]/div[2]/div[2]/div[2]/div[1]/div[1]/div[30]")
    WebElement shedd;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[2]/main/div[4]/div[2]/div[2]/div[2]/div/div/div[32]/div[1]")
    WebElement shedd1;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[2]/main/div[4]/div[2]/div[2]/div[2]/div/div/div[32]/div[2]")
    WebElement shedd2;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[2]/main/div[4]/div[2]/div[2]/div[2]/div/div/div[32]/div[3]")
    WebElement shedd3;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[2]/main/div[4]/div[2]/div[2]/div[2]/div/div/div[32]/div[4]")
    WebElement shedd4;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[2]/main/div[4]/div[2]/div[2]/div[2]/div/div/div[32]/div[5]")
    WebElement shedd5;

    @FindBy(xpath = "//body/div[11]/div[1]/div[1]/div[2]/main[1]/div[4]/div[2]/div[2]/div[2]/div[1]/div[1]/div[33]")
    WebElement actlev;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[2]/main/div[4]/div[2]/div[2]/div[2]/div/div/div[35]/div[1]")
    WebElement actlev1;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[2]/main/div[4]/div[2]/div[2]/div[2]/div/div/div[35]/div[2]")
    WebElement actlev2;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[2]/main/div[4]/div[2]/div[2]/div[2]/div/div/div[35]/div[3]")
    WebElement actlev3;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[2]/main/div[4]/div[2]/div[2]/div[2]/div/div/div[35]/div[4]")
    WebElement actlev4;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[2]/main/div[4]/div[2]/div[2]/div[2]/div/div/div[35]/div[5]")
    WebElement actlev5;

    @FindBy(xpath = "//body/div[11]/div[1]/div[1]/div[2]/main[1]/div[4]/div[2]/div[2]/div[2]/div[1]/div[1]/div[36]")
    WebElement barking;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[2]/main/div[4]/div[2]/div[2]/div[2]/div/div/div[38]/div[1]")
    WebElement barking1;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[2]/main/div[4]/div[2]/div[2]/div[2]/div/div/div[38]/div[2]")
    WebElement barking2;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[2]/main/div[4]/div[2]/div[2]/div[2]/div/div/div[38]/div[3]")
    WebElement barking3;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[2]/main/div[4]/div[2]/div[2]/div[2]/div/div/div[38]/div[4]")
    WebElement barking4;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[2]/main/div[4]/div[2]/div[2]/div[2]/div/div/div[38]/div[5]")
    WebElement barking5;

    @FindBy(css = "body > div.breed-select-wrap > div > div > div.page-layout > main > div.breed-comparison-theme-wrap > div.breed-comparison-select-and-breed-data > div.breed-comparison-wrap-table > div.breed-comparison-wrap-table-inner > div > div > div:nth-child(39) > div:nth-child(1) > a")
    WebElement findpuppy1;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[2]/main/div[4]/div[2]/div[2]/div[2]/div/div/div[39]/div[2]/a")
    WebElement findpuppy2;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[2]/main/div[4]/div[2]/div[2]/div[2]/div/div/div[39]/div[3]/a")
    WebElement findpuppy3;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[2]/main/div[4]/div[2]/div[2]/div[2]/div/div/div[39]/div[4]/a")
    WebElement findpuppy4;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[2]/main/div[4]/div[2]/div[2]/div[2]/div/div/div[39]/div[5]/a")
    WebElement findpuppy5;

    @FindBy(css = "#a268951c-b028-44ad-99ed-5af71765e083")
    WebElement BottomBanner;
    //

    DriverHelper driverHelper;

    WebDriver driver;

    // Constructor
    public CompareBreeds(WebDriver _driver) {
        driver = _driver;
        PageFactory.initElements(driver, this);

    }

    public void VerifyCompareBreeds() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(breeds)).click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", breedscompa);
        wait.until(ExpectedConditions.elementToBeClickable(breedscompa)).click();
        HiddeBanner();
        wait.until(ExpectedConditions.elementToBeClickable(select1)).click();
        wait.until(ExpectedConditions.elementToBeClickable(affens)).click();
        wait.until(ExpectedConditions.elementToBeClickable(select2)).click();
        wait.until(ExpectedConditions.elementToBeClickable(akita)).click();
        wait.until(ExpectedConditions.elementToBeClickable(select3)).click();
        wait.until(ExpectedConditions.elementToBeClickable(beagle)).click();
        wait.until(ExpectedConditions.elementToBeClickable(select4)).click();
        wait.until(ExpectedConditions.elementToBeClickable(boxer)).click();
        wait.until(ExpectedConditions.elementToBeClickable(select5)).click();
        wait.until(ExpectedConditions.elementToBeClickable(bullterrier)).click();
        wait.until(ExpectedConditions.elementToBeClickable(breedcompbutton)).click();
        wait.until(ExpectedConditions.visibilityOf(personality));
        wait.until(ExpectedConditions.visibilityOf(poprank));
        wait.until(ExpectedConditions.visibilityOf(group));
        wait.until(ExpectedConditions.visibilityOf(size));
        wait.until(ExpectedConditions.visibilityOf(lifexp));
        wait.until(ExpectedConditions.visibilityOf(charac));
        wait.until(ExpectedConditions.visibilityOf(trainab));
        wait.until(ExpectedConditions.visibilityOf(coatlength));
        wait.until(ExpectedConditions.visibilityOf(groom));
        //js.executeScript("arguments[0].scrollIntoView();", shedd);
        wait.until(ExpectedConditions.visibilityOf(shedd));
        wait.until(ExpectedConditions.visibilityOf(actlev));
        wait.until(ExpectedConditions.visibilityOf(barking));
        wait.until(ExpectedConditions.visibilityOf(findpuppy1));

    }

    public void HiddeBanner() {

        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("arguments[0].style.visibility='hidden'", BottomBanner);
    }


}
