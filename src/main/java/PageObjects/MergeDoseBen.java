package PageObjects;

import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MergeDoseBen {
	
	
	public WebDriver Driver;
	
    	By bennamenav=By.xpath("//div[@class='ng-input']");
	
	 By bendropdown=By.xpath("//span[@class='ng-option-label ng-star-inserted']");
	
     By benfeciaryid=By.xpath("/html/body/app-root/app-app-root/app-app-tile-view-container/div[2]/div/div[2]/app-merge-multiple-dose/form/div[1]/div[3]/fieldset/form/div[1]/mat-form-field/div/div[1]/div/input");
     
     By benfeciarynum=By.xpath("//input[@formcontrolname='mobile']"); 
     
     By submit=By.xpath("//button[@type='submit']");
      By close=By.xpath(" //button[@class='btn btn-default-lg mat-button mat-button-base']");
     
    public MergeDoseBen(WebDriver Driver)
    {
    	
    	this.Driver=Driver;
    }
	
    
    public WebElement bennamenav()
    {
    	
    	return Driver.findElement(bennamenav);
    			
    }
    public WebElement benfeciaryid()
    {
    	
    	return Driver.findElement(benfeciaryid);
    			
    }
    
    
    public List<WebElement> bendropdown()
    {
    	
    	return Driver.findElements(bendropdown);
    			
    }
    
    public WebElement benfeciarynum()
    {
    	
    	return Driver.findElement(benfeciarynum);
    			
    }
    
    public WebElement submit()
    {
    	
    	return Driver.findElement(submit);
    			
    }


	public WebElement close() {

    	return Driver.findElement(close);
	}
    
}
