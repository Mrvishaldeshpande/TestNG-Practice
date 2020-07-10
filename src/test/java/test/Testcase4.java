package test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.BeforeSuite;

public class Testcase4 {
@Parameters("username")
  @Test
  public void Testcase(String username) {System.out.println(); System.out.println("Test case 4");System.out.println();
System.out.println(username);  
}
  @BeforeMethod
  public void beforeMethod() {System.out.println(); System.out.println("Before Method");System.out.println();
  }

  @AfterMethod
  public void afterMethod() {System.out.println(); System.out.println("After Method");System.out.println();
  }

  @BeforeClass
  public void beforeClass() {System.out.println(); System.out.println("Before class Method test case 4");System.out.println();
  }

  @AfterClass
  public void afterClass() {System.out.println(); System.out.println("After class method test case 4");System.out.println();
  }

  @BeforeTest
  public void beforeTest() {System.out.println(); System.out.println("Before Test method ");System.out.println();
  }

  @BeforeSuite

  public void beforeSuite() {System.out.println(); System.out.println("Before Suite method");System.out.println();
  
  System.out.println();}

}
