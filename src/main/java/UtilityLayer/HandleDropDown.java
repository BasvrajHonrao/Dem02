package UtilityLayer;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import BaseLayer.BaseClass;

public class HandleDropDown extends BaseClass
{
	
public static void SelectByVisibleText(WebElement wb, String value)
{
 new Select(new WebDriverWait(driver,Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(wb))).selectByVisibleText(value);
}
public static void SelectByValue(WebElement wb, String value)
{
 new Select(new WebDriverWait(driver,Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(wb))).selectByValue(value);
}
public static void SelectByIndex(WebElement wb, int index)
{
 new Select(new WebDriverWait(driver,Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(wb))).selectByIndex(index);
}
}

