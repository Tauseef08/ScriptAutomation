package testScenario;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.HomePage;
import pages.LoginPage;

public class TestCases {
	static LoginPage loginPage;
	static HomePage homepage;
	 static WebDriver driver;
	 static String Baseurl = " https://sakshingp.github.io/assignment/login.html";

	@BeforeClass
	public static void setup() {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(Baseurl);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);

	}

	/*
	 * @AfterClass public static void tearDown() { driver.quit(); }
	 */

	@Test
	public void login() {

		loginPage = new LoginPage(driver);
		loginPage.login("anyusername", "anypassword");
		loginPage.clickRememberme();
		loginPage.clicklogin();

	}

	@Test
	public void VerifyHomepage() {
		homepage = new HomePage(driver);
		homepage.clickOnAcnt();
		homepage.testSortByAmount();

	}

}
