package test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;


public class Testcase2 {
  @Test
  public void Testcase() {System.out.println(); System.out.println("Test case 2");System.out.println();
  }
  @BeforeMethod
  public void beforeMethod() {System.out.println(); System.out.println("Before Method");System.out.println();
  }

  @AfterMethod
  public void afterMethod() {System.out.println(); System.out.println("After Method");System.out.println();
  }

  @BeforeClass
  public void beforeClass() {System.out.println("=====================================================================");
  System.out.println(); System.out.println("Before class Method test case 2");System.out.println();
  }

  @AfterClass
  public void afterClass() {System.out.println(); System.out.println("After class method test case 2");System.out.println();
  System.out.println("=====================================================================");}

  @AfterTest
  public void beforeTest() {System.out.println(); System.out.println("After Test method ");System.out.println();
  }

  @AfterSuite
  public void beforeSuite() {System.out.println(); System.out.println("After Suite method");System.out.println();
  }

}
