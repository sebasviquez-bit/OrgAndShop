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

public class CanMyDogEat {

    @FindBy(css = "#site-header > div > div.desktop-header > div > div.primary-nav > nav > a:nth-child(1)")
    WebElement breedsmenu;

    @FindBy(css = "#dog-breeds > div:nth-child(2) > div > div > div > ul > li:nth-child(1) > a > div")
    WebElement findmatch;

    @FindBy(css = "#can-my-dog-eat-___\\? > a > strong")
    WebElement canmydog;

    @FindBy(xpath = "//html/body/main/div/section/h1")
    WebElement tittle;

    @FindBy(xpath = "//html/body/main/div/section/div[2]/img")
    WebElement img;

    @FindBy(xpath = "//html/body/main/div/section/p")
    WebElement msg;

    @FindBy(xpath = "//html/body/main/div/section/div[4]/div[1]/span[1]")
    WebElement apples;

    @FindBy(xpath = "//html/body/main/div/section/div[4]/div[1]/img")
    WebElement applesimg;

    @FindBy(xpath = "//html/body/main/div/section/div[5]/div[1]/span[1]")
    WebElement cheese;

    @FindBy(xpath = "//html/body/main/div/section/div[5]/div[1]/img")
    WebElement cheeseimg;

    @FindBy(xpath = "//html/body/main/div/section/div[6]/div[1]/span[1]")
    WebElement almonds;

    @FindBy(xpath = "//html/body/main/div/section/div[6]/div[1]/img")
    WebElement almpondsimg;

    @FindBy(xpath = "//html/body/main/div/section/div[7]/div[1]/span[1]")
    WebElement carrots;

    @FindBy(xpath = "//html/body/main/div/section/div[7]/div[1]/img")
    WebElement carrotsimg;

    @FindBy(xpath = "//html/body/main/div/section/div[8]/div[1]/span[1]")
    WebElement avoca;

    @FindBy(xpath = "//html/body/main/div/section/div[8]/div[1]/img")
    WebElement avocaimg;

    @FindBy(xpath = "//html/body/main/div/section/div[9]/div[1]/span[1]")
    WebElement grapes;

    @FindBy(xpath = "//html/body/main/div/section/div[9]/div[1]/img")
    WebElement grapesimg;

    @FindBy(xpath = "//html/body/main/div/section/div[10]/div[1]/span[1]")
    WebElement peanut;

    @FindBy(xpath = "//html/body/main/div/section/div[10]/div[1]/img")
    WebElement peanutimg;

    @FindBy(xpath = "//html/body/main/div/section/div[11]/div[1]/span[1]")
    WebElement bananana;

    @FindBy(xpath = "//html/body/main/div/section/div[11]/div[1]/img")
    WebElement bananasimg;

    @FindBy(xpath = "//html/body/main/div/section/div[12]/div[1]/span[1]")
    WebElement tomato;

    @FindBy(xpath = "//html/body/main/div/section/div[12]/div[1]/img")
    WebElement tomatoimg;

    @FindBy(xpath = "//html/body/main/div/section/div[13]/div[1]/span[1]")
    WebElement onions;

    @FindBy(xpath = "//html/body/main/div/section/div[13]/div[1]/img")
    WebElement onionsaimg;

    @FindBy(xpath = "//html/body/main/div/section/div[14]/div[1]/span[1]")
    WebElement pinea;

    @FindBy(xpath = "//html/body/main/div/section/div[14]/div[1]/img")
    WebElement pineaimg;

    @FindBy(xpath = "//html/body/main/div/section/div[15]/div[1]/span[1]")
    WebElement eggs;

    @FindBy(xpath = "//html/body/main/div/section/div[15]/div[1]/img")
    WebElement eggsimg;

    @FindBy(xpath = "//html/body/main/div/section/div[4]/a[1]")
    WebElement yes1;

    @FindBy(css = "#content > div:nth-child(9) > a.no-answer.incorrect")
    WebElement no1;

    @FindBy(xpath = "//html/body/main/div/section/div[5]/a[1]")
    WebElement yes2;

