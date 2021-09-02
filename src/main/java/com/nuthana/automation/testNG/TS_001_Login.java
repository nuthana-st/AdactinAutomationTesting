package com.nuthana.automation.testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.nuthana.automation.utils.General;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class TS_001_Login {
	WebDriver driver;

	@BeforeClass
	public void startup() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Projects\\\\Adactin\\\\\\\\chromedriver92\\\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@AfterClass
	public void closeapp() {
		driver.close();

	}

	@Test
	public void Tc1() throws Exception {

		General gen = new General();
		gen.OpenApplication();
		System.out.println("application open");// console
		Reporter.log("application open");// html report
		gen.login();
		Reporter.log("logincompleted");

	}

	@Test
	public void Tc2() throws Exception {

		General gen = new General();
		gen.OpenApplication();
		System.out.println("application open");// console
		Reporter.log("application open");// html report
		// overriding password with incorrect username for test case purposes
		gen.un = "testaaaaa";
		gen.login();
		Reporter.log("logincompleted");

	
	}

@Test
public void Tc3() throws Exception {

	General gen = new General();
	gen.OpenApplication();
	System.out.println("application open");// console
	Reporter.log("application open");// html report
	//
	//incorrect the password
	 
			gen.un="XXXXXXX";
			gen.pw="XXXXXXX";
			gen.login();
}


@Test
public void Tc4() throws Exception {

	General gen = new General();
	gen.OpenApplication();
	System.out.println("application open");// console
	Reporter.log("application open");// html report
	//
	//incorrect the username,password
	 
			gen.un="xxxxxxx";
			gen.pw="xxxxxxx";
			gen.login();
}

@Test
public void Tc5() throws Exception {

	General gen = new General();
	gen.OpenApplication();
	System.out.println("application open");// console
	Reporter.log("application open");// html report
	//
	//blank the  username,password
	 
	gen.un="";
	gen.pw="";
	gen.login();
}



@Test
public void Tc6() throws Exception {

	General gen = new General();
	gen.OpenApplication();
	System.out.println("application open");// console
	Reporter.log("application open");// html report
	//
	//blank the  password
	 
	gen.un="xxxxxxxxx";
	gen.pw="";
	gen.login();
}


@Test
public void Tc7() throws Exception {

	General gen = new General();
	gen.OpenApplication();
	System.out.println("application open");// console
	Reporter.log("application open");// html report
	//
	//blank the  username
	 
	gen.un="";
	gen.pw="xxxxxxxxxx";
	gen.login();
}
}



