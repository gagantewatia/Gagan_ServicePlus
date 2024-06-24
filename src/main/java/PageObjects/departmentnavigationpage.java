package PageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class departmentnavigationpage {
	public WebDriver Driver;
	
	By allservices=By.xpath("//div[contains(text(),'Services')]");
	By innerallservcies=By.xpath("//span[contains(.,'View All Services')]");
	By all=By.xpath("//div[@class='header-wrapper']//div[@class='text']");
	By allcross=By.xpath("//img[@alt='cross']");
	
	By search=By.xpath("//input[@placeholder='Search In Department']");
	
	//Cowin
		By DNcowin=By.xpath("//span[text()='Co-WIN']");
		
		//GSTN
		By GSTN=By.xpath("//span[text()='Goods & Service Tax Network']");
		By GSTNtitle=By.xpath("//h2[normalize-space()='Goods & Service Tax Network']");
		
		//CRIS
		By CRISNGET=By.xpath("//h4[normalize-space()='CRIS-NGET']");
		By CRISNGETtitle=By.xpath("//h4[normalize-space()='CRIS NGET']");
		
	    //JAS
		By JAS=By.xpath("//span[text()='Jan Aushadhi Sugam']");
		By JAStitle=By.xpath("//h4[normalize-space()='Jan Aushadhi Sugam']");
		
		
		//Skill India
		By Skillindia=By.xpath("//span[text()='Skill India']");
		By SkillIndiatitle=By.xpath("//h4[normalize-space()='Skill India']");
		
		//PMAYG
		By PMAYG=By.xpath("//span[text()='PMAYG']");
		By PMAYGtitle=By.xpath("//h4[normalize-space()='Pradhan Mantri Awaas Yojana - Gramin']");
		
		//e-Raktkosh
		
		By erakt=By.xpath("//span[text()='e-RaktKosh']");
		By erakttitle=By.xpath("//h5[normalize-space()='e-RaktKosh']");
		
		//AICTE
		
		By AICTE=By.xpath("//span[text()='AICTE']");
		By AICTEtitle=By.xpath("//h4[normalize-space()='All India Council for Technical Education']");
		
		//NTA
		
		By NTA=By.xpath("//span[text()='NTA']");
		By NTAtitle=By.xpath("//h4[normalize-space()='National Testing Agency']");
		
		//NSP
		By NSP=By.xpath("//span[text()='National Scholarship Portal']");
		By NSPtitle=By.xpath("//h5[normalize-space()='National Scholarship Portal']");
	//firstdepartment
	By servcieclick=By.xpath("(//div[@class='content'])[1]");
	
	// seconddepartment
	By Secservcieclick=By.xpath("(//div[@class='content'])[2]");
	
	//coffeeboard
	
		By coffeeboard=By.xpath("//h4[normalize-space()='Coffee Board']");
		
		//arundhati Gold Scheme
		By aRundhatigoldscheme=By.xpath("//h4[normalize-space()='Arundhati Gold Scheme']");
		
		//CISF
		By CISF=By.xpath("//h2[normalize-space()='Central Industrial Security Force']");
		
		//CPGRAMS
		By CPGRAMS=By.xpath("//h2[contains(text(),'Centralized Public Grievance Redress and Monitoring System (My Grievance)')]");
		
		//Samagra shiksha
		
		By SamagraShiksha=By.xpath("//h4[normalize-space()='Samagra Shiksha']");
		
		//ICCR
		By ICCRFAQ=By.xpath("//h4[normalize-space()='Indian Council for Cultural Relations']");
		
		
		//MEE seva
		By MEEseva=By.xpath("//h4[normalize-space()='Telangana MeeSeva']");
		
		
		//carbon Neutral
		By carbon=By.xpath("//h4[normalize-space()='Carbon Neutral']");
		
		
		//MAUD
		
		By MAUD=By.xpath("//h4[normalize-space()='Municipal Administration and Urban Development (MAUD)']");
		
		//gallantary awards
		
		By  GA=By.xpath("//h5[normalize-space()='Gallantry Award']");
		
		//TN_MSME
		By  TN_MSME=By.xpath("//h4[normalize-space()='TN MSME']");
		
		//RDD
		
		By RDD=By.xpath("//h4[normalize-space()='Rural Development Department']");
		
		//minority affair
		
		By MA=By.xpath("//h4[normalize-space()='Department of Minority Welfare']");
		
		//Delhi Police
		
		By DP=By.xpath("//h2[normalize-space()='Delhi Police']");
		
		//DHE assam
		By DHEAssam=By.xpath("//h4[normalize-space()='Directorate of Higher Education-Assam']");
		
		//ORS
		By ORS=By.xpath("(//h2[normalize-space()='Online Registration System'])");
		
		//Inspire-Manak
		By InspireManak=By.xpath("//h5[normalize-space()='INSPIRE Manak']");
		
		//eGopala
		By eGopala=By.xpath("//h5[normalize-space()='E-Gopala']");
		
		//Elderline
		By Elderline=By.xpath("//h4[normalize-space()='Elder Line- National Helpline for Senior Citizen(NHSC-NISD)']");

	
    //Department Of Finance(Service Plus)
	By Deptoffinance=By.xpath("//h4[normalize-space()='Department Of Finance Tripura']");
	
	//Agriculture Department(Service Plus)
	By AgricultureDep=By.xpath("//h4[normalize-space()='Agriculture Department Meghalaya']");
	By AgricultureDepAD =By.xpath("//h4[normalize-space()='Agriculture Department - Andaman and Nicobar']");
	By AgricultureDepartmentHaryana=By.xpath("//h4[normalize-space()='Agriculture Department (Haryana)']");
	//CCET (Degree Wing) (Service plus)
	By CCET=By.xpath("//h4[normalize-space()='CCET Chandigarh']");
	//Chief Minister Relief Fund Haryana
	By ChiefMinisterReliefFund=By.xpath("//h4[normalize-space()='Chief Minister Relief Fund (Haryana)']");
	//Department of Commerce and Industries Meghalaya
	By DepartmentofCommerceandIndustriesMeghalaya=By.xpath("//h4[normalize-space()='Department of Commerce and Industries Meghalaya']");
	//Department Of Empowerment Of Persons With Disabilities
	By DepOfEmpowerment=By.xpath("//h4[normalize-space()='Department Of Empowerment Of Persons With Disabilities']");
	//Department Of Revenue
	By DeptOfRevenue =By.xpath("//h4[normalize-space()='Department of Revenue(Jharkhand)']");
    //Department of Animal Husbandry and Veterinary Services
	By DepOfAnimalHusbandry=By.xpath("//h4[normalize-space()='Department of Animal Husbandry and Veterinary Services Andaman & Nicobar Island']");
    //DepaOfScienceAndTechnology
    By DepOfScienceAndTechnology=By.xpath("//h4[normalize-space()='Department of Science and Technology Haryana']");
    //Department of Scientific and Industrial Research
    By DepOfScientificAndIndustrial=By.xpath("//h4[normalize-space()='Department of Scientific and Industrial Research Delhi']");
    //Department of Social Welfare, Women and Child Development, Chandigarh Administration    
    By DepOfSocialWelfare=By.xpath("//h4[normalize-space()='Department of Social Welfare, Women and Child Development, Chandigarh Administration']");
    //Department of Urban Affairs
   By DepOfUrbanAffairs=By.xpath("//h4[normalize-space()='Department of Urban Affairs Meghalaya']");
   //Department Of Urban Development
   By DepOfUrbanDevelopment=By.xpath("//h4[normalize-space()='Department Of Urban Development Tripura']");
   //Department Of Urban Development
   By DirectorateofEducation=By.xpath("//h4[normalize-space()='Directorate of Education Andaman & Nicobar Island']");
   //Directorate of Fisheries
   By DirectorateofFisheries=By.xpath("//h4[normalize-space()='Directorate of Fisheries Andaman & Nicobar Island']");
   //Directorate of Health Services
   By DirectorateOfHealthServices=By.xpath("//h4[normalize-space()='Directorate of Health Services']");
   //Directorate of Industries
   By DirectorateOfIndustries=By.xpath("//h4[normalize-space()='Directorate of Industries Andaman & Nicobar Island']");
   
   //Directorate of School Education
   By DirectorateOfSchoolEducation=By.xpath("//h4[normalize-space()='Directorate of School Education Chandigarh']");

   //Directorate of Technical Education
   By DirectorateOfTechnicalEducation=By.xpath("//h4[normalize-space()='Directorate of Technical Education Chandigarh']");

   //Education Department (School)
   By EducationDepartment=By.xpath("//h4[normalize-space()='Education Department (School) Tripura']");
   //Forest & Climate Change Department
   By ForestClimateChangeDepartment=By.xpath("//h4[normalize-space()='Forest & Climate Change Department']");
   //General Administration Department
   By GeneralAdministrationDepartment=By.xpath("//h4[normalize-space()='General Administration Department']");
 //Guwahati Development Department
   By GuwahatiDevelopmentDepartment=By.xpath("//h4[normalize-space()='Guwahati Development Department (Assam)']");
 //Health Department (GMSH)
   By HealthDepartment=By.xpath("//h4[normalize-space()='Health Department (GMSH) Chandigarh']");
 //Home Department (Fire Service)
   By HomeDepartment=By.xpath("//h4[normalize-space()='Home Department (Fire Service)']");
 //Department of Home
   By DepartmenOfHome=By.xpath("//h4[normalize-space()='Department of Home- Haryana']");
   //Karbi Anglong (AC)
   By KarbiAnglong=By.xpath("//h4[normalize-space()='Karbi Anglong (AC) Assam']");
 //Ministry of New and Renewable Resources
   By MinistryOfNewAndRenewableResources=By.xpath("//h4[normalize-space()='Ministry of New and Renewable Resources']");
 //Punjab Engineering College
   By PunjabEngineeringCollege=By.xpath("//h4[normalize-space()='Punjab Engineering College Chandigarh']");
  //Revenue and Disaster Management Department
   By RevenueAndDisasterManagementDep=By.xpath("//h4[normalize-space()='Revenue and Disaster Management Department (Haryana)']");
 //Rubber Board
   By RubberBoard=By.xpath("//h4[normalize-space()='Rubber Board Tripura']");
 //Social Justice & Empowerment
   By SocialJusticeEmpowerment=By.xpath("//h4[normalize-space()='Social Justice & Empowerment (Haryana)']");
 //Zila Sainik Board
   By ZilaSainikBoard=By.xpath("//h4[normalize-space()='Zila Sainik Board Chandigarh']");
 //Department of Labour, Employment and Training
   By DepartmentOfLabour=By.xpath("//h4[normalize-space()='Department of Labour']");
   //Revenue Department
   By RevenueDep=By.xpath("//h4[normalize-space()='Revenue Department (Tripura)']");
 //Department of Revenue
   By DepartmentOfRevenue=By.xpath("//h4[normalize-space()='Department of Revenue (Jammu & Kashmir)']");
 //Urban Development Department
   By UrbanDevelopmentDepartment=By.xpath("//h4[normalize-space()='Urban Development Department (Jammu & Kashmir)']");
   //Department of Personnel, Administrative Reforms and Raj Bhasa
   By DepOfPersonnelAdministrativeReforms=By.xpath("//h4[normalize-space()='Department of Personnel, Administrative Reforms and Raj Bhasa']");
  
  //Housing Board Haryana
   By HousingBoardHaryana =By.xpath("//h4[normalize-space()='Housing Board Haryana Haryana']");
 //Fisheries Department
   By FisheriesDepartment =By.xpath("//h4[normalize-space()='Fisheries Department Haryana']");
   //Haryana Shahari Vikas Pradhikaran
   By HaryanaShahariVikasPradhikaran =By.xpath("//h4[normalize-space()='Haryana Shahari Vikas Pradhikaran Haryana']");
 //Welfare of SCs & BCs
   By WelfareofSCsBCs =By.xpath("//h4[normalize-space()='Welfare of SCs & BCs (Haryana)']");
 //Employment Department
   By EmploymentDepartment =By.xpath("//h4[normalize-space()='Employment Department']");
  
 //Public Works Department (RandB)
   By PublicWorksDepartment =By.xpath("//h4[normalize-space()='Public Works Department (RandB)']");
  
 //Department of Power
   By DepartmentofPower =By.xpath("//h4[normalize-space()='Department of Power Haryana']");
 //Department of Forest Tripura
   By DepartmentofForestTripura =By.xpath("//h4[normalize-space()='Department of Forest Tripura']");
 //Department of Health Jammu & Kashmir
   By  DepartmentofHealthJammuKashmir=By.xpath("//h4[normalize-space()='Department of Health Jammu & Kashmir']");
   
 //Department of Horticulture
   By DepartmentofHorticulture =By.xpath("//h4[normalize-space()='Department of Horticulture (Jammu Kashmir)']");
 //Department of Mines & Geology
   By DepartmentofMinesGeology =By.xpath("//h4[normalize-space()='Department of Mines & Geology']");
 //Department of Panchayati Raj Jammu & Kashmir
   By  DepartmentofPanchayatiRajJammuKashmir=By.xpath("//h4[normalize-space()='Department of Panchayati Raj Jammu & Kashmir']");
 //Food & Supplies Department Haryana
   By  FoodSuppliesDepartmentHaryana=By.xpath("//h4[normalize-space()='Food & Supplies Department Haryana']");
 //Women and Child Development Department
   By  WomenandChildDevelopmentDepartment=By.xpath("//h4[normalize-space()='Women and Child Development Department']");  
 //Urban Dev. Housing Department Sikkim
   By UrbanDevHousingDepartmentSikkim=By.xpath("//h4[normalize-space()='Urban Dev. Housing Department Sikkim']");   
   
 //depaertmentTagline
   By DeptTagline=By.xpath("//div[@class='department-info']/p");
   By Dept2Tagline=By.xpath("//div[@class='heading-parent']/h6");
   
   By TourismMeghalaya=By.xpath("//h4[normalize-space()='Tourism Meghalaya']");   
 //Sainik & Ardh Sainik Welfare Department  
 By SainikArdhSainikWelfareDepartment=By.xpath("//h4[normalize-space()='Sainik & Ardh Sainik Welfare Department']");   
   
//Public Health Engineering Department Haryana  
By PublicHealthEngineeringDepartmentHaryana=By.xpath("//h4[normalize-space()='Public Health Engineering Department Haryana']");   
  
//Printing and Stationery Department Haryana  
By PrintingandStationeryDepartmentHaryana=By.xpath("//h4[normalize-space()='Printing and Stationery Department Haryana']");   
//Political Department Meghalaya  
By PoliticalDepartmentMeghalaya=By.xpath("//h4[normalize-space()='Political Department Meghalaya']");   
//Political Department Meghalaya  
By LabourDepartment=By.xpath("//h4[normalize-space()='Labour Department Haryana']");   
//Labour Department Meghalaya 
By LabourDepartmentMeghalaya=By.xpath("//h4[normalize-space()='Labour Department Meghalaya']");   

//Department of Urban Local Bodies 
By DepartmentofUrbanLocalBodies=By.xpath("//h4[normalize-space()='Department of Urban Local Bodies- Haryana']");   

//Food Civil Supplies Consumer Affairs Department Sikkim 
By FoodCivilSuppliesConsumerAffairsDepartmentSikkim=By.xpath("//h4[normalize-space()='Food Civil Supplies Consumer Affairs Department Sikkim']");   

//Haryana Veterinary Council 
By HaryanaVeterinaryCouncil=By.xpath("//h4[normalize-space()='Haryana Veterinary Council']");   

//Health and Family Welfare
By HealthandFamilyWelfare=By.xpath("//h4[normalize-space()='Health and Family Welfare']");   

//Home Department Police Meghalaya
By HomeDepartmentPoliceMeghalaya=By.xpath("//h4[normalize-space()='Home Department Police Meghalaya']");   

public WebElement HomeDepartmentPoliceMeghalaya() {
		
		WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(HomeDepartmentPoliceMeghalaya));
		return Driver.findElement(HomeDepartmentPoliceMeghalaya);
	}

