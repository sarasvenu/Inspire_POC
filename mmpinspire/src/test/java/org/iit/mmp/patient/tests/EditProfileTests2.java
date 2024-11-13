package org.iit.mmp.patient.tests;

import org.iit.healthcare.mminspire.BaseClass;
import org.iit.healthcare.mminspire.MMPUtil;
import org.iit.mmp.patient.pageobjects.EditProfilePage;
import org.iit.mmp.patient.pageobjects.EditProfilePage2;
import org.iit.mmp.patient.pageobjects.HomePage;
import org.iit.mmp.patient.pageobjects.LoginPage;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class EditProfileTests2 extends BaseClass{

	@Parameters({"modulename"})
	@Test
	public void editProfileTests(String modulename) {
		
		MMPUtil mmpUtil =new MMPUtil(driver);
		mmpUtil.launchBrowser(prop.getProperty("patient_url"));
		
		LoginPage loginPage = new LoginPage(driver);
		loginPage.login(prop.getProperty("patient_username"),prop.getProperty("patient_password"));
			
		HomePage homePage = new HomePage(driver);
		homePage.navigateToAModule(modulename);
		
		
		EditProfilePage editprofilePage = new EditProfilePage(driver);         //Page object model
		//EditProfilePage2 editprofilePage2 = new EditProfilePage2(driver);    //Page Factory
		editprofilePage.clickEdit();
		editprofilePage.setFirstName("John");
		editprofilePage.setLasttName("Smith");
		editprofilePage.setLicenseNumber("12345678");
		editprofilePage.setssnNumber("111003344");
		editprofilePage.clickSave();
		editprofilePage.handlealert();
		
	}
	
		
}
