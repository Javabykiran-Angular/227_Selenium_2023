package com.jbk.testng;

import org.testng.annotations.Test;

public class SignUp {

	
	@Test(priority = 1)
	public void signupTest1() {
		System.out.println("==== signupTest1===");
	}
	
	@Test(priority = 2)
	public void signupTest2() {
		System.out.println("==== signupTest2===");
	}
	
	
}
