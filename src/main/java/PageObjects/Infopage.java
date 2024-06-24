package PageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.aventstack.extentreports.Status;



public class Infopage {

	WebDriver Driver;
	public Infopage(WebDriver Driver)
	{
		this.Driver=Driver;
	}
	
	
	By seeinfo1=By.xpath("(//p[@class='seemore-button'])[1]");
	By seeinfo4=By.xpath("(//p[@class='seemore-button'])[4]");
	By seeinfo2=By.xpath("(//p[@class='seemore-button'])[2]");
	By seeinfo3=By.xpath("(//p[@class='seemore-button'])[3]");
	By visitservice=By.xpath("//button[normalize-space()='Visit Service']");
	By visitserviceCAPS=By.xpath("//span[normalize-space()='VISIT SERVICE']");
	By AICTEapprovedbuttoninfo=By.xpath("//p[contains(text(),'Citizens can  view list of Colleges, course details and Faculty details of AICTE approved Institutes/Colleges.')]"); 
    By AICTEtrackstatusinfo=By.xpath("//p[contains(text(),'AICTE in order to ensure development of technical education in India awards Post Graduate Scholarship of Rs. 12,400/- per month through its Post Graduate Scholarship Scheme to full time GATE/GPAT qualified students admitted to AICTE approved programs Master of Engineering, Master of Technology, Master of Architecture and Master of Pharmacy courses in AICTE approved Institutions and AICTE approved University Departments.')]"); 
	By AICTEcheckeligibilty=By.xpath("//p[contains(text(),'AICTE in order to ensure development of technical education in India awards Post Graduate Scholarship of Rs. 12,400/- per month through its Post Graduate Scholarship Scheme to full time GATE/GPAT qualified students admitted to AICTE approved programs Master of Engineering, Master of Technology, Master of Architecture and Master of Pharmacy courses in AICTE approved Institutions and AICTE approved University Departments.')]");
	
