package PageObjects;


import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import CPGRAMS.CPGRAMSViewStatus;
import Resources.Base2;
import Utilis.departmenttestdata;

public class ServiceNavigation {
	
public WebDriver Driver;
By close=By.xpath("//button[normalize-space()='Close']");
	
By RegNavCowin=By.xpath("(//span[contains(text(),'Open')])[1]");

By downloadcert=By.xpath("(//span[contains(text(),'Open')])[2]");

By FAQ=By.xpath("(//span[contains(text(),'Open')])[4]");

By NEareastcenter=By.xpath("(//span[contains(text(),'Open')])[3]");

By addpassportdetails=By.xpath("(//span[contains(text(),'Open')])[6]");

By Trackrequest=By.xpath("(//span[contains(text(),'Open')])[8]");

By Certifiatecorrection=By.xpath("(//span[contains(text(),'Open')])[5]");

By mergedose=By.xpath("(//span[contains(text(),'Open')])[7]");

By intercert=By.xpath("(//span[contains(text(),'Open')])[9]");

By frameswitch=By.xpath("//iframe[@id='myIframe']");

By botframeswitch=By.xpath("//iframe[@id='ssIFrame_google']");


//GSTN
By Searchpayertitle=By.xpath("//h2[text()='Search Taxpayer']");
By GSTNSearchpayer=By.xpath("//span[normalize-space()='Search Taxpayer']");

//CRISNGET
//pnr
By CRISpnr=By.xpath("//h4[normalize-space()='PNR Status']");
By CRISpnrtitle=By.xpath("//span[text()='PNR Status']");

//trainschedule
By CRIStrainschedule=By.xpath("//h4[normalize-space()='Train Schedule']");
By CRIStrainscheduletitle=By.xpath("//span[text()='Train Schedule']");

//train between stations
By CRIStrainbetweenstation=By.xpath("//h4[normalize-space()='Train Between Station']");
By CRIStrainbetweenstationtitle=By.xpath("//span[text()='Train Between Stations']");

//availbiltyandfaredetails
By CRISavailbiltyandfare=By.xpath("//h4[normalize-space()='Availability and Fare Enquiry']");
By CRISavailbiltyandfaretitle=By.xpath("//span[text()='Availability and Fare Enquiry']");

//Jan Aushadhi Sugam

//Search Medicine
By JASMedicineList=By.xpath("//h4[normalize-space()='Search Medicine']");
By JASMedicineListtitle=By.xpath("//span[text()='Medicine List']");

//Nearby Store
By JASNearbystore=By.xpath("//h4[normalize-space()='Nearby Store']");
By JASNearbystorelist=By.xpath("//span[text()='Nearby Store']");

//By quality Assurance
By JASQualityAssurance=By.xpath("//h4[normalize-space()='Quality Assurance']");
By JASQualityAssurancetitle=By.xpath("//span[text()='Quality Assurance']");

//by feedback
By JASfeedback=By.xpath("//h4[normalize-space()='Feedback']");
By JASfeedbacktitle=By.xpath("//span[text()='Feedback']");

//about us
By JASaboutus=By.xpath("//h4[normalize-space()='About Us']");
By JASaboutustitle=By.xpath("//span[text()='About Us']");


//SKill India
//find training center
By SIfindtrainingcenter=By.xpath("//h4[normalize-space()='Find a Training Centre']");
By SIfindtrainingcenterinside=By.linkText("Find a Training Centre");
By SIfindtrainingcentertitle=By.xpath("//span[text()='Find a Training Centre']");

//Register Candidate
By SIRegsiter=By.xpath("//h4[normalize-space()='Candidate Registration']");
By SIRegsiterinside=By.linkText("Candidate Registration");
By SIRegistertitle=By.xpath("//span[text()='Candidate Registration']");

//login in 
By SITrainingstatus=By.xpath("//h4[normalize-space()='Training Status']");
By SITrainingstatusinside=By.linkText("Training Status");
By SItrainingloginpopup=By.xpath("//h3[normalize-space()='Login']");


////PMAYG
By logoutPMayg=By.xpath("//button[normalize-space()='Logout']");
By confirmlogoutPMAYG=By.xpath("//button[normalize-space()='Confirm']");
By loginPMAYG=By.xpath("//button[normalize-space()='Login']");
//FTO
By PMAYGFTO=By.xpath("//h4[normalize-space()='FTO Tracking']");
By PMAYGFTOtitle=By.xpath("//span[text()='FTO Tracking']");

//Permanent Wait list

By PMAYgwaitlist=By.xpath("//h4[normalize-space()='Panchayat Wise Permanent Wait List']");
By PMAYgwaitlisttitle=By.xpath("//span[text()='Panchayat Wise Permanent Wait List']");

//Installment details

By PMAYgInstallment=By.xpath("//h4[normalize-space()='Installment Details']");
By PMAYGinstallmenttitle=By.xpath("//span[text()='Installment Details']");

//convergence details

By PMAYGconvergencedetails=By.xpath("//h4[normalize-space()='Convergence Details']");
By PMAYGconvergencetitle=By.xpath("//span[text()='Convergence Details']");

//citizen details

By PMAYGCitizendetails=By.xpath("//h4[normalize-space()='Beneficiary Details']");
By PMAYGcitizentitle=By.xpath("//span[text()='Beneficiary Details']");

//e-raktkosh
// Blood availability

By eraktbloodavail=By.xpath("(//span[contains(text(),'Open')])[1]");
By eraktbloodavailtitle=By.xpath("//h2[normalize-space()='Blood Availability']");

//blood bank search

By eraktbloodbanksearch=By.xpath("(//span[contains(text(),'Open')])[2]");
By eraktbloodbanksearchtitle=By.xpath("//h2[normalize-space()='Blood Bank Search']");

//camp schedule
By eraktcampschedule=By.xpath("(//span[contains(text(),'Open')])[3]");
By eraktcampscheduletitle=By.xpath("//h2[normalize-space()='Blood Bank Search']");


//my donations
By eraktmydonations=By.xpath("(//span[contains(text(),'Open')])[4]");
//By eraktmydonationstitle=By.xpath("//h2[normalize-space()='Blood Bank Search']");

//AICTE
//approved institutions

By AICTEapprovedinstitutions=By.xpath("//h4[normalize-space()='Approved Institutions']");
By AICTEapprovedinstitutiontitle=By.xpath("//span[text()='Approved Institutions']");


//track application status

By AICTEtrackapplicationstatus=By.xpath("//h4[normalize-space()='Track Status']");
By AICTEtrackapplicationstatustitle=By.xpath("//span[text()='Track Status']");

//check Eligibilty
By AICTEcheckeligibilty=By.xpath("//h4[normalize-space()='Check Eligibility']");
By AICTEcheckeligibiltytitle=By.xpath("//span[text()='Check Eligibility']");


//apply for scholarship
By AICTEapplyscholrship=By.xpath("//h4[normalize-space()='Apply for Scholarship']");
By AICTEapplyscholrshiptitle=By.xpath("//span[text()='Apply for Scholarship']");

//NTA
//JEE Session 2 Admit Card
By jeeadmitcardsession2=By.xpath("//h4[normalize-space()='Admit Card (Session 2)']");
By jeeadmitcardsessiontitle=By.xpath("//span[text()='Admit Card (Session 2)']");

// JEE session1scorecard
By jeesession1scorecard=By.xpath("//h4[normalize-space()='Score Card (Session 1)']");
By jeesession1scorecardtitle=By.xpath("//span[text()='Score Card (Session 1)']");


//JEE confirmation details 1
By jeeconfirmationdetails1=By.xpath("(//h4[contains(text(),'Confirmation Details')])[1]");

//JEE confirmation details 2
By jeeconfirmationdetails2=By.xpath("(//h4[contains(text(),'Confirmation Details')])[2]");
//login with application no and dob

By applicationno=By.xpath("//input[@formcontrolname='appnNo']");
By applicationnoneet=By.xpath("//input[@formcontrolname='applicationNo']");
By dob=By.xpath("//input[@formcontrolname='dob']");
By submit=By.xpath("//button[normalize-space()='Submit']");

//Confirmation Details (UGC NEET)
By confirmationneet=By.xpath("(//h4[contains(text(),'Confirmation Details')])[5]");
By confirmationneettitle=By.xpath("//span[text()='Confirmation Details']");

//Admit card (UGC NEET)
By admitcardneet=By.xpath("//h4[normalize-space()='NEET Admit Card']");
By admitcardneettitle=By.xpath("//span[text()='NEET Admit Card']");


//ICCR AIEEA UG

By confirmationdetailsICCRUG=By.xpath("(//h4[contains(text(),'Confirmation Details')])[7]");
By confirmationdetailsICCRUGtitle=By.xpath("//span[text()='ICAR AIEEA UG-2022']");


//Admitcard CUET UG

By cuetUGAdmitcard=By.xpath("//h4[normalize-space()='CUET UG Admit Card']");
By cuetUGAdmitcardtitle=By.xpath("//span[text()='CUET UG Admit Card']");

////ICCR AIEEA PG

By confirmationdetailsICCRPG=By.xpath("(//h4[contains(text(),'Confirmation Details')])[8]");
By confirmationdetailsICCRPGtitle=By.xpath("//span[text()='ICAR AIEEA PG-2022']");


////ICAR AICE Phd

By confirmationdetailsICARPHD=By.xpath("(//h4[contains(text(),'Confirmation Details')])[9]");
By confirmationdetailsICCRPHDtitle=By.xpath("//span[text()='ICAR AICE-JRF/SRF PhD-2022']");

//Confirmationdetails CUET UG

By cuetUGconfirmation=By.xpath("(//h4[contains(text(),'Confirmation Details')])[3]");

//Confirmationdetailsmerged21&21 Merged

By Confirmationdetailsmerged21and22=By.xpath("(//h4[contains(text(),'Confirmation Details')])[6]");

//JEEScorecardsession2
By JEEscorecardsession2=By.xpath("//h4[normalize-space()='Score Card (Session 2)']");
By JEEscorecardsession2title=By.xpath("//span[text()='Score Card (Session 2)']");

//Paper-2 Score Card (B Arch. and B. Planning)

By paper2scorecard=By.xpath("//h4[normalize-space()='Paper-2 Score Card (B Arch. and B. Planning)']");
By paper2scorecardtitle=By.xpath("//span[text()='Paper-2 Score Card (B Arch. and B. Planning)']");

//Admit card cuet PG

By cuetPGAdmitcard=By.xpath("//h4[normalize-space()='CUET PG Admit Card']");
By cuetPGAdmitcardtitle=By.xpath("//span[text()='CUET PG Admit Card']");




//NSP

By SchemeInformation=By.xpath("//h4[normalize-space()='Scheme Information']");

//Search Institute
By searchInstitute=By.xpath("//h4[normalize-space()='Search Institute']");
By searchInstitutetitle=By.xpath("//span[text()='Search Institute']");

// Imp document

By impdocument=By.xpath("//h4[normalize-space()='Important Documents']");
By impdocumenttitle=By.xpath("//span[text()='Important Documents']");

//Check Eligibilty

By checkeligibilty=By.xpath("//h4[normalize-space()='Check Eligibility']");
By checkeligibiltytitle=By.xpath("//span[text()='Check Scholarship Eligibility']");

//fresh apply

By applyfresh=By.xpath("//h4[normalize-space()='Apply for Fresh']");
By applyfreshtitle=By.xpath("//span[normalize-space()='Login for Fresh Application']");

//coffeeboard

By growerapplicationstatus=By.xpath("//h4[normalize-space()='Grower Application Status']");
By growerapplicationstatustitle=By.xpath("//span[text()='Grower Application Status']");

By growerregisteration=By.xpath("//h4[normalize-space()='Grower Registration']");
By growerregisterationtitle=By.xpath("//span[text()='Grower Registration']");

//arundhati gold scheme
//track status
By arundhatitrackstatus=By.xpath("//h4[normalize-space()='Track Status']");
By arundhatitrackstatustitle=By.xpath("//span[contains(text(),'Status of Application')]");
By arundhatitrackstatusinvalidtitle=By.xpath("//p[normalize-space()='Invalid Application no/Mobile no!!']");
By agstrackstatusapp=By.xpath("//input[@formcontrolname='applicationno']");
By  agstrackstatusmob=By.xpath("//input[@formcontrolname='mobile']");


//Refixdatefor verification
By arundhatirefixdate=By.xpath("//h4[normalize-space()='Refix Date for Verification']");
By arundatirefixdatetitle=By.xpath("//span[contains(text(),'Refix Hearing Date')]");
By refixpending=By.xpath("//p[normalize-space()='SRO Hearing Date is yet to be provided!']");


//apply

By arundhatiapply=By.xpath("//h4[normalize-space()='Apply for Arundhati Gold Scheme']");
By arundhatiapplytitle=By.xpath("//span[contains(text(),'Apply for Arundhati Gold Scheme')]");

//cISF
//checkcomplaintstatus
By CISFcheckcompalaintstatus=By.xpath("//span[normalize-space()='Complaint Status']");
By CISFcheckcompalaintstatustitle=By.xpath("//h2[normalize-space()='Check Complaint Status']");

//lostand found
By CISFLostandfound=By.xpath("//span[normalize-space()='Lost and Found']");
By CISFLost=By.xpath("(//md-icon[@class='material-icons ng-scope'])[1]");
By CISFproceed=By.xpath("//span[@class='pull-right custom-padding']");
By CISFproceedfound=By.xpath("(//span[@class='pull-right custom-padding'])[2]");

By CISFLosttitle=By.xpath("//h2[normalize-space()='Lost']");
By CISFLostandfoundtitle=By.xpath("//h2[normalize-space()='Lost and Found']");
By CISFfound=By.xpath("(//md-icon[@class='material-icons ng-scope'])[2]");
By CISFFoundtitle=By.xpath("//h2[normalize-space()='Found']");

//Consultancy
By CISFConsultancy=By.xpath("//span[normalize-space()='Consultancy']");
By CISFConsultancytitle=By.xpath("//h2[normalize-space()='Consultancy']");
By CISFConsulatncybyCISF=By.xpath("(//md-icon[@class='material-icons'])[1]");
By AppformforConsulatncy=By.xpath("(//md-icon[@class='material-icons'])[2]");
By CISFConsulatncybyCISFtitle=By.xpath("//h2[normalize-space()='CISF CONSULTANCY & SERVICES']");
By AppformforConsulatncytitle=By.xpath("//h2[normalize-space()='Consultancy Details']");


//CPGRAMS
//view status
By viewstatus=By.xpath("//span[normalize-space()='View Status']");
By viewstatustitle=By.xpath("//h2[normalize-space()='View Status']");

//Lodge Grievance
By LodgeGrievance=By.xpath("//span[normalize-space()='Lodge Grievance']");
By LodgeGrievancetitle=By.xpath("//h2[normalize-space()='My Grievance']");

//User Registeration
By UserRegisteration=By.xpath("//span[normalize-space()='User Registration']");
By UserRegisterationtitle=By.xpath(" //h2[normalize-space()='New User']");


//User profile

By Userprofile=By.xpath("//span[normalize-space()='My Profile']");
By Userprofiletitle=By.xpath("//h2[normalize-space()='My Profile']");

//Samagra shiksha
//track stipend details
By trackstipenddetails=By.xpath("//h4[normalize-space()='Track your Stipend Details']");
By trackstipenddetailstitle=By.xpath("//span[contains(normalize-space(),'Track your Stipend Details')]");

//track benefit details

By trackbenefitdetails=By.xpath("//h4[normalize-space()='Track your Benefits Details']");
By trackbenefitsdetailstitle=By.xpath("//span[contains(normalize-space(),'Track your Benefits Details')]");

//Grievance
By grievance=By.xpath("//h4[normalize-space()='Grievance Under Inclusive Education']");
By grievancetitle=By.xpath("//span[contains(normalize-space(),'Grievance Under Inclusive Education')]");





public void navigateback() throws InterruptedException
{
	
	    Driver.navigate().back();
	   Thread.sleep(1000);
	     Driver.switchTo().frame(switchframe());
	     Thread.sleep(2000);
}

public void refresh() throws InterruptedException
{
	
	    Driver.navigate().refresh();
	   Thread.sleep(1000);
	     Driver.switchTo().frame(switchframe());
	     Thread.sleep(2000);
}

public WebElement confirmationdetailsICARPHD()
{
	 WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(30));
	 wait.until(ExpectedConditions.elementToBeClickable(confirmationdetailsICARPHD));
	  return Driver.findElement(confirmationdetailsICARPHD);

}


