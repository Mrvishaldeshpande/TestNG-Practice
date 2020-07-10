package test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

import org.testng.annotations.Parameters;


public class Testcase3 {
	@Parameters({"username","url"})
  @Test
  public void Testcase(String username,String url) {System.out.println(); System.out.println("Test case 3");System.out.println();
 System.out.println(username); System.out.println(url);
	}
  @BeforeMethod
  public void beforeMethod() {System.out.println(); System.out.println("Before Method");System.out.println();
  }

  @AfterMethod
  public void afterMethod() {System.out.println(); System.out.println("After Method");System.out.println();
  }

  @BeforeClass
  
  public void beforeClass() {System.out.println(); System.out.println("Before class Method test case 3");System.out.println();
  
  System.out.println();}
  @Parameters("username")
  @AfterClass
  public void afterClass(String username) {System.out.println(); System.out.println("After class method test case 3");System.out.println();
  System.out.println(username);}

  @AfterTest
  
  public void beforeTest( ) {System.out.println(); System.out.println("After Test method ");System.out.println();
  System.out.println();}

  @AfterSuite
  public void beforeSuite() {System.out.println(); System.out.println("After Suite method");System.out.println();
  }

}
