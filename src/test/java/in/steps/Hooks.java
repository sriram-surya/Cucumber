package in.steps;


import java.util.Date;

import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks extends BaseClass {


	@Before ("@first")
	public void tc1() {
		Date d = new Date();
		System.out.println(d);
		System.out.println("this will run @1");
		browserLanuch();
		
	}
	@Before("@second")
	public void tc2() {
		
		Date d = new Date();
		System.out.println(d);
		System.out.println("this will run @3");
		browserLanuch();

	}
	@Before("@third")
	public void tc21() {
		Date d = new Date();
		System.out.println(d);
		System.out.println("this will run @2");

	}
	@After("@first")
	public void after1() {
		Date d = new Date();
		System.out.println(d);
	}
	
	@After("@second")
	public void tc4() {
		Date d = new Date();
		System.out.println(d);
	}
	@After("@third")
	public void tc41() {
		Date d = new Date();
		System.out.println(d);
	}
	
	@After
	public void after() {
	driver.quit();
	}
}
