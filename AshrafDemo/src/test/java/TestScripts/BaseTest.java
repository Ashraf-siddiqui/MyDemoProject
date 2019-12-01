package TestScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import TestPages.FirstPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	WebDriver driver;

	FirstPage firstPage;

	public BaseTest(WebDriver driver) {
		this.driver = driver;

	}

	@BeforeTest
	public void Setup() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		PageFactory.initElements(driver, FirstPage.class);

	}

	@AfterTest
	public void TearDown() {

		driver.close();
		driver.quit();
		System.out.println("driver has been shutdown");

	}

}
