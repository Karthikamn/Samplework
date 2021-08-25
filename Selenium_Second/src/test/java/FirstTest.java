import org.testng.annotations.Test;

public class FirstTest {
  @Test
  public void a() {
	  System.out.println("First test first method");
  }
 @Test (groups="first")
 public void b() {
	 System.out.println("First test second method");
 }

}


