package CPGRAMS;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class CPGRAMSViewStatus {
	
	public WebDriver Driver;
	WebDriverWait wait;
	
	By loginpage=By.xpath("//h2[normalize-space()='Login']");
	By mobileno=By.xpath("//input[@id='userid']");
	By password=By.xpath("//input[@id='password']");
	By login=By.xpath("//button[@id='submit']");
	By crossbutton=By.tagName("svg");
	By closed=By.xpath("//span[contains(text(),'Closed')]");
	By registerationno=By.xpath("(//b[contains(text(),'Registration Number')])");
	By grievanceconcern=By.xpath("//md-select[@id='grevience']");
	By ministryname=By.xpath("//md-select[@id='orgcode']");
	By search=By.xpath("//input[@placeholder='Type to search']");
	By textarea=By.xpath("//textarea[@id='sub']");
	By grievancemessage=By.xpath("//span[normalize-space()='Give Feedback']");
	By ok=By.xpath("//button[@ng-click='vm.cancel()']");
	By duplicate=By.xpath("//p[normalize-space()='Duplicate']");
	By listfirstoption=By.xpath("//div[@class='md-text ng-binding']");
	By viewstatus=By.xpath("//div[@id='moreclosed0']//span[@class='show-moreless'][normalize-space()='Show More']");
	By departmentaction=By.xpath("//td[contains(text(),'Action Taken by Department')]");
	By okyes=By.xpath("//span[normalize-space()='Yes']");
	By FP=By.xpath("//a[normalize-space()='Forgot Password']");
	By Wrongemailid=By.xpath("//p[normalize-space()='Wrong email id']");
	By newuser=By.xpath("//a[normalize-space()='New User']");
	By logout=By.xpath("//a[@href='#/cpgramLogin/cpgramLogout']");
	
	
	public CPGRAMSViewStatus(WebDriver Driver) 
	{
		this.Driver=Driver;
	 wait = new WebDriverWait(Driver, Duration.ofSeconds(30));
		
	}


	
	
	public WebElement logout() 
	{
        wait.until(ExpectedConditions.visibilityOfElementLocated(logout));
		 return Driver.findElement(logout);
	}
	
	
	public WebElement newuser() 
	{
        wait.until(ExpectedConditions.visibilityOfElementLocated(newuser));
		 return Driver.findElement(newuser);
	}
	
	public WebElement FP() 
	{
        wait.until(ExpectedConditions.visibilityOfElementLocated(FP));
		 return Driver.findElement(FP);
	}
	
	public WebElement wrongemailid()
	{
        wait.until(ExpectedConditions.visibilityOfElementLocated(Wrongemailid));
		 return Driver.findElement(Wrongemailid);
	}
	
	public WebElement departmentaction() 
	{
        wait.until(ExpectedConditions.visibilityOfElementLocated(departmentaction));
		 return Driver.findElement(departmentaction);
	}
	
	public WebElement okyes() 
	{
        wait.until(ExpectedConditions.visibilityOfElementLocated(okyes));
		 return Driver.findElement(okyes);
	}
	
	
	
	public WebElement viewstatus() 
	{
        wait.until(ExpectedConditions.visibilityOfElementLocated(viewstatus));
		 return Driver.findElement(viewstatus);
	}
	
	
	
	public WebElement listfirstoption() 
	{
        wait.until(ExpectedConditions.visibilityOfElementLocated(listfirstoption));
		 return Driver.findElement(listfirstoption);
	}
	
	
	public WebElement search() 
	{
        wait.until(ExpectedConditions.visibilityOfElementLocated(search));
		 return Driver.findElement(search);
	}
	
	
	
	public int duplicate() 
	{

		 return Driver.findElements(duplicate).size();
	}
	

	
	public WebElement OK() 
	{
		

		 wait.until(ExpectedConditions.visibilityOfElementLocated(ok));
		 return Driver.findElement(ok);
	}
	
	public int grievancemessage() 
	{
		


		 return Driver.findElements(grievancemessage).size();
	}
	
	
	public WebElement grievanceconcern() 
	{
		

		 wait.until(ExpectedConditions.visibilityOfElementLocated(grievanceconcern));
		 return Driver.findElement(grievanceconcern);
	}
	
	
	public WebElement ministryname() 
	{
		

		 wait.until(ExpectedConditions.visibilityOfElementLocated(ministryname));
		 return Driver.findElement(ministryname);
	}
	
	public WebElement textarea() 
	{
		

		 wait.until(ExpectedConditions.visibilityOfElementLocated(textarea));
		 return Driver.findElement(textarea);
	}
	
	
	
	public WebElement registerationno() 
	{
		

		 wait.until(ExpectedConditions.visibilityOfElementLocated(registerationno));
		 return Driver.findElement(registerationno);
	}
	
	public WebElement closed() 
	{
		
	

		 wait.until(ExpectedConditions.visibilityOfElementLocated(closed));
		 return Driver.findElement(closed);
	}
	
	
	public WebElement crossbutton() 
	{
		
	

		 wait.until(ExpectedConditions.visibilityOfElementLocated(crossbutton));
		 return Driver.findElement(crossbutton);
	}
	
	
	
	public int loginpage() 
	{
		
	
		 return Driver.findElements(loginpage).size();
	}
	
	public WebElement mobileno() 
	{
		
		 wait.until(ExpectedConditions.visibilityOfElementLocated(mobileno));
		 return Driver.findElement(mobileno);
	}
	public WebElement password() 
	{
		
		 wait.until(ExpectedConditions.visibilityOfElementLocated(password));
		 return Driver.findElement(password);
	}
	
	public WebElement login() 
	{
		
		 wait.until(ExpectedConditions.visibilityOfElementLocated(login));
		 return Driver.findElement(login);
	}
	
	
	
	
	public void loginuser(String Mobile, String password) throws InterruptedException
	{
		mobileno().sendKeys(Keys.CONTROL+ "a");
		mobileno().sendKeys(Keys.DELETE);
		Thread.sleep(1000);
		mobileno().sendKeys(Mobile);
		password().sendKeys(password);
		login().click();
		
		
		
	}
	
	
	
	
	}
	
	
	

