package BasePages;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccessoriesPage extends SyskaBase {
 
	@FindBy(xpath="(//div[@class='d-flex align-items-center gap-1'])[2]")
	WebElement AccessoriesButton;
	
	@FindBy(xpath="//*[@id='2-dropdown']/ul/li[1]")
	WebElement smartWatchesLink;
	
	@FindBy(xpath="(//li[@class='splide__slide is-active is-visible'])[2]")
	WebElement selectedwatch;
	
	@FindBy(xpath="(//div[@class='dkn-color-variant-item'])[2]")
	WebElement selectedwatchColor ;
	
	@FindBy(xpath="//button[@class='btn-icon']")
	WebElement cartbutton;
	
	public AccessoriesPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void Accessories() {
		Actions actions = new Actions(driver);
		actions.moveToElement(AccessoriesButton).build().perform();
		smartWatchesLink.click();
	}

	public void WatchSelection() throws IOException {
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File trg = new File(".\\screenshot\\watch.png");
		FileUtils.copyFile(src, trg);
		selectedwatch.click();
	}
	
    public void WatchcolorSelection() {
    	selectedwatchColor.click();
    }
    public void cart() {
    	cartbutton.click();
    }
}
