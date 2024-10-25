package org.iit.mmp.patient.pageobjects;

//Using Page Factory Approach


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditProfilePage2 {
	
	WebDriver driver;
	
	
	//constructor-initiate web driver
	
	public EditProfilePage2(WebDriver driver)
	{
		
		this.driver=driver;
		
		PageFactory.initElements(driver,this);
		
		if (!driver.getTitle().equals("profile")) 
	    {
		      throw new IllegalStateException("This is Profile Page," + " current page is: " + driver.getCurrentUrl());
		 }
		
	
	}
	
	
	//Locators
	@FindBy(xpath="//input[@id='Ebtn']") 
	WebElement editbutton;
	
	@FindBy(xpath="//input[@id='fname']") 
	WebElement fname;
	
	@FindBy(xpath="//input[@id='lname']") 
	WebElement lname;
	
	@FindBy(xpath="//input[@id='licn']") 
	WebElement licnum;
	
	@FindBy(xpath="//input[@id='ssn']") 
	WebElement ssnnum;
	
	@FindBy(xpath="//input[@id='Sbtn']") 
	WebElement savebutton;
	
	
	//Action Methods
	
	public void clickEdit()
	 {
		editbutton.click();
	 }
	
	
	 public void setFirstName(String firstname)
	 {
		 fname.clear();
		 fname.sendKeys(firstname);
		
	 }
	
	 public void setLasttName(String lastname)
	 {
		 lname.clear();
		 lname.sendKeys(lastname);
	 }
	 
	 public void setssnNumber(String ssnNum)
	 {
		 ssnnum.clear();
		 ssnnum.sendKeys(ssnNum);
	 }
	 
	 public void setLicenseNumber(String LicenseNum)
	 {
		 licnum.clear();
		 licnum.sendKeys(LicenseNum);
	 }
	 
	 public void clickSave()
	 {
		 savebutton.click();
		 
	 }
	
	 
	 
}
