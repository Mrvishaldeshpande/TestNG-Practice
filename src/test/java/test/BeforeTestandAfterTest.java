package test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class BeforeTestandAfterTest {
  @Test
  public void befretestmethod() {System.out.println();System.out.println();
	  System.out.println("BeforeTestclass running---Testmethod ");System.out.println();System.out.println();
  }
  @BeforeTest
  public void beforeTest() { System.out.println(" Before Test ");System.out.println();System.out.println();
  }

  @AfterTest
  public void afterTest() { System.out.println(" After Test ");System.out.println();System.out.println();
  }

}
