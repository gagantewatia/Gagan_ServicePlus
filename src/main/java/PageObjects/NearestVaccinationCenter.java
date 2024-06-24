package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NearestVaccinationCenter {

	WebDriver Driver;
	
	By PIN=By.xpath("//div[contains(text(),'Search by PIN')]");
	
	By District=By.xpath("//div[contains(text(),'Search by District')]");
	
	By pincode=By.xpath("//input[@formcontrolname='pincode']");

	By Stateclick=By.xpath("(//input[@role='combobox'])[1]");
	
	By Districtclick=By.xpath("(//input[@role='combobox'])[2]");
	
	By map=By.xpath("//div[contains(text(),'On the Map')]");
	
	By mapsearch=By.id("searchAuto" );
	
	By mapcheckavailability=By.xpath("//span[contains(text(),'Check Availability')]");
	
	By mapprev=By.xpath("//button[text()='Prev')]");
	
	By mapnext=By.xpath("//button[text()='Next')]");
	
	By continued=By.xpath("//button[text()='Continue']");
	
	By search=By.xpath("//button[text()=' Search ']");
	
	By toggle=By.xpath("/html/body/app-root/app-app-root/app-app-tile-view-container/div[2]/div/div[2]/app-view-slot/app-slot-table/div/div[2]/div/ul/li[1]/mat-slide-toggle/label/div/div/div[1]");
	
	By filter=By.xpath("//button[text()='Filter']");
	
	By listage=By.xpath("/html/body/div/div[2]/div/mat-dialog-container/app-book-appointment-filter/mat-dialog-content/div/div[1]/ul/li[2]");
	
	By fee=By.xpath("/html/body/div/div[2]/div/mat-dialog-container/app-book-appointment-filter/mat-dialog-content/div/div[3]/ul/li[3]");
	
	By applyfilter=By.xpath("//button[text()=' Apply ']");
	
	By maphover=By.xpath("//img[@class='leaflet-marker-icon leaflet-zoom-animated leaflet-interactive']");
	
	public NearestVaccinationCenter(WebDriver Driver)
	{
		this.Driver=Driver;
		
	}
	public WebElement PIN()
	{
		return Driver.findElement(PIN);
	}
	public WebElement District()
	{
		return Driver.findElement(District);
	}
	public WebElement pincode()
	{
		return Driver.findElement(pincode);
	}
	
	public WebElement searchbutton()
	
	{
		return Driver.findElement(search);
	}
	
	
	public WebElement continued()
	{
		return Driver.findElement(continued);
	}


	public WebElement stateclick()
	
	{
		return Driver.findElement(Stateclick);
	}
	

	public WebElement districtclick()
	
	{
		return Driver.findElement(Districtclick);
	}
	
public WebElement map()
	
	{
		return Driver.findElement(map);
	} 



public WebElement mapcheckavailability()

{
	return Driver.findElement(mapcheckavailability);
} 


public WebElement mapprev()

{
	return Driver.findElement(mapprev);
} 

public WebElement mapnext()

{
	return Driver.findElement(mapnext);
}

public WebElement mapsearch()

{
	return Driver.findElement(mapsearch);
}

public WebElement toggle()
{
	return Driver.findElement(toggle);
}

public WebElement filter()
{
	return Driver.findElement(filter);
}

public WebElement listage()
{
	return Driver.findElement(listage);
}

public WebElement listfee()

{
	return Driver.findElement(fee);
}

public WebElement applyfilter()

{
	return Driver.findElement(applyfilter);
}

public WebElement maphover()
{
 return Driver.findElement(maphover);
}
}




