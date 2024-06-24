package PageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JASMedicineList {

	//this POM contains data for Search medicine and NEarby Storepage and about us
	public WebDriver Driver;
	
	By generic=By.xpath("(//span[contains(text(),'Generic')])");
	
	By otherbrands=	By.xpath("//div[@class='description-column']");
	
	By otherbrandsnextpage=By.xpath("//h4[normalize-space()='Other Brands']");
	
	By bookmark= By.xpath("//img[@class='cursor-pointer']");
	
	By clickbookmarklink = By.xpath("/html/body/app-root/app-tile-view-container/div[2]/div/div[1]/div/a[3]/img");
	
	By deletebookmark=By.xpath("//img[@src='assets/images/delete.svg']");
	
	By deletebookmarkbutton=By.xpath("//button[normalize-space()='Yes']");
	
	By totalrecords=By.xpath("//div[@class='total-records']");
	
	By neareststore=By.xpath("//img[@src='assets/images/distance.svg']");
	
	By neareststorepage=By.xpath("//span[text()='Nearby Store']");
	
	By searchicon=By.xpath("//img[@src='assets/images/search-icon.svg']");
	
	By searchbox=By.xpath("//input[@formcontrolname='search']");
	
    By searchmedicinetitle=By.xpath("//mat-header-cell[normalize-space()='Medicine Name']");
    
    By nearbystoresearchbox=By.xpath("//img[@src='assets/images/search-icon.svg']");
	
    By nearbybuttontext=By.xpath("//button[contains(text(),'Email')]");
    
    By nearbymap=By.xpath("//button[@class='distance']");
    
    By mappagedestination=By.xpath("//span[normalize-space()='Add destination']");
    
    By PMBJB=By.xpath("//div[contains(text(),'About PMBJP')]");
    By PMBJBdata=By.xpath("//b[normalize-space()='Salient features of scheme :']");
    
    
    By PMBI=By.xpath("//div[contains(text(),'About PMBI')]");
    By PMBIdata=By.xpath("//li[contains(text(),'Coordinate with Hospitals in preparation of formulary.')]");
    
    
	public WebElement PMBJB()
	{
		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(20));
		 wait.until(ExpectedConditions.visibilityOfElementLocated(PMBJB));
	  return Driver.findElement(PMBJB);
	}
    
	public WebElement PMBJBdata()
	{
		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(20));
		 wait.until(ExpectedConditions.visibilityOfElementLocated(PMBJBdata));
	  return Driver.findElement(PMBJBdata);
	}
    
	
	public WebElement PMBI()
	{
		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(20));
		 wait.until(ExpectedConditions.visibilityOfElementLocated(PMBI));
	  return Driver.findElement(PMBI);
	}
	
	public WebElement PMBIdata()
	{
		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(20));
		 wait.until(ExpectedConditions.visibilityOfElementLocated(PMBIdata));
	  return Driver.findElement(PMBIdata);
	}
	
	
    
	public JASMedicineList(WebDriver Driver) 
	{
		this.Driver=Driver;
	}
	
	public WebElement generic()
	{
		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(20));
		 wait.until(ExpectedConditions.visibilityOfElementLocated(generic));
	  return Driver.findElement(generic);
	}
	
	public WebElement otherbrands()
	{
		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(20));
		 wait.until(ExpectedConditions.visibilityOfElementLocated(otherbrands));
	  return Driver.findElement(otherbrands);
	}
	
	public WebElement otherbrandsnextpage()
	{
		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(20));
		 wait.until(ExpectedConditions.visibilityOfElementLocated(otherbrandsnextpage));
	  return Driver.findElement(otherbrandsnextpage);
	}
	
	public WebElement bookmark()
	{
		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(40));
		 wait.until(ExpectedConditions.visibilityOfElementLocated(bookmark));
	  return Driver.findElement(bookmark);
	}
	

	public WebElement clickbookmarklink()
	{
		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(20));
		 wait.until(ExpectedConditions.visibilityOfElementLocated(clickbookmarklink));
	    return Driver.findElement(clickbookmarklink);
	}
	
	
	public WebElement totalrecords()
	{
		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(20));
		 wait.until(ExpectedConditions.visibilityOfElementLocated(totalrecords));
	    return Driver.findElement(totalrecords);
	}
	
	
	public WebElement neareststore()
	{
		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(20));
		 wait.until(ExpectedConditions.visibilityOfElementLocated(neareststore));
	    return Driver.findElement(neareststore);
	}
	
	public WebElement neareststorepage()
	{
		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(20));
		 wait.until(ExpectedConditions.visibilityOfElementLocated(neareststorepage));
	    return Driver.findElement(neareststorepage);
	}
	
	public WebElement searchbox()
	{
		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(20));
		 wait.until(ExpectedConditions.visibilityOfElementLocated(searchbox));
	    return Driver.findElement(searchbox);
	}
	
	public WebElement searchboxtitle()
	{
		 return Driver.findElement(searchmedicinetitle);
	}
	
	public WebElement searchicon()
	{
		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(20));
		 wait.until(ExpectedConditions.visibilityOfElementLocated(searchicon));
	    return Driver.findElement(searchicon);
	}
	
	public WebElement deletebookmark()
	{
		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(20));
		 wait.until(ExpectedConditions.visibilityOfElementLocated(deletebookmark));
	    return Driver.findElement(deletebookmark);
	}
	
	public WebElement deletebookmarkbutton()
	{
		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(20));
		 wait.until(ExpectedConditions.visibilityOfElementLocated(deletebookmarkbutton));
	    return Driver.findElement(deletebookmarkbutton);
	}
	
	public WebElement nearbystoresearchbox()
	{
		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(20));
		 wait.until(ExpectedConditions.visibilityOfElementLocated(nearbystoresearchbox));
	    return Driver.findElement(nearbystoresearchbox);
	}
	
	public WebElement nearbybuttontext()
	{
		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(20));
		 wait.until(ExpectedConditions.visibilityOfElementLocated(nearbybuttontext));
	    return Driver.findElement(nearbybuttontext);
		
	}
	
	public WebElement nearbymap()
	{
		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(20));
		 wait.until(ExpectedConditions.visibilityOfElementLocated(nearbymap));
	    return Driver.findElement(nearbymap);
		
	}
	public WebElement mappagedestination()
	{
		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(20));
		 wait.until(ExpectedConditions.visibilityOfElementLocated(mappagedestination));
	    return Driver.findElement(mappagedestination);
		
	}
	
	}
	

