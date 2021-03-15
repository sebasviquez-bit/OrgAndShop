package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static java.lang.Thread.sleep;


public class Homepage {

    @FindBy(xpath = "/html/body/div[2]/div/div[1]/a/img")
    WebElement akcicon;

    @FindBy(xpath = "//html/body/div[2]/div/div[1]/div/div[1]")
    WebElement headerhome;

    @FindBy(xpath = "//html/body/div[4]/div[2]/div/div[1]")
    WebElement picthome;

    @FindBy(css = "body > div.page-home.bgc-white.cmw > div.page-home__top-stories.backdrop > div > div.section-title.section-title--center > h2")
    WebElement topstories;

    @FindBy(css = "body > div.page-home.bgc-white.cmw > div.page-home__top-stories.backdrop > div > div.grid.grid-4-up.grid--flush > div:nth-child(1) > div > div.content-card__body > a")
    WebElement topstory1;

    @FindBy(css = "body > div.page-home.bgc-white.cmw > div.page-home__top-stories.backdrop > div > div.grid.grid-4-up.grid--flush > div:nth-child(2) > div > div.content-card__body > a")
    WebElement topstory2;

    @FindBy(css = "body > div.page-home.bgc-white.cmw > div.page-home__top-stories.backdrop > div > div.grid.grid-4-up.grid--flush > div:nth-child(3) > div > div.content-card__body > a")
    WebElement topstory3;

    @FindBy(css = "body > div.page-home.bgc-white.cmw > div.page-home__top-stories.backdrop > div > div.grid.grid-4-up.grid--flush > div:nth-child(4) > div > div.content-card__body > a")
    WebElement topstory4;

    @FindBy(css = "body > div.page-home.bgc-white.cmw > div.akctv-embed")
    WebElement akctvheader;

    @FindBy(xpath = "//html/body/div[4]/div[7]/div[2]/div")
    WebElement videoheader;

    @FindBy(css = "body > div.page-home.bgc-white.cmw > div.featured-content-preview.featured-content-preview--dark > div.show-at-large.featured-content-preview__panel.bpm-pb6 > div > div.show-at-large > ul > li:nth-child(1) > a > span.featured-content-preview__link")
    WebElement videotitle1;

    @FindBy(css = "body > div.page-home.bgc-white.cmw > div.featured-content-preview.featured-content-preview--dark > div.show-at-large.featured-content-preview__panel.bpm-pb6 > div > div.show-at-large > ul > li:nth-child(2) > a > span.featured-content-preview__link")
    WebElement videotitle2;

    @FindBy(css = "body > div.page-home.bgc-white.cmw > div.featured-content-preview.featured-content-preview--dark > div.show-at-large.featured-content-preview__panel.bpm-pb6 > div > div.show-at-large > ul > li:nth-child(3) > a > span.featured-content-preview__link")
    WebElement videotitle3;

    @FindBy(css = "body > div.page-home.bgc-white.cmw > div.featured-content-preview.featured-content-preview--dark > div.show-at-large.featured-content-preview__panel.bpm-pb6 > div > div.show-at-large > ul > li:nth-child(4) > a > span.featured-content-preview__link")
    WebElement videotitle4;

    @FindBy(css = "body > div.page-home.bgc-white.cmw > div.featured-content-preview.featured-content-preview--dark")
    WebElement videoJW;

    @FindBy(xpath = "//html/body/div[4]/section[1]/div/div")
    WebElement articheader;

    @FindBy(css = "body > div.page-home.bgc-white.cmw > div.breed-feature > div:nth-child(1) > div > div.media-wrap > img")
    WebElement breedofday;

    @FindBy(css = "body > div.page-home.bgc-white.cmw > div.breed-feature > div.breed-feature__col.breed-feature__content-col > div > div > div > div.tool-grid__header > div > h2")
    WebElement toolheader;

    @FindBy(xpath = "//*[@id=\"cares\"]/div/div/div[1]/div[1]/h2")
    WebElement careheader;

    @FindBy(xpath = "//*[@id=\"cares\"]/div/div/div[2]/img")
    WebElement careimg;

    @FindBy(css = "#panel-AKC\\ Canine\\ Health\\ Foundation > div > a")
    WebElement carebutton;

    //

    @FindBy(xpath = "//html/body/div[4]/section[2]/div/div[2]")
    WebElement seheader;

    @FindBy(xpath = "//html/body/div[4]/section[2]/div/div[3]/a")
    WebElement eventbutton;

    @FindBy(css = "body > div.page-home.bgc-white.cmw > section.page-section.page-home__register-section > div > div > div.side-by-side__content > div > div > h2")
    WebElement regheader;

    @FindBy(xpath = "//html/body/div[4]/section[3]/div/div/div[1]/div/img")
    WebElement regimg;

    @FindBy(xpath = "//html/body/div[6]/div/div[1]/div[1]") //This is only enabled in Prod ***
    WebElement akcf1;

