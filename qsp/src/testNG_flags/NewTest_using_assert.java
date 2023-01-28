package testNG_flags;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class NewTest_using_assert {
  @Test
  public void m1() {
	  Assert.fail();
  }
  
  
  @Test(alwaysRun = true)
  public void m2() {
	  Reporter.log("Method M2 Is Executed");
  }
}
