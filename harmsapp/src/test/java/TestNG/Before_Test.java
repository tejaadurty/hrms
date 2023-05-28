package TestNG;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Before_Test {

	@BeforeTest
	public void Beforetest1() {

		System.out.println("This is from Before test 1");

	}

	@Test(priority = 2)
	public void TestMethod1() {

		System.out.println("This is from test method 1");

	}

	@Test(priority = 1)
	public void TestMethod2() {

		System.out.println("This is from test method 2");

	}

	@AfterTest
	public void Aftertest1() {

		System.out.println("This is from After test 1");

	}
}