    @FindBy(xpath = "//html/body/div[6]/div/div[2]/div[2]/div/div")
    WebElement social;

    @FindBy(css = "body > div.site-footer.cmw > div.page-container > div.site-footer__wrap.site-footer__social.site-footer__wrap--ac.bpm-py3 > div.site-footer__wrap-inner.site-footer__corp-stamp > div.site-footer__statement")
    WebElement footer;

    @FindBy(xpath = "//html/body/div[6]/div/div[3]/div[2]/div/ul/li[1]")
    WebElement akcf2;

    @FindBy(xpath = "//html/body/div[2]/div/div[1]/div/div[1]/nav[1]/a[1]")
    WebElement eventsearch;

    @FindBy(xpath = "//html/body/div[2]/div/div[1]/div/div[1]/nav[1]/a[2]")
    WebElement findpuppy;

    @FindBy(xpath = "//html/body/div[2]/div/div[1]/div/div[1]/nav[1]/a[3]")
    WebElement regdog;

    @FindBy(xpath = "//html/body/div[2]/div/div[1]/div/div[1]/nav[1]/a[4]")
    WebElement shop;

    @FindBy(xpath = "//*[@id='desktop-search']")
    WebElement search;

    @FindBy(xpath = "//html/body/div[2]/div/div[1]/div/div[2]/nav/a[1]")
    WebElement breeds;

    @FindBy(xpath = "//html/body/div[2]/div/div[1]/div/div[2]/nav/a[2]")
    WebElement expadv;

    @FindBy(xpath = "//html/body/div[2]/div/div[1]/div/div[2]/nav/a[3]")
    WebElement prodserv;

    @FindBy(xpath = "//html/body/div[2]/div/div[1]/div/div[2]/nav/a[4]")
    WebElement sports;

    @FindBy(xpath = "//html/body/div[2]/div/div[1]/div/div[2]/nav/a[5]")
    WebElement clubs;

    @FindBy(css = "body > div.page-home.bgc-white.cmw > div.page-home__hero-container > div > div.cmw > div > div.interactive-hero__inner > div.interactive-hero__item.two > div > a:nth-child(1) > img")
    WebElement trainicon;

    @FindBy(css = "#welcome > div > a:nth-child(1) > img")
    WebElement registericon;

    @FindBy(css = "#home__good-works-text-link")
    WebElement careicon;

    @FindBy(css = "body > div.page-home.bgc-white.cmw > div.page-home__hero-container > div > div.cmw > div > div.interactive-hero__inner > div.interactive-hero__item.seven > div > a.interactive-hero__image-wrap")
    WebElement shopicon;

    @FindBy(css = "body > div.page-home.bgc-white.cmw > div.page-home__hero-container > div > div.cmw > div > div.interactive-hero__inner > div.interactive-hero__item.six > div > a.interactive-anchor")
    WebElement akctvicon;

    @FindBy(css = "body > div.page-home.bgc-white.cmw > div.page-home__hero-container > div > div.cmw > div > div.interactive-hero__inner > div.interactive-hero__item.seven > div > a.interactive-anchor")
    WebElement sportsicon;

    //@FindBy(xpath = "//*[@id=\"welcome\"]/div/a[1]/img") This was Removed on Sprint 10/02/20 ************
    WebElement aboutakcicon;

    @FindBy(css = "body > div.page-home.bgc-white.cmw > div.page-home__hero-container > div > div.cmw > div > div.interactive-hero__inner > div.interactive-hero__item.three > div > a:nth-child(1) > img")
    WebElement findpuppyicon;

    @FindBy(css = "body > div.page-home.bgc-white.cmw > div.page-home__hero-container > div > div.cmw > div > div.interactive-hero__inner > div.interactive-hero__item.eight > div > a.interactive-anchor")
    WebElement PetInsuIcon;

    @FindBy(xpath = "//*[@id=\"panel-AKC Canine Health Foundation\"]/div/p")
    WebElement akccareval;

    @FindBy(css = "#page-title > div > h1")
    WebElement aboutval;

    @FindBy(css = "#page-title > div > h1")
    WebElement trainval;

    @FindBy(css = "#page-title > div > h1")
    WebElement regisval;

    @FindBy(css = "#page-title > h1")
    WebElement sportsval;

    @FindBy(css = "body > div.page-home.bgc-white.cmw > div.page-home__top-stories.backdrop > div > div.grid.grid-4-up.grid--flush > div:nth-child(1) > div > div.content-card__body > a")
    WebElement topsto1;

    @FindBy(css = "body > div.page-home.bgc-white.cmw > div.page-home__top-stories.backdrop > div > div.grid.grid-4-up.grid--flush > div:nth-child(2) > div > div.content-card__body > a")
    WebElement topsto2;

