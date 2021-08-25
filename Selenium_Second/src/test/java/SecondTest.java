import org.testng.annotations.Test;

public class SecondTest {
  @Test (groups="first")
  public void a() {
	  System.out.println("Second test first method");
  }
 @Test
 public void b() {
	 System.out.println("Second test second method");
 }

}


