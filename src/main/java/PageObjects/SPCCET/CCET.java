package PageObjects.SPCCET;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CCET{
public WebDriver Driver;
WebDriverWait wait;
	
	

public CCET(WebDriver Driver){
	this.Driver= Driver;
	wait =new WebDriverWait(Driver, Duration.ofSeconds(20));
	
	
}
//Online submission of Aadhaar Card to the District Agriculture Office for PM Kisan Beneficiary ONLY
By Scholarship =By.xpath("//h4[normalize-space()='Scholarship to Meritorious and SC/ST Students of CCET Chandigarh']");
//By SPpageheading =By.xpath("//div[@class='table_cont header_new']");

By infoScholarship =By.xpath("//h4[normalize-space()='Scholarship to Meritorious and SC/ST Students of CCET Chandigarh']//following::img[@src='./assets/images/infoIcon.png'][1]");

public WebElement infoScholarship()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoScholarship));
	  return Driver.findElement(infoScholarship);
}

public WebElement Scholarship()
{
	wait.until(ExpectedConditions.elementToBeClickable(Scholarship));
	  return Driver.findElement(Scholarship);
}

}