    @FindBy(css = "body > div.page-home.bgc-white.cmw > div.page-home__top-stories.backdrop > div > div.grid.grid-4-up.grid--flush > div:nth-child(3) > div > div.content-card__body > a")
    WebElement topsto3;

    @FindBy(css = "body > div.page-home.bgc-white.cmw > div.page-home__top-stories.backdrop > div > div.grid.grid-4-up.grid--flush > div:nth-child(4) > div > div.content-card__body > a")
    WebElement topsto4;

    @FindBy(css = "#left-video")
    WebElement akctvVideo;

    @FindBy(css = "#right-content-2 > a:nth-child(1) > img")
    WebElement akctvimg1;

    @FindBy(css = "#right-content-2 > a:nth-child(2) > img")
    WebElement akctvimg2;

    @FindBy(css = "#right-content-2 > a:nth-child(3) > img")
    WebElement akctvimg3;

    @FindBy(css = "#right-content-2 > a:nth-child(4) > img")
    WebElement akctvimg4;

    @FindBy(css = "body > div.page-home.bgc-white.cmw > div.featured-content-preview.featured-content-preview--dark > div.featured-content-preview__content.featured-content-preview__inner.slick-initialized.slick-slider")
    WebElement videoPreview;

    @FindBy(css = "body > div.page-home.bgc-white.cmw > div.featured-content-preview.featured-content-preview--dark > div.show-at-large.featured-content-preview__panel.bpm-pb6 > div > div.show-at-large > ul > li:nth-child(1) > a > span.featured-content-preview__link")
    WebElement videosel;

    @FindBy(xpath = "//html/body/div[5]/div/div/div/div/div/div/div/div[2]/video")
    WebElement video;

    @FindBy(xpath = "//html/body/div[5]/div/div/div/div/div/div/div/div[8]/div[4]/div[1]/div[1]")
    WebElement videopause;

    @FindBy(css = "body > div.page-home.bgc-white.cmw > section.backdrop.trending > div > div > div.grid.grid-4-up > div:nth-child(1) > div")
    WebElement trendnews1;

    @FindBy(css = "body > div.page-home.bgc-white.cmw > section.backdrop.trending > div > div > div.grid.grid-4-up > div:nth-child(2) > div > div.content-card__body > div")
    WebElement trendnews2;

    @FindBy(css = "body > div.page-home.bgc-white.cmw > section.backdrop.trending > div > div > div.grid.grid-4-up > div:nth-child(3) > div > div.content-card__body > a")
    WebElement trendnews3;

    @FindBy(css = "body > div.page-home.bgc-white.cmw > div.breed-feature > div:nth-child(1) > div > div.breed-of-the-day__body > a")
    WebElement bofday;

    @FindBy(css = "body > div.page-home.bgc-white.cmw > div.breed-feature > div.breed-feature__col.breed-feature__content-col > div > div > div > div.tool-grid__wrap > div:nth-child(1) > a > svg")
    WebElement expbreed;

    @FindBy(css = "#panel-AKC\\ Canine\\ Health\\ Foundation > div > a")
    WebElement carebut1;

    @FindBy(css = "#anchor-Rescue\\ Network > div > div")
    WebElement rescnet;

    @FindBy(css = "#panel-Rescue\\ Network > div > a")
    WebElement rescnetbut;

    @FindBy(id = "anchor-AKC Reunite")
    WebElement akcreun;

    @FindBy(css = "#panel-AKC\\ Reunite > div > a")
    WebElement akcreunbut;

    @FindBy(css = "#anchor-Humane\\ Fund > div > div")
    WebElement humanfund;

    @FindBy(css = "#panel-Humane\\ Fund > div > a")
    WebElement humanfundbut;

    @FindBy(css = "#anchor-Museum\\ of\\ the\\ Dog > div > div")
    WebElement museumdog;

    @FindBy(css = "#panel-Museum\\ of\\ the\\ Dog > div > a")
    WebElement museumdogbut;

    @FindBy(css = "#anchor-Protecting\\ Your\\ Rights > div > div")
    WebElement protectrigh;

    @FindBy(css = "#panel-Protecting\\ Your\\ Rights > div > a")
    WebElement protectrightbut;

    @FindBy(css = "body > div.page-home.bgc-white.cmw > section.page-section.page-home__events-slider > div > div.event-slider__wrap > div.event-slider__nav-wrap > div > div > span.slider-dot-nav__arrow.slider-dot-nav__arrow--right.slick-arrow > svg")
    WebElement sportsarrow;

    @FindBy(css = "#slick-slide00 > a")
    WebElement conf;

    @FindBy(css = "#slick-slide01 > a")
    WebElement obe;

    @FindBy(css = "#slick-slide02 > a")
    WebElement ral;

    @FindBy(css = "#slick-slide03 > a")
    WebElement agi;

    @FindBy(css = "#slick-slide04 > a")
    WebElement track;