    @FindBy(xpath = "//html/body/main/div/section/div[5]/a[2]")
    WebElement no2;

    @FindBy(xpath = "//html/body/main/div/section/div[6]/a[1]")
    WebElement yes3;

    @FindBy(xpath = "//html/body/main/div/section/div[6]/a[2]")
    WebElement no3;

    @FindBy(xpath = "//html/body/main/div/section/div[7]/a[1]")
    WebElement yes4;

    @FindBy(xpath = "//html/body/main/div/section/div[7]/a[2]")
    WebElement no4;

    @FindBy(xpath = "//html/body/main/div/section/div[8]/a[1]")
    WebElement yes5;

    @FindBy(xpath = "//html/body/main/div/section/div[8]/a[2]")
    WebElement no5;

    @FindBy(xpath = "//html/body/main/div/section/div[9]/a[1]")
    WebElement yes6;

    @FindBy(xpath = "//html/body/main/div/section/div[9]/a[2]")
    WebElement no6;

    @FindBy(xpath = "//html/body/main/div/section/div[10]/a[1]")
    WebElement yes7;

    @FindBy(xpath = "//html/body/main/div/section/div[10]/a[2]")
    WebElement no7;

    @FindBy(xpath = "//html/body/main/div/section/div[11]/a[1]")
    WebElement yes8;

    @FindBy(xpath = "//html/body/main/div/section/div[11]/a[2]")
    WebElement no8;

    @FindBy(xpath = "//html/body/main/div/section/div[12]/a[1]")
    WebElement yes9;

    @FindBy(xpath = "//html/body/main/div/section/div[12]/a[2]")
    WebElement no9;

    @FindBy(xpath = "//html/body/main/div/section/div[13]/a[1]")
    WebElement yes10;

    @FindBy(xpath = "//html/body/main/div/section/div[13]/a[2]")
    WebElement no10;

    @FindBy(xpath = "//html/body/main/div/section/div[14]/a[1]")
    WebElement yes11;

    @FindBy(xpath = "//html/body/main/div/section/div[14]/a[2]")
    WebElement no11;

    @FindBy(xpath = "//html/body/main/div/section/div[15]/a[1]")
    WebElement yes12;

    @FindBy(xpath = "//html/body/main/div/section/div[15]/a[2]")
    WebElement no12;

    @FindBy(xpath = "//html/body/main/div/section/div[4]/div[1]/span[2]")
    WebElement answer1;

    @FindBy(xpath = "//html/body/main/div/section/div[4]/div[2]/span")
    WebElement expla1;

    @FindBy(xpath = "//html/body/main/div/section/div[5]/div[1]/span[2]")
    WebElement answer2;

    @FindBy(xpath = "//html/body/main/div/section/div[5]/div[2]/span")
    WebElement expla2;

    @FindBy(xpath = "//html/body/main/div/section/div[6]/div[1]/span[3]")
    WebElement answer3;

    @FindBy(xpath = "//html/body/main/div/section/div[6]/div[2]/span")
    WebElement expla3;

    @FindBy(xpath = "//html/body/main/div/section/div[7]/div[1]/span[2]")
    WebElement answer4;

    @FindBy(xpath = "//html/body/main/div/section/div[7]/div[2]/span")
    WebElement expla4;

    @FindBy(xpath = "//html/body/main/div/section/div[8]/div[1]/span[3]")
    WebElement answer5;

    @FindBy(xpath = "//html/body/main/div/section/div[8]/div[2]/span")
    WebElement expla5;

    @FindBy(xpath = "//html/body/main/div/section/div[9]/div[1]/span[3]")
    WebElement answer6;

    @FindBy(xpath = "//html/body/main/div/section/div[9]/div[2]/span")
    WebElement expla6;

    @FindBy(xpath = "//html/body/main/div/section/div[10]/div[1]/span[2]")
    WebElement answer7;

    @FindBy(xpath = "//html/body/main/div/section/div[10]/div[2]/span")
    WebElement expla7;

    @FindBy(xpath = "//html/body/main/div/section/div[11]/div[1]/span[2]")
    WebElement answer8;