public WebElement confirmationdetailsICARPHDtitle()
{
	 WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(30));
	 wait.until(ExpectedConditions.elementToBeClickable(confirmationdetailsICCRPHDtitle));
	  return Driver.findElement(confirmationdetailsICCRPHDtitle);

}


public WebElement confirmationdetailsICCRPG()
{
	 WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(30));
	 wait.until(ExpectedConditions.elementToBeClickable(confirmationdetailsICCRPG));
	  return Driver.findElement(confirmationdetailsICCRPG);

}

public WebElement confirmationdetailsICCRPGtitle()
{
	 WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(30));
	 wait.until(ExpectedConditions.elementToBeClickable(confirmationdetailsICCRPGtitle));
	  return Driver.findElement(confirmationdetailsICCRPGtitle);

}



public WebElement cuetPGAdmitcard()
{
	 WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(30));
	 wait.until(ExpectedConditions.elementToBeClickable(cuetPGAdmitcard));
	  return Driver.findElement(cuetPGAdmitcard);

}
public WebElement confirmationdetailsICCRUG()
{
	 WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(30));
	 wait.until(ExpectedConditions.elementToBeClickable(confirmationdetailsICCRUG));
	  return Driver.findElement(confirmationdetailsICCRUG);

}

public WebElement confirmationdetailsICCRUGtitle()
{
	 WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(30));
	 wait.until(ExpectedConditions.elementToBeClickable(confirmationdetailsICCRUGtitle));
	  return Driver.findElement(confirmationdetailsICCRUGtitle);

}