    @FindBy(css = "#slick-slide05 > a")
    WebElement herd;

    @FindBy(css = "#slick-slide06 > a")
    WebElement earthdog;

    @FindBy(css = "#slick-slide07 > a")
    WebElement fieldtri;

    @FindBy(css = "#slick-slide08 > a")
    WebElement hunt;

    @FindBy(css = "#slick-slide09 > a")
    WebElement farmdog;

    @FindBy(css = "#slick-slide010 > a")
    WebElement lurecours;

    @FindBy(css = "#slick-slide011 > a")
    WebElement coursabi;

    @FindBy(css = "#slick-slide012 > a")
    WebElement fastcat;

    @FindBy(css = "#slick-slide013 > a")
    WebElement conhound;

    @FindBy(css = "#slick-slide014 > a")
    WebElement scentwork;

    @FindBy(css = "#slick-slide015 > a")
    WebElement trickdog;

    @FindBy(css = "body > div.page-home.bgc-white.cmw > section.page-section.page-home__events-slider > div > div.d-table.mxauto > a")
    WebElement findevenearbut;

    @FindBy(css = "body > div.page-home.bgc-white.cmw > section.page-section.page-home__register-section > div > div > div.side-by-side__content > div > div > div.content-block__bottom-content > div > a")
    WebElement regdogbut;

    @FindBy(xpath = "//html/body/div[4]/div[5]")
    WebElement add;

    @FindBy(xpath = "//html/body/div[4]/section[1]/div/div/div[2]/div[4]/div")
    WebElement add1;

    @FindBy(css = "body > div.page-home.bgc-white.cmw > div.page-home__hero-container > aside")
    WebElement homepageHeroAside;

    @FindBy(css = "body > div.page-home.bgc-white.cmw > div.page-home__hero-container > div > div.cmw > div > div.interactive-hero__inner > div.interactive-hero__item.seven > div > a.interactive-anchor")
    WebElement homepageHeroBreedSearch;

    @FindBy(css = "body > div.page-home.bgc-white.cmw > section.page-section.page-home__events-slider > div > div.event-slider__header.pb7 > div > h2")
    WebElement SportsEventsTittle;

    @FindBy(css = "body > div.usabilla_live_button_container > iframe")
    WebElement FeedbackBut;

    @FindBy(css = "#contents > div.choice.choice_specific")
    WebElement SpecificFeedback;

    @FindBy(css = "#contents > div.choice.choice_general")
    WebElement GeneralFeedback;

    @FindBy(css = "body > div.page-home.bgc-white.cmw > div.page-home__top-stories.backdrop > div > div.section-title.section-title--center > h2")
    WebElement TopStoriesTitle;

    @FindBy(css = "body > div.page-home.bgc-white.cmw > div.breed-feature > div.breed-feature__col.breed-feature__content-col > div > div > div > div.tool-grid__header > div > h2")
    WebElement FindRightBreedTitle;

    @FindBy(css = "body > div.bcpNotificationBar.bcpNotificationBarStickyBottom")
    WebElement BottomBanner;

    @FindBy(css = "body > div.site-footer.cmw > div.page-container > div.site-footer__wrap.site-footer__social.site-footer__wrap--ac.bpm-py3 > div.site-footer__wrap-inner.bpm-flex-shrink-0 > div > div > a:nth-child(4)")
    WebElement FooterIconTikTok;

    @FindBy(css = "body > div.site-footer.cmw > div.page-container > div.site-footer__wrap.site-footer__social.site-footer__wrap--ac.bpm-py3 > div.site-footer__wrap-inner.bpm-flex-shrink-0 > div > div > a:nth-child(1)")
    WebElement FooterIconFB;


    WebDriver driver;

    //Constructor
    public Homepage(WebDriver _driver){
        this.driver = _driver;
        PageFactory.initElements(driver,this);
    }


