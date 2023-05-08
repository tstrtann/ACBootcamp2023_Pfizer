package page.classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	
	WebDriver driver;
	
	public Homepage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[contains(text(),'Search')]") WebElement searchIcon;
	@FindBy(id = "edit-search-api-fulltext") WebElement searchField;
	@FindBy(xpath = "//div[@id='edit-actions']") WebElement nextToResult;
	
	public void clickSearchIcon() {
		searchIcon.click();
	}
	
	public void enterSearchField(String searchValues) {
		searchField.sendKeys(searchValues);
		nextToResult.click();
	}
	

}