   By seeinfop1=By.xpath("(//p[normalize-space()='See Info'])[1]");
   By seeinfop2=By.xpath("(//p[normalize-space()='See Info'])[2]");
   By seeinfop3=By.xpath("(//p[normalize-space()='See Info'])[3]");
   By seeinfop4=By.xpath("(//p[normalize-space()='See Info'])[4]");
   By seeinfop5=By.xpath("(//p[normalize-space()='See Info'])[5]");
   By seeinfop6=By.xpath("(//p[normalize-space()='See Info'])[6]");
   By seeinfop7=By.xpath("(//p[normalize-space()='See Info'])[7]");
  
	
	By seeinfo1icon=By.xpath("(//img[@src='assets/images/infoIcon.png'])[1]");
	By seeinfo2icon=By.xpath("(//img[@src='assets/images/infoIcon.png'])[2]");
	By seeinfo5icon=By.xpath("(//img[@src='assets/images/infoIcon.png'])[5]");
	By seeinfo6icon=By.xpath("(//img[@src='assets/images/infoIcon.png'])[6]");
	By seeinfo7icon=By.xpath("(//img[@src='assets/images/infoIcon.png'])[7]");
	By seeinfo10icon=By.xpath("(//img[@src='assets/images/infoIcon.png'])[10]");
	By seeinfo3icon=By.xpath("(//img[@src='assets/images/infoIcon.png'])[3]");
	By seeinfo4icon=By.xpath("(//img[@src='assets/images/infoIcon.png'])[4]");
	By seeinfo8icon=By.xpath("(//img[@src='assets/images/infoIcon.png'])[8]");
	By seeinfo9icon=By.xpath("(//img[@src='assets/images/infoIcon.png'])[9]");
	By seeinfo11icon=By.xpath("(//img[@src='assets/images/infoIcon.png'])[11]");
	By seeinfo12icon=By.xpath("(//img[@src='assets/images/infoIcon.png'])[12]");
	By seeinfo18icon=By.xpath("(//img[@src='assets/images/infoIcon.png'])[18]");
	By seeinfo19icon=By.xpath("(//img[@src='assets/images/infoIcon.png'])[19]");
	By seeinfo20icon=By.xpath("(//img[@src='assets/images/infoIcon.png'])[20]");
	By seeinfo21icon=By.xpath("(//img[@src='assets/images/infoIcon.png'])[21]");
	By seeinfo6bot=By.xpath("(//div[@class='arrow-icon ng-star-inserted'])[6]");
	By seeinfo1iconflat=By.xpath("(//img[@src='./assets/images/infoIcon.png'])[1]");
	By seeinfo2iconflat=By.xpath("(//img[@src='./assets/images/infoIcon.png'])[2]");
	By seeinfo3iconflat=By.xpath("(//img[@src='./assets/images/infoIcon.png'])[3]");
	By seeinfo4iconflat=By.xpath("(//img[@src='./assets/images/infoIcon.png'])[4]");
	By seeinfo6iconflat=By.xpath("(//img[@src='./assets/images/infoIcon.png'])[6]");
	By seeinfo5iconflat=By.xpath("(//img[@src='./assets/images/infoIcon.png'])[5]");
	By seeinfo7iconflat=By.xpath("(//img[@src='./assets/images/infoIcon.png'])[7]");
	By seeinfo8iconflat=By.xpath("(//img[@src='./assets/images/infoIcon.png'])[8]");
	By seeinfo9iconflat=By.xpath("(//img[@src='./assets/images/infoIcon.png'])[9]");
	By seeinfo10iconflat=By.xpath("(//img[@src='./assets/images/infoIcon.png'])[10]");
	By seeinfo11iconflat=By.xpath("(//img[@src='./assets/images/infoIcon.png'])[11]");
	By seeinfo12iconflat=By.xpath("(//img[@src='./assets/images/infoIcon.png'])[12]");
	By seeinfo13iconflat=By.xpath("(//img[@src='./assets/images/infoIcon.png'])[13]");
	By seeinfo14iconflat=By.xpath("(//img[@src='./assets/images/infoIcon.png'])[14]");
	By seeinfo15iconflat=By.xpath("(//img[@src='./assets/images/infoIcon.png'])[15]");
	By seeinfo16iconflat=By.xpath("(//img[@src='./assets/images/infoIcon.png'])[16]");
	By seeinfo17iconflat=By.xpath("(//img[@src='./assets/images/infoIcon.png'])[17]");
	By seeinfo18iconflat=By.xpath("(//img[@src='./assets/images/infoIcon.png'])[18]");
	By seeinfo19iconflat=By.xpath("(//img[@src='./assets/images/infoIcon.png'])[19]");
	By seeinfo20iconflat=By.xpath("(//img[@src='./assets/images/infoIcon.png'])[20]");
	By seeinfo21iconflat=By.xpath("(//img[@src='./assets/images/infoIcon.png'])[21]");
	By seeinfo22iconflat=By.xpath("(//img[@src='./assets/images/infoIcon.png'])[22]");
	By seeinfo23iconflat=By.xpath("(//img[@src='./assets/images/infoIcon.png'])[23]");
	By seeinfo24iconflat=By.xpath("(//img[@src='./assets/images/infoIcon.png'])[24]");
	By seeinfo25iconflat=By.xpath("(//img[@src='./assets/images/infoIcon.png'])[25]");
	By seeinfo26iconflat=By.xpath("(//img[@src='./assets/images/infoIcon.png'])[26]");
	By seeinfo27iconflat=By.xpath("(//img[@src='./assets/images/infoIcon.png'])[27]");

