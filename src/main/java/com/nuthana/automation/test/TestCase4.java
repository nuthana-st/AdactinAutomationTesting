package com.nuthana.automation.test;

import com.nuthana.automation.utils.General;

public class TestCase4{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		General gen = new General();
		gen.OpenApplication();
		//incorrect the username,password
	 
		gen.un="shreyanvi";
		gen.pw="ishanvi";
		gen.login();

	}

}