public WebElement HealthandFamilyWelfare() {
		
		WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(HealthandFamilyWelfare));
		return Driver.findElement(HealthandFamilyWelfare);
	}
public WebElement HaryanaVeterinaryCouncil() {
		
		WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(HaryanaVeterinaryCouncil));
		return Driver.findElement(HaryanaVeterinaryCouncil);
	}
public WebElement FoodCivilSuppliesConsumerAffairsDepartmentSikkim() {
		
		WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(FoodCivilSuppliesConsumerAffairsDepartmentSikkim));
		return Driver.findElement(FoodCivilSuppliesConsumerAffairsDepartmentSikkim);
	}

public WebElement DepartmentofUrbanLocalBodies() {
		
		WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(DepartmentofUrbanLocalBodies));
		return Driver.findElement(DepartmentofUrbanLocalBodies);
	}
public WebElement LabourDepartmentMeghalaya() {
		
		WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(LabourDepartmentMeghalaya));
		return Driver.findElement(LabourDepartmentMeghalaya);
	}
public WebElement LabourDepartment() {
		
		WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(LabourDepartment));
		return Driver.findElement(LabourDepartment);
	}

public WebElement PoliticalDepartmentMeghalaya() {
		
		WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(PoliticalDepartmentMeghalaya));
		return Driver.findElement(PoliticalDepartmentMeghalaya);
	}

