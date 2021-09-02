package com.nuthana.automation.utils;

import org.openqa.selenium.WebDriver;

public class Global {
	public WebDriver driver;
	//test dara
	public String url="https://adactinhotelapp.com/HotelAppBuild2/index.php";
	public String un="xxxxxxxxxx";
	public String pw="xxxxxxxxxx";
	
	
	//variabes for login
	public String txt_loginname="username";
	public String txt_password="password";
	public String btn_login="login";
	public String link_logout="Logout";
	
	//variabes for new user registration
	public String username="xxxxxxxxxx";
	public String password="xxxxxxxxxx";
	public String re_password="xxxxxxxxxx";
	public String full_name="xxxxxxxxxx";
	public String email_add="xxxxxxxxxxxxx";
	public String btnSubmit="Submit";
	
	
	//Expected Results Varibales
	public String expectedURLAfterLoginSucess="https://adactinhotelapp.com/SearchHotel.php";
	
	
	

}