	By seeinfosvg2=By.xpath("(//*[name()='svg'])[2]");
	By seeinfosvg3=By.xpath("(//*[name()='svg'])[3]");
	By seeinfosvg4=By.xpath("(//*[name()='svg'])[4]");
	By seeinfosvg5=By.xpath("(//*[name()='svg'])[5]");
	By seeinfosvg6=By.xpath("(//*[name()='svg'])[6]");
	By seeinfosvg7=By.xpath("(//*[name()='svg'])[7]");
	By seeinfosvg9=By.xpath("(//*[name()='svg'])[9]");
	By seeinfosvg11=By.xpath("(//*[name()='svg'])[11]");
	By seeInfoButton=By.xpath("//p[contains(@class,'seemore-button ng-star-inserted')]");
	By seeinfobutton6=By.xpath("(//p[@class='seemore-button'])[6]");
	By seeinfobutton4=By.xpath("(//p[@class='seemore-button'])[4]");
	By seeinfobutton5=By.xpath("(//p[@class='seemore-button'])[5]");
	By seeinfobutton7=By.xpath("(//p[@class='seemore-button'])[7]");
	By seeinfobutton8=By.xpath("(//p[@class='seemore-button'])[8]");
	By seeinfobutton2=By.xpath("(//p[@class='seemore-button'])[2]");
	By seeinfobutton1=By.xpath("(//p[@class='seemore-button'])[1]");
	By seeinfobutton3=By.xpath("(//p[@class='seemore-button'])[3]");
	By ataginfo3=By.xpath("(//a[@class='inf-button'])[3]");
	By ataginfo1=By.xpath("(//a[@class='inf-button'])[1]");
	By ataginfo2=By.xpath("(//a[@class='inf-button'])[2]");
	By ataginfo8=By.xpath("(//a[@class='inf-button'])[8]");
	By ataginfo9=By.xpath("(//a[@class='inf-button'])[9]");
	
	//see info page service name 
	By infoservicename  =By.xpath("//p[@class='ng-star-inserted']");
	
	//see info page Serviceplus service name 
		By infoservicename2  =By.xpath("//div[@class='service-name']");
		
		