//Printing and Stationery Department Haryana  
By PersonnelandARMeghalaya=By.xpath("//h4[normalize-space()='Personnel and A.R. Meghalaya']");   

public WebElement PersonnelandARMeghalaya() {
		
		WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(PersonnelandARMeghalaya));
		return Driver.findElement(PersonnelandARMeghalaya);
	}

 public WebElement PrintingandStationeryDepartmentHaryana() {
		
		WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(PrintingandStationeryDepartmentHaryana));
		return Driver.findElement(PrintingandStationeryDepartmentHaryana);
	}
  public WebElement PublicHealthEngineeringDepartmentHaryana() {
		
		WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(PublicHealthEngineeringDepartmentHaryana));
		return Driver.findElement(PublicHealthEngineeringDepartmentHaryana);
	}
   public WebElement SainikArdhSainikWelfareDepartment() {
		
		WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(SainikArdhSainikWelfareDepartment));
		return Driver.findElement(SainikArdhSainikWelfareDepartment);
	}
   public WebElement TourismMeghalaya() {
		
		WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(TourismMeghalaya));
		return Driver.findElement(TourismMeghalaya);
	}
   public WebElement innerallservcies() {
		
		WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(innerallservcies));
		return Driver.findElement(innerallservcies);
	}	
   
   public WebElement UrbanDevHousingDepartmentSikkim ()
   {
   	WebDriverWait wait= new WebDriverWait(Driver,Duration.ofSeconds(20));
   	wait.until(ExpectedConditions.visibilityOfElementLocated(UrbanDevHousingDepartmentSikkim ));
   	return Driver.findElement(UrbanDevHousingDepartmentSikkim );
   }
   
   public WebElement WomenandChildDevelopmentDepartment ()
   {
   	WebDriverWait wait= new WebDriverWait(Driver,Duration.ofSeconds(20));
   	wait.until(ExpectedConditions.visibilityOfElementLocated(WomenandChildDevelopmentDepartment ));
   	return Driver.findElement(WomenandChildDevelopmentDepartment );
   }
   
   
   public WebElement FoodSuppliesDepartmentHaryana ()
   {
   	WebDriverWait wait= new WebDriverWait(Driver,Duration.ofSeconds(20));
   	wait.until(ExpectedConditions.visibilityOfElementLocated(FoodSuppliesDepartmentHaryana ));
   	return Driver.findElement(FoodSuppliesDepartmentHaryana );
   }
   
   public WebElement DepartmentofHorticulture ()
   {
   	WebDriverWait wait= new WebDriverWait(Driver,Duration.ofSeconds(20));
   	wait.until(ExpectedConditions.visibilityOfElementLocated(DepartmentofHorticulture ));
   	return Driver.findElement(DepartmentofHorticulture );
   }
   
   public WebElement DepartmentofMinesGeology ()
   {
   	WebDriverWait wait= new WebDriverWait(Driver,Duration.ofSeconds(20));
   	wait.until(ExpectedConditions.visibilityOfElementLocated(DepartmentofMinesGeology ));
   	return Driver.findElement(DepartmentofMinesGeology );
   }
   
   public WebElement DepartmentofPanchayatiRajJammuKashmir ()
   {
   	WebDriverWait wait= new WebDriverWait(Driver,Duration.ofSeconds(20));
   	wait.until(ExpectedConditions.visibilityOfElementLocated(DepartmentofPanchayatiRajJammuKashmir ));
   	return Driver.findElement(DepartmentofPanchayatiRajJammuKashmir );
   }
   
   public WebElement DepartmentofHealthJammuKashmir ()
   {
   	WebDriverWait wait= new WebDriverWait(Driver,Duration.ofSeconds(20));
   	wait.until(ExpectedConditions.visibilityOfElementLocated(DepartmentofHealthJammuKashmir ));
   	return Driver.findElement(DepartmentofHealthJammuKashmir );
   }
   
   public WebElement DepartmentofForestTripura ()
   {
   	WebDriverWait wait= new WebDriverWait(Driver,Duration.ofSeconds(20));
   	wait.until(ExpectedConditions.visibilityOfElementLocated(DepartmentofForestTripura ));
   	return Driver.findElement(DepartmentofForestTripura );
   }
   
   public WebElement DepartmentofCommerceandIndustriesMeghalaya ()
   {
   	WebDriverWait wait= new WebDriverWait(Driver,Duration.ofSeconds(20));
   	wait.until(ExpectedConditions.visibilityOfElementLocated(DepartmentofCommerceandIndustriesMeghalaya ));
   	return Driver.findElement(DepartmentofCommerceandIndustriesMeghalaya );
   }
   
   public WebElement ChiefMinisterReliefFund ()
   {
   	WebDriverWait wait= new WebDriverWait(Driver,Duration.ofSeconds(20));
   	wait.until(ExpectedConditions.visibilityOfElementLocated(ChiefMinisterReliefFund ));
   	return Driver.findElement(ChiefMinisterReliefFund );
   }
   
   public WebElement AgricultureDepartmentHaryana ()
   {
   	WebDriverWait wait= new WebDriverWait(Driver,Duration.ofSeconds(20));
   	wait.until(ExpectedConditions.visibilityOfElementLocated(AgricultureDepartmentHaryana ));
   	return Driver.findElement(AgricultureDepartmentHaryana );
   }
   
   public WebElement DepartmentofPower ()
   {
   	WebDriverWait wait= new WebDriverWait(Driver,Duration.ofSeconds(20));
   	wait.until(ExpectedConditions.visibilityOfElementLocated(DepartmentofPower ));
   	return Driver.findElement(DepartmentofPower );
   }
   
   public WebElement DeptTagline()
   {
   	WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(20));
   	wait.until(ExpectedConditions.visibilityOfElementLocated(DeptTagline));
   	return Driver.findElement(DeptTagline);		
   }
   public WebElement Dept2Tagline()
   {
   	WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(20));
   	wait.until(ExpectedConditions.visibilityOfElementLocated(Dept2Tagline));
   	return Driver.findElement(Dept2Tagline);		
   }
   

   public WebElement AgricultureDepAD ()
   {
   	WebDriverWait wait= new WebDriverWait(Driver,Duration.ofSeconds(20));
   	wait.until(ExpectedConditions.visibilityOfElementLocated(AgricultureDepAD ));
   	return Driver.findElement(AgricultureDepAD );
   }
  
   public WebElement PublicWorksDepartment ()
   {
   	WebDriverWait wait= new WebDriverWait(Driver,Duration.ofSeconds(20));
   	wait.until(ExpectedConditions.visibilityOfElementLocated(PublicWorksDepartment ));
   	return Driver.findElement(PublicWorksDepartment );
   }
  
  
   public WebElement HousingBoardHaryana ()
   {
   	WebDriverWait wait= new WebDriverWait(Driver,Duration.ofSeconds(20));
   	wait.until(ExpectedConditions.visibilityOfElementLocated(HousingBoardHaryana ));
   	return Driver.findElement(HousingBoardHaryana );
   }
   public WebElement FisheriesDepartment ()
   {
   	WebDriverWait wait= new WebDriverWait(Driver,Duration.ofSeconds(20));
   	wait.until(ExpectedConditions.visibilityOfElementLocated(FisheriesDepartment ));
   	return Driver.findElement(FisheriesDepartment );
   }
   public WebElement HaryanaShahariVikasPradhikaran ()
   {
   	WebDriverWait wait= new WebDriverWait(Driver,Duration.ofSeconds(20));
   	wait.until(ExpectedConditions.visibilityOfElementLocated(HaryanaShahariVikasPradhikaran ));
   	return Driver.findElement(HaryanaShahariVikasPradhikaran );
   }
   public WebElement WelfareofSCsBCs ()
   {
   	WebDriverWait wait= new WebDriverWait(Driver,Duration.ofSeconds(20));
   	wait.until(ExpectedConditions.visibilityOfElementLocated(WelfareofSCsBCs ));
   	return Driver.findElement(WelfareofSCsBCs );
   }
   public WebElement EmploymentDepartment ()
   {
   	WebDriverWait wait= new WebDriverWait(Driver,Duration.ofSeconds(20));
   	wait.until(ExpectedConditions.visibilityOfElementLocated(EmploymentDepartment ));
   	return Driver.findElement(EmploymentDepartment );
   }
   
   public WebElement DepOfPersonnelAdministrativeReforms()
   {
   	WebDriverWait wait= new WebDriverWait(Driver,Duration.ofSeconds(20));
   	wait.until(ExpectedConditions.visibilityOfElementLocated(DepOfPersonnelAdministrativeReforms));
   	return Driver.findElement(DepOfPersonnelAdministrativeReforms);
   }
   public WebElement UrbanDevelopmentDepartment()
   {
   	WebDriverWait wait= new WebDriverWait(Driver,Duration.ofSeconds(20));
   	wait.until(ExpectedConditions.visibilityOfElementLocated(UrbanDevelopmentDepartment));
   	return Driver.findElement(UrbanDevelopmentDepartment);
   }
   public WebElement DepartmentOfRevenue()
   {
   	WebDriverWait wait= new WebDriverWait(Driver,Duration.ofSeconds(20));
   	wait.until(ExpectedConditions.visibilityOfElementLocated(DepartmentOfRevenue));
   	return Driver.findElement(DepartmentOfRevenue);
   }
   public WebElement RevenueDep()
   {
   	WebDriverWait wait= new WebDriverWait(Driver,Duration.ofSeconds(20));
   	wait.until(ExpectedConditions.visibilityOfElementLocated(RevenueDep));
   	return Driver.findElement(RevenueDep);
   }
   public WebElement DepartmentOfLabour()
   {
   	WebDriverWait wait= new WebDriverWait(Driver,Duration.ofSeconds(20));
   	wait.until(ExpectedConditions.visibilityOfElementLocated(DepartmentOfLabour));
   	return Driver.findElement(DepartmentOfLabour);
   }
   public WebElement ZilaSainikBoard()
   {
   	WebDriverWait wait= new WebDriverWait(Driver,Duration.ofSeconds(20));
   	wait.until(ExpectedConditions.visibilityOfElementLocated(ZilaSainikBoard));
   	return Driver.findElement(ZilaSainikBoard);
   }
   public WebElement SocialJusticeEmpowerment()
   {
   	WebDriverWait wait= new WebDriverWait(Driver,Duration.ofSeconds(20));
   	wait.until(ExpectedConditions.visibilityOfElementLocated(SocialJusticeEmpowerment));
   	return Driver.findElement(SocialJusticeEmpowerment);
   }
   public WebElement RubberBoard()
   {
   	WebDriverWait wait= new WebDriverWait(Driver,Duration.ofSeconds(20));
   	wait.until(ExpectedConditions.visibilityOfElementLocated(RubberBoard));
   	return Driver.findElement(RubberBoard);
   }
   public WebElement RevenueAndDisasterManagementDep()
   {
   	WebDriverWait wait= new WebDriverWait(Driver,Duration.ofSeconds(20));
   	wait.until(ExpectedConditions.visibilityOfElementLocated(RevenueAndDisasterManagementDep));
   	return Driver.findElement(RevenueAndDisasterManagementDep);
   }
   public WebElement PunjabEngineeringCollege()
   {
   	WebDriverWait wait= new WebDriverWait(Driver,Duration.ofSeconds(20));
   	wait.until(ExpectedConditions.visibilityOfElementLocated(PunjabEngineeringCollege));
   	return Driver.findElement(PunjabEngineeringCollege);
   }
   public WebElement MinistryOfNewAndRenewableResources()
   {
   	WebDriverWait wait= new WebDriverWait(Driver,Duration.ofSeconds(20));
   	wait.until(ExpectedConditions.visibilityOfElementLocated(MinistryOfNewAndRenewableResources));
   	return Driver.findElement(MinistryOfNewAndRenewableResources);
   }
   public WebElement KarbiAnglong()
   {
   	WebDriverWait wait= new WebDriverWait(Driver,Duration.ofSeconds(20));
   	wait.until(ExpectedConditions.visibilityOfElementLocated(KarbiAnglong));
   	return Driver.findElement(KarbiAnglong);
   }
   public WebElement DepartmenOfHome()
   {
   	WebDriverWait wait= new WebDriverWait(Driver,Duration.ofSeconds(20));
   	wait.until(ExpectedConditions.visibilityOfElementLocated(DepartmenOfHome));
   	return Driver.findElement(DepartmenOfHome);
   }
   public WebElement HomeDepartment()
   {
   	WebDriverWait wait= new WebDriverWait(Driver,Duration.ofSeconds(20));
   	wait.until(ExpectedConditions.visibilityOfElementLocated(HomeDepartment));
   	return Driver.findElement(HomeDepartment);
   }

   public WebElement HealthDepartment()
   {
   	WebDriverWait wait= new WebDriverWait(Driver,Duration.ofSeconds(20));
   	wait.until(ExpectedConditions.visibilityOfElementLocated(HealthDepartment));
   	return Driver.findElement(HealthDepartment);
   }

   public WebElement GuwahatiDevelopmentDepartment()
   {
   	WebDriverWait wait= new WebDriverWait(Driver,Duration.ofSeconds(20));
   	wait.until(ExpectedConditions.visibilityOfElementLocated(GuwahatiDevelopmentDepartment));
   	return Driver.findElement(GuwahatiDevelopmentDepartment);
   }

