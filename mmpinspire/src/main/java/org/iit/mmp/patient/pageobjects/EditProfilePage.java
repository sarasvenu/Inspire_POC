package org.iit.mmp.patient.pageobjects;

import org.openqa.selenium.Alert;

//Page object model approach

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EditProfilePage {
	
	WebDriver driver;
	
	
	//constructor-initiate web driver
	
	public EditProfilePage(WebDriver driver)
	{
		
		this.driver=driver;
		if (!driver.getTitle().equals("profile")) 
	    {
		      throw new IllegalStateException("This is Profile Page," + " current page is: " + driver.getCurrentUrl());
		 }
		
	}
	
	
	//Locators
	
	By editButtonLocator = By.xpath("//input[@id='Ebtn']");
	By firstNameLocator = By.xpath("//input[@id='fname']");
	By lastNameLocator =By.xpath("//input[@id='lname']");
	By licenseNumberLocator =By.xpath("//input[@id='licn']");
	By ssnNumberLocator =By.xpath("//input[@id='ssn']");
	By saveButtonLocator = By.xpath("//input[@id='Sbtn']");
	
	
	
	//Action Methods
	
	public void clickEdit()
	 {
		driver.findElement(editButtonLocator).click();
	 }
	
	
	 public void setFirstName(String firstname)
	 {
		 driver.findElement(firstNameLocator).clear();
		 driver.findElement(firstNameLocator).sendKeys(firstname);
		
	 }
	
	 public void setLasttName(String lastname)
	 {
		 driver.findElement(lastNameLocator).clear();
		 driver.findElement(lastNameLocator).sendKeys(lastname);
	 }
	 
	 public void setssnNumber(String ssnNum)
	 {
		 driver.findElement(ssnNumberLocator).clear();
		 driver.findElement(ssnNumberLocator ).sendKeys(ssnNum);
	 }
	 
	 public void setLicenseNumber(String LicenseNum)
	 {
		 driver.findElement(licenseNumberLocator).clear();
		 driver.findElement(licenseNumberLocator).sendKeys(LicenseNum);
	 }
	 
	 public void clickSave()
	 {
		 driver.findElement(saveButtonLocator).click();
	 }
	
	 public void handlealert()
	 {
		
		    Alert salert = driver.switchTo().alert();
			System.out.println("Alert message: " +salert.getText());
			salert.accept();	
		 
		
	 }
	 
}
