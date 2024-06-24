package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MobileandOTPsubmit

{

	public WebDriver Driver;
	
	By numcowin= (By.xpath("//button[@class='btn']"));
	
    By OTP1=(By.xpath("//button[text()=' Verify OTP ']"));
    
	
	public MobileandOTPsubmit(WebDriver Driver)
	{
		this.Driver=Driver;
		
	}
	 
	public WebElement numbercowin()
	{
		return Driver.findElement(numcowin);
	}
	
	public WebElement OTPcowin()
	
	{
		
		return Driver.findElement(OTP1);
		
	}
	
	


	
}
