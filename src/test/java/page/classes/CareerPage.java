package page.classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class CareerPage {

	WebDriver driver;

	public CareerPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	
	
}
