package Pages;
import Helpers.DriverHelper;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static java.lang.Thread.sleep;

public class BreedSelector {

    @FindBy(xpath = "//html/body/div[2]/div/div[1]/div/div[2]/nav/a[1]")
    WebElement breedsmenu;

    @FindBy(xpath = "//*[@id=\"dog-breeds\"]/div[2]/div/div/div/ul/li[1]/a/div")
    WebElement findmatch;

    @FindBy(xpath = "//*[@id=\"get-started\"]")
    WebElement getstarted;

    @FindBy(xpath = "//*[@id=\"breed-select-template\"]/div/div/div[2]/main/div[4]/div[1]/div[1]/h4")
    WebElement headbreedsel1;

    @FindBy(css = "#breed-select-template > div > div > div.page-layout > main > div.breed-select-questions > div.breed-select-question.js-question.js-question-number-0 > img.breed-select-question__option-image.js-option-image")
    WebElement imagepage1;

    @FindBy(css = "#breed-select-template > div > div > div.page-layout > main > div.breed-select-questions > div.breed-select-question.js-question.js-question-number-0 > div.breed-select-options > div.breed-select-option.js-question-option.js-option-number-0 > label > span")
    WebElement newtodogs;

    @FindBy(css = "#breed-select-template > div > div > div.page-layout > main > div.breed-select-questions > div.breed-select-question.js-question.js-question-number-0 > div.breed-select-options > div.breed-select-option.js-question-option.js-option-number-0 > div")
    WebElement newtodogslab;

    @FindBy(css = "#breed-select-template > div > div > div.page-layout > main > div.breed-select-questions > div.breed-select-question.js-question.js-question-number-0 > div.breed-select-options > div.breed-select-option.js-question-option.js-option-number-1 > label > span")
    WebElement currentowndog;

    @FindBy(css = "#breed-select-template > div > div > div.page-layout > main > div.breed-select-questions > div.breed-select-question.js-question.js-question-number-0 > div.breed-select-options > div.breed-select-option.js-question-option.js-option-number-1 > div")
    WebElement currentowndoglab;

    @FindBy(css = "#breed-select-template > div > div > div.page-layout > main > div.breed-select-questions > div.breed-select-question.js-question.js-question-number-0 > div.breed-select-options > div.breed-select-option.js-question-option.js-option-number-2 > label > span")
    WebElement owndogpast;

    @FindBy(css = "#breed-select-template > div > div > div.page-layout > main > div.breed-select-questions > div.breed-select-question.js-question.js-question-number-0 > div.breed-select-options > div.breed-select-option.js-question-option.js-option-number-2 > div")
    WebElement owndogpastlab;

    @FindBy(xpath = "//*[@id=\"experience-continue\"]")
    WebElement continue1;

    @FindBy(css = "#breed-select-template > div > div > div.page-layout > main > div.breed-select-questions > div.breed-select-question.js-question.js-question-number-2 > div.breed-select-question__title > h4")
    WebElement headbreedsel2;

    @FindBy(css = "#breed-select-template > div > div > div.page-layout > main > div.breed-select-questions > div.breed-select-question.js-question.js-question-number-2 > img.breed-select-question__option-image.js-option-image")
    WebElement imagepage2;

    @FindBy(css = "#breed-select-template > div > div > div.page-layout > main > div.breed-select-questions > div.breed-select-question.js-question.js-question-number-2 > div.breed-select-options > div.breed-select-option.js-question-option.js-option-number-0 > label > span")
    WebElement apartment;

    @FindBy(css = "#breed-select-template > div > div > div.page-layout > main > div.breed-select-questions > div.breed-select-question.js-question.js-question-number-2 > div.breed-select-options > div.breed-select-option.js-question-option.js-option-number-0 > div")
    WebElement apartmentlab;

    @FindBy(css = "#breed-select-template > div > div > div.page-layout > main > div.breed-select-questions > div.breed-select-question.js-question.js-question-number-2 > div.breed-select-options > div.breed-select-option.js-question-option.js-option-number-1 > label > span")
    WebElement housesmall;

    @FindBy(css = "#breed-select-template > div > div > div.page-layout > main > div.breed-select-questions > div.breed-select-question.js-question.js-question-number-2 > div.breed-select-options > div.breed-select-option.js-question-option.js-option-number-1 > div")
    WebElement housesmalllab;

