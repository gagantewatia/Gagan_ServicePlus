package Pageobject.SPDepOfAnimalHusbandry;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DepOfAnimalHusbandry{
public WebDriver Driver;
WebDriverWait wait;
	
	

public DepOfAnimalHusbandry(WebDriver Driver){
	this.Driver= Driver;
	wait =new WebDriverWait(Driver, Duration.ofSeconds(20));
	
	
}
//Training of Part Time Volunteer for Artificial Insemination and Castration with Stipend/without stipend
By ArtificialInsemination =By.xpath("//h4[normalize-space()='Training of Part Time Volunteer for Artificial Insemination and Castration with Stipend/without stipend']");

//Providing one month Training on Dairy Farming with Stipend/Without Stipend
By DairyFarming = By.xpath("//h4[normalize-space()='Providing one month Training on Dairy Farming with Stipend/Without Stipend']");

//Imparting one month training on Poultry, Piggery, Goat Farming with Stipend/ without Stipend
By OneMonthTraining=By.xpath("//h4[normalize-space()='Imparting one month training on Poultry, Piggery, Goat Farming with Stipend/ without Stipend']");


//Training of Part Time Volunteer for Artificial Insemination and Castration with Stipend/without stipend
By infoArtificialInsemination =By.xpath("//h4[normalize-space()='Training of Part Time Volunteer for Artificial Insemination and Castration with Stipend/without stipend']//following::img[@src='./assets/images/infoIcon.png'][1]");

//Providing one month Training on Dairy Farming with Stipend/Without Stipend
By infoDairyFarming = By.xpath("//h4[normalize-space()='Providing one month Training on Dairy Farming with Stipend/Without Stipend']//following::img[@src='./assets/images/infoIcon.png'][1]");

//Imparting one month training on Poultry, Piggery, Goat Farming with Stipend/ without Stipend
By infoOneMonthTraining=By.xpath("//h4[normalize-space()='Imparting one month training on Poultry, Piggery, Goat Farming with Stipend/ without Stipend']//following::img[@src='./assets/images/infoIcon.png'][1]");

public WebElement infoArtificialInsemination()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoArtificialInsemination));
	  return Driver.findElement(infoArtificialInsemination);
}
public WebElement infoDairyFarming()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoDairyFarming));
	  return Driver.findElement(infoDairyFarming);
}
public WebElement infoOneMonthTraining()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoOneMonthTraining));
	  return Driver.findElement(infoOneMonthTraining);
}
public WebElement ArtificialInsemination()
{
	wait.until(ExpectedConditions.elementToBeClickable(ArtificialInsemination));
	  return Driver.findElement(ArtificialInsemination);
}
public WebElement DairyFarming()
{
	wait.until(ExpectedConditions.elementToBeClickable(DairyFarming));
	  return Driver.findElement(DairyFarming);
}
public WebElement OneMonthTraining()
{
	wait.until(ExpectedConditions.elementToBeClickable(OneMonthTraining));
	  return Driver.findElement(OneMonthTraining);
}
}
