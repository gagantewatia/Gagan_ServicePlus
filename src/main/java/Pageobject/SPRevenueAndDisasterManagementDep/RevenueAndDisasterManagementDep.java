package Pageobject.SPRevenueAndDisasterManagementDep;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RevenueAndDisasterManagementDep{
public WebDriver Driver;
WebDriverWait wait;
	
	

public RevenueAndDisasterManagementDep(WebDriver Driver){
	this.Driver= Driver;
	wait =new WebDriverWait(Driver, Duration.ofSeconds(20));
	
	
}
//Minority Community
By MinorityCommunity =By.xpath("//h4[normalize-space()='Minority Community']");

//Scheduled Caste Certificate/ अनुसूचित जाति प्रमाण पत्र
By ScheduledCaste =By.xpath("//h4[normalize-space()='Scheduled Caste Certificate/ अनुसूचित जाति प्रमाण पत्र']");

//Income Certificate
By IncomeCertificate =By.xpath("//h4[normalize-space()='Income Certificate']");

//Deprived Scheduled Caste Certificate/ वंचित अनुसूचित जाति प्रमाण पत्र
By DeprivedScheduled =By.xpath("//h4[normalize-space()='Deprived Scheduled Caste Certificate/ वंचित अनुसूचित जाति प्रमाण पत्र']");

//Income and Asset Certificate for Economically Weaker Section-EWS
By AssetCertificate =By.xpath("//h4[normalize-space()='Income and Asset Certificate for Economically Weaker Section-EWS']");

//Tapriwas caste Certificate/ टपरीवास जाति प्रमाण पत्र
By Tapriwascaste =By.xpath("//h4[normalize-space()='Tapriwas caste Certificate/ टपरीवास जाति प्रमाण पत्र']");

//Backward Class Certificate/पिछड़ा वर्ग प्रमाण पत्र
By BackwardClass =By.xpath("//h4[normalize-space()='Backward Class Certificate/पिछड़ा वर्ग प्रमाण पत्र']");

//Property Dealer License
By PropertyDealer =By.xpath("//h4[normalize-space()='Property Dealer License']");
//Economically Weaker Section (EWS) Certificate for Allotment of Residential Flat or Residential Plot by Housing Board
By HousingBoard =By.xpath("//h4[normalize-space()='Economically Weaker Section (EWS) Certificate for Allotment of Residential Flat or Residential Plot by Housing Board']");
//Application For Permission For Fun Fair or Circus or Magic Show
By MagicShow =By.xpath("//h4[normalize-space()='Application For Permission For Fun Fair or Circus or Magic Show']");
//Application for Permission for Jalsa/ Public Meeting/ Jalus/ Shoba Yatra/ Procession/ Katha/ Jagran/ Chhath Puja
By ChhathPuja =By.xpath("//h4[normalize-space()='Application for Permission for Jalsa/ Public Meeting/ Jalus/ Shoba Yatra/ Procession/ Katha/ Jagran/ Chhath Puja']");
//Application for Permission for Loudspeaker/DJ लाउडस्पीकर/डीजे की अनुमति के लिए आवेदन
By Loudspeaker =By.xpath("//h4[normalize-space()='Application for Permission for Loudspeaker/DJ लाउडस्पीकर/डीजे की अनुमति के लिए आवेदन']");
//Tournaments/ Games
By Tournaments =By.xpath("//h4[normalize-space()='Tournaments/ Games']");
//Dogra Certificate
By DograCertificate =By.xpath("//h4[normalize-space()='Dogra Certificate']");
//Vehicle Permit/ Permission during Assembly / State Election Campaign
By StateElectionCampaign =By.xpath("//h4[normalize-space()='Vehicle Permit/ Permission during Assembly / State Election Campaign']");
//Vehicle Permit/ Permission during Parliamentary Election Campaign
By ElectionCampaign =By.xpath("//h4[normalize-space()='Vehicle Permit/ Permission during Parliamentary Election Campaign']");
//Ex Gratia Assistance to Next of Kin of the Deceased by COVID-19
By COVID19 =By.xpath("//h4[normalize-space()='Ex Gratia Assistance to Next of Kin of the Deceased by COVID-19']");

//Vimukt Jati Certificate
By Vimukt =By.xpath("//h4[normalize-space()='Vimukt Jati Certificate']");
//Other Backward Class Certificate OBC
By OBC =By.xpath("//h4[normalize-space()='Other Backward Class Certificate OBC']");


//Info service 

//Minority Community
By infoMinorityCommunity =By.xpath("//h4[normalize-space()='Minority Community']//following::img[@src='./assets/images/infoIcon.png'][1]");

//Income and Asset Certificate for Economically Weaker Section-EWS
By infoAssetCertificate =By.xpath("//h4[normalize-space()='Income and Asset Certificate for Economically Weaker Section-EWS']//following::img[@src='./assets/images/infoIcon.png'][1]");


//Property Dealer License
By infoPropertyDealer =By.xpath("//h4[normalize-space()='Property Dealer License']//following::img[@src='./assets/images/infoIcon.png'][1]");

//Application For Permission For Fun Fair or Circus or Magic Show
By infoMagicShow =By.xpath("//h4[normalize-space()='Application For Permission For Fun Fair or Circus or Magic Show']//following::img[@src='./assets/images/infoIcon.png'][1]");
//Application for Permission for Jalsa/ Public Meeting/ Jalus/ Shoba Yatra/ Procession/ Katha/ Jagran/ Chhath Puja
By infoChhathPuja =By.xpath("//h4[normalize-space()='Application for Permission for Jalsa/ Public Meeting/ Jalus/ Shoba Yatra/ Procession/ Katha/ Jagran/ Chhath Puja']//following::img[@src='./assets/images/infoIcon.png'][1]");
//Application for Permission for Loudspeaker/DJ लाउडस्पीकर/डीजे की अनुमति के लिए आवेदन
By infoLoudspeaker =By.xpath("//h4[normalize-space()='Application for Permission for Loudspeaker/DJ लाउडस्पीकर/डीजे की अनुमति के लिए आवेदन']//following::img[@src='./assets/images/infoIcon.png'][1]");
//Tournaments/ Games
By infoTournaments =By.xpath("//h4[normalize-space()='Tournaments/ Games']//following::img[@src='./assets/images/infoIcon.png'][1]");
//Dogra Certificate
By infoDograCertificate =By.xpath("//h4[normalize-space()='Dogra Certificate']//following::img[@src='./assets/images/infoIcon.png'][1]");
//Vehicle Permit/ Permission during Assembly / State Election Campaign
By infoStateElectionCampaign =By.xpath("//h4[normalize-space()='Vehicle Permit/ Permission during Assembly / State Election Campaign']//following::img[@src='./assets/images/infoIcon.png'][1]");
//Vehicle Permit/ Permission during Parliamentary Election Campaign
By infoElectionCampaign =By.xpath("//h4[normalize-space()='Vehicle Permit/ Permission during Parliamentary Election Campaign']//following::img[@src='./assets/images/infoIcon.png'][1]");


public WebElement infoElectionCampaign()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoElectionCampaign));
	  return Driver.findElement(infoElectionCampaign);
}
public WebElement infoStateElectionCampaign()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoStateElectionCampaign));
	  return Driver.findElement(infoStateElectionCampaign);
}

