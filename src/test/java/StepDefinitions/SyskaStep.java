package StepDefinitions;

import java.io.IOException;

import BasePages.AccessoriesPage;
import BasePages.SyskaBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class SyskaStep extends SyskaBase {
	AccessoriesPage mn=new AccessoriesPage();
	
	@Given("user open the browser and enter the URL")
	public void user_open_the_browser_and_enter_the_url() {
	    mn.intialization();
	}

	@Then("user mouse over on Accessories")
	public void user_mouse_over_on_accessories() {
	   mn.Accessories();
	}

	@Then("user select watch selection")
	public void user_select_watch_selection() throws IOException {
	   mn.WatchSelection();
	}

	@Then("user select watch color")
	public void user_select_watch_color() {
	  mn.WatchcolorSelection();
	}

	@Then("user cart the watch")
	public void user_cart_the_watch() {
	    mn.cart();
	}
}