		public WebElement infoservicename2()
		{
			WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(10));
			wait.until(ExpectedConditions.elementToBeClickable(infoservicename2));
			  return Driver.findElement(infoservicename2);
		}


	public WebElement infoservicename()
	{
		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(infoservicename));
		  return Driver.findElement(infoservicename);
	}
	public WebElement ataginfo9()
	{
		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(10));
		 wait.until(ExpectedConditions.elementToBeClickable(ataginfo9));
		return Driver.findElement(ataginfo9);
	}
	
	public WebElement ataginfo8()
	{
		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(10));
		 wait.until(ExpectedConditions.elementToBeClickable(ataginfo8));
		return Driver.findElement(ataginfo8);
	}
	public WebElement seeInfoButton1()
	{
		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(40));
		 wait.until(ExpectedConditions.elementToBeClickable(seeinfobutton1));
		return Driver.findElement(seeinfobutton1);
	}
	public WebElement ataginfo3()
	{
		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(10));
		 wait.until(ExpectedConditions.elementToBeClickable(ataginfo3));
		return Driver.findElement(ataginfo3);
	}
	public WebElement ataginfo2()
	{
		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(10));
		 wait.until(ExpectedConditions.elementToBeClickable(ataginfo2));
		return Driver.findElement(ataginfo2);
	}
	
	public WebElement ataginfo1()
	{
		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(10));
		 wait.until(ExpectedConditions.elementToBeClickable(ataginfo1));
		return Driver.findElement(ataginfo1);
	}
	public WebElement seeInfoButton3()
	{
		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(40));
		 wait.until(ExpectedConditions.elementToBeClickable(seeinfobutton3));
		return Driver.findElement(seeinfobutton3);
	}
	
	
	
	public WebElement seeInfoButton7()
	{
		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(40));
		 wait.until(ExpectedConditions.elementToBeClickable(seeinfobutton7));
		return Driver.findElement(seeinfobutton7);
	}
	public WebElement seeInfoButton8()
	{
		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(40));
		 wait.until(ExpectedConditions.elementToBeClickable(seeinfobutton8));
		return Driver.findElement(seeinfobutton8);
	}
	public WebElement seeInfoButton2()
	{
		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(40));
		 wait.until(ExpectedConditions.elementToBeClickable(seeinfobutton2));
		return Driver.findElement(seeinfobutton2);
	}
	
	
	
	public WebElement seeInfoButton()
	{
		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(40));
		 wait.until(ExpectedConditions.elementToBeClickable(seeInfoButton));
		return Driver.findElement(seeInfoButton);
	}
	public WebElement seeInfoButton4()
	{
		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(40));
		 wait.until(ExpectedConditions.elementToBeClickable(seeinfobutton4));
		return Driver.findElement(seeinfobutton4);
	}
	  By description=By.xpath("//div[@class='text-left ng-binding']");

  By Serviceplusdiscription=By.xpath("//p[@class='decription']");
  
	 public WebElement seeinfobutton6()
		{
			WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(10));
			 wait.until(ExpectedConditions.elementToBeClickable(seeinfobutton6));
			return Driver.findElement(seeinfobutton6);
		}
	 public WebElement seeinfobutton5()
		{
			WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(10));
			 wait.until(ExpectedConditions.elementToBeClickable(seeinfobutton5));
			return Driver.findElement(seeinfobutton5);
		}
	 
	 
  public WebElement seeinfo9icon()
	{
		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(40));
		 wait.until(ExpectedConditions.elementToBeClickable(seeinfo9icon));
		return Driver.findElement(seeinfo9icon);
	}
  public WebElement seeinfo27iconflat()
	{
		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(40));
		 wait.until(ExpectedConditions.elementToBeClickable(seeinfo27iconflat));
		return Driver.findElement(seeinfo27iconflat);
	}
  public WebElement seeinfo26iconflat()
	{
		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(40));
		 wait.until(ExpectedConditions.elementToBeClickable(seeinfo26iconflat));
		return Driver.findElement(seeinfo26iconflat);
	}
  public WebElement seeinfo25iconflat()
	{
		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(40));
		 wait.until(ExpectedConditions.elementToBeClickable(seeinfo25iconflat));
		return Driver.findElement(seeinfo25iconflat);
	}
  public WebElement seeinfo24iconflat()
	{
		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(40));
		 wait.until(ExpectedConditions.elementToBeClickable(seeinfo24iconflat));
		return Driver.findElement(seeinfo24iconflat);
	}
  public WebElement seeinfo23iconflat()
	{
		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(40));
		 wait.until(ExpectedConditions.elementToBeClickable(seeinfo23iconflat));
		return Driver.findElement(seeinfo23iconflat);
	}
  public WebElement seeinfo22iconflat()
	{
		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(40));
		 wait.until(ExpectedConditions.elementToBeClickable(seeinfo22iconflat));
		return Driver.findElement(seeinfo22iconflat);
	}
  public WebElement seeinfo21iconflat()
	{
		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(40));
		 wait.until(ExpectedConditions.elementToBeClickable(seeinfo21iconflat));
		return Driver.findElement(seeinfo21iconflat);
	}
  public WebElement seeinfo20iconflat()
	{
		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(40));
		 wait.until(ExpectedConditions.elementToBeClickable(seeinfo20iconflat));
		return Driver.findElement(seeinfo20iconflat);
	}
  public WebElement seeinfo19iconflat()
	{
		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(40));
		 wait.until(ExpectedConditions.elementToBeClickable(seeinfo19iconflat));
		return Driver.findElement(seeinfo19iconflat);
	}
  public WebElement seeinfo18iconflat()
	{
		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(40));
		 wait.until(ExpectedConditions.elementToBeClickable(seeinfo18iconflat));
		return Driver.findElement(seeinfo18iconflat);
	}
  public WebElement seeinfo17iconflat()
	{
		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(40));
		 wait.until(ExpectedConditions.elementToBeClickable(seeinfo17iconflat));
		return Driver.findElement(seeinfo17iconflat);
	}
  public WebElement seeinfo16iconflat()
	{
		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(40));
		 wait.until(ExpectedConditions.elementToBeClickable(seeinfo16iconflat));
		return Driver.findElement(seeinfo16iconflat);
	}
  public WebElement seeinfo15iconflat()
 	{
 		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(40));
 		 wait.until(ExpectedConditions.elementToBeClickable(seeinfo15iconflat));
 		return Driver.findElement(seeinfo15iconflat);
 	}
  public WebElement seeinfo14iconflat()
 	{
 		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(40));
 		 wait.until(ExpectedConditions.elementToBeClickable(seeinfo14iconflat));
 		return Driver.findElement(seeinfo14iconflat);
 	}
  public WebElement seeinfo13iconflat()
 	{
 		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(40));
 		 wait.until(ExpectedConditions.elementToBeClickable(seeinfo13iconflat));
 		return Driver.findElement(seeinfo13iconflat);
 	}
  public WebElement seeinfo12iconflat()
 	{
 		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(40));
 		 wait.until(ExpectedConditions.elementToBeClickable(seeinfo12iconflat));
 		return Driver.findElement(seeinfo12iconflat);
 	}
  public WebElement seeinfo11iconflat()
 	{
 		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(40));
 		 wait.until(ExpectedConditions.elementToBeClickable(seeinfo11iconflat));
 		return Driver.findElement(seeinfo11iconflat);
 	}
  public WebElement seeinfo10iconflat()
 	{
 		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(40));
 		 wait.until(ExpectedConditions.elementToBeClickable(seeinfo10iconflat));
 		return Driver.findElement(seeinfo10iconflat);
 	}
  public WebElement seeinfo9iconflat()
 	{
 		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(40));
 		 wait.until(ExpectedConditions.elementToBeClickable(seeinfo9iconflat));
 		return Driver.findElement(seeinfo9iconflat);
 	}
  public WebElement seeinfo8iconflat()
	{
		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(40));
		 wait.until(ExpectedConditions.elementToBeClickable(seeinfo8iconflat));
		return Driver.findElement(seeinfo8iconflat);
	}
  public WebElement seeinfo4iconflat()
	{
		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(40));
		 wait.until(ExpectedConditions.elementToBeClickable(seeinfo4iconflat));
		return Driver.findElement(seeinfo4iconflat);
	}
  public WebElement seeinfo3iconflat()
	{
		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(40));
		 wait.until(ExpectedConditions.elementToBeClickable(seeinfo3iconflat));
		return Driver.findElement(seeinfo3iconflat);
	}
  
  public WebElement seeinfo2iconflat()
 	{
 		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(40));
 		 wait.until(ExpectedConditions.elementToBeClickable(seeinfo2iconflat));
 		return Driver.findElement(seeinfo2iconflat);
 	}
  
  public WebElement seeinfo1iconflat()
	{
		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(40));
		 wait.until(ExpectedConditions.elementToBeClickable(seeinfo1iconflat));
		return Driver.findElement(seeinfo1iconflat);
	}

  public WebElement seeinfo6bot()
	{
		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(40));
		 wait.until(ExpectedConditions.elementToBeClickable(seeinfo6bot));
		return Driver.findElement(seeinfo6bot);
	}
  
	 public WebElement seeinfop1()
		{
			WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(40));
			 wait.until(ExpectedConditions.elementToBeClickable(seeinfop1));
			return Driver.findElement(seeinfop1);
		}
	 
	 
	 public WebElement seeinfop2()
		{
			WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(40));
			 wait.until(ExpectedConditions.elementToBeClickable(seeinfop2));
			return Driver.findElement(seeinfop2);
		}
	 
	 public WebElement seeinfop3()
		{
			WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(40));
			 wait.until(ExpectedConditions.elementToBeClickable(seeinfop3));
			return Driver.findElement(seeinfop3);
		}
	 
	 public WebElement seeinfop4()
		{
			WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(40));
			 wait.until(ExpectedConditions.elementToBeClickable(seeinfop4));
			return Driver.findElement(seeinfop4);
		}
	 
	 public WebElement seeinfop5()
		{
			WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(40));
			 wait.until(ExpectedConditions.elementToBeClickable(seeinfop5));
			return Driver.findElement(seeinfop5);
		}
	 
	 public WebElement seeinfop6()
		{
			WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(40));
			 wait.until(ExpectedConditions.elementToBeClickable(seeinfop6));
			return Driver.findElement(seeinfop6);
		}
	 
	 
	 public WebElement seeinfop7()
		{
			WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(40));
			 wait.until(ExpectedConditions.elementToBeClickable(seeinfop7));
			return Driver.findElement(seeinfop7);
		}
	
	  public WebElement description()
		{
			WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(40));
			 wait.until(ExpectedConditions.elementToBeClickable(description));
			return Driver.findElement(description);
		}

		  
	  public WebElement Serviceplusdiscription()
			{
				WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(40));
				 wait.until(ExpectedConditions.visibilityOfElementLocated(Serviceplusdiscription));
				return Driver.findElement(Serviceplusdiscription);
			}

	  
	 public WebElement seeinfosvg2()
		{
			WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(40));
			 wait.until(ExpectedConditions.elementToBeClickable(seeinfosvg2));
			return Driver.findElement(seeinfosvg2);
		}
	 
	 public WebElement seeinfosvg3()
		{
			WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(40));
			 wait.until(ExpectedConditions.elementToBeClickable(seeinfosvg3));
			return Driver.findElement(seeinfosvg3);
		}
	 
	 public WebElement seeinfosvg5()
		{
			WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(40));
			 wait.until(ExpectedConditions.elementToBeClickable(seeinfosvg5));
			return Driver.findElement(seeinfosvg5);
		}
	 
	 public WebElement seeinfosvg7()
		{
			WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(40));
			 wait.until(ExpectedConditions.elementToBeClickable(seeinfosvg7));
			return Driver.findElement(seeinfosvg7);
		}
	 
	 public WebElement seeinfosvg9()
		{
			WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(40));
			 wait.until(ExpectedConditions.elementToBeClickable(seeinfosvg9));
			return Driver.findElement(seeinfosvg9);
		}
	 
	 public WebElement seeinfosvg11()
		{
			WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(40));
			 wait.until(ExpectedConditions.elementToBeClickable(seeinfosvg11));
			return Driver.findElement(seeinfosvg11);
		}
	 
	 
	 
	 public WebElement seeinfosvg4()
		{
			WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(40));
			 wait.until(ExpectedConditions.elementToBeClickable(seeinfosvg4));
			return Driver.findElement(seeinfosvg4);
		}
	
	 public WebElement seeinfosvg6()
		{
			WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(40));
			 wait.until(ExpectedConditions.elementToBeClickable(seeinfosvg6));
			return Driver.findElement(seeinfosvg6);
		}
    public WebElement seeinfo1()
	{
		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(40));
		 wait.until(ExpectedConditions.elementToBeClickable(seeinfo1));
		return Driver.findElement(seeinfo1);
	}
	
    public WebElement seeinfo11icon()
  	{
  		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(40));
  		 wait.until(ExpectedConditions.elementToBeClickable(seeinfo11icon));
  		return Driver.findElement(seeinfo11icon);
  	}
    
    public WebElement seeinfo12icon()
  	{
  		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(40));
  		 wait.until(ExpectedConditions.elementToBeClickable(seeinfo12icon));
  		return Driver.findElement(seeinfo12icon);
  	}
  	
    
  	
    public WebElement seeinfo18icon()
  	{
  		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(40));
  		 wait.until(ExpectedConditions.elementToBeClickable(seeinfo18icon));
  		return Driver.findElement(seeinfo18icon);
  	}
    
    public WebElement seeinfo19icon()
  	{
  		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(40));
  		 wait.until(ExpectedConditions.elementToBeClickable(seeinfo19icon));
  		return Driver.findElement(seeinfo19icon);
  	}
    
    public WebElement seeinfo20icon()
  	{
  		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(40));
  		 wait.until(ExpectedConditions.elementToBeClickable(seeinfo20icon));
  		return Driver.findElement(seeinfo20icon);
  	}
    
    
    public WebElement seeinfo21icon()
  	{
  		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(40));
  		 wait.until(ExpectedConditions.elementToBeClickable(seeinfo21icon));
  		return Driver.findElement(seeinfo21icon);
  	}
    
    
    
    
    public WebElement seeinfo1icon()
	{
		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(40));
		 wait.until(ExpectedConditions.elementToBeClickable(seeinfo1icon));
		return Driver.findElement(seeinfo1icon);
	}
    
    public WebElement seeinfo3icon()
   	{
   		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(40));
   		 wait.until(ExpectedConditions.elementToBeClickable(seeinfo3icon));
   		return Driver.findElement(seeinfo3icon);
   	}
    
    public WebElement seeinfo5icon()
  	{
  		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(40));
  		 wait.until(ExpectedConditions.elementToBeClickable(seeinfo5icon));
  		return Driver.findElement(seeinfo5icon);
  	}
    
    public WebElement seeinfo2icon()
  	{
  		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(30));
  		 wait.until(ExpectedConditions.elementToBeClickable(seeinfo2icon));
  		return Driver.findElement(seeinfo2icon);
  	}
    
    public WebElement seeinfo4icon()
  	{
  		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(40));
  		 wait.until(ExpectedConditions.elementToBeClickable(seeinfo4icon));
  		return Driver.findElement(seeinfo4icon);
  	}
    
    public WebElement seeinfo6icon()
   	{
   		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(40));
   		 wait.until(ExpectedConditions.elementToBeClickable(seeinfo6icon));
   		return Driver.findElement(seeinfo6icon);
   	}
     
    public WebElement seeinfo6iconflat()
   	{
   		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(40));
   		 wait.until(ExpectedConditions.elementToBeClickable(seeinfo6iconflat));
   		return Driver.findElement(seeinfo6iconflat);
   	}
    
    public WebElement seeinfo5iconflat()
   	{
   		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(40));
   		 wait.until(ExpectedConditions.elementToBeClickable(seeinfo5iconflat));
   		return Driver.findElement(seeinfo5iconflat);
   	}
    
    public WebElement seeinfo7iconflat()
   	{
   		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(40));
   		 wait.until(ExpectedConditions.elementToBeClickable(seeinfo7iconflat));
   		return Driver.findElement(seeinfo7iconflat);
   	}
    
    
    public WebElement seeinfo7icon()
   	{
   		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(40));
   		 wait.until(ExpectedConditions.elementToBeClickable(seeinfo7icon));
   		return Driver.findElement(seeinfo7icon);
   	}
    
    public WebElement seeinfo8icon()
   	{
   		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(40));
   		 wait.until(ExpectedConditions.elementToBeClickable(seeinfo8icon));
   		return Driver.findElement(seeinfo8icon);
   	}
    
    
    
    public WebElement seeinfo10icon()
   	{
   		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(40));
   		 wait.until(ExpectedConditions.elementToBeClickable(seeinfo10icon));
   		return Driver.findElement(seeinfo10icon);
   	}
    
	public WebElement AICTEapprovedbuttoninfo()
	
	{
		return Driver.findElement(AICTEapprovedbuttoninfo);
		
	}
  public WebElement visitservice()
	
	{	WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(30));
		 wait.until(ExpectedConditions.elementToBeClickable(visitservice));
		return Driver.findElement(visitservice);
		
	}
	
  public WebElement visitserviceCAPS()
	
	{	WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(30));
		 wait.until(ExpectedConditions.elementToBeClickable(visitserviceCAPS));
		return Driver.findElement(visitserviceCAPS);
		
	}
  
  
	public WebElement seeinfo4()
	{
		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(20));
		 wait.until(ExpectedConditions.elementToBeClickable(seeinfo4));
		return Driver.findElement(seeinfo4);
	}
	
	public WebElement AICTEtrackstatusinfo()
	
	{
		return Driver.findElement(AICTEtrackstatusinfo);
		
	}