    @FindBy(css = "#breed-select-template > div > div > div.page-layout > main > div.breed-select-questions > div.breed-select-question.js-question.js-question-number-2 > div.breed-select-options > div.breed-select-option.js-question-option.js-option-number-2 > label > span")
    WebElement houselarge;

    @FindBy(css = "#breed-select-template > div > div > div.page-layout > main > div.breed-select-questions > div.breed-select-question.js-question.js-question-number-2 > div.breed-select-options > div.breed-select-option.js-question-option.js-option-number-2 > div > div")
    WebElement houselargelab;

    @FindBy(css = "#home-type-continue")
    WebElement continue2;

    @FindBy(css = "#breed-select-template > div > div > div.page-layout > main > div.breed-select-intro-title.mb2.bps-mb8 > div.breed-select-intro-title__title")
    WebElement headbreedsel3;

    @FindBy(css = "#breed-select-template > div > div > div.page-layout > main > div.breed-select-questions > div.breed-select-question.js-question.js-question-number-3 > img.breed-select-question__option-image.js-option-image")
    WebElement imagepage3;

    @FindBy(css = "#breed-select-template > div > div > div.page-layout > main > div.breed-select-questions > div.breed-select-question.js-question.js-question-number-4 > div.breed-select-options > div.breed-select-option.js-question-option.js-option-number-0 > label > span")
    WebElement yes;

    @FindBy(css = "#breed-select-template > div > div > div.page-layout > main > div.breed-select-questions > div.breed-select-question.js-question.js-question-number-4 > div.breed-select-options > div.breed-select-option.js-question-option.js-option-number-0 > div")
    WebElement yeslab;

    @FindBy(css = "#breed-select-template > div > div > div.page-layout > main > div.breed-select-questions > div.breed-select-question.js-question.js-question-number-3 > div.breed-select-options > div.breed-select-option.js-question-option.js-option-number-1 > div")
    WebElement no;

    @FindBy(css = "#breed-select-template > div > div > div.page-layout > main > div.breed-select-questions > div.breed-select-question.js-question.js-question-number-3 > div.breed-select-options > div.breed-select-option.js-question-option.js-option-number-1 > div")
    WebElement nolab;

    @FindBy(css = "#apartments-continue")
    WebElement continue3;

    @FindBy(css = "#breed-select-template > div > div > div.page-layout > main > div.breed-select-intro-title.mb2.bps-mb8 > div.breed-select-intro-title__title")
    WebElement headbreedsel4;

    @FindBy(css = "#breed-select-template > div > div > div.page-layout > main > div.breed-select-questions > div.breed-select-question.js-question.js-question-number-4 > img.breed-select-question__option-image.js-option-image")
    WebElement imagepage4;

    @FindBy(css = "#breed-select-template > div > div > div.page-layout > main > div.breed-select-questions > div.breed-select-question.js-question.js-question-number-4 > div.breed-select-options > div.breed-select-option.js-question-option.js-option-number-0 > label")
    WebElement yes2;

    @FindBy(css = "#breed-select-template > div > div > div.page-layout > main > div.breed-select-questions > div.breed-select-question.js-question.js-question-number-4 > div.breed-select-options > div.breed-select-option.js-question-option.js-option-number-0 > div")
    WebElement yes2lab;

    @FindBy(css = "#breed-select-template > div > div > div.page-layout > main > div.breed-select-questions > div.breed-select-question.js-question.js-question-number-4 > div.breed-select-options > div.breed-select-option.js-question-option.js-option-number-1 > label > span")
    WebElement no2;

    @FindBy(css = "#breed-select-template > div > div > div.page-layout > main > div.breed-select-questions > div.breed-select-question.js-question.js-question-number-4 > div.breed-select-options > div.breed-select-option.js-question-option.js-option-number-1 > div")
    WebElement no2lab;

    @FindBy(css = "#children-continue")
    WebElement continue4;

    @FindBy(css = "#breed-select-template > div > div > div.page-layout > main > div.breed-select-questions > div.breed-select-question.js-question.js-question-number-5 > div.breed-select-question__title > h4")
    WebElement headbreedsel5;

