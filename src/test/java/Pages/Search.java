package Pages;
import Model.Word;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Search {

    @FindBy(xpath = "//*[@id='desktop-search']")
    WebElement search;

    @FindBy(id = "homepage-hero-breed-search-selectized")
    WebElement HeroBreedSearch;

    @FindBy(id = "homepage-hero-aside__input")
    WebElement HeroAsideSearch;

    @FindBy(id = "ispbxii_0")
    WebElement ShopSearch;

    @FindBy(id = "the-chosen-input-hack-2")
    WebElement ShopSearchBreed;

    @FindBy(id = "the-chosen-input-hack-2")
    WebElement ShopDogLoversSearch;

    @FindBy(xpath = "//html/body/div[2]/div/div[1]/div/div[1]/div/div/div[1]/form/button/svg/g/ellipse")
    WebElement searchbutton2;

    @FindBy(css = "body > div.cmw.bgc-white > div.page-container.pb4.bpm-pb9 > div.page-layout > main > div.org-search-results-title > h3")
    WebElement numresults;

    @FindBy(css = "body > div.cmw.bgc-white > div.page-container.pb4.bpm-pb9 > div.bpm-mb8 > div > div.iib-search-header__slogan-wrapper > div > img")
    WebElement SearchCampImg;

    @FindBy(css = "body > div.cmw.bgc-white > div.page-container.pb4.bpm-pb9 > div.page-layout > aside > div > div.filter-form__wrap > form > div:nth-child(2) > div > div > div.filter-form__section-header > h3")
    WebElement sections;

    @FindBy(css = "body > div.cmw.bgc-white > div.page-container.pb4.bpm-pb9 > div.page-layout > main > div.contents-grid-wrap.relative > div > div:nth-child(1) > a > div > img")
    WebElement resultsimg;

    @FindBy(css = "body > div.cmw.bgc-white > div.page-container.pb4.bpm-pb9 > div.page-layout > main > div.contents-grid-wrap.relative > div > div:nth-child(1) > div > a")
    WebElement firstresult;

    @FindBy(css = "body > div.cmw.bgc-white > div.page-container.pb4.bpm-pb9 > div.page-layout > main > div.contents-grid-wrap.relative > div > div:nth-child(1) > div > div")
    WebElement frbody;

    @FindBy(xpath = "//html/body/div[4]/div[1]/div[4]/main")
    WebElement listresults;

    @FindBy(xpath = "//html/body/div[4]/div[1]/div[4]/main/div[4]/div")
    WebElement navigate;

    @FindBy(css = "#isp_results_search_text")
    WebElement ShopResultTitle;

    @FindBy(id = "isp_main_search_box")
    WebElement ShopResultSearchBar;

    @FindBy(css = "#single_facet_Breed > div.isp_facet_title")
    WebElement ShopResultSections;

    @FindBy(css = "#isp_search_results_container > li:nth-child(1) > div.isp_product_image_wrapper > a.isp_product_image_href > img")
    WebElement ShopResultImage;

    @FindBy(css = "#collection-main > div.department-blocks > section:nth-child(1) > h2")
    WebElement ShopSearchBreedTitle;

    @FindBy(css = "#collection-header > div.content > div > h4")
    WebElement ChooseBreedTitle;

    @FindBy(css = "#collection-header > div.image-box > img")
    WebElement ShopSearchBreedImage;

    @FindBy(css = "#homepage-pick-your-breed > div > div > a > i")
    WebElement dropdown;

    @FindBy(css = "#breed-collection-filter > div > div > a")
    WebElement dropdownDogLover;

    @FindBy(css = "#collection-main > ul.grid.collection-grid.gradient > li:nth-child(1) > div > div")
    WebElement productDetailDogLover;

    @FindBy(css = "body > div.cmw.bgc-white.page-single-breed > div:nth-child(2) > div > div.breed-page__hero.breed-page__no-page-margin > div.breed-page__section.text-white.breed-page__intro__title-block.my4.bpm-my6 > div.mb3.bpm-mb4 > div > h1")
    WebElement resultsTitle;

    @FindBy(css = "body > div.cmw.bgc-white.page-single-breed > div:nth-child(2) > div > div.breed-page__hero.breed-page__no-page-margin > div.breed-page__section.my4.bpm-my6.text-white.breed-page__intro__title-block > p")
    WebElement Characteristics;

    @FindBy(id = "anchor-panel-puppies")
    WebElement puppiesTab;

    @FindBy(id = "anchor-panel-breed-standard")
    WebElement breedStandardTab;

    //Driver
    WebDriver driver;

    //Constructor
    public Search(WebDriver _driver) {
        this.driver = _driver;
        PageFactory.initElements(driver, this);

    }

    //Methods

    public void SearchPage(Word _searchword) {

        this.search.sendKeys(_searchword.WordSearch);
        this.search.sendKeys(Keys.RETURN);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(SearchCampImg));
        this.numresults.isDisplayed();
        this.sections.isDisplayed();
        this.resultsimg.isDisplayed();
        this.firstresult.isDisplayed();
        this.frbody.isDisplayed();

    }

    public void HeroBreedSearch(Word _searchword) {

        this.HeroBreedSearch.sendKeys(_searchword.WordSearch);
        this.HeroBreedSearch.sendKeys(Keys.RETURN);
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(resultsTitle));
        wait.until(ExpectedConditions.visibilityOf(Characteristics));

    }

    public void HeroAsideSearch(Word _searchword) {

        this.HeroAsideSearch.sendKeys(_searchword.WordSearch);
        this.HeroAsideSearch.sendKeys(Keys.RETURN);
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(SearchCampImg));
        wait.until(ExpectedConditions.visibilityOf(numresults));
        wait.until(ExpectedConditions.visibilityOf(sections));
        //wait.until(ExpectedConditions.visibilityOf(resultsimg));
        wait.until(ExpectedConditions.visibilityOf(firstresult));
        wait.until(ExpectedConditions.visibilityOf(frbody));

    }

    public void ShopSearch(Word _searchword) {

        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(ShopSearch));
        this.ShopSearch.sendKeys(_searchword.WordSearch);
        this.ShopSearch.sendKeys(Keys.RETURN);
        wait.until(ExpectedConditions.visibilityOf(ShopResultTitle));
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");
        //this.ShopResultTitle.isDisplayed();
        wait.until(ExpectedConditions.visibilityOf(ShopResultSearchBar));
        wait.until(ExpectedConditions.visibilityOf(ShopResultSections));
        wait.until(ExpectedConditions.visibilityOf(ShopResultImage));

    }

    public void ShopSearchBreed(Word _searchword) {

        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(dropdown));
        this.dropdown.click();
        wait.until(ExpectedConditions.visibilityOf(ShopSearchBreed));
        this.ShopSearchBreed.sendKeys(_searchword.WordSearch);
        this.ShopSearchBreed.sendKeys(Keys.RETURN);
        wait.until(ExpectedConditions.visibilityOf(ShopSearchBreedTitle));
        //this.ShopSearchBreedTitle.isDisplayed();
        wait.until(ExpectedConditions.visibilityOf(ChooseBreedTitle));
        wait.until(ExpectedConditions.visibilityOf(ShopSearchBreedImage));

    }

    public void ShopDogLoversSearch(Word _searchword) {

        driver.navigate().to("https://shop.akc.org/collections/dog-lovers");
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(dropdownDogLover));
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");
        this.dropdownDogLover.click();
        wait.until(ExpectedConditions.visibilityOf(ShopDogLoversSearch));
        this.ShopDogLoversSearch.sendKeys(_searchword.WordSearch);
        this.ShopDogLoversSearch.sendKeys(Keys.RETURN);
        wait.until(ExpectedConditions.visibilityOf(productDetailDogLover));

    }

}