public WebElement AICTEcheckeligibilty()
	
	{
		return Driver.findElement(AICTEcheckeligibilty);
		
	}
public WebElement seeinfo2()
{
	WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(20));
	 wait.until(ExpectedConditions.elementToBeClickable(seeinfo4));
	return Driver.findElement(seeinfo4);
}


public WebElement seeinfo3()
{
	WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(20));
	 wait.until(ExpectedConditions.elementToBeClickable(seeinfo3));
	return Driver.findElement(seeinfo3);
}


public void infopage() throws InterruptedException
{
	Infopage ii=new Infopage(Driver);
	ii.visitservice().click();
	System.out.println("Service  Navigation done");
	Thread.sleep(2000);
	
	
}
//to check desc is coming with null and length
public void desccheck() throws InterruptedException
{
	Thread.sleep(2500);
	 String x=Serviceplusdiscription().getText();
	   System.out.println(x);
	   System.out.println(x.length());
	
   if(x!=null && x.length()>10)
    {
        Assert.assertTrue(true);
    }	

   else
     {
       Assert.assertTrue(false);   

     }
}

public void desccheck2() throws InterruptedException
{
	Thread.sleep(2500);
	 String x=description().getText();
	   System.out.println(x);
	   System.out.println(x.length());
	
   if(x!=null && x.length()>50)
    {
        Assert.assertTrue(true);
    }	

   else
     {
       Assert.assertTrue(false);   

     }
}

}