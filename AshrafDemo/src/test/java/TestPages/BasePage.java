package TestPages;

import org.openqa.selenium.WebDriver;

public class BasePage {

	WebDriver driver;

	private BasePage(WebDriver driver) {
		this.driver = driver;

	}

}
