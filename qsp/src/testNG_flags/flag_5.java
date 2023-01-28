package testNG_flags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class flag_5 {
	
  @Test (priority = 3)
  public void z() {
	  Reporter.log("Z",true);
  }
  
  @Test (priority = 1)
  public void h() {
	  Reporter.log("H",true);
  }
  
  @Test
  public void k() {
	  Reporter.log("K",true);
  }
  
  @Test (priority = 7)
  public void m() {
	  Reporter.log("M",true);
  }
  
  @Test (priority = 0)
  public void b() {
	  Reporter.log("B",true);
  }
  
  @Test
  public void a() {
	  Reporter.log("A",true);
  }
  
  @Test (priority = 0)
  public void g() {
	  Reporter.log("G",true);
  }
  
  @Test (priority = 2)
  public void p() {
	  Reporter.log("P",true);
  }
  
  @Test (priority = -1)
  public void i() {
	  Reporter.log("I",true);
  }
}
