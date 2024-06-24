package PageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class ServiceDirectoryNavigation {
	
	public WebDriver Driver;
	
By SD=By.xpath("//a[text()=' Service Directory ']");
By profile=By.xpath("//span[@class='user-menu-label']");
By logout=By.xpath("//span[text()='Logout']");
By backbutton=By.xpath("//div[@class='back-to-home']");
By Umangbacklogobutton=By.xpath("//img[@src='https://media.umangapp.in/cdn/web/theme/icons/new_logo.svg']");
By SDtitle=By.xpath("//div[contains(text(),'SERVICES ON UMANG')]");
By profilemenu=By.xpath("//div[normalize-space()='Popular Services']");

public ServiceDirectoryNavigation(WebDriver Driver)
{
	this.Driver=Driver;
	
}
public WebElement profilemenu()
{
	
		 WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(20));
		 wait.until(ExpectedConditions.elementToBeClickable(profilemenu));
		 return Driver.findElement(profilemenu);
}
	
public void backtohome()
{
Driver.switchTo().defaultContent();

backbutton().click();
//Assert.assertEquals(profilemenu().getText(),"Popular Services","Not matched");

}
public void Umangbackbutton()
{
Driver.switchTo().defaultContent();

Umangbacklogobutton().click();
//Assert.assertEquals(profilemenu().getText(),"Popular Services","Not matched");

}

public WebElement Service()
{
	
		 WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(20));
		 wait.until(ExpectedConditions.elementToBeClickable(SD));
		 return Driver.findElement(SD);
		
	
}

public WebElement profile()
{
	return Driver.findElement(profile);
}

public WebElement logout()
{
	return Driver.findElement(logout);
}


public WebElement backbutton()

{
	return Driver.findElement(backbutton);
}
public WebElement Umangbacklogobutton()

{
	return Driver.findElement(Umangbacklogobutton);
}

public WebElement SDtitle()
{
	return Driver.findElement(SDtitle);
}


}