    @FindBy(xpath = "//html/body/main/div/section/div[11]/div[2]/span")
    WebElement expla8;

    @FindBy(xpath = "//html/body/main/div/section/div[12]/div[1]/span[2]")
    WebElement answer9;

    @FindBy(xpath = "//html/body/main/div/section/div[12]/div[2]/span")
    WebElement expla9;

    @FindBy(xpath = "//html/body/main/div/section/div[13]/div[1]/span[3]")
    WebElement answer10;

    @FindBy(xpath = "//html/body/main/div/section/div[13]/div[2]/span")
    WebElement expla10;

    @FindBy(xpath = "//html/body/main/div/section/div[14]/div[1]/span[2]")
    WebElement answer11;

    @FindBy(xpath = "//html/body/main/div/section/div[14]/div[2]/span")
    WebElement expla11;

    @FindBy(xpath = "//html/body/main/div/section/div[15]/div[1]/span[2]")
    WebElement answer12;

    @FindBy(xpath = "//html/body/main/div/section/div[15]/div[2]/span")
    WebElement expla12;

    @FindBy(xpath = "//html/body/main/div/section/div[4]/div[1]/span[3]")
    WebElement otheranswer1;

    @FindBy(xpath = "//html/body/main/div/section/div[5]/div[1]/span[3]")
    WebElement otheranswer2;

    @FindBy(xpath = "//html/body/main/div/section/div[6]/div[1]/span[2]")
    WebElement otheranswer3;

    @FindBy(xpath = "//html/body/main/div/section/div[7]/div[1]/span[3]")
    WebElement otheranswer4;

    @FindBy(xpath = "//html/body/main/div/section/div[8]/div[1]/span[2]")
    WebElement otheranswer5;

    @FindBy(xpath = "//html/body/main/div/section/div[9]/div[1]/span[2]")
    WebElement otheranswer6;

    @FindBy(xpath = "//html/body/main/div/section/div[10]/div[1]/span[3]")
    WebElement otheranswer7;

    @FindBy(xpath = "//html/body/main/div/section/div[11]/div[1]/span[3]")
    WebElement otheranswer8;

    @FindBy(xpath = "//html/body/main/div/section/div[12]/div[1]/span[3]")
    WebElement otheranswer9;

    @FindBy(xpath = "//html/body/main/div/section/div[13]/div[1]/span[2]")
    WebElement otheranswer10;

    @FindBy(xpath = "//html/body/main/div/section/div[14]/div[1]/span[3]")
    WebElement otheranswer11;

    @FindBy(xpath = "//html/body/main/div/section/div[15]/div[1]/span[3]")
    WebElement otheranswer12;

    @FindBy(xpath = "//html/body/main/div/section/div[16]/div[1]/h3")
    WebElement results;

    @FindBy(xpath = "//html/body/main/div/section/div[16]/div[2]/p[2]")
    WebElement suggestion;

    @FindBy(xpath = "//html/body/main/div/section/div[16]/div[1]/img")
    WebElement resultsimg;

    @FindBy(css = "#a268951c-b028-44ad-99ed-5af71765e083")
    WebElement BottomBanner;

    @FindBy(css = "body > div.fancybox-overlay.fancybox-overlay-fixed > div > div > a.fancybox-item.fancybox-close")
    WebElement PupUpBanner;

    WebDriver driver;

    // Constructor
    public CanMyDogEat(WebDriver _driver) {
        driver = _driver;
        PageFactory.initElements(driver, this);


    }