public WebElement GeneralAdministrationDepartment()
{
	WebDriverWait wait= new WebDriverWait(Driver,Duration.ofSeconds(20));
	wait.until(ExpectedConditions.visibilityOfElementLocated(GeneralAdministrationDepartment));
	return Driver.findElement(GeneralAdministrationDepartment);
}
public WebElement ForestClimateChangeDepartment()
{
	WebDriverWait wait= new WebDriverWait(Driver,Duration.ofSeconds(20));
	wait.until(ExpectedConditions.visibilityOfElementLocated(ForestClimateChangeDepartment));
	return Driver.findElement(ForestClimateChangeDepartment);
}
public WebElement EducationDepartment()
{
	WebDriverWait wait= new WebDriverWait(Driver,Duration.ofSeconds(20));
	wait.until(ExpectedConditions.visibilityOfElementLocated(EducationDepartment));
	return Driver.findElement(EducationDepartment);
}
public WebElement DirectorateOfTechnicalEducation()
{
	WebDriverWait wait= new WebDriverWait(Driver,Duration.ofSeconds(20));
	wait.until(ExpectedConditions.visibilityOfElementLocated(DirectorateOfTechnicalEducation));
	return Driver.findElement(DirectorateOfTechnicalEducation);
}
public WebElement DirectorateOfSchoolEducation()
{
	WebDriverWait wait= new WebDriverWait(Driver,Duration.ofSeconds(20));
	wait.until(ExpectedConditions.visibilityOfElementLocated(DirectorateOfSchoolEducation));
	return Driver.findElement(DirectorateOfSchoolEducation);
}
public WebElement DirectorateOfIndustries()
{
	WebDriverWait wait= new WebDriverWait(Driver,Duration.ofSeconds(20));
	wait.until(ExpectedConditions.visibilityOfElementLocated(DirectorateOfIndustries));
	return Driver.findElement(DirectorateOfIndustries);
}

