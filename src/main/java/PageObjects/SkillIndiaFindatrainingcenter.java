package PageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SkillIndiaFindatrainingcenter {
	public WebDriver Driver;
	By trainingdetail=By.xpath("//img[@src='assets/images/right-arrow.svg']");
	By trgcenterdetails=By.xpath("(//div[text()=' Training Centre Details '])");
	By trgsearchmatched=By.xpath("//strong[text()='Matches found']");
	By searchimage=By.xpath("//img[@src='assets/images/search-icon.svg']");
	By search=By.xpath("//input[@placeholder='Search by Training Centre Name']");
	
	By filterimage=By.xpath("//img[@src='assets/images/filter-icon.svg']");
	
	By state=By.xpath("//mat-select[@formcontrolname='state']");
	By district=By.xpath("//mat-select[@formcontrolname='district']");
	By sector1=By.xpath("//mat-select[@formcontrolname='sector']");
	By searchenterfilter=By.xpath("//input[@placeholder='Search']");
	By jobrole=By.xpath("//mat-select[@formcontrolname='jobRole']");
	
	By filterapply=By.xpath("//button[normalize-space()='Apply']");
	By norecordfilter=By.xpath("//p[normalize-space()='No results found!']");
	
	By close=By.xpath("//button[normalize-space()='Close']");
	By filterresult=By.xpath("//strong[text()='Results found']");
	
		public SkillIndiaFindatrainingcenter(WebDriver Driver)
		{
			this.Driver=Driver;
		}
	
	public WebElement trainingdetail()
	{
		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(20));
		 wait.until(ExpectedConditions.elementToBeClickable(trainingdetail));
		return Driver.findElement(trainingdetail);
	}
	
	public WebElement trgcenterdetails()
	{
		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(20));
		 wait.until(ExpectedConditions.elementToBeClickable(trgcenterdetails));
		return Driver.findElement(trgcenterdetails);
	}
	
	
	public WebElement searchimage()
	{

		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(20));
		 wait.until(ExpectedConditions.elementToBeClickable(searchimage));
		return Driver.findElement(searchimage);
	}
	
	public WebElement search()
	{

		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(30));
		 wait.until(ExpectedConditions.elementToBeClickable(search));
		return Driver.findElement(search);
			
	}
	
	public WebElement filterimage()
	{

		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(30));
		 wait.until(ExpectedConditions.elementToBeClickable(filterimage));
		return Driver.findElement(filterimage);
			
	}
	
	public WebElement trgsearchmatched()
	{

		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(30));
		 wait.until(ExpectedConditions.elementToBeClickable(trgsearchmatched));
		return Driver.findElement(trgsearchmatched);
			
	}
	
	public WebElement state()
	{

		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(20));
		 wait.until(ExpectedConditions.elementToBeClickable(state));
		return Driver.findElement(state);
			
	}
	
	public WebElement district()
	{

		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(30));
		 wait.until(ExpectedConditions.elementToBeClickable(district));
		return Driver.findElement(district);
			
	}
	
	

	public WebElement searchenterfilter()
	{
		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(30));
		 wait.until(ExpectedConditions.visibilityOfElementLocated(searchenterfilter));
		return Driver.findElement(searchenterfilter);
			
	}
	public WebElement sector1()
	{
		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(30));
		 wait.until(ExpectedConditions.elementToBeClickable(sector1));
		return Driver.findElement(sector1);
			
	}
	
	public WebElement applyfilter()
	{

		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(20));
		 wait.until(ExpectedConditions.elementToBeClickable(filterapply));
		return Driver.findElement(filterapply);
			
	}
	public WebElement jobrole()
	{

		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(20));
		 wait.until(ExpectedConditions.elementToBeClickable(jobrole));
		return Driver.findElement(jobrole);
			
	}
	public WebElement norecordfilter()
	{

		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(20));
		 wait.until(ExpectedConditions.elementToBeClickable(norecordfilter));
		return Driver.findElement(norecordfilter);
			
	}
	public WebElement close()
	{

		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(20));
		 wait.until(ExpectedConditions.elementToBeClickable(close));
		return Driver.findElement(close);
			
	}
	public WebElement resultfound()
	{

		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(20));
		 wait.until(ExpectedConditions.elementToBeClickable(filterresult));
		return Driver.findElement(filterresult);
			
	}
	
	}
	
	

