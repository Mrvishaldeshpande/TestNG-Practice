package test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class BeforesuitandAftersuit {
  @Test
  public void suitmethod() {System.out.println();System.out.println();System.out.println("beforeSuit class running---Test Method");System.out.println();System.out.println();
  }
  @BeforeSuite
  public void beforeSuite() {System.out.println();System.out.println();System.out.println(" Before suit ");System.out.println();System.out.println();
  }

  @AfterSuite
  public void afterSuite() {System.out.println();System.out.println();System.out.println("After suite");System.out.println();System.out.println();
  }

}
