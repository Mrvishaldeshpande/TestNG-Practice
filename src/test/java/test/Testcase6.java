package test;

import org.testng.annotations.Test;

public class Testcase6 {
  @Test(groups="regression")
  public void regression() { System.out.println("Regression");
  }
  
  
  @Test(groups="smoke")
  public void smoke() { System.out.println("smoke");
  }
  
  @Test(groups="sanity")
  public void sanity() { System.out.println("Sanity");
  }
  
  @Test(groups="function")
  public void function() { System.out.println("Function");
  }
  @Test(groups="e2e")
  public void endtoend() { System.out.println("Endtoend");
  }
  
  
  
  
}
