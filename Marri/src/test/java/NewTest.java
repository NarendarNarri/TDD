

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class NewTest {
	WebDriver d;
  @Test
  public void f() {
	  d.findElement(By.xpath("//*[@name='uname']")).sendKeys("admin");
	  d.findElement(By.xpath("//*[@name='psw']")).sendKeys("pass");
	  d.findElement(By.xpath("//*[@type='submit']")).click();
	  Assert.assertEquals("prolearn", "prolearn");
  }
  @BeforeTest
  public void beforeTest() {
 System.setProperty("webdriver.gecko.driver", "E:\\geckodriverwer\\geckodriver.exe");
	  d = new FirefoxDriver();
	  d.get("http://ec2-18-222-224-37.us-east-2.compute.amazonaws.com:8090/TestWebapp-1.0/");
  }

  @AfterTest
  public void afterTest() {
	  d.close();
  }

}
