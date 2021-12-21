package ShopPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ShopGroomingWellness {

    @FindBy(css = "#menu-bar > ul > li.grooming-wellness > a")
    WebElement GromingWellnessMenu;

    @FindBy(css = "#collection-header > div.content > div > h1")
    WebElement GromingWellnessTitle;

    @FindBy(css = "#grooming-wellness-side-nav")
    WebElement GromingWellnessSideNav;

    @FindBy(css = "#grooming-wellness-grooming > li:nth-child(1) > a")
    WebElement Grooming;

    @FindBy(css = "#collection-header > div.content > div > h1")
    WebElement GroomingTitle;

    @FindBy(css = "#grooming-wellness-wellness > li:nth-child(1) > a")
    WebElement Wellness;

    @FindBy(css = "#collection-header > div.content > div > h1")
    WebElement WellnessTitle;

    @FindBy(css = "#grooming-wellness-grooming > li:nth-child(2) > a")
    WebElement ShampoConditio;

    @FindBy(css = "#collection-header > div.content > div > h1")
    WebElement ShampoConditioTitle;

    @FindBy(css = "#grooming-wellness-grooming > li:nth-child(3) > a")
    WebElement NailPaw;

    @FindBy(css = "#collection-header > div.content > div > h1")
    WebElement NailPawTitle;

    @FindBy(css = "#grooming-wellness-grooming > li:nth-child(4) > a")
    WebElement SkinCoat;

    @FindBy(css = "#collection-header > div.content > div > h1")
    WebElement SkinCoatTitle;

    @FindBy(css = "#grooming-wellness-grooming > li:nth-child(5) > a")
    WebElement DogDentalCare;

    @FindBy(css = "#collection-header > div.content > div > h1")
    WebElement DogDentalCareTitle;

    @FindBy(css = "#grooming-wellness-grooming > li:nth-child(6) > a")
    WebElement DogEarEyeCare;

    @FindBy(css = "#collection-header > div.content > div > h1")
    WebElement DogEarEyeCareTitle;

    @FindBy(css = "#grooming-wellness-grooming > li:nth-child(7) > a")
    WebElement GrommingKits;

    @FindBy(css = "#collection-header > div.content > div > h1")
    WebElement GrommingKitsTitle;

    @FindBy(css = "#grooming-wellness-grooming > li:nth-child(8) > a")
    WebElement ClippersAccessories;

    @FindBy(css = "#collection-header > div.content > div > h1")
    WebElement ClippersAccessoriesTtile;

    @FindBy(css = "#grooming-wellness-wellness > li:nth-child(2) > a")
    WebElement AKCVetline;

    @FindBy(css = "#grooming-wellness-wellness > li:nth-child(3) > a")
    WebElement AnxietyRelief;

    @FindBy(css = "#collection-header > div.content > div > h1")
    WebElement AnxietyReliefTitle;

    @FindBy(css = "#grooming-wellness-wellness > li:nth-child(4) > a")
    WebElement InsectProtection;

    @FindBy(css = "#collection-header > div.content > div > h1")
    WebElement InsectProtectionTitle;

    @FindBy(css = "#grooming-wellness-wellness > li:nth-child(5) > a")
    WebElement MobilitySupport;

    @FindBy(css = "#collection-header > div.content > div > h1")
    WebElement MobilitySupportTitle;

    @FindBy(css = "#grooming-wellness-wellness > li:nth-child(6) > a")
    WebElement WellnessAccessories;

    @FindBy(css = "#collection-header > div.content > div > h1")
    WebElement WellnessAccessoriesTitle;

    //------------------------//

    WebDriver driver;

    // Constructor
    public ShopGroomingWellness (WebDriver _driver){
        this.driver = _driver;
        PageFactory.initElements(driver,this);
    }

    // Methods

    public void clickGromingWellnessMenu()  {

        this.GromingWellnessMenu.isDisplayed();
        this.GromingWellnessMenu.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(GromingWellnessTitle));
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");
        wait.until(ExpectedConditions.visibilityOf(GromingWellnessSideNav));

    }

    public void clickGrooming() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.grooming-wellness > a"));
        builder.moveToElement(element).build().perform();
        this.Grooming.click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(GroomingTitle));

    }

    public void clickWellness() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.grooming-wellness > a"));
        builder.moveToElement(element).build().perform();
        this.Wellness.click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(WellnessTitle));

    }

    public void clickShampoConditio() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.grooming-wellness > a"));
        builder.moveToElement(element).build().perform();
        this.ShampoConditio.click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(ShampoConditioTitle));

    }

    public void clickNailPaw() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.grooming-wellness > a"));
        builder.moveToElement(element).build().perform();
        this.NailPaw.click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(NailPawTitle));

    }

    public void clickSkinCoat() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.grooming-wellness > a"));
        builder.moveToElement(element).build().perform();
        this.SkinCoat.click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(SkinCoatTitle));

    }

    public void clickDogDentalCare() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.grooming-wellness > a"));
        builder.moveToElement(element).build().perform();
        this.DogDentalCare.click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(DogDentalCareTitle));

    }

    public void clickDogEarEyeCare() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.grooming-wellness > a"));
        builder.moveToElement(element).build().perform();
        this.DogEarEyeCare.click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(DogEarEyeCareTitle));

    }

    public void clickGrommingKits() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.grooming-wellness > a"));
        builder.moveToElement(element).build().perform();
        this.GrommingKits.click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(GrommingKitsTitle));

    }

    public void clickClippersAccessories() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.grooming-wellness > a"));
        builder.moveToElement(element).build().perform();
        this.ClippersAccessories.click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(ClippersAccessoriesTtile));

    }

    public void clickAKCVetline() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.grooming-wellness > a"));
        builder.moveToElement(element).build().perform();
        this.AKCVetline.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.urlContains("/products/vet-helpline"));

    }

    public void clickAnxietyRelief() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.grooming-wellness > a"));
        builder.moveToElement(element).build().perform();
        this.AnxietyRelief.click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(AnxietyReliefTitle));

    }

    public void clickInsectProtection() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.grooming-wellness > a"));
        builder.moveToElement(element).build().perform();
        this.InsectProtection.click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(InsectProtectionTitle));

    }

    public void clickMobilitySupport() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.grooming-wellness > a"));
        builder.moveToElement(element).build().perform();
        this.MobilitySupport.click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(MobilitySupportTitle));

    }

    public void clickWellnessAccess() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.grooming-wellness > a"));
        builder.moveToElement(element).build().perform();
        this.WellnessAccessories.click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(WellnessAccessoriesTitle));

    }

}