    @FindBy(css = "#breed-select-template > div > div > div.page-layout > main > div.breed-select-questions > div.breed-select-question.js-question.js-question-number-5 > img.breed-select-question__option-image.js-option-image.js-option-image-volume.breed-select-question__option-image_volume")
    WebElement imagepage5;

    @FindBy(css = "#breed-select-template > div > div > div.page-layout > main > div.breed-select-questions > div.breed-select-question.js-question.js-question-number-5 > div.breed-select-options > div > div.breed-select-volume__child.breed-select-volume__child_left")
    WebElement onlybarks;

    @FindBy(css = "#breed-select-template > div > div > div.page-layout > main > div.breed-select-questions > div.breed-select-question.js-question.js-question-number-5 > div.breed-select-options > div > div.breed-select-volume__child.breed-select-volume__child_right")
    WebElement likesvocal;

    @FindBy(css = "#volume-control-down > div")
    WebElement minusbark;

    @FindBy(css = "#volume-control-up")
    WebElement plusbark;

    @FindBy(css = "#volume-continue")
    WebElement continue5;

    @FindBy(css = "#breed-select-template > div > div > div.page-layout > main > div.breed-select-questions > div.breed-select-question.js-question.js-question-number-6 > div.breed-select-question__title > h4")
    WebElement headbreedsel6;

    @FindBy(css = "#breed-select-template > div > div > div.page-layout > main > div.breed-select-questions > div.breed-select-question.js-question.js-question-number-6 > img.breed-select-question__option-image.js-option-image")
    WebElement imagepage6;

    @FindBy(css = "#breed-select-template > div > div > div.page-layout > main > div.breed-select-questions > div.breed-select-question.js-question.js-question-number-6 > div.breed-select-options > div.breed-select-option.js-question-option.js-option-number-0 > label > span")
    WebElement infreq;

    @FindBy(css = "#breed-select-template > div > div > div.page-layout > main > div.breed-select-questions > div.breed-select-question.js-question.js-question-number-6 > div.breed-select-options > div.breed-select-option.js-question-option.js-option-number-0 > div")
    WebElement infreqlab;

    @FindBy(css = "#breed-select-template > div > div > div.page-layout > main > div.breed-select-questions > div.breed-select-question.js-question.js-question-number-6 > div.breed-select-options > div.breed-select-option.js-question-option.js-option-number-1 > label > span")
    WebElement freq;

    @FindBy(css = "#breed-select-template > div > div > div.page-layout > main > div.breed-select-questions > div.breed-select-question.js-question.js-question-number-6 > div.breed-select-options > div.breed-select-option.js-question-option.js-option-number-1 > div")
    WebElement freqlab;

    @FindBy(css = "#shedding-continue")
    WebElement continue6;

    @FindBy(css = "body > div.breed-results-wrap > div:nth-child(2) > div > div.breed-select-intro-title__sub-title > h2")
    WebElement headresults;

    @FindBy(css = "body > div.breed-results-wrap > div:nth-child(2) > div > div.breed-results-top-match > div.breed-results-highlight > img")
    WebElement imageresults;

    @FindBy(css = "body > div.breed-results-wrap > div:nth-child(2) > div > div.breed-results-top-match > div.breed-results-highlight > div.breed-results-highlight__heading > h3")
    WebElement results;

    @FindBy(css = "body > div.breed-results-wrap > div:nth-child(2) > div > div.breed-results-top-match > div.breed-results-highlight > div.breed-results-highlight__heading > h3")
    WebElement resultsdetail;

    @FindBy(css = "#find-puppies")
    WebElement findpuppies;

    @FindBy(css = "#learn-more")
    WebElement learnmore;

    @FindBy(css = "body > div.breed-results-wrap > div:nth-child(3) > div > div > div.breed-results-other-matches__heading > h2")
    WebElement restmatch;

    @FindBy(css = "body > div.breed-results-wrap > div:nth-child(3) > div > div > div.breed-results-other-matches__heading > p")
    WebElement restmatchdet;

    @FindBy(css = "body > div.breed-results-wrap > div:nth-child(3) > div > div > div:nth-child(2) > div.breed-results-other-match-item__content > h3")
    WebElement match2;

    @FindBy(css = "body > div.breed-results-wrap > div:nth-child(3) > div > div > div:nth-child(2) > div.breed-results-other-match-item__thumbnail > img")
    WebElement match2pict;

