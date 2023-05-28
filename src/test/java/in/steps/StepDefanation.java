package in.steps;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefanation extends BaseClass {
	
	@When("user has to launch the url")
	public void userHasToLaunchTheUrl() {
		launchUrl("http://www.brm.tremplintech.in/web_pages/login.aspx");
	}

	@When("user has to enter the {string} and {string}")
	public void userHasToEnterTheAnd(String username, String password) {
	   driver.findElement(By.id("txt_unam")).sendKeys(username);
	   driver.findElement(By.id("txt_pass")).sendKeys(password);
	   driver.findElement(By.id("Button3")).click();
	}

	@Then("user has to navigate to homepage")
	public void userHasToNavigateToHomepage() {
		try {
			String url = driver.getCurrentUrl();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	//  Assert.assertEquals(url,"http://www.brm.tremplintech.in/web_pages/ord_reg.aspx");
	}
	
	@When("user has to click supplier Management")
	public void userHasToClickSupplierManagement() {
	 try {
		 driver.findElement(By.xpath("//a[text()='ordermanagement']")).click();
	} catch (Exception e) {
		e.printStackTrace();
	}
	  
	}

	@When("user has to enter the date of enquiry")
	public void userHasToEnterTheDateOfEnquiry(io.cucumber.datatable.DataTable d)throws Throwable {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		List<String> l = d.asList();
		String date = l.get(1);
	  driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys(date);
	}

	@When("user has to enter the customer id")
	public void userHasToEnterTheCustomerId(io.cucumber.datatable.DataTable d)throws Throwable {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	List<List<String>> li = d.asLists();
	List<String> l1 = li.get(0);
	String cusid = l1.get(0);
	driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys(cusid);
	}

	@When("user has to enter the phone number")
	public void userHasToEnterThePhoneNumber(io.cucumber.datatable.DataTable d)throws Throwable {
		//driver.navigate().refresh();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  Map<String, String> m = d.asMap(String.class, String.class);
	  try {
		  driver.findElement(By.xpath("(//input[@type='text'])[6]")).sendKeys(m.get("phonenumber"));
	} catch (Exception e) {
		System.out.println(e.getMessage());
	} 
	}

	@When("user has to enter the mobile number")
	public void userHasToEnterTheMobileNumber(io.cucumber.datatable.DataTable d)throws Throwable {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	List<Map<String, String>> m1 = d.asMaps(String.class, String.class);
//	Map<String, String> map = m1.get(0);
//	String s = map.get("phonenumber");
	driver.findElement(By.xpath("(//input[@type='text'])[9]")).sendKeys(m1.get(0).get("phonenumber"));
	}
}
