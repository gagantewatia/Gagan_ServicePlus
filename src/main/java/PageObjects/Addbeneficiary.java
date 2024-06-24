package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Addbeneficiary 

{
	public WebDriver Driver;
	
	By name=By.id("mat-input-2");
	By calender=By.id("mat-input-4");
	By Gender=By.xpath("//div[@class='ng-select-container ng-has-value']");
    By SelectGender=By.xpath("/html/body/ng-dropdown-panel/div/div[2]/div[1]");
	By photoidproof=By.xpath("/html[1]/body[1]/app-root[1]/app-app-root[1]/app-app-tile-view-container[1]/div[2]/div[1]/div[2]/app-registration-form[1]/div[1]/form[1]/div[1]/div[4]/searchable-dropdown[1]/ng-select[1]/div[1]/div[1]/div[2]");
	By idnumber=By.id("mat-input-3");
	

public Addbeneficiary(WebDriver Driver)

{
	this.Driver=Driver;
	
}

public WebElement name()
{
return Driver.findElement(name);
}

public WebElement calender()

{
return Driver.findElement(calender);
}

public WebElement Gender()
{
return Driver.findElement(Gender);
}

public WebElement SelectGender()
{
return Driver.findElement(SelectGender);
}


public WebElement photoidproof()
{
return Driver.findElement(photoidproof);
}

public WebElement idnumber()
{
return Driver.findElement(idnumber);
}

}