public WebElement infoDograCertificate()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoDograCertificate));
	  return Driver.findElement(infoDograCertificate);
}
public WebElement infoTournaments()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoTournaments));
	  return Driver.findElement(infoTournaments);
}
public WebElement infoLoudspeaker()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoLoudspeaker));
	  return Driver.findElement(infoLoudspeaker);
}
public WebElement infoChhathPuja()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoChhathPuja));
	  return Driver.findElement(infoChhathPuja);
}
public WebElement infoMagicShow()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoMagicShow));
	  return Driver.findElement(infoMagicShow);
}

public WebElement infoPropertyDealer()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoPropertyDealer));
	  return Driver.findElement(infoPropertyDealer);
}


public WebElement infoAssetCertificate()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoAssetCertificate));
	  return Driver.findElement(infoAssetCertificate);
}
public WebElement DeprivedScheduled()
{
	wait.until(ExpectedConditions.elementToBeClickable(DeprivedScheduled));
	  return Driver.findElement(DeprivedScheduled);
}
public WebElement IncomeCertificate()
{
	wait.until(ExpectedConditions.elementToBeClickable(IncomeCertificate));
	  return Driver.findElement(IncomeCertificate);
}
public WebElement ScheduledCaste()
{
	wait.until(ExpectedConditions.elementToBeClickable(ScheduledCaste));
	  return Driver.findElement(ScheduledCaste);
}
public WebElement infoMinorityCommunity()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoMinorityCommunity));
	  return Driver.findElement(infoMinorityCommunity);
}
public WebElement OBC()
{
	wait.until(ExpectedConditions.elementToBeClickable(OBC));
	  return Driver.findElement(OBC);
}
public WebElement Vimukt()
{
	wait.until(ExpectedConditions.elementToBeClickable(Vimukt));
	  return Driver.findElement(Vimukt);
}

