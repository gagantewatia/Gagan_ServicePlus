package PageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class certificatecorrectionpom {
	
	public WebDriver Driver;
	
	public certificatecorrectionpom(WebDriver Driver)

	{
		
		this.Driver=Driver;
	}
	
	
	By benname=By.xpath("//div[@class='ng-input']");
	
	By benlist=By.xpath("//span[@class='ng-option-label ng-star-inserted']");
	
	By editname=By.xpath("(//img[@alt='edit'])[1]");
	
	By editgender=By.xpath("(//img[@alt='edit'])[3]");
	
	By editphotiid=By.xpath("(//img[@alt='edit'])[4]");
	
	By changename=By.xpath("//input[@formcontrolname='memberName']");
	By changephotoid=By.xpath("//input[@formcontrolname='photoId']");
		
    By genname=By.id("gender");
    
    By selectgender=By.xpath("//span[@class='ng-option-label ng-star-inserted']");
    
    By submit= By.xpath("//button[text()=' Submit ']");
	
	public WebElement benname()
	{
		return Driver.findElement(benname);
	}
	
	
	public List<WebElement> benlist()
	
	{
		
		return Driver.findElements(benlist);
		
	}
	
	public WebElement editname()
	
	{
		
		return Driver.findElement(editname);
		
	}

public WebElement changename()
	
	{
		
		return Driver.findElement(changename);
		
	}

public WebElement genname()
{
	return Driver.findElement(genname);
}
	
public List<WebElement> selectgender()

{
	return Driver.findElements(selectgender);

}

public WebElement editgender()

{
	return Driver.findElement(editgender);

}

public WebElement photoid()

{
	return Driver.findElement(editphotiid);

}

public WebElement changephotoid()

{
	return Driver.findElement(changephotoid);

}

public WebElement submit()

{
	return Driver.findElement(submit);
}
}
