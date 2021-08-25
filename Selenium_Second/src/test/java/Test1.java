import org.testng.Assert;
import org.testng.annotations.Test;

public class Test1 {
	
	Calculator calc=new Calculator();
	 @Test
	  public void add1Test() {
	    Assert.assertEquals(calc.add1(5, 5), 10);
	  }

	  @Test
	  public void sub1Test() {
	    Assert.assertEquals(calc.sub1(10, 5), 5);
	  }


}
