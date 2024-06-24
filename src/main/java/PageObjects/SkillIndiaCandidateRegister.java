package PageObjects;


import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SkillIndiaCandidateRegister {

	public WebDriver Driver;
	
	By salutation=By.xpath("//mat-select[@formcontrolname='salutation']");
	By name=By.xpath("//input[@formcontrolname='name']");
	By guardianname=By.xpath("//input[@formcontrolname='guardianName']");
	By calender=By.xpath("/html/body/app-root/app-app-root/app-app-tile-view-container/div[2]/div/div[2]/app-registration/div/mat-tab-group/div/mat-tab-body[1]/div/app-step1-registration/form/div/div[4]/app-date-picker/mat-form-field/div/div[1]/div[1]/input");
	By gender=By.xpath("//mat-select[@formcontrolname='gender']");
	By email=By.xpath("//input[@formcontrolname='email']");
	By mobileno=By.xpath("//input[@formcontrolname='mobileNumber']");
	By education=By.xpath("//mat-select[@formcontrolname='education']");
	
	By nextbutton=By.xpath("//button[normalize-space()='Next']");
	By location=By.xpath("//h3[normalize-space()='Location Details']");
	
	By pincode=By.xpath("//input[@formcontrolname='pincode']");
	
	By state=By.xpath("//mat-select[@formcontrolname='state']");
	By searchenterpath=By.xpath("/html/body/div[2]/div[2]/div/div/div/mat-option[1]/span/ngx-mat-select-search/div/input");
	By district=By.xpath("//mat-select[@formcontrolname='district']");
	By sector=By.xpath("//mat-select[@formcontrolname='sector']");
	By sector1=By.xpath("/html/body/div[2]/div[2]/div/div/div/mat-option[2]");
	By interestedin=By.xpath("//mat-select[@formcontrolname='interested']"); 
	By  interestedoption=By.className("mat-option");
	By preview=By.xpath("//button[normalize-space()='Preview']");
	By previewpage=By.xpath("//div[contains(text(),'Preview')]");
	By previewcancel=By.xpath("//button[normalize-space()='Cancel']");
	By submit=By.xpath("//button[normalize-space()='Submit']");
	By userexists=By.xpath("//p[normalize-space()='User Already exists!']");
	By canditateregistered=By.xpath("//p[normalize-space()='Candidate is already registred!']");
	By close=By.xpath("//button[normalize-space()='Close']");
	By registersucessfull=By.xpath("//p[normalize-space()='Credentials will be shared via SMS & Email']");
	By Home=By.xpath("//button[normalize-space()='Home']");
	By username=By.xpath("//input[@formcontrolname='username']");
	By password=By.xpath("//input[@formcontrolname='password']");
	By Login=By.xpath("//button[normalize-space()='Login']");
	By invalidlogin=By.xpath("//p[normalize-space()='Invalid UserName or Password!']"); 
	By loginnoresultfound=By.xpath("//p[normalize-space()='No results found!']");
	By trainingstatuspage=By.xpath("//span[contains(text(),'Training Status')]");
	By Logout=By.xpath("//button[normalize-space()='Logout']");
	
	public SkillIndiaCandidateRegister(WebDriver Driver)
	{
		this.Driver=Driver;
		
	}
	
	public WebElement salutation()
	{
		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(30));
		 wait.until(ExpectedConditions.elementToBeClickable(salutation));
		return Driver.findElement(salutation);
		
	}
	
	
	public WebElement name()
	{
		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(30));
		 wait.until(ExpectedConditions.elementToBeClickable(name));
		return Driver.findElement(name);
		
	}
	
	public WebElement guardianname()
	{
		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(30));
		 wait.until(ExpectedConditions.elementToBeClickable(guardianname));
		return Driver.findElement(guardianname);
		
	}
	public WebElement calender()
	{
		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(30));
		 wait.until(ExpectedConditions.elementToBeClickable(calender));
		return Driver.findElement(calender);
		
	}
	public WebElement gender()
	{	WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(30));
	 wait.until(ExpectedConditions.elementToBeClickable(gender));
		return Driver.findElement(gender);
		
	}
	
	public WebElement email()
	{	WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(30));
	 wait.until(ExpectedConditions.elementToBeClickable(email));
		return Driver.findElement(email);
		
	}
	public WebElement mobileno()
	{	WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(30));
	 wait.until(ExpectedConditions.elementToBeClickable(mobileno));
		return Driver.findElement(mobileno);
		
	}
	
	public WebElement education()
	{
		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(30));
		 wait.until(ExpectedConditions.elementToBeClickable(education));
		return Driver.findElement(education);
		
	}
	public WebElement nextbutton()
	{
		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(30));
		 wait.until(ExpectedConditions.elementToBeClickable(nextbutton));
		return Driver.findElement(nextbutton);
		
	}
	
	public WebElement location()
	{
		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(30));
		 wait.until(ExpectedConditions.elementToBeClickable(location));
		return Driver.findElement(location);
	}
	
	public WebElement pincode()
	{
		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(30));
		 wait.until(ExpectedConditions.elementToBeClickable(pincode));
		return Driver.findElement(pincode);
		
	}
	
	public WebElement searchenterpath()
	{
		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(30));
		 wait.until(ExpectedConditions.elementToBeClickable(searchenterpath));
		return Driver.findElement(searchenterpath);
	}
	
	public WebElement state()
	{
		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(20));
		 wait.until(ExpectedConditions.elementToBeClickable(state));
		return Driver.findElement(state);
	}
	
	public WebElement district()
	{
		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(20));
		 wait.until(ExpectedConditions.elementToBeClickable(district));
		return Driver.findElement(district);
	}
	
	public WebElement sector()
	{
		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(20));
		 wait.until(ExpectedConditions.elementToBeClickable(sector));
		return Driver.findElement(sector);
	}
	
	public WebElement sector1()
	{
		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(20));
		 wait.until(ExpectedConditions.elementToBeClickable(sector1));
		return Driver.findElement(sector1);
	}
	public WebElement interestedin()
	{
		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(20));
		 wait.until(ExpectedConditions.elementToBeClickable(interestedin));
		return Driver.findElement(interestedin);
	}
	
	public List<WebElement> interestedoption()
	{
		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(20));
		 wait.until(ExpectedConditions.elementToBeClickable(interestedoption));
		return Driver.findElements(interestedoption);
	}
	
	public WebElement Preview()
	{
		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(20));
		 wait.until(ExpectedConditions.elementToBeClickable(preview));
		return Driver.findElement(preview);
	}
	
	
	public WebElement Previewpage()
	{
		return Driver.findElement(previewpage);
	}
	
	public WebElement Previewcancel()
	{
		return Driver.findElement(previewcancel);
	}
	
	public WebElement submit()
	{
		return Driver.findElement(submit);
	}
	
	public int userexists()
	{

		return Driver.findElements(userexists).size();
	}
	
	public int closed()
	{

		return Driver.findElements(close).size();
	}
	
	public WebElement close()
	{
		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(20));
		 wait.until(ExpectedConditions.elementToBeClickable(close));
		return Driver.findElement(close);
	}
	
	public WebElement registersucessfull()
	{
		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(20));
		 wait.until(ExpectedConditions.elementToBeClickable(registersucessfull));
		return Driver.findElement(registersucessfull);
	}
	
	public WebElement Home()
	{
		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(20));
		 wait.until(ExpectedConditions.elementToBeClickable(Home));
		return Driver.findElement(Home);	
		}
	
	public int candidateregistered()
	{

		return Driver.findElements(canditateregistered).size();
	}
	
	
	public WebElement username()
	{
		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(20));
		 wait.until(ExpectedConditions.elementToBeClickable(username));
		return Driver.findElement(username);	
		}
	
	
	public WebElement password()
	{
		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(20));
		 wait.until(ExpectedConditions.elementToBeClickable(password));
		return Driver.findElement(password);	
		}
	
	
	public WebElement login()
	{
		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(20));
		 wait.until(ExpectedConditions.elementToBeClickable(Login));
		return Driver.findElement(Login);	
		}
	
	public WebElement invalidlogin()
	{
		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(20));
		 wait.until(ExpectedConditions.elementToBeClickable(invalidlogin));
		return Driver.findElement(invalidlogin);	
	}
	
	public WebElement loginnoresultfound()
	{
		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(20));
		 wait.until(ExpectedConditions.elementToBeClickable(loginnoresultfound));
		return Driver.findElement(loginnoresultfound);	
	}
	
	public WebElement trainingstatuspage()
	{
		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(20));
		 wait.until(ExpectedConditions.elementToBeClickable(trainingstatuspage));
		return Driver.findElement(trainingstatuspage);	
	}
	

	public WebElement logout()
	{
		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(20));
		 wait.until(ExpectedConditions.elementToBeClickable(Logout));
		return Driver.findElement(Logout);	
	}
	
	
	}
	

	

