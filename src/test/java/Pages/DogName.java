package Pages;
import Helpers.DriverHelper;
import Model.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DogName {


    @FindBy(css = "#site-header > div > div.desktop-header > div > div.primary-nav > nav > a:nth-child(2)")
    WebElement ExpertAdvicemenu;

    @FindBy(css = "#expert-advice > div:nth-child(3) > div > div > div > ul > li:nth-child(2) > a")
    WebElement EAmenuDNF;

    @FindBy(css = "body > div.page-home.bgc-white.cmw > div.breed-feature > div.breed-feature__wrapper > div.breed-feature__col.breed-feature__content-col > div > div > div > div.tool-grid__wrap > div:nth-child(4) > a")
    WebElement dognametool;

    @FindBy(xpath = "//html/body/main/div/section/div[1]/h2[2]")
    WebElement dognameheader;

    @FindBy(xpath = "//html/body/main/div/section/div[1]/form/div[1]/label[1]")
    WebElement male;

    @FindBy(xpath = "//html/body/main/div/section/div[1]/form/div[1]/label[2]")
    WebElement female;

    @FindBy(xpath = "//html/body/main/div/section/div[1]/form/div[1]/label[3]")
    WebElement all;

    @FindBy(xpath = "//html/body/main/div/section/div[1]/form/div[2]/div[1]/label")
    WebElement a;

    @FindBy(xpath = "//html/body/main/div/section/div[1]/form/div[2]/div[2]/label")
    WebElement b;

    @FindBy(xpath = "//html/body/main/div/section/div[1]/form/div[2]/div[3]/label")
    WebElement c;

    @FindBy(xpath = "//html/body/main/div/section/div[1]/form/div[2]/div[4]/label")
    WebElement d;

    @FindBy(xpath = "//html/body/main/div/section/div[1]/form/div[2]/div[5]/label")
    WebElement e;

    @FindBy(xpath = "//html/body/main/div/section/div[1]/form/div[2]/div[6]/label")
    WebElement f;

    @FindBy(xpath = "//html/body/main/div/section/div[1]/form/div[2]/div[7]/label")
    WebElement g;

    @FindBy(xpath = "//html/body/main/div/section/div[1]/form/div[2]/div[8]/label")
    WebElement h;

    @FindBy(xpath = "//html/body/main/div/section/div[1]/form/div[2]/div[9]/label")
    WebElement i;

    @FindBy(xpath = "//html/body/main/div/section/div[1]/form/div[2]/div[10]/label")
    WebElement j;

    @FindBy(xpath = "//html/body/main/div/section/div[1]/form/div[2]/div[11]/label")
    WebElement k;

    @FindBy(xpath = "//html/body/main/div/section/div[1]/form/div[2]/div[12]/label")
    WebElement l;

    @FindBy(xpath = "//html/body/main/div/section/div[1]/form/div[2]/div[13]/label")
    WebElement m;

    @FindBy(xpath = "//html/body/main/div/section/div[1]/form/div[2]/div[14]/label")
    WebElement n;

    @FindBy(xpath = "//html/body/main/div/section/div[1]/form/div[2]/div[15]/label")
    WebElement o;

    @FindBy(xpath = "//html/body/main/div/section/div[1]/form/div[2]/div[16]/label")
    WebElement p;

    @FindBy(xpath = "//html/body/main/div/section/div[1]/form/div[2]/div[17]/label")
    WebElement q;

    @FindBy(xpath = "//html/body/main/div/section/div[1]/form/div[2]/div[18]/label")
    WebElement r;

    @FindBy(xpath = "//html/body/main/div/section/div[1]/form/div[2]/div[19]/label")
    WebElement s;

    @FindBy(xpath = "//html/body/main/div/section/div[1]/form/div[2]/div[20]/label")
    WebElement t;

    @FindBy(xpath = "//html/body/main/div/section/div[1]/form/div[2]/div[21]/label")
    WebElement u;

    @FindBy(xpath = "//html/body/main/div/section/div[1]/form/div[2]/div[22]/label")
    WebElement v;

    @FindBy(xpath = "//html/body/main/div/section/div[1]/form/div[2]/div[23]/label")
    WebElement w;

    @FindBy(xpath = "//html/body/main/div/section/div[1]/form/div[2]/div[24]/label")
    WebElement x;

    @FindBy(xpath = "//html/body/main/div/section/div[1]/form/div[2]/div[25]/label")
    WebElement y;

    @FindBy(xpath = "//html/body/main/div/section/div[1]/form/div[2]/div[26]/label")
    WebElement z;

    @FindBy(xpath = "//*[@id=\"reset\"]")
    WebElement clear;

    @FindBy(xpath = "//html/body/main/div/section/div[3]/h1")
    WebElement listnamesheader;

    @FindBy(xpath = "//html/body/main/div/section/div[4]/div/ul")
    WebElement listnames;

    @FindBy(xpath = "//html/body/main/div/aside[1]/div/div[1]")
    WebElement pict;

    @FindBy(xpath = "//html/body/main/div/aside[1]/div/div[4]")
    WebElement box;

    @FindBy(xpath = "//html/body/main/div/aside[1]/div/div[4]/ul/li[1]/a")
    WebElement allcat;

    @FindBy(xpath = "//html/body/main/div/aside[1]/div/div[4]/ul/li[2]/a")
    WebElement baby;

    @FindBy(xpath = "//html/body/main/div/aside[1]/div/div[4]/ul/li[3]/a")
    WebElement celebrity;

    @FindBy(css = "#sidebar-left-contents > div.mid-blackboard > ul > li:nth-child(4) > a")
    WebElement cute;

    @FindBy(xpath = "//html/body/main/div/aside[1]/div/div[4]/ul/li[5]/a")
    WebElement disney;

    @FindBy(xpath = "//html/body/main/div/aside[1]/div/div[4]/ul/li[6]/a")
    WebElement fancy;

    @FindBy(xpath = "//html/body/main/div/aside[1]/div/div[4]/ul/li[7]/a")
    WebElement mostpop;

    @FindBy(xpath = "//html/body/main/div/aside[1]/div/div[4]/ul/li[8]/a")
    WebElement presi;

    @FindBy(xpath = "//html/body/main/div/aside[1]/div/div[4]/ul/li[9]/a")
    WebElement techy;

    @FindBy(xpath = "//html/body/main/div/aside[1]/div/div[4]/ul/li[10]/a")
    WebElement television;

    @FindBy(xpath = "//html/body/main/div/aside[1]/div/div[4]/ul/li[11]/a")
    WebElement trendy;

    @FindBy(xpath = "//html/body/main/div/aside[1]/div/div[4]/ul/li[12]/a")
    WebElement unisex;

    @FindBy(xpath = "//html/body/main/div/aside[1]/div/div[4]/ul/li[13]/a")
    WebElement videogame;

    @FindBy(xpath = "//html/body/main/div/section/div[4]/ul/li[1]/button")
    WebElement but1;

    @FindBy(xpath = "//html/body/main/div/section/div[4]/ul/li[2]/button")
    WebElement but2;

    @FindBy(xpath = "//html/body/main/div/section/div[4]/ul/li[3]/button")
    WebElement but3;

    @FindBy(xpath = "//html/body/main/div/section/div[4]/ul/li[4]/button")
    WebElement but4;

    @FindBy(xpath = "//html/body/main/div/section/div[4]/ul/li[5]/button")
    WebElement but5;

    @FindBy(xpath = "//html/body/main/div/section/div[4]/ul/li[6]/button")
    WebElement but6;


    //New locators


    @FindBy(css = "body > main > div > div.dog-name-archive__hero > div > h1")
    WebElement pageTitle;

    @FindBy(css = "#react-select-2-input")
    WebElement inputBar;

    @FindBy(css = "body > main > div > div.dog-name-archive__hero > div > div.dog-name-archive__search > form > button.dog-name-archive__search__box__filter-button")
    WebElement FilterButton;

    @FindBy(css = "body > main > div > div.dog-name-archive__hero > div > div.dog-name-archive__search > form > div.dog-name-archive__search__box__filters.dog-name-archive__search__box__filters--show > div:nth-child(1) > div:nth-child(2) > label > span.checkbox__visual-input")
    WebElement OneWordFilter;

    @FindBy(css = "body > main > div > div.dog-name-archive__hero > div > div.dog-name-archive__search > form > div.dog-name-archive__search__box__filters.dog-name-archive__search__box__filters--show > div.dog-name-archive__search__box__filter.dog-name-archive__search__box__filter--length > input[type=range]")
    WebElement LenghtBarFilter;

    @FindBy(css = "body > main > div > div.dog-name-archive__hero > div > div.dog-name-archive__search > form > button.button.dog-name-archive__search__box__submit")
    WebElement FindNamesButton;

    @FindBy(css = "body > main > div > form > div.dog-name-archive__results__items > div > ul > li:nth-child(1) > a")
    WebElement AaronName;

    @FindBy(css = "body > main > div > form > div.dog-name-archive__results__items > div > ul > li > a > p")
    WebElement YodaName;


    @FindBy(css = "body > main > div > form > div.dog-name-archive__results__items > div > ul > li:nth-child(1) > a > p")
    WebElement AlexanderName;
    //

    @FindBy(css = "body > main > div > div.dog-name-archive__hero > div > div.dog-name-archive__search > a")
    WebElement SurpriceMeButton;

    @FindBy(css = "body > main > div > form > h2")
    WebElement SurpriceMeNames;


    @FindBy(css = "body > main > div > div.dog-name-archive__section.dog-name-archive__search-by-category > div.dog-name-archive__search-by-category__categories-wrap > form > div > div:nth-child(2)")
    WebElement PupolarOption;

    @FindBy(css = "body > main > div > div.dog-name-archive__section.dog-name-archive__search-by-category > div.dog-name-archive__search-by-category__categories-wrap > form > button")
    WebElement GenerateNamesButton;

    @FindBy(css = "body > main > div > div.dog-name-archive__section.dog-name-archive__search-by-category > div.dog-name-archive__search-by-category__pupdate > div > form > div > input")
    WebElement PupDateEmailInput;

    @FindBy(css = "body > main > div > form > div.dog-name-archive__results__bottom-menus > a")
    WebElement MySavedNamesButton;

    @FindBy(css = "body > main > div > form > div.dog-name-archive__results__bottom-menus > a")
    WebElement AaronNameFavoriteIcon;

    @FindBy(css = "body > main > div > div.dog-name-archive__details-overlay > div > div.dog-name-archive__details__buttons > div > a")
    WebElement SaveToListButton;

    @FindBy(css = "body > main > div > div.dog-name-archive__details-overlay > div > div.dog-name-archive__details__buttons > div > a.button.button--small.dog-name-archive__details__button.dog-name-archive__details__button--saved > svg")
    WebElement SavedToYourList;

    @FindBy(xpath = "//*[@id=\"gigya-login-form\"]/div[1]/div[3]/input")
    WebElement userName;

    @FindBy(xpath = "//*[@id=\"gigya-login-form\"]/div[1]/div[4]/input")
    WebElement password;

    @FindBy(xpath = "//*[@id=\"gigya-login-form\"]/div[3]/div/input")
    WebElement login;



    DriverHelper driverHelper;

    WebDriver driver;

    // Constructor
    public DogName(WebDriver _driver){
        this.driver = _driver;
        PageFactory.initElements(driver,this);
    }


    public void DogNameVerify() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(dognametool));
        this.dognametool.click();
        wait.until(ExpectedConditions.visibilityOf(dognameheader));
        this.male.isDisplayed();
        this.female.isDisplayed();
        this.all.isDisplayed();
        this.a.isDisplayed();
        this.b.isDisplayed();
        this.c.isDisplayed();
        this.d.isDisplayed();
        this.e.isDisplayed();
        this.f.isDisplayed();
        this.g.isDisplayed();
        this.h.isDisplayed();
        this.i.isDisplayed();
        this.j.isDisplayed();
        this.k.isDisplayed();
        this.l.isDisplayed();
        this.m.isDisplayed();
        this.n.isDisplayed();
        this.o.isDisplayed();
        this.p.isDisplayed();
        this.q.isDisplayed();
        this.r.isDisplayed();
        this.s.isDisplayed();
        this.t.isDisplayed();
        this.u.isDisplayed();
        this.v.isDisplayed();
        this.w.isDisplayed();
        this.x.isDisplayed();
        this.y.isDisplayed();
        this.z.isDisplayed();
        this.clear.isDisplayed();
        this.listnamesheader.isDisplayed();
        this.listnames.isDisplayed();
        this.pict.isDisplayed();
        this.box.isDisplayed();
        this.allcat.isDisplayed();
        this.baby.isDisplayed();
        this.celebrity.isDisplayed();
        this.cute.isDisplayed();
        this.disney.isDisplayed();
        this.fancy.isDisplayed();
        this.mostpop.isDisplayed();
        this.presi.isDisplayed();
        this.techy.isDisplayed();
        this.television.isDisplayed();
        this.trendy.isDisplayed();
        this.unisex.isDisplayed();
        this.videogame.isDisplayed();
        this.but1.isDisplayed();
        this.but2.isDisplayed();
        this.but3.isDisplayed();
        this.but4.isDisplayed();
        this.but5.isDisplayed();
        this.but6.isDisplayed();
        this.a.click();
        this.but3.isDisplayed();
        this.b.click();
        this.but3.isDisplayed();
        this.c.click();
        this.but3.isDisplayed();
        this.d.click();
        this.but2.isDisplayed();
        this.e.click();
        this.f.click();
        this.g.click();
        this.but2.isDisplayed();
        this.h.click();
        this.but2.isDisplayed();
        this.i.click();
        this.j.click();
        this.but2.isDisplayed();
        this.k.click();
        this.but2.isDisplayed();
        this.l.click();
        this.but2.isDisplayed();
        this.m.click();
        this.but3.isDisplayed();
        this.n.click();
        this.o.click();
        this.p.click();
        this.q.click();
        this.r.click();
        this.but2.isDisplayed();
        this.s.click();
        this.but3.isDisplayed();
        this.t.click();
        this.but2.isDisplayed();
        this.u.click();
        this.v.click();
        this.w.click();
        this.x.click();
        this.y.click();
        this.z.click();
        this.clear.click();
        this.male.click();
        this.but6.isDisplayed();
        this.female.click();
        this.but6.isDisplayed();
        this.all.click();
        this.baby.click();
        this.but3.isDisplayed();
        this.allcat.click();
        this.but6.isDisplayed();
        this.celebrity.click();
        this.but2.isDisplayed();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#sidebar-left-contents > div.mid-blackboard > ul > li:nth-child(4) > a")));
        this.cute.isDisplayed();
        this.cute.click();
        this.but3.isDisplayed();
        this.disney.click();
        this.but4.isDisplayed();
        this.fancy.click();
        this.but4.isDisplayed();
        this.mostpop.click();
        this.but3.isDisplayed();
        this.presi.click();
        this.but3.isDisplayed();
        this.techy.click();
        this.but2.isDisplayed();
        this.television.click();
        this.but4.isDisplayed();
        this.trendy.click();
        this.but3.isDisplayed();
        this.unisex.click();
        this.but6.isDisplayed();
        this.videogame.click();
        this.but4.isDisplayed();

    }

    //New page tests:

    public void DNFTFindNamesResult() {

        ExpertAdvicemenu.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(EAmenuDNF));
        Actions action = new Actions(this.driver);
        action.moveToElement(EAmenuDNF).perform();
        action.moveToElement(EAmenuDNF).click();
        this.EAmenuDNF.click();
        this.FindNamesButton.click();
        wait.until(ExpectedConditions.elementToBeClickable(AaronName));

    }

    public void DNFTSearchNames() {

        this.ExpertAdvicemenu.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(EAmenuDNF));
        this.EAmenuDNF.click();
        this.inputBar.sendKeys("Yoda");
        this.FindNamesButton.click();
        wait.until(ExpectedConditions.elementToBeClickable(YodaName));

    }

    public void DNFTSurpriceMe() {

        driver.navigate().to("https://test-web.akc.org/dog-name-finder/");
        this.SurpriceMeButton.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(SurpriceMeNames));

    }

    public void DNFTFilters() {

        driver.navigate().to("https://test-web.akc.org/dog-name-finder/");
        this.FilterButton.click();
        this.LenghtBarFilter.click();
        this.OneWordFilter.click();
        this.FindNamesButton.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(AlexanderName));

    }

    public void MySavedNames() {

        driver.navigate().to("https://test-web.akc.org/dog-name-finder/");
        this.FindNamesButton.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(MySavedNamesButton));
        this.MySavedNamesButton.click();
        this.userName.sendKeys("sxv@akc.org");
        this.password.sendKeys("CypresHill2*");
        this.login.click();
        wait.until(ExpectedConditions.elementToBeClickable(MySavedNamesButton));
        this.MySavedNamesButton.click();
        wait.until(ExpectedConditions.elementToBeClickable(AaronName));

    }

    public void FavoriteName() {

        driver.navigate().to("https://test-web.akc.org/dog-name-finder/");
        this.FindNamesButton.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(AaronNameFavoriteIcon));
        this.AaronNameFavoriteIcon.click();
        this.userName.sendKeys("sxv@akc.org");
        this.password.sendKeys("CypresHill2*");
        this.login.click();
        wait.until(ExpectedConditions.elementToBeClickable(AaronNameFavoriteIcon));
        this.AaronNameFavoriteIcon.click();
        this.AaronName.click();

    }


}