    @FindBy(css = "body > div.breed-results-wrap > div:nth-child(3) > div > div > div:nth-child(3) > div.breed-results-other-match-item__content > h3")
    WebElement match3;

    @FindBy(css = "body > div.breed-results-wrap > div:nth-child(3) > div > div > div:nth-child(3) > div.breed-results-other-match-item__thumbnail > img")
    WebElement match3pict;

    @FindBy(css = "body > div.breed-results-wrap > div:nth-child(3) > div > div > div:nth-child(4) > div.breed-results-other-match-item__content > h3")
    WebElement match4;

    @FindBy(css = "body > div.breed-results-wrap > div:nth-child(3) > div > div > div:nth-child(4) > div.breed-results-other-match-item__thumbnail > img")
    WebElement match4pict;

    @FindBy(css = "body > div.breed-results-wrap > div:nth-child(3) > div > div > div:nth-child(5) > div.breed-results-other-match-item__content > h3")
    WebElement match5;

    @FindBy(css = "body > div.breed-results-wrap > div:nth-child(3) > div > div > div:nth-child(5) > div.breed-results-other-match-item__thumbnail > img")
    WebElement match5pict;

    @FindBy(css = "body > div.breed-results-wrap > div:nth-child(3) > div > div > div:nth-child(6) > div.breed-results-other-match-item__content > h3")
    WebElement match6;

    @FindBy(css = "body > div.breed-results-wrap > div:nth-child(3) > div > div > div:nth-child(6) > div.breed-results-other-match-item__thumbnail > img")
    WebElement match6pict;

    @FindBy(css = "body > div.breed-results-wrap > div:nth-child(3) > div > div > div:nth-child(7) > div.breed-results-other-match-item__content > h3")
    WebElement match7;

    @FindBy(css = "body > div.breed-results-wrap > div:nth-child(3) > div > div > div:nth-child(7) > div.breed-results-other-match-item__content > h3")
    WebElement match7pict;

    @FindBy(css = "body > div.breed-results-wrap > div:nth-child(3) > div > div > div:nth-child(8) > div.breed-results-other-match-item__content > h3")
    WebElement match8;

    @FindBy(css = "body > div.breed-results-wrap > div:nth-child(3) > div > div > div:nth-child(8) > div.breed-results-other-match-item__thumbnail > img")
    WebElement match8pict;

    @FindBy(css = "body > div.breed-results-wrap > div:nth-child(3) > div > div > div:nth-child(9) > div.breed-results-other-match-item__content > h3")
    WebElement match9;

    @FindBy(css = "body > div.breed-results-wrap > div:nth-child(3) > div > div > div:nth-child(9) > div.breed-results-other-match-item__thumbnail > img")
    WebElement match9pict;

    @FindBy(css = "body > div.breed-results-wrap > div:nth-child(3) > div > div > div:nth-child(10) > div.breed-results-other-match-item__content > h3")
    WebElement match10;

    @FindBy(css = "body > div.breed-results-wrap > div:nth-child(3) > div > div > div:nth-child(10) > div.breed-results-other-match-item__thumbnail > img")
    WebElement match10pict;

    @FindBy(css = "body > div.breed-results-wrap > div:nth-child(4) > div > div > main > div.breed-results-comparison__heading > h2")
    WebElement breedcomp;

    @FindBy(css = "body > div.breed-results-wrap > div:nth-child(4) > div > div > main > div.breed-results-comparison.js-breed-results-comparison")
    WebElement breedcompdetail;

    @FindBy(css = "body > div.breed-results-wrap > div:nth-child(5) > div > div > a")
    WebElement quizagain;

    @FindBy(css = "body > div.breed-results-wrap > div:nth-child(5) > div > div > div")
    WebElement sharequiz;

    @FindBy(css = "#breed-select-template > div > div > div.page-layout > main > div.breed-select-questions > div.breed-select-question.js-question.js-question-number-1 > div.breed-select-question__title > h4")
    WebElement timeheadersel;

    @FindBy(css = "#breed-select-template > div > div > div.page-layout > main > div.breed-select-questions > div.breed-select-question.js-question.js-question-number-1 > img.breed-select-question__option-image.js-option-image")
    WebElement timeheaderpict;

