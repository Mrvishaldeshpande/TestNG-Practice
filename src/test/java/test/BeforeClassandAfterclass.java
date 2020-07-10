package test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class BeforeClassandAfterclass {
  @Test
  public void beforeclassmethod() {System.out.println();System.out.println();
	  System.out.println("Before class method running--->TestMethod");
  }
  @BeforeClass
  public void beforeClass() {System.out.println("Before class");System.out.println();System.out.println();
  }

  @AfterClass
  public void afterClass() {
	  
	  System.out.println("After class ");System.out.println();System.out.println();
  }

}
