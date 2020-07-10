package test;

import org.testng.annotations.Test;

public class Testcase5 {
  @Test(priority=1)
  public void mobilemethod() {System.out.println("Mobile method");
  }
  
  @Test (priority=2,enabled=false)
  public void mobiletest () {System.out.println("Mobile test method");}
  
  @Test (priority=3)
  public void mobilesteps () {System.out.println("Mobile steps method");}
  
  
  @Test(priority=4)
  public void Webmethod() {System.out.println("Web method");
  }
  
  @Test (priority=5)
  public void Webtest () {System.out.println("Web method");}
  
  @Test (priority=6)
  public void Websteps () {System.out.println("Web steps method");}
  
  
}
