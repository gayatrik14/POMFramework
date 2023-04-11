package testNgLearning;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class AnnotationLearning {
  @Test
  public void f() {
	  System.out.println("this is test");
	  
	  
  }
  @Test
  public void Test() {
	  System.out.println("this is test1");
  }
  @BeforeMethod
  public void beforeMethod() {
	  
	  System.out.println("this is beforeMethod");
  }

  @AfterMethod
  public void afterMethod() {
	  
	  System.out.println("this is afterMethod");
  }

  @BeforeClass
  public void beforeClass() {
	  
	  System.out.println("this is beforeclass");
  }

  @AfterClass
  public void afterClass() {
	  
	  System.out.println("this is afterClass");
  }

  @BeforeTest
  public void beforeTest() {
	  
	  System.out.println("this is beforeTest");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("this is afterTest");
  }

  @BeforeSuite
  public void beforeSuite() {
	  
	  System.out.println("this is beforeSuite");
  }

  @AfterSuite
  public void afterSuite() {
	  
	  System.out.println("this is afterSuite");
  }

}
