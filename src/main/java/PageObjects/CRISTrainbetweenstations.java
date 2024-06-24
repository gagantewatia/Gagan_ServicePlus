package PageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CRISTrainbetweenstations {
	
	WebDriver Driver;
	
	By fromstations=By.xpath("/html/body/app-root/app-app-root/app-app-tile-view-container/div/div/div[2]/app-train-bw-stations/form/div[1]/div[1]/app-rail-searchable-dropdown/div/div/div[1]/input");
	
	By tostation=By.xpath("/html/body/app-root/app-app-root/app-app-tile-view-container/div/div/div[2]/app-train-bw-stations/form/div[1]/div[2]/app-rail-searchable-dropdown/div/div/div[1]/input");
	
	By fromstationlist=By.xpath("/html/body/app-root/app-app-root/app-app-tile-view-container/div/div/div[2]/app-train-bw-stations/form/div[1]/div[1]/app-rail-searchable-dropdown/div/div/div[2]/cdk-virtual-scroll-viewport/div[1]/ul/li");
	 
	By tostationlist= By.xpath("/html/body/app-root/app-app-root/app-app-tile-view-container/div/div/div[2]/app-train-bw-stations/form/div[1]/div[2]/app-rail-searchable-dropdown/div/div/div[2]/cdk-virtual-scroll-viewport/div[1]/ul/li");
	
	By calenderclick=By.xpath("//button[@aria-label='Open calendar']");
	
	By submit=By.xpath("//button[text()='Submit']");
	
	By searchbox=By.xpath("//div[@class='input-wrapper']");
    By distance=By.xpath("//span[contains(text(),'Distance:')]");
    By searchcount1=By.xpath("//h3[normalize-space()='Record count : 1']");
	By norouteimage=By.xpath("//img[@src='assets/images/no-train-found.svg']");
	By noroutetext=By.xpath("//p[contains(text(),'No direct trains available between the inputted stations. Would you like to search the in!')]");
	
	
	By closenoroute=By.xpath("//button[@class='btn'][normalize-space()='Close']");
	
	By crossfromstation=By.xpath("(//img[@class='pointer ng-star-inserted'])[1]");
	 
	By crosstostation=By.xpath("(//img[@class='pointer ng-star-inserted'])[2]");
	
	By searchresult=By.xpath("//div[@class='card h-100 ng-star-inserted']");
	
	By searchtype=By.xpath("/html/body/app-root/app-app-root/app-app-tile-view-container/div/div/div[2]/app-train-stations-info/div[1]/div/app-dropdown-search/div/input");
	
	By trainnavigateimage=By.xpath("(//img[@alt='status-btn'])[1]");
	
	public  CRISTrainbetweenstations (WebDriver Driver) 
	{
		this.Driver=Driver;
	}
	
	public WebElement fromstation()
    {
		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(fromstations));
        return Driver.findElement(fromstations);
    			
    }
	public WebElement tostation()
    {
		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(tostation));
        return Driver.findElement(tostation);
    			
    }
    
	public WebElement fromstationlist()
    {
		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(fromstationlist));
        return Driver.findElement(fromstationlist);
    			
    }
    
	public WebElement tostationlist()
    {
		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(tostationlist));
        return Driver.findElement(tostationlist);
    			
    }
    
	public WebElement calenderclick()
    {
		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(calenderclick));
        return Driver.findElement(calenderclick);
    			
    }
	
	public WebElement submit()
	{
		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(submit));
        return Driver.findElement(submit);	
	}
	
	public WebElement searchbox()
	
	{
		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(searchbox));
        return Driver.findElement(searchbox);	
	}
    
public WebElement noroutetext()
	
	{
		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(noroutetext));
        return Driver.findElement(noroutetext);	
	}

public WebElement closenoroute()

{
	WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(20));
	wait.until(ExpectedConditions.visibilityOfElementLocated(closenoroute));
    return Driver.findElement(closenoroute);	
}

public WebElement crossfromstation()

{
	WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(10));
	wait.until(ExpectedConditions.visibilityOfElementLocated(crossfromstation));
    return Driver.findElement(crossfromstation);	
}

public WebElement crosstostation()

{
	WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(20));
	wait.until(ExpectedConditions.visibilityOfElementLocated(crosstostation));
    return Driver.findElement(crosstostation);	
}

public WebElement searchresult()

{
	WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(20));
	wait.until(ExpectedConditions.visibilityOfElementLocated(searchresult));
    return Driver.findElement(searchresult);	
}

public WebElement searchtype()

{
	WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(20));
	wait.until(ExpectedConditions.visibilityOfElementLocated(searchtype));
    return Driver.findElement(searchtype);	
}


public WebElement trainnavigateimage()
{
	WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(20));
	wait.until(ExpectedConditions.visibilityOfElementLocated(trainnavigateimage));
	return Driver.findElement(trainnavigateimage);
}

public WebElement distance()
{	
	WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(20));
wait.until(ExpectedConditions.visibilityOfElementLocated(distance));
	return Driver.findElement(distance);
}
public WebElement searchcount1()
{
	WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(20));
	wait.until(ExpectedConditions.visibilityOfElementLocated(searchcount1));
	return Driver.findElement(searchcount1);
}

}