    private void valid1() {
        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
        }
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.urlContains("https://marketplace.akc.org/"));

    }

    private void valid2() {
        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
        }
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.urlContains("https://shop.akc.org/"));

    }

    private void valid3() {
        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
        }
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.urlContains("https://akc.tv/"));

    }

    private void validAKCTv() {
        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
        }
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.urlContains("https://akc.tv/"));

    }

    private void validroku() {
        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
        }
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.urlContains("https://channelstore.roku.com/"));

    }

    private void validapple() {
        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
        }
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.urlContains("https://apps.apple.com/us/app/akc-tv"));

    }

    private void validamazon() {
        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
        }
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.urlContains("https://www.amazon.com/gp/"));

    }

    private void validmagazine() {
        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
        }
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.urlContains("/products-services/magazines/"));
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");

    }

    private void validbreedofday() {
        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
        }
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.urlContains("akc.org/dog-breeds/"));

    }

    private void validakccanine() {
        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
        }
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.urlContains("https://www.akcchf.org/"));

    }

    private void validarescuenet() {
        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
        }
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.urlContains("akc.org/akc-rescue-network/"));

    }

    private void validakcreunite() {
        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
        }
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.urlContains("akcreunite.org/"));

    }

    private void validhumanefund() {
        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
        }
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.urlContains("akchumanefund.org/"));

    }

    private void validmuseumofdog() {
        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
        }
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.urlContains("museum"));

    }

    private void validprotectrights() {
        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
        }
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.urlContains("akc.org/clubs-delegates/government-relations/"));

    }

    private void validconformation() {
        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
        }
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.urlContains("akc.org/sports/conformation/"));

    }

    private void validobedience() {
        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
        }
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.urlContains("akc.org/sports/obedience/"));

    }

    private void validrally() {
        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
        }
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.urlContains("akc.org/sports/rally/"));

    }

    private void validagility() {
        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
        }
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.urlContains("akc.org/sports/agility/"));

    }

    private void validtracking() {
        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
        }
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.urlContains("akc.org/sports/tracking/"));

    }

    private void validherding() {
        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
        }
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.urlContains("akc.org/sports/herding/"));

    }

    private void validearthdog() {
        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
        }
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.urlContains("akc.org/sports/earthdog/"));

    }

    private void validfieldtrials() {
        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
        }
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.urlContains("akc.org/sports/pointing-breeds/"));

    }

    private void validfastcat() {
        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
        }
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.urlContains("akc.org/sports/coursing/fast-cat/"));

    }

    private void validcoonhound() {
        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
        }
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.urlContains("akc.org/sports/field-events-hounds/coonhound/"));

    }

    private void validscentwork() {
        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
        }
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.urlContains("akc.org/sports/akc-scent-work/"));

    }

    private void validtrickdog() {
        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
        }
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.urlContains("akc.org/sports/trick-dog/about-trick-dog/"));

    }

    private void validhunting() {
        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
        }
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.urlContains("akc.org/sports/field-events-hounds/basset-hound-field-trials/"));

    }

    private void validfarmdog() {
        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
        }
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.urlContains("akc.org/sports/herding/farm-dog-certified-test/"));

    }

    private void validlurecoursing() {
        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
        }
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.urlContains("akc.org/sports/coursing/lure-coursing/"));

    }

    private void validcoursingability() {
        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
        }
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.urlContains("akc.org/sports/coursing/coursing-ability-test/"));

    }

    private void validfindevents() {
        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
        }
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.urlContains("apps.akc.org/apps/event_calendar/"));

    }

    private void validregisterdog() {
        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
        }
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.urlContains("akc.org/register/"));

    }

    private void validPetInsurance() {
        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
        }
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.urlContains("https://www.akcpetinsurance.com/"));

    }


    public void CheckHomepage() throws InterruptedException {  //Video section was removed from CMS on Sprint April0720

        sleep(1000);
        this.akcicon.isDisplayed();
        this.headerhome.isDisplayed();
        this.picthome.isDisplayed();
        this.homepageHeroBreedSearch.isDisplayed();
        this.homepageHeroAside.isDisplayed();
        this.topstories.isDisplayed();
        this.topstory1.isDisplayed();
        this.topstory2.isDisplayed();
        this.topstory3.isDisplayed();
        this.topstory4.isDisplayed();
        this.akctvheader.isDisplayed();
        //this.videoheader.isDisplayed();  This was removed from the HomePage ***
        //this.videotitle1.isDisplayed();
        //this.videotitle2.isDisplayed();
        //this.videotitle3.isDisplayed();
        //this.videotitle4.isDisplayed();
        //this.videoJW.isDisplayed();
        this.articheader.isDisplayed();
        this.breedofday.isDisplayed();
        this.toolheader.isDisplayed();
        this.careheader.isDisplayed();
        this.careimg.isDisplayed();
        this.seheader.isDisplayed();
        this.eventbutton.isDisplayed();
        this.regheader.isDisplayed();
        this.regimg.isDisplayed();
        //this.akcf1.isDisplayed(); //This is available only in Prod*
        this.social.isDisplayed();
        this.footer.isDisplayed();
        this.akcf2.isDisplayed();

    }

    public void Verifytopmenu() {

        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(eventsearch));
        this.findpuppy.isDisplayed();
        this.regdog.isDisplayed();
        this.shop.isDisplayed();
        this.search.isDisplayed();
        this.breeds.isDisplayed();
        this.expadv.isDisplayed();
        this.prodserv.isDisplayed();
        this.sports.isDisplayed();
        this.clubs.isDisplayed();

    }

    public void VerifyAKCAbouticon() { //THIS ICON WAS REMOVED FROM HOMEPAGE

        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(aboutakcicon));
        this.aboutakcicon.click();
        wait.until(ExpectedConditions.visibilityOf(aboutval));

    }

    public void VerifyTrainingicon() {

        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(trainicon));
        this.trainicon.click();
        wait.until(ExpectedConditions.visibilityOf(trainval));

    }

    public void VerifyRegistericon() {

        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(registericon));
        this.registericon.click();
        wait.until(ExpectedConditions.visibilityOf(regisval));

    }

    public void VerifySportsicon() {

        HiddeBanner();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(sportsicon));
        this.sportsicon.click();
        valid2();

    }

    public void VerifyAKCCareicon() {  //THIS ICON WAS REMOVED FROM HOMEPAGE 02/13/21

        HiddeBanner();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(careicon));
        this.careicon.click();
        wait.until(ExpectedConditions.visibilityOf(akccareval));

    }

    public void VerifyFindPuppiesicon() {

        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(findpuppyicon));
        this.findpuppyicon.click();
        valid1();

    }

    public void VerifyShopicon() {

        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(shopicon));
        this.shopicon.click();
        valid2();

    }

    public void VerifyAKCTVicon() {

        HiddeBanner();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(akctvicon));
        this.akctvicon.click();
        valid3();

    }

    public void VerifyPetInsuIcon() {

        HiddeBanner();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(PetInsuIcon));
        this.PetInsuIcon.click();
        validPetInsurance();

    }

    public void UsabillaFeedback() {

        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(FeedbackBut));
        assert(FeedbackBut.isEnabled());
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.cssSelector("body > div.usabilla_live_button_container > iframe")));

    }

    public void SpecificFeedback() {

        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(FeedbackBut));
        this.FeedbackBut.click();
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.cssSelector("body > div.usabilla_scroller_area > iframe")));
        wait.until(ExpectedConditions.visibilityOf(SpecificFeedback));
        this.SpecificFeedback.click();

    }

    public void GeneralFeedback() {

        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(FeedbackBut));
        this.FeedbackBut.click();
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.cssSelector("body > div.usabilla_scroller_area > iframe")));
        wait.until(ExpectedConditions.visibilityOf(GeneralFeedback));
        this.GeneralFeedback.click();

    }

    public void VerifyTopstory1() {

        HiddeBanner();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(topsto1));
        this.topsto1.click();
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");
        wait.until(ExpectedConditions.urlContains("akc.org/"));

    }

    public void VerifyTopstory2() {

        HiddeBanner();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(topsto1));
        this.topsto2.click();
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");
        wait.until(ExpectedConditions.urlContains("akc.org/"));

    }

    public void VerifyTopstory3() {

        HiddeBanner();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(topsto3));
        this.topsto3.click();
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");
        wait.until(ExpectedConditions.urlContains("akc.org/"));

    }

    public void VerifyTopstory4() {

        HiddeBanner();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(topsto4));
        this.topsto4.click();
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");
        wait.until(ExpectedConditions.urlContains("akc.org/"));

    }

    public void VerifyAKCTVideo() {

        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("scroll(0, 1200)");
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("/html[1]/body[1]/div[4]/div[4]/div[1]/div[1]/iframe[1]")));

    }

    public void VerifyAKCTVimg1() {

        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("scroll(0, 1200)");
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("/html[1]/body[1]/div[4]/div[4]/div[1]/div[1]/iframe[1]")));
        this.akctvimg1.click();
        validAKCTv();


    }

    public void VerifyAKCTVimg2() {

        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("scroll(0, 1200)");
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("/html[1]/body[1]/div[4]/div[4]/div[1]/div[1]/iframe[1]")));
        this.akctvimg2.click();
        validroku();

    }

    public void VerifyAKCTVimg3() {

        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("scroll(0, 1200)");
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("/html[1]/body[1]/div[4]/div[4]/div[1]/div[1]/iframe[1]")));
        wait.until(ExpectedConditions.elementToBeClickable(akctvimg3));
        this.akctvimg3.click();
        validapple();

    }

    public void VerifyAKCTVimg4() {

        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("scroll(0, 1200)");
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("/html[1]/body[1]/div[4]/div[4]/div[1]/div[1]/iframe[1]")));
        this.akctvimg4.click();
        validamazon();

    }

    public void VerifyVideo() throws InterruptedException {

        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("scroll(0, 1600);");
        this.videoPreview.isDisplayed();  // To validate JW player issues on preview section*
        this.videosel.isDisplayed();
        sleep(2000);
        this.videosel.click();
        sleep(2000);
        this.videosel.click();

    }

    public void VerifyTrend1() {

        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(trendnews1));
        this.trendnews1.click();
        wait.until(ExpectedConditions.urlContains("akc.org/expert-advice/"));

    }

    public void VerifyTrend2() {

        HiddeBanner();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(trendnews2));
        this.trendnews2.click();
        validmagazine();

    }

    public void VerifyTrend3() {

        HiddeBanner();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(trendnews3));
        this.trendnews3.click();
        wait.until(ExpectedConditions.urlContains("akc.org/expert-advice/"));

    }

    public void VerifyBreedofDay() {

        HiddeBanner();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(bofday));
        this.bofday.click();
        validbreedofday();

    }

    public void VerifyExpBreeds() {

        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("scroll(0,2400);");
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(expbreed));
        this.expbreed.click();
        validbreedofday();

    }

    public void VerifyAKCCanine() {

        HiddeBanner();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(carebut1));
        this.carebut1.click();
        validakccanine();

    }

    public void VerifyRescueNet() {

        HiddeBanner();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(rescnet));
        this.rescnet.click();
        wait.until(ExpectedConditions.elementToBeClickable(rescnetbut));
        this.rescnetbut.click();
        validarescuenet();

    }

    public void VerifyAKCReunite() {

        HiddeBanner();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(akcreun));
        this.akcreun.click();
        wait.until(ExpectedConditions.elementToBeClickable(akcreunbut));
        this.akcreunbut.click();
        validakcreunite();

    }

    public void VerifyHumaneFund() {

        HiddeBanner();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(humanfund));
        this.humanfund.click();
        wait.until(ExpectedConditions.visibilityOf(humanfundbut));
        this.humanfundbut.click();
        validhumanefund();

    }

    public void VerifyMuseumofDog() {

        HiddeBanner();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(museumdog));
        this.museumdog.click();
        wait.until(ExpectedConditions.visibilityOf(museumdogbut));
        this.museumdogbut.click();
        validmuseumofdog();

    }

    public void VerifyProtectRights() {

        HiddeBanner();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(protectrigh));
        this.protectrigh.click();
        wait.until(ExpectedConditions.visibilityOf(protectrightbut));
        this.protectrightbut.click();
        validprotectrights();

    }

    public void VerifyConformation() {

        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(conf));
        this.conf.click();
        validconformation();

    }

    public void VerifyObedience() {

        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(obe));
        this.obe.click();
        validobedience();

    }

    public void VerifyRally() {

        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(ral));
        this.ral.click();
        validrally();

    }

    public void VerifyAgility() {

        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(agi));
        this.agi.click();
        validagility();

    }

    public void VerifyTracking() {

        HiddeBanner();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(sportsarrow));
        this.sportsarrow.click();
        this.track.click();
        validtracking();

    }

    public void VerifyHerding() throws InterruptedException {

        HiddeBanner();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(sportsarrow));
        this.sportsarrow.click();
        sleep(1000);
        this.sportsarrow.click();
        wait.until(ExpectedConditions.visibilityOf(herd));
        this.herd.click();
        validherding();

    }

    public void VerifyEarthDog() throws InterruptedException {

        HiddeBanner();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(sportsarrow));
        this.sportsarrow.click();
        sleep(1000);
        this.sportsarrow.click();
        sleep(1000);
        this.sportsarrow.click();
        sleep(1000);
        this.earthdog.click();
        validearthdog();

    }

    public void VerifyFieldTrials() throws InterruptedException{

        HiddeBanner();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(sportsarrow));
        this.sportsarrow.click();
        sleep(1000);
        this.sportsarrow.click();
        sleep(1000);
        this.sportsarrow.click();
        sleep(1000);
        this.sportsarrow.click();
        sleep(1000);
        this.fieldtri.click();
        validfieldtrials();

    }

    public void VerifyHunting() throws InterruptedException{

        HiddeBanner();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(sportsarrow));
        this.sportsarrow.click();
        sleep(1000);
        this.sportsarrow.click();
        sleep(1000);
        this.sportsarrow.click();
        sleep(1000);
        this.sportsarrow.click();
        sleep(1000);
        this.sportsarrow.click();
        sleep(1000);
        this.hunt.click();
        validhunting();

    }

    public void VerifyFarmDog() throws InterruptedException {

        HiddeBanner();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(sportsarrow));
        this.sportsarrow.click();
        sleep(1000);
        this.sportsarrow.click();
        sleep(1000);
        this.sportsarrow.click();
        sleep(1000);
        this.sportsarrow.click();
        sleep(1000);
        this.sportsarrow.click();
        sleep(1000);
        this.sportsarrow.click();
        sleep(1000);
        this.farmdog.click();
        validfarmdog();

    }

    public void VerifyLureCoursing() throws InterruptedException{

        HiddeBanner();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(sportsarrow));
        this.sportsarrow.click();
        sleep(1000);
        this.sportsarrow.click();
        sleep(1000);
        this.sportsarrow.click();
        sleep(1000);
        this.sportsarrow.click();
        sleep(1000);
        this.sportsarrow.click();
        sleep(1000);
        this.sportsarrow.click();
        sleep(1000);
        this.sportsarrow.click();
        sleep(1000);
        this.lurecours.click();
        validlurecoursing();

    }

    public void VerifyCoursingAbility() throws InterruptedException{

        HiddeBanner();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(sportsarrow));
        this.sportsarrow.click();
        sleep(1000);
        this.sportsarrow.click();
        sleep(1000);
        this.sportsarrow.click();
        sleep(1000);
        this.sportsarrow.click();
        sleep(1000);
        this.sportsarrow.click();
        sleep(1000);
        this.sportsarrow.click();
        sleep(1000);
        this.sportsarrow.click();
        sleep(1000);
        this.sportsarrow.click();
        sleep(1000);
        this.coursabi.click();
        validcoursingability();

    }

    public void VerifyFastCat() throws InterruptedException{

        HiddeBanner();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(sportsarrow));
        this.sportsarrow.click();
        sleep(1000);
        this.sportsarrow.click();
        sleep(1000);
        this.sportsarrow.click();
        sleep(1000);
        this.sportsarrow.click();
        sleep(1000);
        this.sportsarrow.click();
        sleep(1000);
        this.sportsarrow.click();
        sleep(1000);
        this.sportsarrow.click();
        sleep(1000);
        this.sportsarrow.click();
        sleep(1000);
        this.sportsarrow.click();
        sleep(1000);
        this.fastcat.click();
        validfastcat();

    }

    public void VerifyCoounhound() throws InterruptedException{

        HiddeBanner();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(sportsarrow));
        this.sportsarrow.click();
        sleep(1000);
        this.sportsarrow.click();
        sleep(1000);
        this.sportsarrow.click();
        sleep(1000);
        this.sportsarrow.click();
        sleep(1000);
        this.sportsarrow.click();
        sleep(1000);
        this.sportsarrow.click();
        sleep(1000);
        this.sportsarrow.click();
        sleep(1000);
        this.sportsarrow.click();
        sleep(1000);
        this.sportsarrow.click();
        sleep(1000);
        this.sportsarrow.click();
        sleep(1000);
        this.conhound.click();
        validcoonhound();

    }

    public void VerifyScentWork() throws InterruptedException{

        HiddeBanner();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(sportsarrow));
        this.sportsarrow.click();
        sleep(1000);
        this.sportsarrow.click();
        sleep(1000);
        this.sportsarrow.click();
        sleep(1000);
        this.sportsarrow.click();
        sleep(1000);
        this.sportsarrow.click();
        sleep(1000);
        this.sportsarrow.click();
        sleep(1000);
        this.sportsarrow.click();
        sleep(1000);
        this.sportsarrow.click();
        sleep(1000);
        this.sportsarrow.click();
        sleep(1000);
        this.sportsarrow.click();
        sleep(1000);
        this.sportsarrow.click();
        sleep(1000);
        this.scentwork.click();
        validscentwork();

    }

    public void VerifyTrickDog() throws InterruptedException{

        HiddeBanner();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(sportsarrow));
        this.sportsarrow.click();
        sleep(1000);
        this.sportsarrow.click();
        sleep(1000);
        this.sportsarrow.click();
        sleep(1000);
        this.sportsarrow.click();
        sleep(1000);
        this.sportsarrow.click();
        sleep(1000);
        this.sportsarrow.click();
        sleep(1000);
        this.sportsarrow.click();
        sleep(1000);
        this.sportsarrow.click();
        sleep(1000);
        this.sportsarrow.click();
        sleep(1000);
        this.sportsarrow.click();
        sleep(1000);
        this.sportsarrow.click();
        sleep(1000);
        this.sportsarrow.click();
        sleep(1000);
        this.trickdog.click();
        validtrickdog();

    }

    public void VerifyFindEvents() {

        HiddeBanner();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(findevenearbut));
        this.findevenearbut.click();
        validfindevents();

    }

    public void VerifyRegisterDogbut(){

        HiddeBanner();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(regdogbut));
        this.regdogbut.click();
        validregisterdog();

    }


    //Adds Verify & Click solutions

    public void VerifyAdd() {

        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("scroll(0, 1500);");
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(add));

    }

    public void ClickAdd() {

        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("scroll(0, 1800);");
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(add));
        this.add.click();
        ClickOpenAdd();

    }

    public void VerifyAdd1() {

        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("scroll(0, 2000);");
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(add1));

    }

    public void ClickAdd1() {

        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("scroll(0, 2000);");
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(add1));
        this.add1.click();
        ClickOpenAdd();

    }

    public void ClickOpenAdd() {

        for (String winHandle : driver.getWindowHandles()) driver.switchTo().window(winHandle);
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.urlContains("https:"));

    }

    public void ClickFooterTikTok() {

        HiddeBanner();
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.elementToBeClickable(FooterIconTikTok));
        this.FooterIconTikTok.click();
        for (String winHandle : driver.getWindowHandles()) { driver.switchTo().window(winHandle);}
        wait.until(ExpectedConditions.urlContains("https://www.tiktok.com"));

    }

    public void HiddeBanner() {

        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("arguments[0].style.visibility='hidden'", BottomBanner);
    }
}













