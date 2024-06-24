package Pageobject.SPUrbanDevelopmentDepartment;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UrbanDevelopmentDepartment{
public WebDriver Driver;
WebDriverWait wait;
	
	

public UrbanDevelopmentDepartment(WebDriver Driver){
	this.Driver= Driver;
	wait =new WebDriverWait(Driver, Duration.ofSeconds(20));
	
	
}
//Application for Road Cutting Permission for Municipal Councils/Municipal Committees Only
By RoadCuttingMunicipalCouncils =By.xpath("//h4[normalize-space()='Application for Road Cutting Permission for Municipal Councils / Municipal Committees Only']");
//Application for Road Cutting Permission for Municipal Councils/Municipal Committees Only
By infoRoadCuttingMunicipalCouncils =By.xpath("//h4[normalize-space()='Application for Road Cutting Permission for Municipal Councils / Municipal Committees Only']//following::img[@src='./assets/images/infoIcon.png'][1]");

//Application for Issuance Street Vending / Rehri License
By StreetVending = By.xpath("//h4[normalize-space()='Application for Issuance Street Vending / Rehri License']");
//Application for Road Cutting Permission for Municipal Corporation Only
By RoadCuttingMunicipalCorporation=By.xpath("//h4[normalize-space()='Application for Road Cutting Permission for Municipal Corporation Only']");
//Application for Permission of Trade Fair/Mela/Exhibition for Municipal Corporations Only
By TradeFair=By.xpath("//h4[normalize-space()='Application for Permission of Trade Fair/Mela/Exhibition for Municipal Corporations Only']");
//Application for Sewerage Connection for Municipal Corporation Only
By SewerageMunicipalCorporation=By.xpath("//h4[normalize-space()='Application for Sewerage Connection for Municipal Corporation Only']");
//Application for Sewerage Connection for Municipal Council/Municipal Committee Only
By SewerageMunicipalCouncil=By.xpath("//h4[normalize-space()='Application for Sewerage Connection for Municipal Council / Municipal Committee Only']");
//Application for Mobile Tower Installation Permission
By MobileTower=By.xpath("//h4[normalize-space()='Application for Mobile Tower Installation Permission']");

//Application for Road Cutting Permission for Municipal Corporation Only
By infoRoadCuttingMunicipalCorporation=By.xpath("//h4[normalize-space()='Application for Road Cutting Permission for Municipal Corporation Only']//following::img[@src='./assets/images/infoIcon.png'][1]");
//Application for Permission of Trade Fair/Mela/Exhibition for Municipal Corporations Only
By infoTradeFair=By.xpath("//h4[normalize-space()='Application for Permission of Trade Fair/Mela/Exhibition for Municipal Corporations Only']//following::img[@src='./assets/images/infoIcon.png'][1]");
//Application for Sewerage Connection for Municipal Corporation Only
By infoSewerageMunicipalCorporation=By.xpath("//h4[normalize-space()='Application for Sewerage Connection for Municipal Corporation Only']//following::img[@src='./assets/images/infoIcon.png'][1]");
//Application for Sewerage Connection for Municipal Council/Municipal Committee Only
By infoSewerageMunicipalCouncil=By.xpath("//h4[normalize-space()='Application for Sewerage Connection for Municipal Council / Municipal Committee Only']//following::img[@src='./assets/images/infoIcon.png'][1]");
//Application for Mobile Tower Installation Permission
By infoMobileTower=By.xpath("//h4[normalize-space()='Application for Mobile Tower Installation Permission']//following::img[@src='./assets/images/infoIcon.png'][1]");

//Application for Issuance of Birth Certificate and Inclusion of Child Name in the Existing Record
By  BirthCertificate=By.xpath("//h4[normalize-space()='Application for Issuance of Birth Certificate and Inclusion of Child Name in the Existing Record']");
//Application for Issuance of Birth Certificate and Inclusion of Child Name in the Existing Record
By  infoBirthCertificate=By.xpath("//h4[normalize-space()='Application for Issuance of Birth Certificate and Inclusion of Child Name in the Existing Record']//following::img[@src='./assets/images/infoIcon.png'][1]");

//Application for Issuance of Death Certificate
By  DeathCertificate=By.xpath("//h4[normalize-space()='Application for Issuance of Death Certificate']");

//Application for Issuance of Death Certificate
By  infoDeathCertificate=By.xpath("//h4[normalize-space()='Application for Issuance of Death Certificate']//following::img[@src='./assets/images/infoIcon.png'][1]");

//Application for Correction in the Existing Death Record and Issuance of Certificate
By ExistingDeathRecord=By.xpath("//h4[normalize-space()='Application for Correction in the Existing Death Record and Issuance of Certifica']");

//Application for Correction in the Existing Death Record and Issuance of Certificate
By infoExistingDeathRecord=By.xpath("//h4[normalize-space()='Application for Correction in the Existing Death Record and Issuance of Certifica']//following::img[@src='./assets/images/infoIcon.png'][1]");

//Application for Issuance of Non-Availability Certificate of Birth Record
By  infoBirthRecord=By.xpath("//h4[normalize-space()='Application for Issuance of Non-Availability Certificate of Birth Record']//following::img[@src='./assets/images/infoIcon.png'][1]");

//Application for Issuance of Non-Availability Certificate of Birth Record
By  BirthRecord=By.xpath("//h4[normalize-space()='Application for Issuance of Non-Availability Certificate of Birth Record']");

//Application for Issuance of Non-Availability Certificate of Death Record
By  DeathRecord=By.xpath("//h4[normalize-space()='Application for Issuance of Non-Availability Certificate of Death Record']");

//Application for Issuance of Non-Availability Certificate of Death Record
By  infoDeathRecord=By.xpath("//h4[normalize-space()='Application for Issuance of Non-Availability Certificate of Death Record']//following::img[@src='./assets/images/infoIcon.png'][1]");

//Application for Correction in the Existing Birth Record and Issuance of Certificate
By ExistingBirthRecord=By.xpath("//h4[normalize-space()='Application for Correction in the Existing Birth Record and Issuance of Certificate']");
//Application for Correction in the Existing Birth Record and Issuance of Certificate
By infoExistingBirthRecord=By.xpath("//h4[normalize-space()='Application for Correction in the Existing Birth Record and Issuance of Certificate']//following::img[@src='./assets/images/infoIcon.png'][1]");

//Application for Provisional Registration of Dairy Farm/Gaushalla
By DairyFarm=By.xpath("//h4[normalize-space()='Application for Provisional Registration of Dairy Farm/Gaushalla']");
//Application for Grant of License for Pet Shop/Pet Trade/Bird Trade/Pet Clinic
By PetShop =By.xpath("//h4[normalize-space()='Application for Grant of License for Pet Shop/Pet Trade/Bird Trade/Pet Clinic']");
//Application for Grant of License for Pet Shop/Pet Trade/Bird Trade/Pet Clinic
By infoPetShop =By.xpath("//h4[normalize-space()='Application for Grant of License for Pet Shop/Pet Trade/Bird Trade/Pet Clinic']//following::img[@src='./assets/images/infoIcon.png'][1]");

//Application for No Objection Certificate for Commercial Establishments for Municipal Corporation Only
By ObjectionCertificate = By.xpath("//h4[normalize-space()='Application for No Objection Certificate for Commercial Establishments for Municipal Corporation Only']");
//Application for No Objection Certificate for Commercial Establishments for Municipal Corporation Only
By infoObjectionCertificate = By.xpath("//h4[normalize-space()='Application for No Objection Certificate for Commercial Establishments for Municipal Corporation Only']//following::img[@src='./assets/images/infoIcon.png'][1]");
//Application for No Objection Certificate for Commercial Establishments for Municipal Councils/Municipal Committees Only
By CommercialEstablishments=By.xpath("//h4[normalize-space()='Application for No Objection Certificate for Commercial Establishments for Municipal Corporation Only']");
//Application for No Objection Certificate for Commercial Establishments for Municipal Councils/Municipal Committees Only
By infoCommercialEstablishments=By.xpath("//h4[normalize-space()='Application for No Objection Certificate for Commercial Establishments for Municipal Corporation Only']//following::img[@src='./assets/images/infoIcon.png'][1]");


//Application for Issuance of License to Draftsman for Building Permission for Srinagar Municipal Corporation Only
By DraftsmanSrinagarMunicipalCorporation =By.xpath("//h4[normalize-space()='Application for Issuance of License to Draftsman for Building Permission for Srinagar Municipal Corporation Only']");
//Application for Issuance of License to Draftsman for Building Permission for Srinagar Municipal Corporation Only
By infoDraftsmanSrinagarMunicipalCorporation =By.xpath("//h4[normalize-space()='Application for Issuance of License to Draftsman for Building Permission for Srinagar Municipal Corporation Only']//following::img[@src='./assets/images/infoIcon.png'][1]");
//Application for Issuance of License to Draftsman for Building Permission for Jammu Municipal Corporation Only
By DraftsmanJammuMunicipalCorporation =By.xpath("//h4[normalize-space()='Application for Issuance of License to Draftsman for Building Permission for Jammu Municipal Corporation Only']");

//Application for Issuance of License to Architect for Building Permission for Srinagar Municipal Corporation Only
By ArchitectSrinagarMunicipalCorporation =By.xpath("//h4[normalize-space()='Application for Issuance of License to Architect for Building Permission for Srinagar Municipal Corporation Only']");

//Application for Issuance of License to Architect for Building Permission for Srinagar Municipal Corporation Only
By infoArchitectSrinagarMunicipalCorporation =By.xpath("//h4[normalize-space()='Application for Issuance of License to Architect for Building Permission for Srinagar Municipal Corporation Only']//following::img[@src='./assets/images/infoIcon.png'][1]");

//Application for Issuance of License to Architect for Building Permission for Municipal Council / Municipal Committee Only
By ArchitectMunicipalCouncilMunicipalCommittee =By.xpath("//h4[normalize-space()='Application for Issuance of License to Architect for Building Permission for Municipal Council / Municipal Committee Only']");

//Application for Issuance of License to Architect for Building Permission for Municipal Council / Municipal Committee Only
By infoArchitectMunicipalCouncilMunicipalCommittee =By.xpath("//h4[normalize-space()='Application for Issuance of License to Architect for Building Permission for Municipal Council / Municipal Committee Only']//following::img[@src='./assets/images/infoIcon.png'][1]");

//Application for Issuance of License to Architect for Building Permission for Jammu Municipal Corporation Only
By ArchitectJammuMunicipalCorporation =By.xpath("//h4[normalize-space()='Application for Issuance of License to Architect for Building Permission for Jammu Municipal Corporation Only']");

//Application for Issuance of License to Draftsman for Building Permission for Municipal Council / Municipal Committee Only
By DraftsmanMunicipalCouncilMunicipalCommittee =By.xpath("//h4[normalize-space()='Application for Issuance of License to Draftsman for Building Permission for Municipal Council / Municipal Committee Only']//following::img[@src='./assets/images/infoIcon.png'][1]");

//Application for Request for Issuance of Copy of Documents
By CopyDocuments =By.xpath("//h4[normalize-space()='Application for Request for Issuance of Copy of Documents']");

//Application for Issuance of License to Draftsman for Building Permission for Municipal Council / Municipal Committee Only
By infoDraftsmanMunicipalCouncilMunicipalCommittee =By.xpath("//h4[normalize-space()='Application for Issuance of License to Draftsman for Building Permission for Municipal Council / Municipal Committee Only']//following::img[@src='./assets/images/infoIcon.png'][1]");

//Application for Request for Issuance of Copy of Documents
By infoCopyDocuments =By.xpath("//h4[normalize-space()='Application for Request for Issuance of Copy of Documents']//following::img[@src='./assets/images/infoIcon.png'][1]");


By ServiceHeading=By.xpath("//h5[@class='text-center justify-content-center my-1']");

By ServiceList =By.xpath("//div[@class='tile-heading']");

//Application for Street Light Installation Permission for Municipal Council / Municipal Committees Only
By RehriLicense =By.xpath("//h4[normalize-space()='Application for Street Light Installation Permission for Municipal Council / Municipal Committees Only']");

//Application for Street Light Installation Permission for Municipal Council / Municipal Committees Only
By infoRehriLicense =By.xpath("//h4[normalize-space()='Application for Street Light Installation Permission for Municipal Council / Municipal Committees Only']//following::img[@src='./assets/images/infoIcon.png'][1]");

//Application for Permission of Trade Fair / Mela / Exhibition for Municipal Council / Municipal Committee Only
By TradeFairMela =By.xpath("//h4[normalize-space()='Application for Permission of Trade Fair / Mela / Exhibition for Municipal Council / Municipal Committee Only']");

//Application for Permission of Trade Far / Mela / Exhibition for Municipal Council / Municipal Committee Only
By infoTradeFairMela =By.xpath("//h4[normalize-space()='Application for Permission of Trade Fair / Mela / Exhibition for Municipal Council / Municipal Committee Only']//following::img[@src='./assets/images/infoIcon.png'][1]");




public WebElement infoObjectionCertificate()
{

	 wait.until(ExpectedConditions.elementToBeClickable(infoObjectionCertificate));
	  return Driver.findElement(infoObjectionCertificate);
}
public WebElement infoDraftsmanSrinagarMunicipalCorporation()
{

	 wait.until(ExpectedConditions.elementToBeClickable(infoDraftsmanSrinagarMunicipalCorporation));
	  return Driver.findElement(infoDraftsmanSrinagarMunicipalCorporation);
}

public WebElement infoArchitectSrinagarMunicipalCorporation()
{

	 wait.until(ExpectedConditions.elementToBeClickable(infoArchitectSrinagarMunicipalCorporation));
	  return Driver.findElement(infoArchitectSrinagarMunicipalCorporation);
}

public WebElement infoArchitectMunicipalCouncilMunicipalCommittee()
{

	 wait.until(ExpectedConditions.elementToBeClickable(infoArchitectMunicipalCouncilMunicipalCommittee));
	  return Driver.findElement(infoArchitectMunicipalCouncilMunicipalCommittee);
}

public WebElement infoDraftsmanMunicipalCouncilMunicipalCommittee()
{

	 wait.until(ExpectedConditions.elementToBeClickable(infoDraftsmanMunicipalCouncilMunicipalCommittee));
	  return Driver.findElement(infoDraftsmanMunicipalCouncilMunicipalCommittee);
}

public WebElement infoCopyDocuments()
{

	 wait.until(ExpectedConditions.elementToBeClickable(infoCopyDocuments));
	  return Driver.findElement(infoCopyDocuments);
}

public WebElement infoRehriLicense()
{

	 wait.until(ExpectedConditions.elementToBeClickable(infoRehriLicense));
	  return Driver.findElement(infoRehriLicense);
}
public WebElement infoTradeFairMela()
{

	 wait.until(ExpectedConditions.elementToBeClickable(infoTradeFairMela));
	  return Driver.findElement(infoTradeFairMela);
}
public WebElement infoBirthCertificate()
{

	 wait.until(ExpectedConditions.elementToBeClickable(infoBirthCertificate));
	  return Driver.findElement(infoBirthCertificate);
}


public WebElement infoDeathCertificate()
{

	 wait.until(ExpectedConditions.elementToBeClickable(infoDeathCertificate));
	  return Driver.findElement(infoDeathCertificate);
}

public WebElement infoExistingDeathRecord()
{

	 wait.until(ExpectedConditions.elementToBeClickable(infoExistingDeathRecord));
	  return Driver.findElement(infoExistingDeathRecord);
}
public WebElement infoBirthRecord()
{

	 wait.until(ExpectedConditions.elementToBeClickable(infoBirthRecord));
	  return Driver.findElement(infoBirthRecord);
}
public WebElement infoDeathRecord()
{

	 wait.until(ExpectedConditions.elementToBeClickable(infoDeathRecord));
	  return Driver.findElement(infoDeathRecord);
}

public WebElement infoExistingBirthRecord()
{

	 wait.until(ExpectedConditions.elementToBeClickable(infoExistingBirthRecord));
	  return Driver.findElement(infoExistingBirthRecord);
}
public WebElement infoPetShop()
{

	 wait.until(ExpectedConditions.elementToBeClickable(infoPetShop));
	  return Driver.findElement(infoPetShop);
}
public WebElement infoCommercialEstablishments()
{

	 wait.until(ExpectedConditions.elementToBeClickable(infoCommercialEstablishments));
	  return Driver.findElement(infoCommercialEstablishments);
}

public WebElement infoMobileTower()
{

	 wait.until(ExpectedConditions.elementToBeClickable(infoMobileTower));
	  return Driver.findElement(infoMobileTower);
}
public WebElement infoSewerageMunicipalCouncil()
{

	 wait.until(ExpectedConditions.elementToBeClickable(infoSewerageMunicipalCouncil));
	  return Driver.findElement(infoSewerageMunicipalCouncil);
}
public WebElement infoSewerageMunicipalCorporation()
{

	 wait.until(ExpectedConditions.elementToBeClickable(infoSewerageMunicipalCorporation));
	  return Driver.findElement(infoSewerageMunicipalCorporation);
}

public WebElement infoTradeFair()
{

	 wait.until(ExpectedConditions.elementToBeClickable(infoTradeFair));
	  return Driver.findElement(infoTradeFair);
}
public WebElement infoRoadCuttingMunicipalCorporation()
{

	 wait.until(ExpectedConditions.elementToBeClickable(infoRoadCuttingMunicipalCorporation));
	  return Driver.findElement(infoRoadCuttingMunicipalCorporation);
}
public WebElement infoRoadCuttingMunicipalCouncils()
{

	 wait.until(ExpectedConditions.elementToBeClickable(infoRoadCuttingMunicipalCouncils));
	  return Driver.findElement(infoRoadCuttingMunicipalCouncils);
}

public WebElement TradeFairMela()
{

	 wait.until(ExpectedConditions.elementToBeClickable(TradeFairMela));
	  return Driver.findElement(TradeFairMela);
}
public WebElement RehriLicense()
{

	 wait.until(ExpectedConditions.elementToBeClickable(RehriLicense));
	  return Driver.findElement(RehriLicense);
}

public WebElement CopyDocuments()
{

	 wait.until(ExpectedConditions.elementToBeClickable(CopyDocuments));
	  return Driver.findElement(CopyDocuments);
}

public WebElement DraftsmanMunicipalCouncilMunicipalCommittee()
{

	 wait.until(ExpectedConditions.elementToBeClickable(DraftsmanMunicipalCouncilMunicipalCommittee));
	  return Driver.findElement(DraftsmanMunicipalCouncilMunicipalCommittee);
}

public WebElement ArchitectJammuMunicipalCorporation()
{

	 wait.until(ExpectedConditions.elementToBeClickable(ArchitectJammuMunicipalCorporation));
	  return Driver.findElement(ArchitectJammuMunicipalCorporation);
}

public WebElement ArchitectMunicipalCouncilMunicipalCommittee()
{

	 wait.until(ExpectedConditions.elementToBeClickable(ArchitectMunicipalCouncilMunicipalCommittee));
	  return Driver.findElement(ArchitectMunicipalCouncilMunicipalCommittee);
}

public WebElement ArchitectSrinagarMunicipalCorporation()
{

	 wait.until(ExpectedConditions.elementToBeClickable(ArchitectSrinagarMunicipalCorporation));
	  return Driver.findElement(ArchitectSrinagarMunicipalCorporation);
}

public WebElement DraftsmanJammuMunicipalCorporation()
{

	 wait.until(ExpectedConditions.elementToBeClickable(DraftsmanJammuMunicipalCorporation));
	  return Driver.findElement(DraftsmanJammuMunicipalCorporation);
}

public WebElement DraftsmanSrinagarMunicipalCorporation()
{

	 wait.until(ExpectedConditions.elementToBeClickable(DraftsmanSrinagarMunicipalCorporation));
	  return Driver.findElement(DraftsmanSrinagarMunicipalCorporation);
}

public List<WebElement> ServiceList()
{

	 wait.until(ExpectedConditions.elementToBeClickable(ServiceList));
	  return Driver.findElements(ServiceList);
}

public WebElement ServiceHeading()
{
	wait.until(ExpectedConditions.elementToBeClickable(ServiceHeading));
	  return Driver.findElement(ServiceHeading);
}

public WebElement RoadCuttingMunicipalCouncils()
{
	wait.until(ExpectedConditions.elementToBeClickable(RoadCuttingMunicipalCouncils));
	  return Driver.findElement(RoadCuttingMunicipalCouncils);
}


public WebElement StreetVending()
{
	wait.until(ExpectedConditions.elementToBeClickable(StreetVending));
	  return Driver.findElement(StreetVending);
}


public WebElement RoadCuttingMunicipalCorporation()
{
	wait.until(ExpectedConditions.elementToBeClickable(RoadCuttingMunicipalCorporation));
	  return Driver.findElement(RoadCuttingMunicipalCorporation);
}

public WebElement TradeFair()
{
	wait.until(ExpectedConditions.elementToBeClickable(TradeFair));
	  return Driver.findElement(TradeFair);
}

public WebElement SewerageMunicipalCorporation()
{
	wait.until(ExpectedConditions.elementToBeClickable(SewerageMunicipalCorporation));
	  return Driver.findElement(SewerageMunicipalCorporation);
}

public WebElement SewerageMunicipalCouncil()
{
	wait.until(ExpectedConditions.elementToBeClickable(SewerageMunicipalCouncil));
	  return Driver.findElement(SewerageMunicipalCouncil);
}

public WebElement MobileTower()
{
	wait.until(ExpectedConditions.elementToBeClickable(MobileTower));
	  return Driver.findElement(MobileTower);
}

public WebElement BirthCertificate()
{
	wait.until(ExpectedConditions.elementToBeClickable(BirthCertificate));
	  return Driver.findElement(BirthCertificate);
}

public WebElement DeathCertificate()
{
	wait.until(ExpectedConditions.elementToBeClickable(DeathCertificate));
	  return Driver.findElement(DeathCertificate);
}

public WebElement ExistingDeathRecord()
{
	wait.until(ExpectedConditions.elementToBeClickable(ExistingDeathRecord));
	  return Driver.findElement(ExistingDeathRecord);
}

public WebElement BirthRecord()
{
	wait.until(ExpectedConditions.elementToBeClickable(BirthRecord));
	  return Driver.findElement(BirthRecord);
}
public WebElement DeathRecord()
{
	wait.until(ExpectedConditions.elementToBeClickable(DeathRecord));
	  return Driver.findElement(DeathRecord);
}
public WebElement ExistingBirthRecord()
{
	wait.until(ExpectedConditions.elementToBeClickable(ExistingBirthRecord));
	  return Driver.findElement(ExistingBirthRecord);
}
public WebElement DairyFarm()
{
	wait.until(ExpectedConditions.elementToBeClickable(ExistingDeathRecord));
	  return Driver.findElement(ExistingDeathRecord);
}

public WebElement PetShop()
{
	wait.until(ExpectedConditions.elementToBeClickable(PetShop));
	  return Driver.findElement(PetShop);
}
public WebElement ObjectionCertificate()
{
	wait.until(ExpectedConditions.elementToBeClickable(ObjectionCertificate));
	  return Driver.findElement(ObjectionCertificate);
}
public WebElement CommercialEstablishments()
{
	wait.until(ExpectedConditions.elementToBeClickable(CommercialEstablishments));
	  return Driver.findElement(CommercialEstablishments);
}
}
