package com.seleniumFW.homePage;

import java.sql.Driver;

import com.seleniumFW.testBase.TestBase;

public class TestCase1 extends TestBase {

	public static void main(String[] args) {
		
		TestCase1 tc1 = new TestCase1();
		tc1.getBrowser("chrome");
		tc1.getDriver().get("http://google.com");;

	}

}