    @FindBy(css = "#breed-select-template > div > div > div.page-layout > main > div.breed-select-questions > div.breed-select-question.js-question.js-question-number-1 > div.breed-select-options > div.breed-select-option.js-question-option.js-option-number-0 > label > span")
    WebElement littletime;

    @FindBy(css = "#breed-select-template > div > div > div.page-layout > main > div.breed-select-questions > div.breed-select-question.js-question.js-question-number-1 > div.breed-select-options > div.breed-select-option.js-question-option.js-option-number-0 > div")
    WebElement littletimelab;

    @FindBy(css = "#breed-select-template > div > div > div.page-layout > main > div.breed-select-questions > div.breed-select-question.js-question.js-question-number-1 > div.breed-select-options > div.breed-select-option.js-question-option.js-option-number-1 > label > span")
    WebElement sometime;

    @FindBy(css = "#breed-select-template > div > div > div.page-layout > main > div.breed-select-questions > div.breed-select-question.js-question.js-question-number-1 > div.breed-select-options > div.breed-select-option.js-question-option.js-option-number-1 > label > span")
    WebElement sometimelab;

    @FindBy(css = "#breed-select-template > div > div > div.page-layout > main > div.breed-select-questions > div.breed-select-question.js-question.js-question-number-1 > div.breed-select-options > div.breed-select-option.js-question-option.js-option-number-2 > label > span")
    WebElement alotoftime;

    @FindBy(css = "#breed-select-template > div > div > div.page-layout > main > div.breed-select-questions > div.breed-select-question.js-question.js-question-number-1 > div.breed-select-options > div.breed-select-option.js-question-option.js-option-number-2 > div")
    WebElement alotoftimelab;

    @FindBy(xpath = "//*[@id=\"training-continue\"]")
    WebElement continue7;

    @FindBy(xpath = "//*[@id=\"breed-select-template\"]/div/div/div[2]/main/div[4]/div[8]/div[1]/h4")
    WebElement actlevelheader;

    @FindBy(xpath = "//*[@id=\"breed-select-template\"]/div/div/div[2]/main/div[4]/div[8]/img[1]")
    WebElement actlevelpict;

    @FindBy(xpath = "//*[@id=\"breed-select-template\"]/div/div/div[2]/main/div[4]/div[8]/div[2]/div[1]/label/span")
    WebElement hangcouch;

    @FindBy(xpath = "//*[@id=\"breed-select-template\"]/div/div/div[2]/main/div[4]/div[8]/div[2]/div[1]/div")
    WebElement hangcouchlab;

    @FindBy(xpath = "//*[@id=\"breed-select-template\"]/div/div/div[2]/main/div[4]/div[8]/div[2]/div[2]/label/span")
    WebElement walkaround;

    @FindBy(xpath = "//*[@id=\"breed-select-template\"]/div/div/div[2]/main/div[4]/div[8]/div[2]/div[2]/div")
    WebElement walkaroundlab;

    @FindBy(xpath = "//*[@id=\"breed-select-template\"]/div/div/div[2]/main/div[4]/div[8]/div[2]/div[3]/label/span")
    WebElement goingadv;

    @FindBy(xpath = "//*[@id=\"breed-select-template\"]/div/div/div[2]/main/div[4]/div[8]/div[2]/div[3]/div")
    WebElement goingadvlab;

    @FindBy(xpath = "//*[@id=\"activity-level-continue\"]")
    WebElement continue8;


    DriverHelper driverHelper;

    WebDriver driver;

    // Constructor
    public BreedSelector(WebDriver _driver){
        this.driver = _driver;
        PageFactory.initElements(driver,this);
    }


