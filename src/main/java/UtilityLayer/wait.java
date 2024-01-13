package UtilityLayer;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import BaseLayer.BaseClass;

public class wait extends BaseClass {
	public static void sendKeys(WebElement wb, String value) {
		new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(wb)).sendKeys(value);
	}

	public static void click(WebElement wb) {
		new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(wb)).click();
	}

	public static void clear(WebElement wb) {
		new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(wb)).clear();
	}

	public static String getText(WebElement wb) {
		return new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(wb)).getText();
	}

	public static String getAttribute(WebElement wb, String keyname) {
		return new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(wb))
				.getAttribute(keyname);
	}

	public static boolean isSelected(WebElement wb) {
		return new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(wb))
				.isSelected();
	}

	public static void selecheckbox(List<WebElement> ls, String value) {
		for (WebElement abc : ls) {
			String a = abc.getText();
			if (a.equalsIgnoreCase(value)) {
				abc.click();
			}
		}

	}

}