public WebElement cuetPGAdmitcardtitle()
{
	 WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(30));
	 wait.until(ExpectedConditions.elementToBeClickable(cuetPGAdmitcardtitle));
	  return Driver.findElement(cuetPGAdmitcardtitle);

}

public WebElement grievance()
{
	 WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(30));
	 wait.until(ExpectedConditions.elementToBeClickable(grievance));
	  return Driver.findElement(grievance);

}


public WebElement grievancetitle()
{
	 WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(30));
	 wait.until(ExpectedConditions.elementToBeClickable(grievancetitle));
	  return Driver.findElement(grievancetitle);

}


public WebElement trackbenefitdetails()
{
	 WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(30));
	 wait.until(ExpectedConditions.elementToBeClickable(trackbenefitdetails));
	  return Driver.findElement(trackbenefitdetails);

}

public WebElement trackbenefitsdetailstitle()
{
	 WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(30));
	 wait.until(ExpectedConditions.elementToBeClickable(trackbenefitsdetailstitle));
	  return Driver.findElement(trackbenefitsdetailstitle);

}


public WebElement trackstipenddetails()
{
	 WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(30));
	 wait.until(ExpectedConditions.elementToBeClickable(trackstipenddetails));
	  return Driver.findElement(trackstipenddetails);

}

