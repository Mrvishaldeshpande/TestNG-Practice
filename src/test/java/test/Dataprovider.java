package test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider {
  @Test(dataProvider="data")
  public void provider(String a,String b) {System.out.println(a);System.out.println(b);
  }
  
  @DataProvider
  public Object[][] data(){
	  
	 return  new Object [][] {
		 new Object []{"Vishal","de"},
		 new Object []{"Deshpande","vv"}
	 };
	  
  }
}