    public void VerifyBreedSelector1() throws InterruptedException {

        this.breedsmenu.click();
        sleep(1000);
        this.findmatch.isDisplayed();
        this.findmatch.click();
        sleep(1000);
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");
        sleep(1000);
        this.getstarted.isDisplayed();
        this.getstarted.click();
        sleep(1000);
        this.headbreedsel1.isDisplayed();
        this.imagepage1.isDisplayed();
        this.newtodogs.isDisplayed();
        this.newtodogslab.isDisplayed();
        this.currentowndog.isDisplayed();
        this.currentowndoglab.isDisplayed();
        this.owndogpast.isDisplayed();
        this.owndogpastlab.isDisplayed();
        this.newtodogs.click();
        this.continue1.click();
        sleep(1000);
        this.headbreedsel2.isDisplayed();
        this.imagepage2.isDisplayed();
        this.apartment.isDisplayed();
        this.apartmentlab.isDisplayed();
        this.housesmall.isDisplayed();
        this.housesmalllab.isDisplayed();
        this.houselarge.isDisplayed();
        this.houselargelab.isDisplayed();
        this.apartment.click();
        this.continue2.click();
        sleep(1000);
        this.headbreedsel3.isDisplayed();
        this.imagepage3.isDisplayed();
        this.yes.isDisplayed();
        this.yeslab.isDisplayed();
        this.no.isDisplayed();
        this.nolab.isDisplayed();
        //this.yes.click();
        this.continue3.click();
        sleep(1000);
        this.headbreedsel4.isDisplayed();
        this.imagepage4.isDisplayed();
        this.yes2.isDisplayed();
        this.yes2lab.isDisplayed();
        this.no2.isDisplayed();
        this.no2lab.isDisplayed();
        this.yes2.click();
        this.continue4.click();
        sleep(1000);
        this.headbreedsel5.isDisplayed();
        this.imagepage5.isDisplayed();
        this.onlybarks.isDisplayed();
        this.likesvocal.isDisplayed();
        this.minusbark.isDisplayed();
        this.plusbark.isDisplayed();
        this.plusbark.click();
        this.plusbark.click();
        this.continue5.click();
        sleep(1000);
        this.headbreedsel6.isDisplayed();
        this.imagepage6.isDisplayed();
        this.infreq.isDisplayed();
        this.infreqlab.isDisplayed();
        this.freq.isDisplayed();
        this.freqlab.isDisplayed();
        this.infreq.click();
        this.continue6.click();
        sleep(1000);
        this.actlevelheader.isDisplayed();
        this.actlevelpict.isDisplayed();
        this.hangcouch.isDisplayed();
        this.hangcouchlab.isDisplayed();
        this.walkaround.isDisplayed();
        this.walkaroundlab.isDisplayed();
        this.goingadv.isDisplayed();
        this.goingadvlab.isDisplayed();
        this.hangcouch.click();
        this.continue8.click();
        sleep(1000);
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");
        sleep(2000);
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("scroll(0, 500);");
        this.headresults.isDisplayed();
        this.imageresults.isDisplayed();
        this.results.isDisplayed();
        jse.executeScript("scroll(0, 900);");
        this.resultsdetail.isDisplayed();
        this.findpuppies.isDisplayed();
        this.learnmore.isDisplayed();
        this.restmatch.isDisplayed();
        this.restmatchdet.isDisplayed();
        this.match2.isDisplayed();
        this.match2pict.isDisplayed();
        this.match3.isDisplayed();
        this.match3pict.isDisplayed();
        this.match4.isDisplayed();
        this.match4pict.isDisplayed();
        this.match5.isDisplayed();
        this.match5pict.isDisplayed();
        this.match6.isDisplayed();
        this.match6pict.isDisplayed();
        this.match7.isDisplayed();
        this.match7pict.isDisplayed();
        this.match8.isDisplayed();
        this.match8pict.isDisplayed();
        this.match9.isDisplayed();
        this.match9pict.isDisplayed();
        this.match10.isDisplayed();
        this.match10pict.isDisplayed();
        this.breedcomp.isDisplayed();
        this.breedcompdetail.isDisplayed();
        this.quizagain.isDisplayed();
        this.sharequiz.isDisplayed();


    }