public WebElement DirectorateOfHealthServices()
{
	WebDriverWait wait= new WebDriverWait(Driver,Duration.ofSeconds(20));
	wait.until(ExpectedConditions.visibilityOfElementLocated(DirectorateOfHealthServices));
	return Driver.findElement(DirectorateOfHealthServices);
}

public WebElement DirectorateofFisheries()
{
	WebDriverWait wait= new WebDriverWait(Driver,Duration.ofSeconds(20));
	wait.until(ExpectedConditions.visibilityOfElementLocated(DirectorateofFisheries));
	return Driver.findElement(DirectorateofFisheries);
}

public WebElement DirectorateofEducation()
{
	WebDriverWait wait= new WebDriverWait(Driver,Duration.ofSeconds(20));
	wait.until(ExpectedConditions.visibilityOfElementLocated(DirectorateofEducation));
	return Driver.findElement(DirectorateofEducation);
}


public WebElement DepOfUrbanDevelopment()
{
	WebDriverWait wait= new WebDriverWait(Driver,Duration.ofSeconds(20));
	wait.until(ExpectedConditions.visibilityOfElementLocated(DepOfUrbanDevelopment));
	return Driver.findElement(DepOfUrbanDevelopment);
}
    
    public WebElement DepOfUrbanAffairs()
	{
		WebDriverWait wait= new WebDriverWait(Driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(DepOfUrbanAffairs));
		return Driver.findElement(DepOfUrbanAffairs);
	}
    public WebElement DepOfSocialWelfare()
	{
		WebDriverWait wait= new WebDriverWait(Driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(DepOfSocialWelfare));
		return Driver.findElement(DepOfSocialWelfare);
	}
    
	public WebElement DepOfScientificAndIndustrial()
	{
		WebDriverWait wait= new WebDriverWait(Driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(DepOfScientificAndIndustrial));
		return Driver.findElement(DepOfScientificAndIndustrial);
	}
	
	public WebElement DepOfScienceAndTechnology()
	{
		WebDriverWait wait= new WebDriverWait(Driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(DepOfScienceAndTechnology));
		return Driver.findElement(DepOfScienceAndTechnology);
	}
	
	public WebElement DepOfAnimalHusbandry()
	{
		WebDriverWait wait= new WebDriverWait(Driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(DepOfAnimalHusbandry));
		return Driver.findElement(DepOfAnimalHusbandry);
	}
	public WebElement DeptOfRevenue()
	{
		WebDriverWait wait= new WebDriverWait(Driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(DeptOfRevenue));
		return Driver.findElement(DeptOfRevenue);
	}
	public WebElement DepOfEmpowerment()
	{
		WebDriverWait wait= new WebDriverWait(Driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(DepOfEmpowerment));
		return Driver.findElement(DepOfEmpowerment);
	}
	
	public WebElement CCET()
	{
		WebDriverWait wait= new WebDriverWait(Driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(CCET));
		return Driver.findElement(CCET);
	}

	
	public WebElement AgricultureDep()
	{
		WebDriverWait wait= new WebDriverWait(Driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(AgricultureDep));
		return Driver.findElement(AgricultureDep);
	}
	
	public WebElement Deptoffinance()
	{
		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(20));
		 wait.until(ExpectedConditions.visibilityOfElementLocated(Deptoffinance));
		return Driver.findElement(Deptoffinance);		
	}
	
	public WebElement Elderline()
	{
		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(20));
		 wait.until(ExpectedConditions.visibilityOfElementLocated(Elderline));
		return Driver.findElement(Elderline);		
	}
	
	public WebElement IM()
	{
		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(20));
		 wait.until(ExpectedConditions.visibilityOfElementLocated(InspireManak));
		return Driver.findElement(InspireManak);		
	}
	
	public WebElement eGopala()
	{
		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(20));
		 wait.until(ExpectedConditions.visibilityOfElementLocated(eGopala));
		return Driver.findElement(eGopala);		
	}
	
	public departmentnavigationpage(WebDriver Driver) 
	{
		this.Driver=Driver;
	}
	public WebElement ORS()
	{
		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(20));
		 wait.until(ExpectedConditions.visibilityOfElementLocated(ORS));
		return Driver.findElement(ORS);		
	}
	
	
	
	public WebElement TN_MSME()
	{
		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(20));
		 wait.until(ExpectedConditions.visibilityOfElementLocated(TN_MSME));
		return Driver.findElement(TN_MSME);		
	}
	
	
	public WebElement MA()
	{
		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(20));
		 wait.until(ExpectedConditions.visibilityOfElementLocated(MA));
		return Driver.findElement(MA);		
	}
	
	
	public WebElement RDD()
	{
		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(20));
		 wait.until(ExpectedConditions.visibilityOfElementLocated(RDD));
		return Driver.findElement(RDD);		
	}
	
	
	public WebElement MAUD()
	{
		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(20));
		 wait.until(ExpectedConditions.visibilityOfElementLocated(MAUD));
		return Driver.findElement(MAUD);		
	}
	
	
	public WebElement GA()
	{
		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(20));
		 wait.until(ExpectedConditions.visibilityOfElementLocated(GA));
		return Driver.findElement(GA);		
	}
	