public WebElement trackstipenddetailstitle()
{
	 WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(30));
	 wait.until(ExpectedConditions.elementToBeClickable(trackstipenddetailstitle));
	  return Driver.findElement(trackstipenddetailstitle);

}



public WebElement paper2scorecard()
{
	 WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(30));
	 wait.until(ExpectedConditions.elementToBeClickable(paper2scorecard));
	  return Driver.findElement(paper2scorecard);


}


public WebElement paper2scorecardtitle()
{
	 WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(30));
	 wait.until(ExpectedConditions.elementToBeClickable(paper2scorecardtitle));
	  return Driver.findElement(paper2scorecardtitle);

}


public WebElement Userprofile()
{
	 WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(30));
	 wait.until(ExpectedConditions.elementToBeClickable(Userprofile));
	  return Driver.findElement(Userprofile);
}

public WebElement Userprofiletitle()
{
	 WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(30));
	 wait.until(ExpectedConditions.elementToBeClickable(Userprofiletitle));
	  return Driver.findElement(Userprofiletitle);
}



public WebElement LodgeGrievance()
{
	 WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(30));
	 wait.until(ExpectedConditions.elementToBeClickable(LodgeGrievance));
	  return Driver.findElement(LodgeGrievance);
}

public WebElement UserRegisteration()
{
	 WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(30));
	 wait.until(ExpectedConditions.elementToBeClickable(UserRegisteration));
	  return Driver.findElement(UserRegisteration);
}

public WebElement LodgeGrievancetitle()
{
	 WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(30));
	 wait.until(ExpectedConditions.elementToBeClickable(LodgeGrievancetitle));
	  return Driver.findElement(LodgeGrievancetitle);
}




public WebElement UserRegisterationtitle()
{
	 WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(30));
	 wait.until(ExpectedConditions.elementToBeClickable(UserRegisterationtitle));
	  return Driver.findElement(UserRegisterationtitle);
}


public WebElement viewstatustitle()
{
	 WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(30));
	 wait.until(ExpectedConditions.elementToBeClickable(viewstatustitle));
	  return Driver.findElement(viewstatustitle);
}


public WebElement viewstatus()
{
	 WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(30));
	 wait.until(ExpectedConditions.elementToBeClickable(viewstatus));
	  return Driver.findElement(viewstatus);
}



public WebElement CISFLostandfoundtitle()
{
	 WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(30));
	 wait.until(ExpectedConditions.elementToBeClickable(CISFLostandfoundtitle));
	  return Driver.findElement(CISFLostandfoundtitle);
}

public WebElement CISFConsultancytitle()
{
	 WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(30));
	 wait.until(ExpectedConditions.elementToBeClickable(CISFConsultancytitle));
	  return Driver.findElement(CISFConsultancytitle);
}


public WebElement AppformforConsulatncytitle()
{
	 WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(30));
	 wait.until(ExpectedConditions.elementToBeClickable(AppformforConsulatncytitle));
	  return Driver.findElement(AppformforConsulatncytitle);
}

public WebElement CISFConsultancybyCISFtitle()
{
	 WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(30));
	 wait.until(ExpectedConditions.elementToBeClickable(CISFConsulatncybyCISFtitle));
	  return Driver.findElement(CISFConsulatncybyCISFtitle);
}


public WebElement CISFConsultancy()
{
	 WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(30));
	 wait.until(ExpectedConditions.elementToBeClickable(CISFConsultancy));
	  return Driver.findElement(CISFConsultancy);
}

public WebElement CISFConsulatncybyCISF()
{
	 WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(30));
	 wait.until(ExpectedConditions.elementToBeClickable(CISFConsulatncybyCISF));
	  return Driver.findElement(CISFConsulatncybyCISF);
}

public WebElement AppformforConsulatncy()
{
	 WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(30));
	 wait.until(ExpectedConditions.elementToBeClickable(AppformforConsulatncy));
	  return Driver.findElement(AppformforConsulatncy);
}




public WebElement CISFLostandfound()
{
	 WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(30));
	 wait.until(ExpectedConditions.elementToBeClickable(CISFLostandfound));
	  return Driver.findElement(CISFLostandfound);
}


public WebElement CISFfound()
{
	 WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(30));
	 wait.until(ExpectedConditions.visibilityOfElementLocated(CISFfound));
	  return Driver.findElement(CISFfound);
}

