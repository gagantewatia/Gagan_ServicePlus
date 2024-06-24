package PageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InternationalCertificate1 
{
	public WebDriver Driver;
	
 By bennamenav=By.xpath("//div[@class='ng-input']");

 By bendropdown=By.xpath("//span[@class='ng-option-label ng-star-inserted']");
 
 By inputfield=By.xpath("/html/body/app-root/app-app-root/app-app-tile-view-container/div[2]/div/div[2]/app-download-international-certificate/form/fieldset/form/div[1]/div[1]/mat-form-field/div/div[1]/div[1]/input");
 
 By calenderclick=By.xpath("//button[@aria-label='Open calendar']");
 
 By yearmonth=By.xpath("//button[@class='mat-calendar-period-button mat-button mat-button-base']");
 
 By previous20year= By.xpath("//button[@class='mat-calendar-previous-button mat-icon-button mat-button-base']");
 
 By yearmonthsel=By.xpath("//div[@class='mat-calendar-body-cell-content']");
 
 By passportdetails=By.xpath("//input[@formcontrolname='passportId']");
 
 By checkbox=By.xpath("//div[@class='mat-checkbox-inner-container']");
 By  update=By.xpath("//button[text()=' Update ']");
 By  download=By.xpath("//button[text()=' Download ']");
 
 public InternationalCertificate1(WebDriver Driver)
 {
	 this.Driver=Driver;
 }



public WebElement bennamenav()
 {
 	
 	return Driver.findElement(bennamenav);
 			
 }
 

 
 public List<WebElement> bendropdown()
 {
 	
 	return Driver.findElements(bendropdown);
 			
 }
 
 
 public WebElement calenderclick()
 {
 	
		return Driver.findElement(calenderclick);
 			
 }
 
 public WebElement yearmonth()
 {
 	
 	return Driver.findElement(yearmonth);
 			
 }
 public WebElement previous20year()
 {
 	
 	return Driver.findElement(previous20year);
 			
 }
 
 public List<WebElement> yearmonthsel()
 {
 	
 	return Driver.findElements(yearmonthsel);
 			
 }
 
 
 public WebElement passportdetails()
 
 {
	 return Driver.findElement(passportdetails);
 }
 
 public WebElement inputfield()
 {
	 return Driver.findElement(inputfield);
 }

 
 

public WebElement checkbox()

{
return Driver.findElement(checkbox);	
}


public WebElement update()

{
return Driver.findElement(update);	
}

public WebElement download()

{
return Driver.findElement(download);	
}

}
