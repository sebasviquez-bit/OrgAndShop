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
        driver = _driver;
        PageFactory.initElements(driver,this);
    }


    public void DogNameVerify() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(dognametool));
        wait.until(ExpectedConditions.elementToBeClickable(dognametool)).click();
        wait.until(ExpectedConditions.visibilityOf(dognameheader));
        wait.until(ExpectedConditions.visibilityOf(male));
        wait.until(ExpectedConditions.visibilityOf(female));
        wait.until(ExpectedConditions.visibilityOf(all));
        wait.until(ExpectedConditions.visibilityOf(a));
        wait.until(ExpectedConditions.visibilityOf(b));
        wait.until(ExpectedConditions.visibilityOf(c));
        wait.until(ExpectedConditions.visibilityOf(d));
        wait.until(ExpectedConditions.visibilityOf(e));
        wait.until(ExpectedConditions.visibilityOf(f));
        wait.until(ExpectedConditions.visibilityOf(g));
        wait.until(ExpectedConditions.visibilityOf(h));
        wait.until(ExpectedConditions.visibilityOf(i));
        wait.until(ExpectedConditions.visibilityOf(j));
        wait.until(ExpectedConditions.visibilityOf(k));
        wait.until(ExpectedConditions.visibilityOf(l));
        wait.until(ExpectedConditions.visibilityOf(m));
        wait.until(ExpectedConditions.visibilityOf(n));
        wait.until(ExpectedConditions.visibilityOf(o));
        wait.until(ExpectedConditions.visibilityOf(p));
        wait.until(ExpectedConditions.visibilityOf(q));
        wait.until(ExpectedConditions.visibilityOf(r));
        wait.until(ExpectedConditions.visibilityOf(s));
        wait.until(ExpectedConditions.visibilityOf(t));
        wait.until(ExpectedConditions.visibilityOf(u));
        wait.until(ExpectedConditions.visibilityOf(v));
        wait.until(ExpectedConditions.visibilityOf(w));
        wait.until(ExpectedConditions.visibilityOf(x));
        wait.until(ExpectedConditions.visibilityOf(y));
        wait.until(ExpectedConditions.visibilityOf(z));
        wait.until(ExpectedConditions.visibilityOf(clear));
        wait.until(ExpectedConditions.visibilityOf(listnamesheader));
        wait.until(ExpectedConditions.visibilityOf(listnames));
        wait.until(ExpectedConditions.visibilityOf(pict));
        wait.until(ExpectedConditions.visibilityOf(box));
        wait.until(ExpectedConditions.visibilityOf(allcat));
        wait.until(ExpectedConditions.visibilityOf(baby));
        wait.until(ExpectedConditions.visibilityOf(celebrity));
        wait.until(ExpectedConditions.visibilityOf(cute));
        wait.until(ExpectedConditions.visibilityOf(disney));
        wait.until(ExpectedConditions.visibilityOf(fancy));
        wait.until(ExpectedConditions.visibilityOf(mostpop));
        wait.until(ExpectedConditions.visibilityOf(presi));
        wait.until(ExpectedConditions.visibilityOf(techy));
        wait.until(ExpectedConditions.visibilityOf(television));
        wait.until(ExpectedConditions.visibilityOf(trendy));
        wait.until(ExpectedConditions.visibilityOf(unisex));
        wait.until(ExpectedConditions.visibilityOf(videogame));
        wait.until(ExpectedConditions.visibilityOf(but1));
        wait.until(ExpectedConditions.visibilityOf(but2));
        wait.until(ExpectedConditions.visibilityOf(but3));
        wait.until(ExpectedConditions.visibilityOf(but4));
        wait.until(ExpectedConditions.visibilityOf(but5));
        wait.until(ExpectedConditions.visibilityOf(but6));
        wait.until(ExpectedConditions.elementToBeClickable(a)).click();
        wait.until(ExpectedConditions.visibilityOf(but3));
        wait.until(ExpectedConditions.elementToBeClickable(b)).click();
        wait.until(ExpectedConditions.visibilityOf(but3));
        wait.until(ExpectedConditions.elementToBeClickable(c)).click();
        wait.until(ExpectedConditions.visibilityOf(but3));
        wait.until(ExpectedConditions.elementToBeClickable(d)).click();
        wait.until(ExpectedConditions.visibilityOf(but2));
        wait.until(ExpectedConditions.elementToBeClickable(e)).click();
        wait.until(ExpectedConditions.elementToBeClickable(f)).click();
        wait.until(ExpectedConditions.elementToBeClickable(g)).click();
        wait.until(ExpectedConditions.visibilityOf(but2));
        wait.until(ExpectedConditions.elementToBeClickable(h)).click();
        wait.until(ExpectedConditions.visibilityOf(but2));
        wait.until(ExpectedConditions.elementToBeClickable(i)).click();
        wait.until(ExpectedConditions.elementToBeClickable(j)).click();
        wait.until(ExpectedConditions.visibilityOf(but2));
        wait.until(ExpectedConditions.elementToBeClickable(k)).click();
        wait.until(ExpectedConditions.visibilityOf(but2));
        wait.until(ExpectedConditions.elementToBeClickable(l)).click();
        wait.until(ExpectedConditions.visibilityOf(but2));
        wait.until(ExpectedConditions.elementToBeClickable(m)).click();
        wait.until(ExpectedConditions.visibilityOf(but3));
        wait.until(ExpectedConditions.elementToBeClickable(n)).click();
        wait.until(ExpectedConditions.elementToBeClickable(o)).click();
        wait.until(ExpectedConditions.elementToBeClickable(p)).click();
        wait.until(ExpectedConditions.elementToBeClickable(q)).click();
        wait.until(ExpectedConditions.elementToBeClickable(r)).click();
        wait.until(ExpectedConditions.visibilityOf(but2));
        wait.until(ExpectedConditions.elementToBeClickable(s)).click();
        wait.until(ExpectedConditions.visibilityOf(but3));
        wait.until(ExpectedConditions.elementToBeClickable(t)).click();
        wait.until(ExpectedConditions.visibilityOf(but2));
        wait.until(ExpectedConditions.elementToBeClickable(u)).click();
        wait.until(ExpectedConditions.elementToBeClickable(v)).click();
        wait.until(ExpectedConditions.elementToBeClickable(w)).click();
        wait.until(ExpectedConditions.elementToBeClickable(x)).click();
        wait.until(ExpectedConditions.elementToBeClickable(y)).click();
        wait.until(ExpectedConditions.elementToBeClickable(z)).click();
        wait.until(ExpectedConditions.elementToBeClickable(clear)).click();
        wait.until(ExpectedConditions.elementToBeClickable(male)).click();
        wait.until(ExpectedConditions.visibilityOf(but6));
        wait.until(ExpectedConditions.elementToBeClickable(female)).click();
        wait.until(ExpectedConditions.visibilityOf(but6));
        wait.until(ExpectedConditions.elementToBeClickable(all)).click();
        wait.until(ExpectedConditions.elementToBeClickable(baby)).click();
        wait.until(ExpectedConditions.visibilityOf(but3));
        wait.until(ExpectedConditions.elementToBeClickable(allcat)).click();
        wait.until(ExpectedConditions.visibilityOf(but6));
        wait.until(ExpectedConditions.elementToBeClickable(celebrity)).click();
        wait.until(ExpectedConditions.visibilityOf(but2));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#sidebar-left-contents > div.mid-blackboard > ul > li:nth-child(4) > a")));
        wait.until(ExpectedConditions.visibilityOf(cute));
        wait.until(ExpectedConditions.elementToBeClickable(cute)).click();
        wait.until(ExpectedConditions.visibilityOf(but3));
        wait.until(ExpectedConditions.elementToBeClickable(disney)).click();
        wait.until(ExpectedConditions.visibilityOf(but4));
        wait.until(ExpectedConditions.elementToBeClickable(fancy)).click();
        wait.until(ExpectedConditions.visibilityOf(but4));
        wait.until(ExpectedConditions.elementToBeClickable(mostpop)).click();
        wait.until(ExpectedConditions.visibilityOf(but3));
        wait.until(ExpectedConditions.elementToBeClickable(presi)).click();
        wait.until(ExpectedConditions.visibilityOf(but3));
        wait.until(ExpectedConditions.elementToBeClickable(techy)).click();
        wait.until(ExpectedConditions.visibilityOf(but2));
        wait.until(ExpectedConditions.elementToBeClickable(television)).click();
        wait.until(ExpectedConditions.visibilityOf(but4));
        wait.until(ExpectedConditions.elementToBeClickable(trendy)).click();
        wait.until(ExpectedConditions.visibilityOf(but3));
        wait.until(ExpectedConditions.elementToBeClickable(unisex)).click();
        wait.until(ExpectedConditions.visibilityOf(but6));
        wait.until(ExpectedConditions.elementToBeClickable(videogame)).click();
        wait.until(ExpectedConditions.visibilityOf(but4));

    }

    //New page tests:

    public void DNFTFindNamesResult() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(ExpertAdvicemenu)).click();
        wait.until(ExpectedConditions.elementToBeClickable(EAmenuDNF));
        Actions action = new Actions(driver);
        action.moveToElement(EAmenuDNF).perform();
        action.moveToElement(EAmenuDNF).click();
        wait.until(ExpectedConditions.elementToBeClickable(EAmenuDNF)).click();
        wait.until(ExpectedConditions.elementToBeClickable(FindNamesButton)).click();
        wait.until(ExpectedConditions.elementToBeClickable(AaronName));

    }

    public void DNFTSearchNames() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(ExpertAdvicemenu)).click();
        wait.until(ExpectedConditions.elementToBeClickable(EAmenuDNF));
        wait.until(ExpectedConditions.elementToBeClickable(EAmenuDNF)).click();
        inputBar.sendKeys("Yoda");
        wait.until(ExpectedConditions.elementToBeClickable(FindNamesButton)).click();
        wait.until(ExpectedConditions.elementToBeClickable(YodaName));

    }

    public void DNFTSurpriceMe() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.navigate().to("https://test-web.akc.org/dog-name-finder/");
        wait.until(ExpectedConditions.elementToBeClickable(SurpriceMeButton)).click();
        wait.until(ExpectedConditions.elementToBeClickable(SurpriceMeNames));

    }

    public void DNFTFilters() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.navigate().to("https://test-web.akc.org/dog-name-finder/");
        wait.until(ExpectedConditions.elementToBeClickable(FilterButton)).click();
        wait.until(ExpectedConditions.elementToBeClickable(LenghtBarFilter)).click();
        wait.until(ExpectedConditions.elementToBeClickable(OneWordFilter)).click();
        wait.until(ExpectedConditions.elementToBeClickable(FindNamesButton)).click();
        wait.until(ExpectedConditions.elementToBeClickable(AlexanderName));

    }

    public void MySavedNames() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.navigate().to("https://test-web.akc.org/dog-name-finder/");
        wait.until(ExpectedConditions.elementToBeClickable(FindNamesButton)).click();
        wait.until(ExpectedConditions.elementToBeClickable(MySavedNamesButton));
        wait.until(ExpectedConditions.elementToBeClickable(MySavedNamesButton)).click();
        userName.sendKeys("sxv@akc.org");
        password.sendKeys("CypresHill2*");
        wait.until(ExpectedConditions.elementToBeClickable(login)).click();
        wait.until(ExpectedConditions.elementToBeClickable(MySavedNamesButton));
        wait.until(ExpectedConditions.elementToBeClickable(MySavedNamesButton)).click();
        wait.until(ExpectedConditions.elementToBeClickable(AaronName));

    }

    public void FavoriteName() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.navigate().to("https://test-web.akc.org/dog-name-finder/");
        wait.until(ExpectedConditions.elementToBeClickable(FindNamesButton)).click();
        wait.until(ExpectedConditions.elementToBeClickable(AaronNameFavoriteIcon));
        wait.until(ExpectedConditions.elementToBeClickable(AaronNameFavoriteIcon)).click();
        userName.sendKeys("sxv@akc.org");
        password.sendKeys("CypresHill2*");
        wait.until(ExpectedConditions.elementToBeClickable(login)).click();
        wait.until(ExpectedConditions.elementToBeClickable(AaronNameFavoriteIcon));
        wait.until(ExpectedConditions.elementToBeClickable(AaronNameFavoriteIcon)).click();
        wait.until(ExpectedConditions.elementToBeClickable(AaronName)).click();

    }


}
