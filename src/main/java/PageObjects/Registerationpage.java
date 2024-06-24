package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Registerationpage {
	
	public WebDriver Driver;
	
	By Addmore=By.xpath("//button[text()=' Add more ']");
	By Schedule=By.xpath("//div[text()=' Schedule Appointment ']");
	By option= By.xpath("/html/body/app-root/app-app-root/app-app-tile-view-container/div[2]/div/div[2]/app-registration-details/div[1]/div[1]/div/div/div[1]/div[2]/button/span/mat-icon");
	
	By downloadcert=By.xpath("//span[text()='Download Latest vaccination certificate']");
	
	By CentreAddress=By.xpath("//span[text()='View Centre Address']");
	By CentreAddressback=By.xpath("/html/body/div/div[2]/div/mat-dialog-container/app-address-popup/div/div[1]/img");
	By Downloadslip=By.xpath("//span[text()='Download slip']");
	By delete=By.xpath("//span[text()='Delete']");
	By downloadslipneg=By.xpath("//button[@class='btn btn-default-lg mat-button mat-button-base']");
	By cancelappoint=By.xpath("//span[text()='Cancel Appointment']");
	By cancelconfirm=By.xpath("//button[@class='btn']");
	
	public Registerationpage(WebDriver Driver)
	{
		this.Driver=Driver;
	}
	
	public WebElement addbutton()
	{
		
		return Driver.findElement(Addmore);
	}
	
	
	public WebElement schedule()
	{
		return Driver.findElement(Schedule);
	}
	

	public WebElement downloadcert()
	{
		return Driver.findElement(downloadcert);
		
	}
	public WebElement CentreAddress()
	{
		return Driver.findElement(CentreAddress);
		
	}
	
	public WebElement Downloadslip()
	{
		return Driver.findElement(Downloadslip);
		
	}
	

 public WebElement option()
     {
   
	 return Driver.findElement(option);
	}
 
 
 public WebElement CentreAddressback()
 
 {
	 return Driver.findElement(CentreAddressback);
	 
 }
 
 public WebElement Delete()
 { 
	 return Driver.findElement(delete);
 }
 
 public WebElement  downloadslipneg()
 { 
	 return Driver.findElement(downloadslipneg);
 }
 

 public WebElement cancelappoint()
 { 
	 return Driver.findElement(cancelappoint);
 }
 
 public WebElement cancelconfirm()
 {
	 return Driver.findElement(cancelconfirm);
 }
 
}
	

