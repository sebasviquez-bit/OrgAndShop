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
        wait.until(ExpectedConditions.visibilityOf(img));
        wait.until(ExpectedConditions.visibilityOf(msg));
        wait.until(ExpectedConditions.visibilityOf(apples));
        wait.until(ExpectedConditions.visibilityOf(applesimg));
        wait.until(ExpectedConditions.visibilityOf(yes1));
        wait.until(ExpectedConditions.visibilityOf(no1));
        wait.until(ExpectedConditions.visibilityOf(cheese));
        wait.until(ExpectedConditions.visibilityOf(cheeseimg));
        wait.until(ExpectedConditions.visibilityOf(yes2));
        wait.until(ExpectedConditions.visibilityOf(no2));
        wait.until(ExpectedConditions.visibilityOf(almonds));
        wait.until(ExpectedConditions.visibilityOf(almpondsimg));
        wait.until(ExpectedConditions.visibilityOf(yes3));
        wait.until(ExpectedConditions.visibilityOf(no3));
        wait.until(ExpectedConditions.visibilityOf(carrots));
        wait.until(ExpectedConditions.visibilityOf(carrotsimg));
        wait.until(ExpectedConditions.visibilityOf(yes4));
        wait.until(ExpectedConditions.visibilityOf(no4));
        wait.until(ExpectedConditions.visibilityOf(avoca));
        wait.until(ExpectedConditions.visibilityOf(avocaimg));
        wait.until(ExpectedConditions.visibilityOf(yes5));
        wait.until(ExpectedConditions.visibilityOf(no5));
        wait.until(ExpectedConditions.visibilityOf(grapes));
        wait.until(ExpectedConditions.visibilityOf(grapesimg));
        wait.until(ExpectedConditions.visibilityOf(yes6));
        wait.until(ExpectedConditions.visibilityOf(no6));
        wait.until(ExpectedConditions.visibilityOf(peanut));
        wait.until(ExpectedConditions.visibilityOf(peanutimg));
        wait.until(ExpectedConditions.visibilityOf(yes7));
        wait.until(ExpectedConditions.visibilityOf(no7));
        wait.until(ExpectedConditions.visibilityOf(bananana));
        wait.until(ExpectedConditions.visibilityOf(bananasimg));
        wait.until(ExpectedConditions.visibilityOf(yes8));
        wait.until(ExpectedConditions.visibilityOf(no8));
        wait.until(ExpectedConditions.visibilityOf(tomato));
        wait.until(ExpectedConditions.visibilityOf(tomatoimg));
        wait.until(ExpectedConditions.visibilityOf(yes9));
        wait.until(ExpectedConditions.visibilityOf(no9));
        wait.until(ExpectedConditions.visibilityOf(onions));
        wait.until(ExpectedConditions.visibilityOf(onionsaimg));
        wait.until(ExpectedConditions.visibilityOf(yes10));
        wait.until(ExpectedConditions.visibilityOf(no10));
        wait.until(ExpectedConditions.visibilityOf(pinea));
        wait.until(ExpectedConditions.visibilityOf(pineaimg));
        wait.until(ExpectedConditions.visibilityOf(yes11));
        wait.until(ExpectedConditions.visibilityOf(no11));
        wait.until(ExpectedConditions.visibilityOf(eggs));
        wait.until(ExpectedConditions.visibilityOf(eggsimg));
        wait.until(ExpectedConditions.visibilityOf(yes12));
        wait.until(ExpectedConditions.visibilityOf(no12));
        wait.until(ExpectedConditions.elementToBeClickable(yes1)).click();  //fix this locator
        wait.until(ExpectedConditions.visibilityOf(answer1));
        wait.until(ExpectedConditions.visibilityOf(expla1));
        wait.until(ExpectedConditions.elementToBeClickable(yes2)).click();
        wait.until(ExpectedConditions.visibilityOf(answer2));
        wait.until(ExpectedConditions.visibilityOf(expla2));
        wait.until(ExpectedConditions.elementToBeClickable(yes3)).click();
        wait.until(ExpectedConditions.visibilityOf(answer3));
        wait.until(ExpectedConditions.visibilityOf(expla3));
        wait.until(ExpectedConditions.elementToBeClickable(yes4)).click();
        wait.until(ExpectedConditions.visibilityOf(answer4));
        wait.until(ExpectedConditions.visibilityOf(expla4));
        wait.until(ExpectedConditions.elementToBeClickable(yes5)).click();
        wait.until(ExpectedConditions.elementToBeClickable(answer5)).click();
        wait.until(ExpectedConditions.elementToBeClickable(expla5)).click();
        wait.until(ExpectedConditions.elementToBeClickable(yes6)).click();
        wait.until(ExpectedConditions.visibilityOf(answer6));
        wait.until(ExpectedConditions.visibilityOf(expla6));
        wait.until(ExpectedConditions.elementToBeClickable(yes7)).click();
        wait.until(ExpectedConditions.visibilityOf(answer7));
        wait.until(ExpectedConditions.visibilityOf(expla7));
        wait.until(ExpectedConditions.elementToBeClickable(yes8)).click();
        wait.until(ExpectedConditions.visibilityOf(answer8));
        wait.until(ExpectedConditions.visibilityOf(expla8));
        wait.until(ExpectedConditions.elementToBeClickable(yes9)).click();
        wait.until(ExpectedConditions.visibilityOf(answer9));
        wait.until(ExpectedConditions.visibilityOf(expla9));
        wait.until(ExpectedConditions.elementToBeClickable(yes10)).click();
        wait.until(ExpectedConditions.visibilityOf(answer10));
        wait.until(ExpectedConditions.visibilityOf(expla10));
        wait.until(ExpectedConditions.elementToBeClickable(yes11)).click();
        wait.until(ExpectedConditions.visibilityOf(answer11));
        wait.until(ExpectedConditions.visibilityOf(expla11));
        wait.until(ExpectedConditions.elementToBeClickable(yes12)).click();
        wait.until(ExpectedConditions.visibilityOf(answer11));
        wait.until(ExpectedConditions.visibilityOf(expla12));
        wait.until(ExpectedConditions.visibilityOf(results));
        wait.until(ExpectedConditions.visibilityOf(resultsimg));
        wait.until(ExpectedConditions.visibilityOf(suggestion));

    }

    public void VerifyCanMyDogEat2() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(breedsmenu)).click();
        wait.until(ExpectedConditions.elementToBeClickable(findmatch));
        wait.until(ExpectedConditions.elementToBeClickable(findmatch)).click();
        wait.until(ExpectedConditions.elementToBeClickable(canmydog));
        //HiddeBanner();
        wait.until(ExpectedConditions.elementToBeClickable(canmydog)).click();
        //HiddeBanner();
        wait.until(ExpectedConditions.elementToBeClickable(no1));
        wait.until(ExpectedConditions.elementToBeClickable(no1)).click();
        wait.until(ExpectedConditions.elementToBeClickable(otheranswer1));
        wait.until(ExpectedConditions.elementToBeClickable(no2)).click();
        wait.until(ExpectedConditions.elementToBeClickable(otheranswer2));
        wait.until(ExpectedConditions.elementToBeClickable(no3)).click();
        wait.until(ExpectedConditions.elementToBeClickable(otheranswer3));
        wait.until(ExpectedConditions.elementToBeClickable(no4)).click();
        wait.until(ExpectedConditions.elementToBeClickable(otheranswer4));
        wait.until(ExpectedConditions.elementToBeClickable(no5)).click();
        wait.until(ExpectedConditions.elementToBeClickable(otheranswer5));
        wait.until(ExpectedConditions.elementToBeClickable(no6)).click();
        wait.until(ExpectedConditions.elementToBeClickable(otheranswer6));
        wait.until(ExpectedConditions.elementToBeClickable(no7)).click();
        wait.until(ExpectedConditions.elementToBeClickable(otheranswer7));
        wait.until(ExpectedConditions.elementToBeClickable(no8)).click();
        wait.until(ExpectedConditions.elementToBeClickable(otheranswer8));
        wait.until(ExpectedConditions.elementToBeClickable(no9)).click();
        wait.until(ExpectedConditions.elementToBeClickable(otheranswer9));
        wait.until(ExpectedConditions.elementToBeClickable(no10)).click();
        wait.until(ExpectedConditions.elementToBeClickable(otheranswer10));
        wait.until(ExpectedConditions.elementToBeClickable(no11)).click();
        wait.until(ExpectedConditions.elementToBeClickable(otheranswer11));
        wait.until(ExpectedConditions.elementToBeClickable(no12)).click();
        wait.until(ExpectedConditions.elementToBeClickable(otheranswer12));
        wait.until(ExpectedConditions.visibilityOf(results));
        wait.until(ExpectedConditions.visibilityOf(resultsimg));
        wait.until(ExpectedConditions.visibilityOf(suggestion));

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



