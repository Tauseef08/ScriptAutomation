package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;

public class LoginPage {
	public WebDriver driver;
	public WebElement usernameField;
	public WebElement passwordField;
	public WebElement loginButton;
	public WebElement rememberMecheckbox;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		usernameField = driver.findElement(By.cssSelector("#username"));
		passwordField = driver.findElement(By.id("password"));
		loginButton = driver.findElement(By.xpath("//button[@id='log-in']"));
	}

	public void login(String username, String password) {
		usernameField.sendKeys(username);
		passwordField.sendKeys(password);
	
	}

	public void clickRememberme() {
		rememberMecheckbox=driver.findElement(By.xpath("//input[@class=\"form-check-input\"]"));
		if(!rememberMecheckbox.isSelected())
		{
			rememberMecheckbox.click();
		}		
	

	}
	public void clicklogin() {
		loginButton.click();
	}
}
