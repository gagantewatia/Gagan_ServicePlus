package Pageobject.SPWelfareofSCsBCs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WelfareofSCsBCs {
public WebDriver Driver;
WebDriverWait wait;
	
	

public WelfareofSCsBCs(WebDriver Driver){
	this.Driver= Driver;
	wait =new WebDriverWait(Driver, Duration.ofSeconds(20));
	
	
}
//Mukhya Mantri samajik Antarjayatia Samrasta Yojna
By AntarjayatiaSamrasta =By.xpath("//h4[normalize-space()='Mukhya Mantri samajik Antarjayatia Samrasta Yojna']");

//Legal AID To Scheduled Castes And Vimukat Jatis
By IntensiveFisheries=By.xpath("//h4[normalize-space()='Legal AID To Scheduled Castes And Vimukat Jatis']");

//Financial Assistance Under Scheduled Castes/Scheduled Tribes(Prevention Of Atrocities) Rules.1995
By FinancialAssistance=By.xpath("//h4[normalize-space()='Financial Assistance Under Scheduled Castes/Scheduled Tribes(Prevention Of Atrocities) Rules.1995']");

//Dr. Ambedkar Sanshodhit Medhavi Chhattar Sansodhit Yojna
By AmbedkarSanshodhit=By.xpath("//h4[normalize-space()='Dr. Ambedkar Sanshodhit Medhavi Chhattar Sansodhit Yojna']");

//Dr B.R Ambedkar Awas Navinikaran Yojna
By AmbedkarAwas=By.xpath("//h4[normalize-space()='Dr B.R Ambedkar Awas Navinikaran Yojna']");


//Legal AID To Scheduled Castes And Vimukat Jatis
By infoIntensiveFisheries=By.xpath("//h4[normalize-space()='Legal AID To Scheduled Castes And Vimukat Jatis']//following::img[@src='./assets/images/infoIcon.png'][1]");

//Financial Assistance Under Scheduled Castes/Scheduled Tribes(Prevention Of Atrocities) Rules.1995
By infoFinancialAssistance=By.xpath("//h4[normalize-space()='Financial Assistance Under Scheduled Castes/Scheduled Tribes(Prevention Of Atrocities) Rules.1995']//following::img[@src='./assets/images/infoIcon.png'][1]");
//Dr B.R Ambedkar Awas Navinikaran Yojna
By infoAmbedkarAwas=By.xpath("//h4[normalize-space()='Dr B.R Ambedkar Awas Navinikaran Yojna']//following::img[@src='./assets/images/infoIcon.png'][1]");
public WebElement infoAmbedkarAwas()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoAmbedkarAwas));
	  return Driver.findElement(infoAmbedkarAwas);
}

public WebElement infoFinancialAssistance()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoFinancialAssistance));
	  return Driver.findElement(infoFinancialAssistance);
}

public WebElement infoIntensiveFisheries()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoIntensiveFisheries));
	  return Driver.findElement(infoIntensiveFisheries);
}


public WebElement AmbedkarSanshodhit()
{
	wait.until(ExpectedConditions.elementToBeClickable(AmbedkarSanshodhit));
	  return Driver.findElement(AmbedkarSanshodhit);
}

public WebElement AmbedkarAwas()
{
	wait.until(ExpectedConditions.elementToBeClickable(AmbedkarAwas));
	  return Driver.findElement(AmbedkarAwas);
}

public WebElement FinancialAssistance()
{
	wait.until(ExpectedConditions.elementToBeClickable(FinancialAssistance));
	  return Driver.findElement(FinancialAssistance);
}

public WebElement IntensiveFisheries()
{
	wait.until(ExpectedConditions.elementToBeClickable(IntensiveFisheries));
	  return Driver.findElement(IntensiveFisheries);
}
public WebElement AntarjayatiaSamrasta()
{
	wait.until(ExpectedConditions.elementToBeClickable(AntarjayatiaSamrasta));
	  return Driver.findElement(AntarjayatiaSamrasta);
}

}