public WebElement COVID19()
{
	wait.until(ExpectedConditions.elementToBeClickable(COVID19));
	  return Driver.findElement(COVID19);
}
public WebElement ElectionCampaign()
{
	wait.until(ExpectedConditions.elementToBeClickable(ElectionCampaign));
	  return Driver.findElement(ElectionCampaign);
}
public WebElement StateElectionCampaign()
{
	wait.until(ExpectedConditions.elementToBeClickable(StateElectionCampaign));
	  return Driver.findElement(StateElectionCampaign);
}

public WebElement DograCertificate()
{
	wait.until(ExpectedConditions.elementToBeClickable(DograCertificate));
	  return Driver.findElement(DograCertificate);
}
public WebElement Tournaments()
{
	wait.until(ExpectedConditions.elementToBeClickable(Tournaments));
	  return Driver.findElement(Tournaments);
}
public WebElement Loudspeaker()
{
	wait.until(ExpectedConditions.elementToBeClickable(Loudspeaker));
	  return Driver.findElement(Loudspeaker);
}
public WebElement ChhathPuja()
{
	wait.until(ExpectedConditions.elementToBeClickable(ChhathPuja));
	  return Driver.findElement(ChhathPuja);
}
public WebElement MagicShow()
{
	wait.until(ExpectedConditions.elementToBeClickable(MagicShow));
	  return Driver.findElement(MagicShow);
}
public WebElement HousingBoard()
{
	wait.until(ExpectedConditions.elementToBeClickable(HousingBoard));
	  return Driver.findElement(HousingBoard);
}
public WebElement PropertyDealer()
{
	wait.until(ExpectedConditions.elementToBeClickable(PropertyDealer));
	  return Driver.findElement(PropertyDealer);
}
public WebElement BackwardClass()
{
	wait.until(ExpectedConditions.elementToBeClickable(BackwardClass));
	  return Driver.findElement(BackwardClass);
}
public WebElement Tapriwascaste()
{
	wait.until(ExpectedConditions.elementToBeClickable(Tapriwascaste));
	  return Driver.findElement(Tapriwascaste);
}
public WebElement AssetCertificate()
{
	wait.until(ExpectedConditions.elementToBeClickable(AssetCertificate));
	  return Driver.findElement(AssetCertificate);
}

public WebElement MinorityCommunity()
{
	wait.until(ExpectedConditions.elementToBeClickable(MinorityCommunity));
	  return Driver.findElement(MinorityCommunity);
}
}