public WebElement CISFLost()
{
	 WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(30));
	 wait.until(ExpectedConditions.visibilityOfElementLocated(CISFLost));
	  return Driver.findElement(CISFLost);
}

public WebElement CISFproceedfound()
{
	 WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(30));
	 wait.until(ExpectedConditions.elementToBeClickable(CISFproceedfound));
	  return Driver.findElement(CISFproceedfound);
}

public WebElement CISFproceed()
{
	 WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(30));
	 wait.until(ExpectedConditions.elementToBeClickable(CISFproceed));
	  return Driver.findElement(CISFproceed);
}

public WebElement CISFLosttitle()
{
	 WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(30));
	 wait.until(ExpectedConditions.elementToBeClickable(CISFLosttitle));
	  return Driver.findElement(CISFLosttitle);
}

public WebElement CISFfoundtitle()
{
	 WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(30));
	 wait.until(ExpectedConditions.elementToBeClickable(CISFFoundtitle));
	  return Driver.findElement(CISFFoundtitle);
}

public WebElement CISFcheckcompalaintstatus()
{
	 WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(30));
	 wait.until(ExpectedConditions.elementToBeClickable(CISFcheckcompalaintstatus));
	  return Driver.findElement(CISFcheckcompalaintstatus);
}

public WebElement CISFcheckcompalaintstatustitle()
{
	 WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(30));
	 wait.until(ExpectedConditions.elementToBeClickable(CISFcheckcompalaintstatustitle));
	  return Driver.findElement(CISFcheckcompalaintstatustitle);
}



public WebElement arundhatiapply()
{
	 WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(30));
	 wait.until(ExpectedConditions.elementToBeClickable(arundhatiapply));
	  return Driver.findElement(arundhatiapply);
}

public WebElement arundhatiapplytitle()
{
	 WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(30));
	 wait.until(ExpectedConditions.elementToBeClickable(arundhatiapplytitle));
	  return Driver.findElement(arundhatiapplytitle);
}




public int refixpending()
{
	
	  return Driver.findElements(refixpending).size();
}
public WebElement arundhatirefix()
{
	 WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(30));
	 wait.until(ExpectedConditions.elementToBeClickable(arundhatirefixdate));
	  return Driver.findElement(arundhatirefixdate);
}
public int arundhatirefixtitle()
{

	  return Driver.findElements(arundatirefixdatetitle).size();
}


public WebElement arundhatitrackstatus()
{
	 WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(30));
	 wait.until(ExpectedConditions.elementToBeClickable(arundhatitrackstatus));
	  return Driver.findElement(arundhatitrackstatus);
}


public WebElement arundhatitrackstatustitle()
{
	 WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(30));
	 wait.until(ExpectedConditions.elementToBeClickable(arundhatitrackstatustitle));
	  return Driver.findElement(arundhatitrackstatustitle);
}

public int arundhatitrackstatustitle1()
{

	  return Driver.findElements(arundhatitrackstatustitle).size();
}

public int arundhatitrackstatusinvalidtitle()
{

	  return Driver.findElements(arundhatitrackstatusinvalidtitle).size();
}

public WebElement agstrackstatusapp()
{
	 WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(30));
	 wait.until(ExpectedConditions.elementToBeClickable(agstrackstatusapp));
	  return Driver.findElement(agstrackstatusapp);
}
public WebElement agstrackstatusmob()
{
	 WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(30));
	 wait.until(ExpectedConditions.elementToBeClickable(agstrackstatusmob));
	  return Driver.findElement(agstrackstatusmob);
}


public WebElement growerregisteration()
{
	 WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(30));
	 wait.until(ExpectedConditions.elementToBeClickable(growerregisteration));
	  return Driver.findElement(growerregisteration);
}



public WebElement growerregisterationtitle()
{
	 WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(30));
	 wait.until(ExpectedConditions.elementToBeClickable(growerregisterationtitle));
	  return Driver.findElement(growerregisterationtitle);
}
public WebElement  growerapplicationstatus()
{
	 WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(30));
	 wait.until(ExpectedConditions.elementToBeClickable(growerapplicationstatus));
	  return Driver.findElement(growerapplicationstatus);
}

public WebElement growerapplicationstatustitle()
{
	 WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(30));
	 wait.until(ExpectedConditions.elementToBeClickable(growerapplicationstatustitle));
	  return Driver.findElement(growerapplicationstatustitle);
}
public WebElement JASaboutus()
{
	 WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(30));
	 wait.until(ExpectedConditions.elementToBeClickable(JASaboutus));
	  return Driver.findElement(JASaboutus);
}
public WebElement JASaboutustitle()
{
	 WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(30));
	 wait.until(ExpectedConditions.elementToBeClickable(JASaboutustitle));
	  return Driver.findElement(JASaboutustitle);
}

public WebElement JEEscorecardsession2()
{
	 WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(30));
	 wait.until(ExpectedConditions.elementToBeClickable(JEEscorecardsession2));
	  return Driver.findElement(JEEscorecardsession2);
}


public WebElement JEEscorecardsession2title()
{
	 WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(30));
	 wait.until(ExpectedConditions.presenceOfElementLocated(JEEscorecardsession2title));
	  return Driver.findElement(JEEscorecardsession2title);
}

public WebElement applyfresh()
{
	 WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(30));
	 wait.until(ExpectedConditions.elementToBeClickable(applyfresh));
	return Driver.findElement(applyfresh);
}

public WebElement applyfreshtitle()
{
	 WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(30));
	 wait.until(ExpectedConditions.presenceOfElementLocated(applyfreshtitle));
	return Driver.findElement(applyfreshtitle);
}


public WebElement checkeligibilty()
{
	 WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(30));
	 wait.until(ExpectedConditions.elementToBeClickable(checkeligibilty));
	return Driver.findElement(checkeligibilty);
}