    public void VerifyBreedSelector2() throws InterruptedException {

        this.breedsmenu.click();
        sleep(1000);
        this.findmatch.isDisplayed();
        this.findmatch.click();
        sleep(1000);
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");
        sleep(1000);
        this.getstarted.click();
        sleep(1000);
        Actions actions = new Actions(driver);
        actions.moveToElement(currentowndog).perform();
        assert(currentowndog.isEnabled());
        this.currentowndog.click();
        this.continue1.click();
        sleep(1000);
        this.timeheadersel.isDisplayed();
        this.timeheaderpict.isDisplayed();
        this.littletime.isDisplayed();
        this.littletimelab.isDisplayed();
        this.sometime.isDisplayed();
        this.sometimelab.isDisplayed();
        this.alotoftime.isDisplayed();
        this.alotoftimelab.isDisplayed();
        this.littletime.click();
        this.continue7.click();
        sleep(1000);
        this.housesmall.click();
        this.continue2.click();
        sleep(1000);
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");
        sleep(3000);
        this.headresults.isDisplayed();
        this.imageresults.isDisplayed();
        this.results.isDisplayed();
        this.resultsdetail.isDisplayed();
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("scroll(0, 500);");
        this.findpuppies.isDisplayed();
        this.learnmore.isDisplayed();
        this.restmatch.isDisplayed();
        this.restmatchdet.isDisplayed();
        this.match2.isDisplayed();
        this.match2pict.isDisplayed();
        this.match3.isDisplayed();
        this.match3pict.isDisplayed();
        this.match4.isDisplayed();
        this.match4pict.isDisplayed();
        this.match5.isDisplayed();
        this.match5pict.isDisplayed();
        this.match6.isDisplayed();
        this.match6pict.isDisplayed();
        this.match7.isDisplayed();
        this.match7pict.isDisplayed();
        this.match8.isDisplayed();
        this.match8pict.isDisplayed();
        //this.match9.isDisplayed();
        //this.match9pict.isDisplayed();
        //this.match10.isDisplayed();
        //this.match10pict.isDisplayed();
        this.breedcomp.isDisplayed();
        this.breedcompdetail.isDisplayed();
        this.quizagain.isDisplayed();
        this.sharequiz.isDisplayed();

    }


    public void VerifyBreedSelector3() throws InterruptedException {


        this.breedsmenu.click();
        sleep(1000);
        this.findmatch.isDisplayed();
        this.findmatch.click();
        sleep(1000);
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");
        sleep(1000);
        this.getstarted.click();
        sleep(1000);
        Actions actions = new Actions(driver);
        actions.moveToElement(owndogpast).perform();
        assert(owndogpast.isEnabled());
        this.owndogpast.click();
        sleep(1000);
        this.continue1.click();
        sleep(1000);
        this.sometime.click();
        sleep(1000);
        this.continue7.click();
        sleep(1000);
        this.houselarge.click();
        sleep(1000);
        this.continue2.click();
        sleep(1000);
        this.no2.click();
        sleep(1000);
        this.continue4.click();
        sleep(1000);
        this.plusbark.click();
        sleep(1000);
        this.plusbark.click();
        sleep(1000);
        this.plusbark.click();
        sleep(1000);
        this.plusbark.click();
        sleep(1000);
        this.plusbark.click();
        sleep(1000);
        this.continue5.click();
        sleep(1000);
        this.freq.click();
        sleep(1000);
        this.continue6.click();
        sleep(1000);
        this.actlevelheader.isDisplayed();
        this.actlevelpict.isDisplayed();
        this.hangcouch.isDisplayed();
        this.hangcouchlab.isDisplayed();
        this.walkaround.isDisplayed();
        this.walkaroundlab.isDisplayed();
        this.goingadv.isDisplayed();
        this.goingadvlab.isDisplayed();
        this.hangcouch.click();
        sleep(1000);
        this.continue8.click();
        sleep(1000);
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");
        sleep(1000);
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("scroll(0, 500);");
        this.headresults.isDisplayed();
        this.imageresults.isDisplayed();
        this.results.isDisplayed();
        this.resultsdetail.isDisplayed();
        this.findpuppies.isDisplayed();
        this.learnmore.isDisplayed();
        this.restmatch.isDisplayed();
        this.restmatchdet.isDisplayed();
        this.match2.isDisplayed();
        this.match2pict.isDisplayed();
        this.match3.isDisplayed();
        this.match3pict.isDisplayed();
        this.match4.isDisplayed();
        this.match4pict.isDisplayed();
        this.match5.isDisplayed();
        this.match5pict.isDisplayed();
        this.match6.isDisplayed();
        this.match6pict.isDisplayed();
        this.match7.isDisplayed();
        this.match7pict.isDisplayed();
        this.match8.isDisplayed();
        this.match8pict.isDisplayed();
        //this.match9.isDisplayed();
        //this.match9pict.isDisplayed();
        //this.breedcomp.isDisplayed();
        //this.breedcompdetail.isDisplayed();
        //this.quizagain.isDisplayed();
        //this.sharequiz.isDisplayed();


    }


}
