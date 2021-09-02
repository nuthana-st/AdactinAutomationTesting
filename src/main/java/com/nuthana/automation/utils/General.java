package com.nuthana.automation.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

//import com.hrms.utility.Log;

public class General extends Global {

	// functions/methods
	public void OpenApplication() {
		System.setProperty("webdriver.chrome.driver", "C:\\Projects\\Adactin\\\\chromedriver92\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to(url);
		System.out.println("Application opened");
		// Log.info("Application opened");//log4j program
	}

	public void CloseApplication() {
		driver.close();
		System.out.println("Application close");
		// Log.info("Application close");
	}

	public void login() {
		driver.findElement(By.name(txt_loginname)).sendKeys(un);
		driver.findElement(By.name(txt_password)).sendKeys(pw);
		driver.findElement(By.name(btn_login)).click();

		// Log.info("login");
	}

	public void logout() {
		driver.findElement(By.linkText(link_logout)).click();
		System.out.println("logout completed");
		// Log.info("logout");
	}

	public void add() {
		driver.switchTo().frame("rightMenu");
		driver.findElement(By.xpath("//input[@value='Add']")).click();
		System.out.println("add button ");
		driver.switchTo().defaultContent();
		// Log.info("add");
	}

	// TODO Auto-generated method stub

	public void delete() {
		driver.findElement(By.xpath("//input[@value='Delete']")).click();
		System.out.println("delete the button ");
		// Log.info("delete");
	}

	public void newuserregistration() {
		driver.findElement(By.linkText("New User Register Here")).click();
		driver.findElement(By.name("username")).sendKeys("nuthanashreya");
		driver.findElement(By.name("password")).sendKeys("Nikki@2021");
		driver.findElement(By.name("re_password")).sendKeys("Nikki@2021");
		driver.findElement(By.name("full_name")).sendKeys("nuthanapenugonda");
		driver.findElement(By.name("email_add")).sendKeys("nallam.nuthana@gmail.com");
		driver.findElement(By.name("Submit")).click();

	}

}