public WebElement checkeligibiltytitle()
{
	 WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(30));
	 wait.until(ExpectedConditions.presenceOfElementLocated(checkeligibiltytitle));
	return Driver.findElement(checkeligibiltytitle);
}

public int close()
{

	return Driver.findElements(close).size();
}

public WebElement closed()
{
	 WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(30));
	 wait.until(ExpectedConditions.elementToBeClickable(close));
	return Driver.findElement(close);
}


public void login(String appno, String dob) throws InterruptedException

{
	 applicationno().sendKeys(appno);
	 ((JavascriptExecutor) Driver).executeScript("arguments[0].removeAttribute('readonly')", dob());// Enables the date box
		dob().sendKeys(dob);
    	submit().click();
	//Thread.sleep(2000);
}

public WebElement impdocument()
{
	 WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(30));
	 wait.until(ExpectedConditions.elementToBeClickable(impdocument));
	return Driver.findElement(impdocument);
	
}

public WebElement impdocumenttitle()
{
	 WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(30));
	 wait.until(ExpectedConditions.elementToBeClickable(impdocumenttitle));
	return Driver.findElement(impdocumenttitle);
	
}

public WebElement SchemeInformation()
{
	 WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(30));
	 wait.until(ExpectedConditions.elementToBeClickable(SchemeInformation));
	return Driver.findElement(SchemeInformation);
	
}




public WebElement searchInstitute()
{
	 WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(30));
	 wait.until(ExpectedConditions.elementToBeClickable(searchInstitute));
	return Driver.findElement(searchInstitute);
	
}


	


public WebElement searchInstitutetitle()
{
	WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(40));
	 wait.until(ExpectedConditions.visibilityOfElementLocated(searchInstitutetitle));
	return Driver.findElement(searchInstitutetitle);
	
}

public WebElement Confirmationdetailsmerged21and22()
{
	 WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(30));
	 wait.until(ExpectedConditions.elementToBeClickable(Confirmationdetailsmerged21and22));
	return Driver.findElement(Confirmationdetailsmerged21and22);
	
}




public WebElement admitcardneet()
{
	 WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(30));
	 wait.until(ExpectedConditions.elementToBeClickable(admitcardneet));
	return Driver.findElement(admitcardneet);
	
}

public WebElement admitcardneettitle()
{
	 WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(30));
	 wait.until(ExpectedConditions.elementToBeClickable(admitcardneettitle));
	return Driver.findElement(admitcardneettitle);
	
}



public WebElement jeeconfirmationdetails1()
{
	 WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(30));
	 wait.until(ExpectedConditions.elementToBeClickable(jeeconfirmationdetails1));
	return Driver.findElement(jeeconfirmationdetails1);
	
}

public WebElement jeeconfirmationdetails2()
{
	 WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(30));
	 wait.until(ExpectedConditions.elementToBeClickable(jeeconfirmationdetails2));
	return Driver.findElement(jeeconfirmationdetails2);
	
}


public WebElement cuetUGAdmitcard()
{
	 WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(30));
	 wait.until(ExpectedConditions.elementToBeClickable(cuetUGAdmitcard));
	return Driver.findElement(cuetUGAdmitcard);
	
}

public WebElement cuetUGconfirmation()
{
	 WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(30));
	 wait.until(ExpectedConditions.elementToBeClickable(cuetUGconfirmation));
	return Driver.findElement(cuetUGconfirmation);
	
}

public WebElement cuetUGAdmitcardtitle()
{
	return Driver.findElement(cuetUGAdmitcardtitle);
	
}


public WebElement confirmationneet()
{
	 WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(30));
	 wait.until(ExpectedConditions.elementToBeClickable(confirmationneet));
	return Driver.findElement(confirmationneet);
	
}

public WebElement confirmationneettitle()
{
	WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(30));
wait.until(ExpectedConditions.elementToBeClickable(confirmationneettitle));
	return Driver.findElement(confirmationneettitle);
	
}

	public ServiceNavigation(WebDriver Driver)
	{
		this.Driver=Driver;
	}

	public WebElement jeeadmitcardsession2()
	{
		 WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(30));
		 wait.until(ExpectedConditions.elementToBeClickable(jeeadmitcardsession2));
		return Driver.findElement(jeeadmitcardsession2);
		
	}

	public WebElement jeeadmitcardsessiontitle()
	{
		return Driver.findElement(jeeadmitcardsessiontitle);
		
	}
   

	public WebElement jeesession1scorecard()
	{
		 WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(30));
		 wait.until(ExpectedConditions.elementToBeClickable(jeesession1scorecard));
		return Driver.findElement(jeesession1scorecard);
		
	}

	public WebElement jeesession1scorecardtitle()
	{
		return Driver.findElement(jeesession1scorecardtitle);
		
	}
  
	
	public WebElement submit()
	{

		 WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(30));
		 wait.until(ExpectedConditions.elementToBeClickable(submit));
		return Driver.findElement(submit);
		
	}
   
	
	public WebElement applicationno()
	{
		 WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(30));
		 wait.until(ExpectedConditions.elementToBeClickable(applicationno));
		return Driver.findElement(applicationno);
		
	}
	
	public WebElement applicationnoneet()
	{
		 WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(30));
		 wait.until(ExpectedConditions.elementToBeClickable(applicationnoneet));
		return Driver.findElement(applicationnoneet);
		
	}
	
	public WebElement dob()
	{
		 WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(30));
		 wait.until(ExpectedConditions.elementToBeClickable(dob));
		return Driver.findElement(dob);
		
	}
	
	
	public WebElement RegNAVcowin1()
	{
	return Driver.findElement(RegNavCowin);
    }
	
	
	public WebElement FAQ1()
	{
		return Driver.findElement(FAQ);
		
	}
	
	public WebElement nearestcenteropen()
	{
		return Driver.findElement(NEareastcenter);
		
	}
	
	public WebElement addpassportdetails()
	{
		return Driver.findElement(addpassportdetails);
		
	}
	
	public WebElement trackrequest()
	
	{
		return Driver.findElement(Trackrequest);
		
    }
	
	
