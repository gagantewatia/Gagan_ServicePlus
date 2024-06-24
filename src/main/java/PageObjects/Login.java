package PageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login {
	
	public WebDriver Driver;
	
	By mobile=By.xpath("//input[@formcontrolname='mob']");
	By mpin=By.xpath("//input[@formcontrolname='mpin']");
	By wLogin=By.className("btn");
	By accountrecovery=By.xpath("//h4[normalize-space()='Account Recovery Options']");
	By imagecross=By.xpath("//img[@src='assets/img/error_icon.svg']");
	
	public int  accountrecovery()
	{
		
		return Driver.findElements(accountrecovery).size();	
	}	
			
	public WebElement imagecross()
	{
		 WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(30));
		 wait.until(ExpectedConditions.elementToBeClickable(imagecross));
		return Driver.findElement(imagecross);
		
	}
	
	
			
	public Login(WebDriver Driver)
	{
		this.Driver=Driver;
		
	}

	public WebElement getmobile()
	{
		 WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(30));
		 wait.until(ExpectedConditions.elementToBeClickable(mobile));
		return Driver.findElement(mobile);
		
	}
	public WebElement getmpin()
	{
		 WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(30));
		 wait.until(ExpectedConditions.elementToBeClickable(mpin));
		return Driver.findElement(mpin);
		
	}
	public WebElement getlogin()
	{
		 WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(30));
		 wait.until(ExpectedConditions.elementToBeClickable(wLogin));
		return Driver.findElement(wLogin);
		
	}
	
}
