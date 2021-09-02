package com.nuthana.automation.test;

import com.nuthana.automation.utils.General;

public class TestCase3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		General gen = new General();
		gen.OpenApplication();
		//incorrect the password
	 
		gen.un="nuthanashreya";
		gen.pw="ishanvi";
		gen.login();

	}

}
