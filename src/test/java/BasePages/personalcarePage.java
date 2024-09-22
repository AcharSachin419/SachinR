package BasePages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class personalcarePage extends SyskaBase{
  
 @FindBy(xpath="(//div[@class='d-flex align-items-center gap-1'])[3]")
 WebElement PersonalcareTab;
 
 @FindBy(xpath="//*[@id=\"3-dropdown\"]/ul/li[2]")
 WebElement HairdryerLink;
 
 @FindBy(xpath="(//li[@class='splide__slide is-active is-visible'])[1]")
 WebElement Productbutton;
 
 @FindBy(xpath="//h5[@class='text-black']")
 WebElement ReviewButton;
 ////*[@id=\"additionalInfo\"]/h5
// @FindBy(xpath="//div[@class='no-reviews-cta-btn']")
 WebElement ReviewWriteButton;
 
 @FindBy(xpath="(//div[@class='flex d-row rm-rating-star-div'])[4]")
 WebElement StarRating;
 
 @FindBy(xpath="//input[@id='full_name-input']")
 WebElement namefield; 
 
 @FindBy(xpath="//textarea[@id='description-input']")
 WebElement reviewfield; 
 
 @FindBy(xpath="//button[@id='review-submit-btn']")
 WebElement submitButton; 

public personalcarePage() {
	PageFactory.initElements(driver, this);
}
public void personalCare() {
	Actions actions = new Actions(driver);
	actions.moveToElement(PersonalcareTab).build().perform();
}
public void hairDryer() {
	Actions actions1= new Actions(driver);
	actions1.moveToElement(HairdryerLink).click().build().perform();
}
public void product() {
	Productbutton.click();
	Actions actions= new Actions(driver);
JavascriptExecutor js = (JavascriptExecutor)driver;
  js.executeScript("window.scrollBy(300,0)");
    actions.moveToElement(ReviewButton).click().build().perform();
	ReviewButton.click();
	actions.moveToElement(ReviewWriteButton).click().build().perform();
}
public void Review() {
	StarRating.click();
	namefield.sendKeys(prop.getProperty("firstname"));
	reviewfield.sendKeys(prop.getProperty("review"));
}
public void submittion() {
	submitButton.click();
}
}