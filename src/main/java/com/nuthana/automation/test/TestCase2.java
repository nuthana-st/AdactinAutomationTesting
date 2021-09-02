package com.nuthana.automation.test;

import com.nuthana.automation.utils.General;

public class TestCase2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		General gen = new General();
		gen.OpenApplication();
		//overriding password with incorrect username for test case purposes
		gen.un="testaaaaa";
		gen.login();

	}

}
