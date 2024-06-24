package CPGRAMS;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CPGRAMSUserRegisteration 
{
	public WebDriver Driver;
	WebDriverWait wait;
	
	
	By name=By.id("name");
	By gender=By.id("gender");
	By email=By.id("email");
	By useridclr=By.xpath("/html/body/div[5]/md-content/md-card/form/md-input-container[4]/svg/path");
	By userid=By.xpath("//input[@id='userid']");
	By searchstate=By.xpath("//input[@ng-model='vm.searchState']");
	By searchoption=By.xpath("/html/body/div[9]/md-select-menu/md-content/md-optgroup/md-option/div[1]");
	By statecode=By.id("statecode");
	By districtcode=By.id("districtcode");
	By add1=By.id("add1");
	By pincode=By.id("pin");
	By password=By.id("password");
	By confirmpassword=By.id("confirmpass");
	By submit=By.xpath("//button[@id='submit']");
	By mobilelareadyregistered=By.xpath("//p[contains(text(),'This number is already registered with us, please login with this number')]");
	By emailidregistered=By.xpath("//p[normalize-space()='Someone already registered with this E-mail']");
	By usersucessregistered=By.xpath("//p[normalize-space()='User Registered Successfully.']");
	By ResendOTP=By.xpath("//a[normalize-space()='Resend OTP']");
	By invalidOTP=By.xpath("//p[normalize-space()='Invalid OTP']");
	By otp=By.id("otp");
	By okotp=By.xpath("//button[@id='okOtp']");
	By edit=By.xpath("//div[@role='button']");
	By editsuccess=By.xpath("//p[normalize-space()='Profile updated sucessfully']");
	By changepassword=By.xpath("//span[normalize-space()='Change password']");
	By oldpassword=By.name("password");
	By newpassword=By.name("newpass");
	By cconfirmpassword=By.name("confirmpassword");
	
	By samepassword=By.xpath("//p[normalize-space()='Old and new password should not be same']");
	By changepwdsuccess=By.xpath("//p[normalize-space()='Password Changed Successfully.']");
	By okcancel=By.xpath("//button[@ng-click='vm.cancel()']");
	By vmlogout=By.xpath("//button[@ng-click='vm.logout();']");
	
	By oksubmit=By.xpath("(//span[contains(normalize-space(),'OK')])[2]");
	By passwordname=By.name("password");
	By myprofile=By.xpath("//a[@href='#/cpgramLogin/myProfile']");
	
	public WebElement passwordname() 
	{
        wait.until(ExpectedConditions.visibilityOfElementLocated(passwordname));
		 return Driver.findElement(passwordname);
	}
	
	public WebElement myprofile() 
	{
        wait.until(ExpectedConditions.visibilityOfElementLocated(myprofile));
		 return Driver.findElement(myprofile);
	}
	
	
	public CPGRAMSUserRegisteration (WebDriver Driver) 
	{
		this.Driver=Driver;
	 wait = new WebDriverWait(Driver, Duration.ofSeconds(30));
		
	}
	
	public int changepwdsuccess() 
	{
  
		 return Driver.findElements(changepwdsuccess).size();
	}
	
	
	public int samepassword() 
	{
 
		 return Driver.findElements(samepassword).size();
	}
	
	public WebElement oksubmit() 
	{
        wait.until(ExpectedConditions.visibilityOfElementLocated(oksubmit));
		 return Driver.findElement(oksubmit);
	}
	
	
	public WebElement okcancel() 
	{
        wait.until(ExpectedConditions.visibilityOfElementLocated(okcancel));
		 return Driver.findElement(okcancel);
	}
	
	public WebElement vmlogout() 
	{
        wait.until(ExpectedConditions.visibilityOfElementLocated(vmlogout));
		 return Driver.findElement(vmlogout);
	}
	
	
	
	public WebElement oldpassword() 
	{
        wait.until(ExpectedConditions.visibilityOfElementLocated(oldpassword));
		 return Driver.findElement(oldpassword);
	}
	
	public WebElement newpassword() 
	{
        wait.until(ExpectedConditions.visibilityOfElementLocated(newpassword));
		 return Driver.findElement(newpassword);
	}
	
	public WebElement cconfirmpassword() 
	{
        wait.until(ExpectedConditions.visibilityOfElementLocated(cconfirmpassword));
		 return Driver.findElement(cconfirmpassword);
	}
	
	public WebElement changepassword() 
	{
        wait.until(ExpectedConditions.visibilityOfElementLocated(changepassword));
		 return Driver.findElement(changepassword);
	}
	
	
	public WebElement editsuccess() 
	{
        wait.until(ExpectedConditions.visibilityOfElementLocated(editsuccess));
		 return Driver.findElement(editsuccess);
	}
	
	public WebElement edit() 
	{
        wait.until(ExpectedConditions.visibilityOfElementLocated(edit));
		 return Driver.findElement(edit);
	}
	
	public WebElement otp() 
	{
        wait.until(ExpectedConditions.visibilityOfElementLocated(otp));
		 return Driver.findElement(otp);
	}
	
	public WebElement okotp() 
	{
        wait.until(ExpectedConditions.visibilityOfElementLocated(okotp));
		 return Driver.findElement(okotp);
	}
	
	public int usersucessregistered()
	{
		 return Driver.findElements(usersucessregistered).size();
		
	}
	
	public int emailidregistered()
	{
		 return Driver.findElements(emailidregistered).size();
		
	}
	
	public int mobilelareadyregistered()
	{
		 return Driver.findElements(mobilelareadyregistered).size();
		
	}
	
	
	public int ResendOTP()
	{
		 return Driver.findElements(ResendOTP).size();
		
	}
	
	
	public int invalidOTP()
	{

		 return Driver.findElements(invalidOTP).size();
		
	}
	
	public WebElement useridclr() 
	{
        wait.until(ExpectedConditions.visibilityOfElementLocated(useridclr));
		 return Driver.findElement(useridclr);
	}
	
	public WebElement searchstate() 
	{
        wait.until(ExpectedConditions.visibilityOfElementLocated(searchstate));
		 return Driver.findElement(searchstate);
	}
	
	public WebElement searchoption() 
	{
        wait.until(ExpectedConditions.visibilityOfElementLocated(searchoption));
		 return Driver.findElement(searchoption);
	}
	
	
	
	public WebElement name() 
	{
        wait.until(ExpectedConditions.visibilityOfElementLocated(name));
		 return Driver.findElement(name);
	}
	
	
	public WebElement gender() 
	{
        wait.until(ExpectedConditions.visibilityOfElementLocated(gender));
		 return Driver.findElement(gender);
	}
	
	public WebElement email() 
	{
        wait.until(ExpectedConditions.visibilityOfElementLocated(email));
		 return Driver.findElement(email);
	}
	
	public WebElement userid() 
	{
        wait.until(ExpectedConditions.visibilityOfElementLocated(userid));
		 return Driver.findElement(userid);
	}
	
	
	public WebElement statecode() 
	{
        wait.until(ExpectedConditions.visibilityOfElementLocated(statecode));
		 return Driver.findElement(statecode);
	}
	
	public WebElement districtcode() 
	{
        wait.until(ExpectedConditions.visibilityOfElementLocated(districtcode));
		 return Driver.findElement(districtcode);
	}
	
	public WebElement add1() 
	{
        wait.until(ExpectedConditions.visibilityOfElementLocated(add1));
		 return Driver.findElement(add1);
	}
	
	public WebElement pincode() 
	{
        wait.until(ExpectedConditions.visibilityOfElementLocated(pincode));
		 return Driver.findElement(pincode);
	}
	
	
	public WebElement password() 
	{
        wait.until(ExpectedConditions.visibilityOfElementLocated(password));
		 return Driver.findElement(password);
	}
	
	public WebElement confirmpassword() 
	{
        wait.until(ExpectedConditions.visibilityOfElementLocated(confirmpassword));
		 return Driver.findElement(confirmpassword);
	}
	
	public WebElement submit() 
	{
        wait.until(ExpectedConditions.visibilityOfElementLocated(submit));
		 return Driver.findElement(submit);
	}
}
