package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SlotSchedule 

{

	WebDriver Driver;
	By Search=By.xpath("//input[@placeholder='Search']");
	By Filter=By.xpath("//button[text()='Filter']");
	By toggle= By.xpath("/html/body/app-root/app-app-root/app-app-tile-view-container/div[2]/div/div[2]/app-view-slot/app-slot-table/div/div[3]/div/mat-slide-toggle/label/div/div/div[1]");
	By dosequant=By.xpath("//div[@class='chips success ng-star-inserted']");
	By slotsavail=By.xpath("//div[@class='slot-chips']");
	By slotsnotavail=By.xpath("//div[@class='no-slot-chip ng-star-inserted']");
	By back=By.xpath("//button[text()=' Back ']");
	By selects=By.xpath("//button[text()=' Confirm ']");
	By selectappointment=By.xpath("//button[text()='Appointment Slip']");
	By backafterslotconfirm=By.xpath("//button[text()=' Back ']");
	
	public SlotSchedule (WebDriver Driver)
	{
		this.Driver=Driver;
		
	}
	
public WebElement Search()
	
	{
		return Driver.findElement(Search);
				
	}
	
	public WebElement filter()
	
	{
		return Driver.findElement(Filter);
				
	}
public WebElement toggle()
	
	{
		return Driver.findElement(toggle);
				
	}

public WebElement dosequant()

{
	return Driver.findElement(dosequant);
			
}

public WebElement slotsavail()

{
	return Driver.findElement(slotsavail);
			
}

public WebElement selects()
{
	return Driver.findElement(selects);
}

public WebElement back()
{
	return Driver.findElement(back);
}

public WebElement selectappointment()
{
	return Driver.findElement(selectappointment);
}

public WebElement backafterslotconfirm()
{
	return Driver.findElement(backafterslotconfirm);
}


public WebElement slotsnotavail()
{
	return Driver.findElement(slotsnotavail);
}



}
