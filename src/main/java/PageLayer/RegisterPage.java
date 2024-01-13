package PageLayer;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilityLayer.HandleDropDown;

public class RegisterPage extends BaseClass {
	@FindBy(name = "firstname")
	private WebElement fname;

	@FindBy(name = "lastname")
	private WebElement lname;

	@FindBy(name = "reg_email__")
	private WebElement email;

	@FindBy(name = "reg_passwd__")
	private WebElement pass;

	@FindBy(name = "birthday_day")
	private WebElement day;

	@FindBy(name = "birthday_month")
	private WebElement month;

	@FindBy(name = "birthday_year")
	private WebElement year;

	@FindBys(@FindBy(xpath = "//label[@class='_58mt']"))
	private List<WebElement> gender;

	public RegisterPage() 
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void rgisterPageFunctionality(String Fname)
	{
	UtilityLayer.wait.sendKeys(fname, Fname);
	}
	
	public void userFunctionality(String Lname,String Email,String Pass)
	{
	UtilityLayer.wait.sendKeys(lname, Lname);
	UtilityLayer.wait.sendKeys(email, Email);
	UtilityLayer.wait.sendKeys(pass, Pass);
	
	}
	
	public void loginFunctionality(String Date,String Month,String Year,String Gender)
	{
		HandleDropDown.SelectByVisibleText(day, Date);
		HandleDropDown.SelectByVisibleText(month, Month);
		HandleDropDown.SelectByVisibleText(year, Year);
		UtilityLayer.wait.selecheckbox(gender, Gender);
	}
	
	
	
	
}