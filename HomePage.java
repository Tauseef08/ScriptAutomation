package pages;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;

public class HomePage {
	public WebDriver driver;
	WebElement accounttab;


	public HomePage(WebDriver driver) {
		this.driver = driver;
		accounttab=driver.findElement(By.xpath("//th[contains(text(),'Amount')]"));
		  
	}


	public void testSortByAmount() {
		List<WebElement> amounts = driver.findElements(By.xpath("//table[@id='transactionTable']/tbody/tr/td[5]"));
	
		List<String> expectedsortedAmounts = new ArrayList<>();
		for (WebElement amount : amounts) {
			expectedsortedAmounts.add(amount.getText());
		}
		List<String> SortedAmounts = new ArrayList<>();
		for(String s:expectedsortedAmounts) {
			SortedAmounts.add(s);
		}
		Collections.sort(SortedAmounts);
		Assert.assertEquals(expectedsortedAmounts, SortedAmounts);
	}
	public void clickOnAcnt() {
		accounttab.click();
		
	}



}
