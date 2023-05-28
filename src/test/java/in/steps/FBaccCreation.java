package in.steps;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FBaccCreation extends BaseClass {
	
	@When("user has to launch the Url and click create new account button")
	public void userHasToLaunchTheUrlAndClickCreateNewAccountButton() {
	    driver.get("https://en-gb.facebook.com/");
	    driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
	}

	@When("user has to navigate to create new account page")
	public void userHasToNavigateToCreateNewAccountPage() {
	   String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl,"https://en-gb.facebook.com/");
		System.out.println("successfull");
	}

	@When("user has to enter the Firstname and secondname")
	public void userHasToEnterTheFirstnameAndSecondname(io.cucumber.datatable.DataTable d) throws InterruptedException {
	    List<String> l = d.asList();
	    String firstn = l.get(0);
	    String secondn = l.get(1);
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 //   Thread.sleep(3000);
	    driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(firstn);
	  //  Thread.sleep(3000);
	    driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys(secondn);
	}

	@When("user has to enter the moblie number or email id")
	public void userHasToEnterTheMoblieNumberOrEmailId(io.cucumber.datatable.DataTable d) throws InterruptedException {
	 List<List<String>> asLists = d.asLists();
	// Thread.sleep(3000);
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys(asLists.get(0).get(2));
	}

	@When("user has to click the gender icon")
	public void userHasToClickTheGenderIcon() throws InterruptedException {
		//Thread.sleep(3000);
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   driver.findElement(By.xpath("(//input[@name='sex'])[2]")).click();
	}

	@When("user has to click signup button")
	public void userHasToClickSignupButton() {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.findElement(By.xpath("//button[text()='Sign Up']")).click();
	}

	@Then("user has to navigate to facebook homepage")
	public void userHasToNavigateToFacebookHomepage() {
	  driver.close();
	}
}