public WebElement certificatecorrection()
	
	{
		return Driver.findElement(Certifiatecorrection);
		
    }


public WebElement mergedose()

    {
	return Driver.findElement(mergedose);
     }

public WebElement intercert()

{
	return Driver.findElement(intercert);
	
	
}


public WebElement downloadcert()

{
	return Driver.findElement(downloadcert);
}

public WebElement GSTNSearchpayer()
{
	 WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(30));
	 wait.until(ExpectedConditions.elementToBeClickable(GSTNSearchpayer));
	return Driver.findElement(GSTNSearchpayer);
}


public WebElement switchframe()
{
	 WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(30));
	 wait.until(ExpectedConditions.presenceOfElementLocated(frameswitch));
	return Driver.findElement(frameswitch);
}

public WebElement Searchpayertitle()
{
	return Driver.findElement(Searchpayertitle);
}

public WebElement CRIStrainschedule()
{
	 WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(30));
	 wait.until(ExpectedConditions.elementToBeClickable(CRIStrainschedule));
	return Driver.findElement(CRIStrainschedule);
}

public WebElement CRIStrainscheduletitle()
{
	return Driver.findElement(CRIStrainscheduletitle);
}

public WebElement CRIStrainbteweenstation()
{
	 WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(30));
	 wait.until(ExpectedConditions.elementToBeClickable(CRIStrainbetweenstation));
	return Driver.findElement(CRIStrainbetweenstation);
}

public WebElement CRIStrainbetweenstationtitle()
{
	return Driver.findElement(CRIStrainbetweenstationtitle);
}


public  WebElement CRISpnr()
{
	WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(30));
	 wait.until(ExpectedConditions.elementToBeClickable(CRISpnr));
	return Driver.findElement(CRISpnr);
}

public  WebElement CRISpnrtitle()
{

	return Driver.findElement(CRISpnrtitle);
}

public  WebElement CRISavailbiltyandfare()
{
	WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(30));
	 wait.until(ExpectedConditions.elementToBeClickable(CRISavailbiltyandfare));
	return Driver.findElement(CRISavailbiltyandfare);
}

public  WebElement CRISavailbiltyandfaretitle()
{

	return Driver.findElement(CRISavailbiltyandfaretitle);
}


public WebElement JASNearbystore()
{
	WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(30));
	 wait.until(ExpectedConditions.elementToBeClickable(JASNearbystore));
	return Driver.findElement(JASNearbystore);
}

public WebElement JASMedicineListtitle()
{
	return Driver.findElement(JASMedicineListtitle);
}

public WebElement JASMedicineList()
{
	WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(30));
	 wait.until(ExpectedConditions.elementToBeClickable(JASMedicineList));
	return Driver.findElement(JASMedicineList);
}

public WebElement JASNearbystorelist()
{
	return Driver.findElement(JASNearbystorelist);
}

public WebElement JASQualityAssurance()
{
	WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(30));
	 wait.until(ExpectedConditions.elementToBeClickable(JASQualityAssurance));
	return Driver.findElement(JASQualityAssurance);
}

public WebElement JASQualityAssurancetitle()
{
	return Driver.findElement(JASQualityAssurancetitle);
}

public WebElement JASfeedback()
{
	WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(30));
	 wait.until(ExpectedConditions.elementToBeClickable(JASfeedback));
	return Driver.findElement(JASfeedback);
}

public WebElement JASFeedbacktitle()
{
	return Driver.findElement(JASfeedbacktitle);
}
public WebElement SIfindingtrainingcenter()
{
	WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(30));
	 wait.until(ExpectedConditions.elementToBeClickable(SIfindtrainingcenter));
	return Driver.findElement(SIfindtrainingcenter);
}

public WebElement SIfindingtrainingcentertitle()
{
	WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(30));
	 wait.until(ExpectedConditions.elementToBeClickable(SIfindtrainingcentertitle));
	return Driver.findElement(SIfindtrainingcentertitle);
}

public WebElement SIfindingtrainingcenterinside()
{
	WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(30));
	 wait.until(ExpectedConditions.elementToBeClickable(SIfindtrainingcenterinside));
	return Driver.findElement(SIfindtrainingcenterinside);
}
public WebElement SIRegister()
{
	
	WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(30));
	 wait.until(ExpectedConditions.elementToBeClickable(SIRegsiter));
	return Driver.findElement(SIRegsiter);
}

public WebElement SIRegisterinside()
{
	WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(30));
	 wait.until(ExpectedConditions.elementToBeClickable(SIRegsiterinside));
	return Driver.findElement(SIRegsiterinside);
}

public WebElement SIRegsitertitle()
{
	WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(30));
	 wait.until(ExpectedConditions.elementToBeClickable(SIRegistertitle));
	return Driver.findElement(SIRegistertitle);
}

public WebElement SITrainingstatus()
{
	
	WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(30));
	 wait.until(ExpectedConditions.elementToBeClickable(SITrainingstatus));
	return Driver.findElement(SITrainingstatus);
	
}
public WebElement SITrainingstatusinside()
{
	
	WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(30));
	 wait.until(ExpectedConditions.elementToBeClickable(SITrainingstatusinside));
	return Driver.findElement(SITrainingstatusinside);
}

public WebElement SItrainingloginpopup()
{
	WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(30));
	 wait.until(ExpectedConditions.elementToBeClickable(SItrainingloginpopup));
	return Driver.findElement(SItrainingloginpopup);
}

public WebElement PMAYGFTO()
{
	
	WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(30));
	 wait.until(ExpectedConditions.elementToBeClickable(PMAYGFTO));
	return Driver.findElement(PMAYGFTO);
	
}
public WebElement PMAYGFTOtitle()
{
	
	WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(30));
	 wait.until(ExpectedConditions.elementToBeClickable(PMAYGFTOtitle));
	return Driver.findElement(PMAYGFTOtitle);
}

