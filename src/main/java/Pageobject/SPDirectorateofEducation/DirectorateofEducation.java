package Pageobject.SPDirectorateofEducation;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DirectorateofEducation
{
public WebDriver Driver;
WebDriverWait wait;
	
	

public DirectorateofEducation(WebDriver Driver){
	this.Driver= Driver;
	wait =new WebDriverWait(Driver, Duration.ofSeconds(20));
	
	
}
//Scholarship to students pursuing higher education in mainland in the form of mess bill reimbursement
By Scholarshiptostudents =By.xpath("//h4[normalize-space()='Scholarship to students pursuing higher education in mainland in the form of mess bill reimbursement']");

//Hostel Reimbursement of cash in lieu of Mess bill/Stipend
By HostelReimbursement = By.xpath("//h4[normalize-space()='Hostel Reimbursement of cash in lieu of Mess bill/Stipend']");

//Hostel Stipend for College students of Andaman and Nicobar Islands
By CollegeStudents =By.xpath("//h4[normalize-space()='Hostel Stipend for College students of Andaman and Nicobar Islands']");

//Reimbursement of cash in lieu of school uniform
By SchoolUniform = By.xpath("//h4[normalize-space()='Reimbursement of cash in lieu of school uniform']");

//Reimbursement of School Stationary Kits
By SchoolStationaryKits = By.xpath("//h4[normalize-space()='Reimbursement of School Stationary Kits']");

// info services

//Scholarship to students pursuing higher education in mainland in the form of mess bill reimbursement
By infoScholarshiptostudents =By.xpath("//h4[normalize-space()='Scholarship to students pursuing higher education in mainland in the form of mess bill reimbursement']//following::img[@src='./assets/images/infoIcon.png'][1]");

//Hostel Reimbursement of cash in lieu of Mess bill/Stipend
By infoHostelReimbursement = By.xpath("//h4[normalize-space()='Hostel Reimbursement of cash in lieu of Mess bill/Stipend']//following::img[@src='./assets/images/infoIcon.png'][1]");

//Hostel Stipend for College students of Andaman and Nicobar Islands
By infoCollegeStudents =By.xpath("//h4[normalize-space()='Hostel Stipend for College students of Andaman and Nicobar Islands']//following::img[@src='./assets/images/infoIcon.png'][1]");

//Reimbursement of cash in lieu of school uniform
By infoSchoolUniform = By.xpath("//h4[normalize-space()='Reimbursement of cash in lieu of school uniform']//following::img[@src='./assets/images/infoIcon.png'][1]");

//Reimbursement of School Stationary Kits
By infoSchoolStationaryKits = By.xpath("//h4[normalize-space()='Reimbursement of School Stationary Kits']//following::img[@src='./assets/images/infoIcon.png'][1]");

public WebElement infoScholarshiptostudents()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoScholarshiptostudents));
	  return Driver.findElement(infoScholarshiptostudents);
}

public WebElement infoHostelReimbursement()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoHostelReimbursement));
	  return Driver.findElement(infoHostelReimbursement);
}
public WebElement infoCollegeStudents()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoCollegeStudents));
	  return Driver.findElement(infoCollegeStudents);
}
public WebElement infoSchoolUniform()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoSchoolUniform));
	  return Driver.findElement(infoSchoolUniform);
}
public WebElement infoSchoolStationaryKits()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoSchoolStationaryKits));
	  return Driver.findElement(infoSchoolStationaryKits);
}

public WebElement Scholarshiptostudents()
{
	wait.until(ExpectedConditions.elementToBeClickable(Scholarshiptostudents));
	  return Driver.findElement(Scholarshiptostudents);
}

public WebElement HostelReimbursement()
{
	wait.until(ExpectedConditions.elementToBeClickable(HostelReimbursement));
	  return Driver.findElement(HostelReimbursement);
}
public WebElement CollegeStudents()
{
	wait.until(ExpectedConditions.elementToBeClickable(CollegeStudents));
	  return Driver.findElement(CollegeStudents);
}
public WebElement SchoolUniform()
{
	wait.until(ExpectedConditions.elementToBeClickable(SchoolUniform));
	  return Driver.findElement(SchoolUniform);
}
public WebElement SchoolStationaryKits()
{
	wait.until(ExpectedConditions.elementToBeClickable(SchoolStationaryKits));
	  return Driver.findElement(SchoolStationaryKits);
}

}
