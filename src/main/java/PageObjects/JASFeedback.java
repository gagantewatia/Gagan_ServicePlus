package PageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JASFeedback {
	
	public WebDriver Driver;
	
	By reportbug=By.xpath("//span[normalize-space()='Report Bug']");
	By reportbugpage=By.xpath("//h2[normalize-space()='Report Bug']");
	
	By reportbugtitle=By.xpath("//span[contains(text(),'Report Bug')]");
	
	By feedback=By.xpath("//span[normalize-space()='Feedback']");
	By feedbackpagetitle=By.xpath("//span[contains(text(),'Feedback')]");
	
    By suggestion= By.xpath("//span[normalize-space()='Suggestion']");	
	By suggestionpagetitle=By.xpath("//span[contains(text(),'Suggestion')]");
	
    By addbutton=By.xpath("//button[@class='btn-default']");
    By firstname=By.xpath("//input[@formcontrolname='userFirstName']");
    By lastname=By.xpath("//input[@formcontrolname='userLastName']");
    
    By state=By.xpath("//mat-select[@formcontrolname='userState']");
    
    
    By statelist=By.xpath("/html/body/div[2]/div[2]/div/div/div/mat-option[2]/span");
    
    By categorybug=By.xpath("//input[@formcontrolname='title']");
    By categorybuglist=By.xpath("/html/body/div[2]/div[2]/div/div/div/mat-option[1]/span/ngx-mat-select-search/div/input");
    
    By categorybugclick=By.xpath("/html/body/app-root/app-feedback-form/div[2]/div/form/div[2]/div[5]/mat-form-field/div/div[1]/div/mat-select/div/div[1]");
    
    By message=By.xpath("//textarea[@placeholder='Enter Message']");
    
    By submit=By.xpath("//button[normalize-space()='Submit']");
    
    By moreadd=By.className("more-feedbacks");
    
    
	public JASFeedback(WebDriver Driver)
	{
		this.Driver=Driver;
	}
	
	public WebElement reportbug()
	{
		 WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(20));
		 wait.until(ExpectedConditions.elementToBeClickable(reportbug));
		return Driver.findElement(reportbug);
	}

	public WebElement reportbugtitle()
	{

		return Driver.findElement(reportbugtitle);
	}
	
	
	
	public WebElement feedback()
	{
		 WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(20));
		 wait.until(ExpectedConditions.elementToBeClickable(feedback));
		return Driver.findElement(feedback);
	}
	
	public WebElement feedbackpagetitle()
	{
		 WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(20));
		 wait.until(ExpectedConditions.elementToBeClickable(feedbackpagetitle));
		return Driver.findElement(feedbackpagetitle);
	}
	
	public WebElement suggestion()
	{
		 WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(20));
		 wait.until(ExpectedConditions.elementToBeClickable(suggestion));
		return Driver.findElement(suggestion);
	}
	
	public WebElement suggestionpagetitle()
	{
		 WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(20));
		 wait.until(ExpectedConditions.elementToBeClickable(suggestionpagetitle));
		return Driver.findElement(suggestionpagetitle);
	}
	public WebElement addbtn()
	{
		 WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(10));
		 wait.until(ExpectedConditions.elementToBeClickable(addbutton));
		return Driver.findElement(addbutton);
	}
	
	public WebElement firstname()
	{
		 WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(20));
		 wait.until(ExpectedConditions.elementToBeClickable(firstname));
		return Driver.findElement(firstname);
	}
	public WebElement lastname()
	{
		 WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(20));
		 wait.until(ExpectedConditions.elementToBeClickable(lastname));
		return Driver.findElement(lastname);
	}
	public WebElement state()
	{
		 WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(20));
		 wait.until(ExpectedConditions.elementToBeClickable(state));
		return Driver.findElement(state);
	}
	public WebElement categorybug()
	{
		 WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(20));
		 wait.until(ExpectedConditions.elementToBeClickable(categorybug));
		return Driver.findElement(categorybug);
	}
	public WebElement categorybuglist()
	{
		 WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(60));
		 wait.until(ExpectedConditions.elementToBeClickable(categorybuglist));
		return Driver.findElement(categorybuglist);
	}
	
	public WebElement message()
	{
		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(20));
		 wait.until(ExpectedConditions.elementToBeClickable(message));
		return Driver.findElement(message);
	}
	
	public WebElement statelist()
	{
		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(20));
		 wait.until(ExpectedConditions.elementToBeClickable(statelist));
		return Driver.findElement(statelist);
	}
	
	public WebElement submit()
	{
		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(20));
		 wait.until(ExpectedConditions.elementToBeClickable(submit));
		return Driver.findElement(submit);
	}
	
	public WebElement reportbugpage()
	{
		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(20));
		 wait.until(ExpectedConditions.elementToBeClickable(reportbugpage));
		return Driver.findElement(reportbugpage);
	}
	
	public WebElement moreadd()
	{
		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(10));
		 wait.until(ExpectedConditions.elementToBeClickable(moreadd));
		return Driver.findElement(moreadd);
	}
	
	public WebElement categorybugclick()
	{
		
		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(40));
		 wait.until(ExpectedConditions.elementToBeClickable(categorybugclick));
		return Driver.findElement(categorybugclick);
	}
	
	
}
