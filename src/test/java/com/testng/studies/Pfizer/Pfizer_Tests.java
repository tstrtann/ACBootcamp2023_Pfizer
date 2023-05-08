package com.testng.studies.Pfizer;

import org.testng.Assert;
import org.testng.annotations.Test;

import page.classes.Homepage;
import utilities.BaseClass;

public class Pfizer_Tests extends BaseClass{
	
  @Test(description = "As a user I should be able to search for vaccine information using a search icon.")
  public void test1() throws InterruptedException {
	  Homepage hp = new Homepage(driver);
	  
	  // Assert Homepage
	  Assert.assertEquals(driver.getTitle(), "Pfizer: One of the world's premier biopharmaceutical companies");
	  hp.clickSearchIcon();
	  hp.enterSearchField("covid-19");
	  
	  	 
  }
  
  @Test(description = "As a user, I should be able to go on the Pfizer website in the careers functionality,"
  		+ " and be able to access the Careers in PGS")
  public void test2() {
	  
	  // Assert Homepage
	  Assert.assertEquals(driver.getTitle(), "Pfizer: One of the world's premier biopharmaceutical companies");
	  
  }
  
}
