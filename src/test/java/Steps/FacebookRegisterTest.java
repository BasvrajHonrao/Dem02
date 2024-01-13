package Steps;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import BaseLayer.BaseClass;
import PageLayer.RegisterPage;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class FacebookRegisterTest extends BaseClass {
	public static RegisterPage reg=new RegisterPage();
	@Given("user is on register page,enter firstname")
	public void user_is_on_register_page_enter_firstname() {
		BaseClass.initialization();
		 reg=new RegisterPage();
		reg.rgisterPageFunctionality("Basvraj");
	    
	}

	@When("user enter valid ,lastname,emil,pass")
	public void user_enter_valid_lastname_emil_pass() {
		reg.userFunctionality("Honrao", "basu@gmail.com", "basu@1234");
		
	}

	@When("user enter valid birth date,month,year and select gender")
	public void user_enter_valid_birth_date_month_year_and_select_gender()
	{
	   reg.loginFunctionality("13", "Mar", "1983", "male");
	}
	@AfterStep
	public void tearDown(Scenario scenario) {
		if (scenario.isFailed()) {
			byte[] f = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);

			String date = new SimpleDateFormat("ddMMyyyy_HHmmss").format(new Date());

			scenario.attach(f, "image/png", date + scenario.getName());

		} else {
			byte[] f = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);

			String date = new SimpleDateFormat("ddMMyyyy_HHmmss").format(new Date());

			scenario.attach(f, "image/png", date + scenario.getName());
		}
	}
}
