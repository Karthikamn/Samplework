import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class NewTest1 {
	
	
	@Test(priority=0)
	  public void browser_to_be_opened_chrome() {
		  System.out.println("chrome browser");
	  }
  @Test(priority=0)
  public void appln_open_the_login_page() {
	  System.out.println("login page to be opened");
  }
  
  @Test
  
  public void close() {
	  System.out.println("close browser");
  }
  
}
