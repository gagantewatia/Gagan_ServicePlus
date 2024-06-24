package UMANG.Cowintest;

import java.io.IOException;
import java.util.ArrayList;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PageObjects.CRISPNRStatus;
import PageObjects.ServiceDirectoryNavigation;
import PageObjects.ServiceNavigation;
import PageObjects.departmentnavigationpage;
import Resources.Base2;
import Utilis.CRISExcel;

public class CRISPNRStatusTestCases extends Base2{
	//go to all services
		@Test(priority=1)
		public void allservicesnavigation() throws IOException, InterruptedException

		{
			 test.assignCategory(CRIS);
			departmentnavigationpage SD=new departmentnavigationpage(Driver);
			SD.allservicesredirect();
			
		}

	//go to department page	
		
		@Test(priority=2)
		public void CRISdepartmentnavigation() throws IOException, InterruptedException

		{
			 test.assignCategory(CRIS);
			 departmentnavigationpage SD=new departmentnavigationpage(Driver);
			 String Servicename="CRIS";
		 	 SD.servicenavigationclick(Servicename);
			 	Assert.assertEquals(SD.CRISNGETTitle().getText(),"CRIS NGET","Not matched");
		}
			
		
		
		//ServiceNavigation
		@Test(priority=3)
		public void CRISServiceNavigation() throws IOException
		{
			 test.assignCategory(CRIS);
			System.out.println("Service Navigation");
			ServiceNavigation dp=new ServiceNavigation(Driver);
	 		dp.CRISpnr().click();
			 Assert.assertEquals(dp.CRISpnrtitle().getText(),"PNR Status","Not matched");
		}
		
		// Case : Invalid PNR
		
				@Test(priority=4)	
				public void CRISpnrinvalidpnr() throws IOException, InterruptedException
				{
					 test.assignCategory(CRIS);
				
					CRISPNRStatus CS=new CRISPNRStatus(Driver);
					CRISExcel gs1=new CRISExcel();
					ArrayList<String> data1=gs1.getData("Trainpnrstatus-Invalid PNR");
					CS.inputpnr().sendKeys(data1.get(1));
						CS.submitbutton().click();
						
					 SoftAssert softAssert = new SoftAssert();
					softAssert.assertEquals(CS.invalidpnrtext().getText(), "Invalid PNR Number!", "Not matched");
					 
					 CS.Close().click();
					 CS.inputpnr().clear();
					 softAssert.assertAll();
				}
		
		//	Case : Flushed PNR
		@Test(priority=5)	
		public void CRISflushedpnr() throws IOException, InterruptedException
		{
			 test.assignCategory(CRIS);
		
			CRISPNRStatus CS=new CRISPNRStatus(Driver);
			CRISExcel gs=new CRISExcel();
			ArrayList<String> data=gs.getData("Trainpnrstatus-Flushed PNR");
			
			CS.inputpnr().sendKeys(data.get(1));
			
			CS.submitbutton().click();
	
			 SoftAssert softAssert = new SoftAssert();
			softAssert.assertEquals(CS.flushedPNR().getText(), "FLUSHED PNR / PNR NOT YET GENERATED!", "Not matched");
			Thread.sleep(1000);
			 CS.Close().click();
			 CS.inputpnr().clear();
		   
		    softAssert.assertAll();
			
		}
	/*		
//Case : valid PNR
		@Test(priority=6)	
		public void CRISvalidpnr() throws IOException
		{
			 test.assignCategory(CRIS);
		
			CRISPNRStatus CS=new CRISPNRStatus(Driver);
			CRISExcel gs2=new CRISExcel();
			ArrayList<String> data2=gs2.getData("Trainpnrstatus-valid PNR");
			
			CS.inputpnr().sendKeys(data2.get(1));
			
			CS.submitbutton().click();
			
			 Assert.assertEquals(true,CS.boarddetails().isDisplayed(),"Not matched");
	
		}
*/		
		//back to service directory
		@Test(priority=7)
		
		public void CRISbacktoservicedirectory()
		{
			 test.assignCategory(CRIS);
			 ServiceDirectoryNavigation SN=new ServiceDirectoryNavigation(Driver);
			    SN.backtohome();
		}
		
}
