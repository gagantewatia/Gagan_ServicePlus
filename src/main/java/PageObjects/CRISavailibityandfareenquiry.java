package PageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class CRISavailibityandfareenquiry {
	
	WebDriver Driver;
	By calenderclick=By.xpath("//button[@aria-label='Open calendar']");
	By selectfirstactivedate1=By.cssSelector("td[class='mat-calendar-body-cell ng-star-inserted'] div[class='mat-calendar-body-cell-content']");
	By selectfirstactivatedate=By.cssSelector("td[class='mat-calendar-body-cell mat-calendar-body-active ng-star-inserted'] div[class='mat-calendar-body-cell-content mat-calendar-body-today']");
	By trainnumber=By.xpath("/html/body/app-root/app-app-root/app-app-tile-view-container/div/div/div[2]/app-av-fair-inquiry/form/div[1]/div[1]/searchable-dropdown/ng-select/div/div/div[3]/input");
	By trainnumberlist=By.xpath("/html/body/ng-dropdown-panel/div/div[2]/div/span");
	By fromstation=By.xpath("/html/body/app-root/app-app-root/app-app-tile-view-container/div/div/div[2]/app-av-fair-inquiry/form/div[1]/div[2]/searchable-dropdown/ng-select/div/div/div[3]/input");
	By fromstationlist=By.xpath("/html/body/ng-dropdown-panel/div/div[2]/div/span");

	By tostation=By.xpath("/html/body/app-root/app-app-root/app-app-tile-view-container/div/div/div[2]/app-av-fair-inquiry/form/div[1]/div[3]/searchable-dropdown/ng-select/div/div/div[3]/input");
	By tostationlist=By.xpath("/html/body/ng-dropdown-panel/div/div[2]/div[1]/span");
	
	By classoftrain=By.xpath("/html/body/app-root/app-app-root/app-app-tile-view-container/div/div/div[2]/app-av-fair-inquiry/form/div[1]/div[5]/searchable-dropdown/ng-select/div/div/div[3]/input");
	By classlist=By.xpath("/html/body/ng-dropdown-panel/div/div[2]/div/span");
	
	By quota=By.xpath("/html/body/app-root/app-app-root/app-app-tile-view-container/div/div/div[2]/app-av-fair-inquiry/form/div[1]/div[6]/searchable-dropdown/ng-select/div/div/div[3]/input");
	By quotalist=By.xpath("/html/body/ng-dropdown-panel/div/div[2]/div/span");
	
	
	By submit=By.xpath("//button[normalize-space()='Submit']");
	By close=By.xpath("//button[@class='btn'][normalize-space()='Close']");
	By classdoesnotexist=By.xpath("//p[contains(text(),'Class does not exist in this train for this Train ')]");
	By openbox=By.xpath("//img[@class='open-list ng-star-inserted']");
	By openboxdetails=By.xpath("//div[@class='row ng-star-inserted']");
	By journeydate=By.xpath("//input[@formcontrolname='journeyDate']");
	
	public CRISavailibityandfareenquiry(WebDriver Driver)
	{
		this.Driver=Driver;
	}


	public WebElement calenderclick()

	{
		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(calenderclick));
	    return Driver.findElement(calenderclick);	
	}
	public WebElement selectfirstactivedate()

	{
		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(selectfirstactivatedate));
	    return Driver.findElement(selectfirstactivatedate);	
	}
	
	public WebElement trainnumber()
	{
		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(trainnumber));
	    return Driver.findElement(trainnumber);
	}
	
	public WebElement trainnumberlist()
	{
		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(trainnumberlist));
	    return Driver.findElement(trainnumberlist);
	}
	public WebElement journeydate()
	{
		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(journeydate));
	    return Driver.findElement(journeydate);
	}
	
	public WebElement fromstation()
	{
		
		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(fromstation));
	    return Driver.findElement(fromstation);
	}
	public WebElement fromstationlist()
	{
		
		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(fromstationlist));
	    return Driver.findElement(fromstationlist);
	}
	
	
	public WebElement classoftrain()
	{
		
		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(classoftrain));
	    return Driver.findElement(classoftrain);
	}
	
	public WebElement classlist()
	{
		
		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(classlist));
	    return Driver.findElement(classlist);
	}
	
	
	public WebElement tostation()
	{
		
	WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(tostation));
	    return Driver.findElement(tostation);
	}
	
	public WebElement tostationlist()
	{
		
		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(tostationlist));
	    return Driver.findElement(tostationlist);
	}
	
	
	
	public WebElement quota()
	{
		
		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(quota));
	    return Driver.findElement(quota);
	}
	
	public WebElement quotalist()
	{
		
		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(quotalist));
	    return Driver.findElement(quotalist);
	}
	
	
	public WebElement submit()
	{
		
		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(submit));
	    return Driver.findElement(submit);
	}
	
	public WebElement classnotexist()
	{
		
		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(classdoesnotexist));
	    return Driver.findElement(classdoesnotexist);
	}
	
	public WebElement close()
	{
		
		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(close));
	    return Driver.findElement(close);
	}
	
	
	public WebElement openbox()
	{
		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(40));
		wait.until(ExpectedConditions.visibilityOfElementLocated(openbox));
	    return Driver.findElement(openbox);
		
	}
	
	public WebElement openboxdetails()
	{
		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(openboxdetails));
	    return Driver.findElement(openboxdetails);
		
	}
	}

