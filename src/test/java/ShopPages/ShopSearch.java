package ShopPages;
import Model.Word;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ShopSearch {

    @FindBy(css = "#ispbxii_1")
    WebElement ShopSearch;

    @FindBy(css = "#main-menu-nav > nav > a:nth-child(5)")
    WebElement ShopByBreed;
    //

    @FindBy(id = "the-chosen-input-hack-2")
    WebElement ShopSearchBreed;

    @FindBy(id = "the-chosen-input-hack-2")
    WebElement ShopDogLoversSearch;

    @FindBy(css = "#isp_results_search_text")
    WebElement ShopResultTitle;

    @FindBy(id = "isp_main_search_box")
    WebElement ShopResultSearchBar;

    @FindBy(css = "#single_facet_Breed > div.isp_facet_title")
    WebElement ShopResultSections;

    @FindBy(css = "#isp_search_results_container > li:nth-child(1) > div.isp_product_image_wrapper > a.isp_product_image_href > img")
    WebElement ShopResultImage;

    @FindBy(css = "#main-content > div > h1")
    WebElement ShopSearchBreedTitle;

    @FindBy(css = "#collection-header > div.content > div > h4")
    WebElement ChooseBreedTitle;

    @FindBy(css = "#isp_search_results_container > li:nth-child(1) > div.isp_product_image_wrapper > a > img")
    WebElement ShopSearchBreedImage;

    @FindBy(css = "#shopify-section-collection-breeds > div > div > div > div > a > i")
    WebElement dropdown;

    @FindBy(css = "#breed-collection-filter > div > div > a")
    WebElement dropdownDogLover;

    @FindBy(css = "#collection-main > ul.grid.collection-grid.gradient > li:nth-child(1) > div > div")
    WebElement productDetailDogLover;


    //Driver
    WebDriver driver;

    //Constructor
    public ShopSearch(WebDriver _driver) {
        this.driver = _driver;
        PageFactory.initElements(driver, this);

    }

    //Methods

    public void ShopSearch(Word _searchword) {

        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(ShopSearch));
        //this.ShopSearch.click();
        this.ShopSearch.sendKeys(_searchword.WordSearch);
        this.ShopSearch.sendKeys(Keys.RETURN);
        wait.until(ExpectedConditions.visibilityOf(ShopResultTitle));
        //wait.until(ExpectedConditions.visibilityOf(ShopResultSections));
        wait.until(ExpectedConditions.visibilityOf(ShopResultImage));

    }

    public void ShopSearchBreed(Word _searchword) {


        this.ShopByBreed.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(dropdown));
        this.dropdown.click();
        wait.until(ExpectedConditions.visibilityOf(ShopSearchBreed));
        this.ShopSearchBreed.sendKeys(_searchword.WordSearch);
        this.ShopSearchBreed.sendKeys(Keys.RETURN);
        wait.until(ExpectedConditions.visibilityOf(ShopSearchBreedTitle));
        //this.ShopSearchBreedTitle.isDisplayed();
        //wait.until(ExpectedConditions.visibilityOf(ChooseBreedTitle));
        wait.until(ExpectedConditions.visibilityOf(ShopSearchBreedImage));

    }

    public void ShopDogLoversSearch(Word _searchword) {

        driver.navigate().to("https://shop.akc.org/collections/dog-lovers");
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(dropdownDogLover));
        //this.driver.get(this.driver.getCurrentUrl() + "?test=true");
        this.dropdownDogLover.click();
        wait.until(ExpectedConditions.visibilityOf(ShopDogLoversSearch));
        this.ShopDogLoversSearch.sendKeys(_searchword.WordSearch);
        this.ShopDogLoversSearch.sendKeys(Keys.RETURN);
        wait.until(ExpectedConditions.visibilityOf(productDetailDogLover));

    }

}
