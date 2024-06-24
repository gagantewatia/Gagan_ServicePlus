package Pageobject.SPAgricultureDep;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AgricultureDept{
public WebDriver Driver;
WebDriverWait wait;
	
	

public AgricultureDept(WebDriver Driver){
	this.Driver= Driver;
	wait =new WebDriverWait(Driver, Duration.ofSeconds(20));
	
	
}
//Assistance to farmers for promotion of Horticulture crops and High Value Agriculture
By Horticulturecrops =By.xpath("//h4[normalize-space()='Assistance to farmers for promotion of Horticulture crops and High Value Agriculture']");

//Assistance to farmers under High Yielding Programme
By HighYeilding = By.xpath("//h4[normalize-space()='Assistance to farmers under High Yielding Programme']");

//Development of Minor Irrigation
By  MinorIrrigation=By.xpath("//h4[normalize-space()='Development of Minor Irrigation']");

//Soil Conservation Work and Strenghthening of Soil test Laboratory
By SoilConservation=By.xpath("//h4[normalize-space()='Soil Conservation Work and Strenghthening of Soil test Laboratory']");


//Seeinfo
//Development of Minor Irrigation
By  infoMinorIrrigation=By.xpath("//h4[normalize-space()='Development of Minor Irrigation']//following::img[@src='./assets/images/infoIcon.png'][1]");

//Soil Conservation Work and Strenghthening of Soil test Laboratory
By infoSoilConservation=By.xpath("//h4[normalize-space()='Soil Conservation Work and Strenghthening of Soil test Laboratory']//following::img[@src='./assets/images/infoIcon.png'][1]");

public WebElement infoMinorIrrigation()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoMinorIrrigation));
	  return Driver.findElement(infoMinorIrrigation);
}
public WebElement infoSoilConservation()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoSoilConservation));
	  return Driver.findElement(infoSoilConservation);
}



public WebElement Horticulturecrops()
{
	wait.until(ExpectedConditions.elementToBeClickable(Horticulturecrops));
	  return Driver.findElement(Horticulturecrops);
}
public WebElement HighYeilding()
{
	wait.until(ExpectedConditions.elementToBeClickable(HighYeilding));
	  return Driver.findElement(HighYeilding);
}

public WebElement MinorIrrigation()
{
	wait.until(ExpectedConditions.elementToBeClickable(MinorIrrigation));
	  return Driver.findElement(MinorIrrigation);
}

public WebElement SoilConservation()
{
	wait.until(ExpectedConditions.elementToBeClickable(SoilConservation));
	  return Driver.findElement(SoilConservation);
}

}