    public void VerifyCanMyDogEat1() {

        //HideBanner1();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(breedsmenu)).click();
        wait.until(ExpectedConditions.elementToBeClickable(findmatch)).click();
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("scroll(0, 800);");
        wait.until(ExpectedConditions.elementToBeClickable(canmydog));
        wait.until(ExpectedConditions.visibilityOf(tittle));
        img.isDisplayed();
        msg.isDisplayed();
        apples.isDisplayed();
        applesimg.isDisplayed();
        yes1.isDisplayed();
        no1.isDisplayed();
        cheese.isDisplayed();
        cheeseimg.isDisplayed();
        yes2.isDisplayed();
        no2.isDisplayed();
        almonds.isDisplayed();
        almpondsimg.isDisplayed();
        yes3.isDisplayed();
        no3.isDisplayed();
        carrots.isDisplayed();
        carrotsimg.isDisplayed();
        yes4.isDisplayed();
        no4.isDisplayed();
        avoca.isDisplayed();
        avocaimg.isDisplayed();
        yes5.isDisplayed();
        no5.isDisplayed();
        grapes.isDisplayed();
        grapesimg.isDisplayed();
        yes6.isDisplayed();
        no6.isDisplayed();
        peanut.isDisplayed();
        peanutimg.isDisplayed();
        yes7.isDisplayed();
        no7.isDisplayed();
        bananana.isDisplayed();
        bananasimg.isDisplayed();
        yes8.isDisplayed();
        no8.isDisplayed();
        tomato.isDisplayed();
        tomatoimg.isDisplayed();
        yes9.isDisplayed();
        no9.isDisplayed();
        onions.isDisplayed();
        onionsaimg.isDisplayed();
        yes10.isDisplayed();
        no10.isDisplayed();
        pinea.isDisplayed();
        pineaimg.isDisplayed();
        yes11.isDisplayed();
        no11.isDisplayed();
        eggs.isDisplayed();
        eggsimg.isDisplayed();
        yes12.isDisplayed();
        no12.isDisplayed();
        yes1.click();  //fix this locator
        answer1.isDisplayed();
        expla1.isDisplayed();
        yes2.click();
        answer2.isDisplayed();
        expla2.isDisplayed();
        yes3.click();
        answer3.isDisplayed();
        expla3.isDisplayed();
        yes4.click();
        answer4.isDisplayed();
        expla4.isDisplayed();
        yes5.click();
        answer5.click();
        expla5.click();
        yes6.click();
        answer6.isDisplayed();
        expla6.isDisplayed();
        yes7.click();
        answer7.isDisplayed();
        expla7.isDisplayed();
        yes8.click();
        answer8.isDisplayed();
        expla8.isDisplayed();
        yes9.click();
        answer9.isDisplayed();
        expla9.isDisplayed();
        yes10.click();
        answer10.isDisplayed();
        expla10.isDisplayed();
        yes11.click();
        answer11.isDisplayed();
        expla11.isDisplayed();
        yes12.click();
        answer11.isDisplayed();
        expla12.isDisplayed();
        results.isDisplayed();
        resultsimg.isDisplayed();
        suggestion.isDisplayed();

    }

    public void VerifyCanMyDogEat2() {


        breedsmenu.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(findmatch));
        findmatch.click();
        wait.until(ExpectedConditions.elementToBeClickable(canmydog));
        //HiddeBanner();
        canmydog.click();
        //HiddeBanner();
        wait.until(ExpectedConditions.elementToBeClickable(no1));
        no1.click();
        wait.until(ExpectedConditions.elementToBeClickable(otheranswer1));
        no2.click();
        wait.until(ExpectedConditions.elementToBeClickable(otheranswer2));
        no3.click();
        wait.until(ExpectedConditions.elementToBeClickable(otheranswer3));
        no4.click();
        wait.until(ExpectedConditions.elementToBeClickable(otheranswer4));
        no5.click();
        wait.until(ExpectedConditions.elementToBeClickable(otheranswer5));
        no6.click();
        wait.until(ExpectedConditions.elementToBeClickable(otheranswer6));
        no7.click();
        wait.until(ExpectedConditions.elementToBeClickable(otheranswer7));
        no8.click();
        wait.until(ExpectedConditions.elementToBeClickable(otheranswer8));
        no9.click();
        wait.until(ExpectedConditions.elementToBeClickable(otheranswer9));
        no10.click();
        wait.until(ExpectedConditions.elementToBeClickable(otheranswer10));
        no11.click();
        wait.until(ExpectedConditions.elementToBeClickable(otheranswer11));
        no12.click();
        wait.until(ExpectedConditions.elementToBeClickable(otheranswer12));
        results.isDisplayed();
        resultsimg.isDisplayed();
        suggestion.isDisplayed();

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



