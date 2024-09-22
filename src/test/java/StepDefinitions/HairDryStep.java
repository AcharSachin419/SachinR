package StepDefinitions;

import BasePages.SyskaBase;
import BasePages.personalcarePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class HairDryStep extends SyskaBase{
	personalcarePage pg=new personalcarePage();
	@Given("customer launch the browser and enter the url")
	public void customer_launch_the_browser_and_enter_the_url() {
	  intialization();
	}

	@Then("mouse over on personal care tab")
	public void mouse_over_on_personal_care_tab() {
	    pg.personalCare();
	}

	@Then("navigate to hair dryers and click on it")
	public void navigate_to_hair_dryers_and_click_on_it() {
	   pg.hairDryer();
	}

	@Then("click on desired product and click on review button")
	public void click_on_desired_product_and_click_on_review_button() {
	  pg.product();
	}

	@Then("click on write review button and fill necessery details")
	public void click_on_write_review_button_and_fill_necessery_details() {
	    pg.Review();
	}

	@Then("click on submit and take screenshot")
	public void click_on_submit_and_take_screenshot() {
	   pg.submittion();
	}

}
