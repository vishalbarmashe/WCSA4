package testNG_package;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {
  @Test
  public void demo() {
	  //System.out.println("this is Demo class");
	  Reporter.log("This is a demo method", true);
  }
  
  
  @Test
  public void demo1() {
	  Reporter.log("This is a demo1 method", true);
  }
  
  
  @Test
  public void demo2() {
	  int a=33;
	  int b=0;
	  int res=a/b;
	  Reporter.log(res+"This is a demo2 Method");
  }
}
