package test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class BeforeMethodandAftermethod {
  @Test
  public void testmethod() { System.out.println("Testing practice1--Test>>");
  }
  @BeforeMethod
  public void beforeMethod() { System.out.println("BeforeMethod");
  }

  @AfterMethod
  public void afterMethod() {System.out.println("After method");
  }

}