public WebElement PMAYgwaitlist()
{
	
	WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(30));
	 wait.until(ExpectedConditions.elementToBeClickable(PMAYgwaitlist));
	return Driver.findElement(PMAYgwaitlist);
	
}
public WebElement PMAYgwaitlisttitle()
{
	
	WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(30));
	 wait.until(ExpectedConditions.elementToBeClickable(PMAYgwaitlisttitle));
	return Driver.findElement(PMAYgwaitlisttitle);
}

public WebElement PMAYgInstallment()
{
	
	WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(30));
	 wait.until(ExpectedConditions.elementToBeClickable(PMAYgInstallment));
	return Driver.findElement(PMAYgInstallment);
}

public WebElement PMAYGinstallmenttitle()
{
	
	WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(30));
	 wait.until(ExpectedConditions.elementToBeClickable(PMAYGinstallmenttitle));
	return Driver.findElement(PMAYGinstallmenttitle);
}


public WebElement logoutPMayg()
{
	WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(30));
	 wait.until(ExpectedConditions.elementToBeClickable(logoutPMayg));
	 return Driver.findElement(logoutPMayg);
}

public WebElement confirmlogoutPMAYG()
{
	WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(30));
	 wait.until(ExpectedConditions.elementToBeClickable(confirmlogoutPMAYG));
	 return Driver.findElement(confirmlogoutPMAYG);
}

public WebElement loginPMAYG()
{
	WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(30));
	 wait.until(ExpectedConditions.elementToBeClickable(loginPMAYG));
	 return Driver.findElement(loginPMAYG);
}


public WebElement PMAYGconvergencedetails()
{
	WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(30));
	 wait.until(ExpectedConditions.elementToBeClickable(PMAYGconvergencedetails));
	 return Driver.findElement(PMAYGconvergencedetails);
}

public WebElement PMAYGconvergencetitle()
{
	WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(30));
	 wait.until(ExpectedConditions.elementToBeClickable(PMAYGconvergencetitle));
	 return Driver.findElement(PMAYGconvergencetitle);
}

public WebElement PMAYGCitizendetails()
{
	WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(30));
	 wait.until(ExpectedConditions.elementToBeClickable(PMAYGCitizendetails));
	 return Driver.findElement(PMAYGCitizendetails);
}

public WebElement PMAYGcitizentitle()
{
	WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(30));
	 wait.until(ExpectedConditions.elementToBeClickable(PMAYGcitizentitle));
	 return Driver.findElement(PMAYGcitizentitle);
}


public WebElement eraktbloodavail()
{
	WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(30));
	 wait.until(ExpectedConditions.elementToBeClickable(eraktbloodavail));
	 return Driver.findElement(eraktbloodavail);
}

public WebElement eraktbloodavailtitle()
{
	WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(30));
	 wait.until(ExpectedConditions.elementToBeClickable(eraktbloodavailtitle));
	 return Driver.findElement(eraktbloodavailtitle);
}


public WebElement eraktbloodbanksearch()
{
	WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(30));
	 wait.until(ExpectedConditions.elementToBeClickable(eraktbloodbanksearch));
	return Driver.findElement(eraktbloodbanksearch);
}


public WebElement eraktbloodbanksearchtitle()
{
	WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(30));
	 wait.until(ExpectedConditions.elementToBeClickable(eraktbloodbanksearchtitle));
	 return Driver.findElement(eraktbloodbanksearchtitle);
}

public WebElement eraktcampschedule()
{
	WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(30));
	 wait.until(ExpectedConditions.elementToBeClickable(eraktcampschedule));
	 return Driver.findElement(eraktcampschedule);
	
}

public WebElement eraktcampscheduletitle()
{
	WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(30));
	 wait.until(ExpectedConditions.elementToBeClickable(eraktcampscheduletitle));
	 return Driver.findElement(eraktcampscheduletitle);
	
}

public WebElement eraktmydonations()
{
	WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(30));
	 wait.until(ExpectedConditions.elementToBeClickable(eraktmydonations));
	 return Driver.findElement(eraktmydonations);
}


public WebElement AICTEapprovedinstitutions()
{
	WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(30));
	 wait.until(ExpectedConditions.elementToBeClickable(AICTEapprovedinstitutions));
	 return Driver.findElement(AICTEapprovedinstitutions);
}

public WebElement AICTEapprovedinstitutionstitle()
{
	WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(30));
	 wait.until(ExpectedConditions.elementToBeClickable(AICTEapprovedinstitutiontitle));
	 return Driver.findElement(AICTEapprovedinstitutiontitle);
}

public WebElement AICTEtrackapplicationstatus()
{
	WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(30));
	 wait.until(ExpectedConditions.elementToBeClickable(AICTEtrackapplicationstatus));
	 return Driver.findElement(AICTEtrackapplicationstatus);
}

public WebElement AICTEtrackapplicationstatustitle()
{
	WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(30));
	 wait.until(ExpectedConditions.elementToBeClickable(AICTEtrackapplicationstatustitle));
	 return Driver.findElement(AICTEtrackapplicationstatustitle);
}


public WebElement AICTEcheckeligibilty()
{
	WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(30));
	 wait.until(ExpectedConditions.elementToBeClickable(AICTEcheckeligibilty));
	 return Driver.findElement(AICTEcheckeligibilty);
}

public WebElement AICTEcheckeligibiltytitle()
{
	WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(30));
	 wait.until(ExpectedConditions.elementToBeClickable(AICTEcheckeligibiltytitle));
	 return Driver.findElement(AICTEcheckeligibiltytitle);
}

public WebElement AICTEapplyscholarship()
{
	WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(30));
	 wait.until(ExpectedConditions.elementToBeClickable(AICTEapplyscholrship));
	 return Driver.findElement(AICTEapplyscholrship);
}

public WebElement AICTEapplyscholrshiptitle()
{
	WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(30));
	 wait.until(ExpectedConditions.elementToBeClickable(AICTEapplyscholrshiptitle));
	 return Driver.findElement(AICTEapplyscholrshiptitle);
}


}
	
	
	
	
	