public int innerallservcies1() throws InterruptedException {
		
		Thread.sleep(2000);
		return Driver.findElements(innerallservcies).size();
	}
	
public void allservicesredirect() throws InterruptedException
{
	Thread.sleep(2000);

	if(allcross()>0)
	{
		allcross1().click();

	}
	System.out.println("All Services Size:" +allservices1());
	if(allservices1()==0)
	{
		Driver.navigate().refresh();
		System.out.println("Refresh Home Page");
		if(allcross()>0)
		{
			allcross1().click();
	
		}

		System.out.println("All Services Size:" +allservices1());
		if(allservices1()==0)
		{
			Driver.navigate().refresh();
			System.out.println("Refresh Home Page");
			if(allcross()>0)
			{
				allcross1().click();
		
			}
			
		}
		
		
		allservices().click();	 

		// Assert.assertEquals(all().getText(),"All services","Not matched");

		
		if(innerallservcies1()==1)
		{
        innerallservcies().click();
		}
		// Assert.assertEquals(all().getText(),"All Services","Not matched");


		
	}
	allservices().click();	 
	Thread.sleep(2000);
	if(innerallservcies1()==1)
	{
    innerallservcies().click();
	}
	 //Assert.assertEquals(all().getText(),"All Services","Not matched");
	
}

	public int allservices1()
	{
		try {
		 WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(10));
		 wait.until(ExpectedConditions.visibilityOfElementLocated(allservices));
		}
		catch(Exception e)
		{
			
			System.out.println("All Service bottom tab not visible" +e);
		}
		return Driver.findElements(allservices).size();
		
	}
	
	//for   navigation()
			public void servicenavigationclick(String servicename) throws InterruptedException
			{
				search().clear();
				search().sendKeys(servicename);
		         Thread.sleep(1000);
			    servcieclick().click();
			    System.out.println("Size is :" + umanglogowait());
			    if(umanglogowait()==1) {
			    System.out.println("Refreshing the page");
			    	Driver.navigate().refresh();
			    	Thread.sleep(5000);
			    	if(umanglogowait()==1)
			    	{
			    	    System.out.println("Goes to Home page");
			    		Driver.navigate().to("https://web.umang.gov.in/web_new/home");
			    	}
			    }
			    
			  ServiceNavigation dp=new ServiceNavigation(Driver);
				 Driver.switchTo().frame(dp.switchframe());
			     Thread.sleep(1000);
			}
	
			
	By umanglogo=By.xpath("//img[@src='assets/img/logo.svg']");



			public int umanglogowait()
			{
				try
				{
					WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(10));
					wait.until(ExpectedConditions.invisibilityOfElementLocated(umanglogo));
						
				}catch(Exception e)
				{
					System.out.println(e+ "Department Page Still Loading");
					
				}
				
				 return Driver.findElements(umanglogo).size();
				 
			}
	public void SCservicenavigationclick(String servicename) throws InterruptedException
	{
		search().sendKeys(servicename);
         Thread.sleep(1000);
         Secservcieclick().click();
	  ServiceNavigation dp=new ServiceNavigation(Driver);
		 Driver.switchTo().frame(dp.switchframe());
	     Thread.sleep(1000);
	}
	
	public WebElement DHEAssam()
	{
		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(20));
		 wait.until(ExpectedConditions.visibilityOfElementLocated(DHEAssam));
		return Driver.findElement(DHEAssam);		
	}
	
	
	
	public WebElement carbon()
	{
		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(20));
		 wait.until(ExpectedConditions.visibilityOfElementLocated(carbon));
		return Driver.findElement(carbon);		
	}
	
	
	public WebElement SamagraShiksha()
	{
		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(20));
		 wait.until(ExpectedConditions.visibilityOfElementLocated(SamagraShiksha));
		return Driver.findElement(SamagraShiksha);		
	}
	
	public WebElement ICCRFAQ()
	{
		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(20));
		 wait.until(ExpectedConditions.visibilityOfElementLocated(ICCRFAQ));
		return Driver.findElement(ICCRFAQ);		
	}
	
	public WebElement MEEseva()
	{
		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(20));
		 wait.until(ExpectedConditions.visibilityOfElementLocated(MEEseva));
		return Driver.findElement(MEEseva);		
	}
	
	public WebElement CPGRAMS()
	{
		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(20));
		 wait.until(ExpectedConditions.visibilityOfElementLocated(CPGRAMS));
		return Driver.findElement(CPGRAMS);		
	}
	
	public WebElement CISF()
	{
		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(20));
		 wait.until(ExpectedConditions.visibilityOfElementLocated(CISF));
		return Driver.findElement(CISF);		
	}
	
	
	public WebElement deptcowin()
	{
		return Driver.findElement(DNcowin);		
	}
	public int allcross()
	{
		return Driver.findElements(allcross).size();		
	}
	public WebElement allcross1()
	{
		return Driver.findElement(allcross);		
	}
	
	public WebElement servcieclick()
	{	
		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(20));
	 wait.until(ExpectedConditions.visibilityOfElementLocated(servcieclick));
		return Driver.findElement(servcieclick);		
	}
	
	
	public WebElement Secservcieclick()
	{	
		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(20));
	 wait.until(ExpectedConditions.visibilityOfElementLocated(Secservcieclick));
		return Driver.findElement(Secservcieclick);		
	}
	
	public WebElement search()
	{	
		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(20));
	 wait.until(ExpectedConditions.visibilityOfElementLocated(search));
		return Driver.findElement(search);		
	}
	public WebElement GSTN()
	{
		 WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(20));
		 wait.until(ExpectedConditions.visibilityOfElementLocated(GSTN));
		return Driver.findElement(GSTN);
		
	}
	
	public WebElement coffeeboard()
	{
		 WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(20));
		 wait.until(ExpectedConditions.visibilityOfElementLocated(coffeeboard));
		return Driver.findElement(coffeeboard);
		
	}
	
	public WebElement AGS()
	{
		 WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(20));
		 wait.until(ExpectedConditions.visibilityOfElementLocated(aRundhatigoldscheme));
		return Driver.findElement(aRundhatigoldscheme);
		
	}
	
	
	
	public WebElement GSTNtitle()
	{
		return Driver.findElement(GSTNtitle);
	}
	
	public WebElement CRISNGET()
	{
		 WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(20));
		 wait.until(ExpectedConditions.visibilityOfElementLocated(CRISNGET));
		return Driver.findElement(CRISNGET);
		
	}
	
	public WebElement CRISNGETTitle()
	{
		 WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(20));
		 wait.until(ExpectedConditions.visibilityOfElementLocated(CRISNGETtitle));
		return Driver.findElement(CRISNGETtitle);
	}
	
	public WebElement JAS()
	{
		 WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(20));
		 wait.until(ExpectedConditions.visibilityOfElementLocated(JAS));
		return Driver.findElement(JAS);
		
	}
	
	public WebElement JASTitle()
	{
		return Driver.findElement(JAStitle);
	}
	
	public WebElement skillindia()
	{
		 WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(20));
		 wait.until(ExpectedConditions.visibilityOfElementLocated(Skillindia));
		return Driver.findElement(Skillindia);
		
	}
	
	public WebElement SkillIndiatitleTitle()
	{
		return Driver.findElement(SkillIndiatitle);
	}
	
	
	public WebElement PMAYG()
	{
		 WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(20));
		 wait.until(ExpectedConditions.visibilityOfElementLocated(PMAYG));
		return Driver.findElement(PMAYG);
		
	}
	
	
	public WebElement PMAYGtitle()
	{
		 WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(20));
		 wait.until(ExpectedConditions.visibilityOfElementLocated(PMAYGtitle));
		return Driver.findElement(PMAYGtitle);
		
	}
	
	public WebElement erakt()
	{
		 WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(20));
		 wait.until(ExpectedConditions.visibilityOfElementLocated(erakt));
		return Driver.findElement(erakt);
		
	}
	
	public WebElement erakttitle()
	{
		 WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(20));
		 wait.until(ExpectedConditions.visibilityOfElementLocated(erakttitle));
		return Driver.findElement(erakttitle);
		
	}
	public WebElement AICTE()
	{
		 WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(20));
		 wait.until(ExpectedConditions.visibilityOfElementLocated(AICTE));
		return Driver.findElement(AICTE);
		
	}
	
	public WebElement AICTEtitle()
	{
		 WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(20));
		 wait.until(ExpectedConditions.visibilityOfElementLocated(AICTEtitle));
		return Driver.findElement(AICTEtitle);
		
	}
	
	public WebElement NTA()
	{
		 WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(20));
		 wait.until(ExpectedConditions.visibilityOfElementLocated(NTA));
		return Driver.findElement(NTA);
		
	}
	
	public WebElement NTAtitle()
	{
		 WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(20));
		 wait.until(ExpectedConditions.visibilityOfElementLocated(NTAtitle));
		return Driver.findElement(NTAtitle);
		
	}
	
	public WebElement NSP()
	{
		 WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(20));
		 wait.until(ExpectedConditions.visibilityOfElementLocated(NSP));
		return Driver.findElement(NSP);
		
	}
	
	public WebElement NSPtitle()
	{
		 WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(20));
		 wait.until(ExpectedConditions.visibilityOfElementLocated(NSPtitle));
		return Driver.findElement(NSPtitle);
		
	}
	public WebElement allservices()
	{
		 WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(20));
		 wait.until(ExpectedConditions.visibilityOfElementLocated(allservices));
		return Driver.findElement(allservices);
		
	}
	
	public WebElement all()
	{
		 WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(20));
		 wait.until(ExpectedConditions.visibilityOfElementLocated(all));
		return Driver.findElement(all);
		
	}
	public WebElement DP()
	{
		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(20));
		 wait.until(ExpectedConditions.visibilityOfElementLocated(DP));
		return Driver.findElement(DP);		
	}
	
	
	
	}
	
	
	

