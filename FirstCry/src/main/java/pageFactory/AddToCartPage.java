package pageFactory;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddToCartPage {
	
	private Actions actions;
	private WebDriverWait wait;
	
	@FindBy(id = "search_box")
	private WebElement searchBox;
	
	@FindBy(xpath = "(//span[contains(@class, 'edittext L12_21')])[1]")
	private WebElement firstItem;
	
	@FindBy(xpath = "//img[contains(@src, '//cdn.fcglcdn.com/brainbees/images/products/219x265/9509103a.webp')]")
	private WebElement addToCartBtn;
	
	@FindBy(id = "prod_name")
	private WebElement productName;
	
	
	public AddToCartPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		actions = new Actions(driver);
		wait = new WebDriverWait(driver,Duration.ofSeconds(60));
	}
	
	public void clicksearchIcon() {
		searchBox.click();	
	}
	

	public void searchItem(String item) throws InterruptedException{
		searchBox.sendKeys(item);
		wait.until(ExpectedConditions.visibilityOfAllElements(searchBox));
		actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
	}
	
	public void clickFirstItem() {
		firstItem.click();
	}
	
	public void clickAddToCartBtn() {
		addToCartBtn.click();
	}

	public String getText() {
		String message = productName.getText();
		return message;
	}

}
