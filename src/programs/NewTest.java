package programs;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewTest {
	WebDriver driver=new FirefoxDriver();

  @Test
  public void openBrowser() {
	  driver.get("https://www.google.co.in");
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
  }
  
  @Test(dependsOnMethods={"openBrowser"})
  public void login(){

  }
  
}
