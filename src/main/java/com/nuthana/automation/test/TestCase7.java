package com.nuthana.automation.test;

import com.nuthana.automation.utils.General;

public class TestCase7{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		General gen = new General();
		gen.OpenApplication();
		//blank the  username
	 
		gen.un="";
		gen.pw="Adactin@test";
		gen.login();

	}

}
