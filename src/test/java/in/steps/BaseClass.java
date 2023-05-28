package in.steps;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.SendKeysAction;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;

	public static void browserLanuch() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	public static void launchUrl(String url) {
		driver.get(url);
	}

	public static String getTitle() {
		String title = driver.getTitle();
		return title;
	}

	public static void getCurrentUrl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
	}

	public void close() {
		driver.close();
	}

	public static void quite() {
		driver.quit();
	}

	public static void passValue(WebElement element, String value) {
		element.sendKeys(value);
	}

	public static void clickElement(WebElement element) {
		element.click();
	}

	public static void getText(WebElement element ) {
		String text = element.getText();
		
	}

	public static Actions a;

	public static void moveToElement(WebElement element) {
		Actions a = new Actions(driver);
		a.moveToElement(element).perform();
	}

	public static void contextClick(WebElement element) {
		Actions a = new Actions(driver);
		a.contextClick(element).perform();
	}

	public static void doubleClick(WebElement element) {
		Actions a = new Actions(driver);
		a.doubleClick(element).perform();
	}

	public static void dragAndDrop(WebElement src, WebElement des) {
		Actions a = new Actions(driver);
		a.dragAndDrop(src, des).perform();
	}

	public static void keyDown(CharSequence key) {
		Actions a = new Actions(driver);
		a.keyDown(key).perform();
	}

	public static void keyUp(CharSequence key) {
		Actions a = new Actions(driver);
		a.keyUp(key).perform();
	}

	public static Alert a1;

	public static void accept() {
		Alert a1 = driver.switchTo().alert();
		a1.accept();
	}

	public static void dismiss() {
		Alert a1 = driver.switchTo().alert();
		a1.dismiss();
	}

	public static void gettextAlert() {
		Alert a1 = driver.switchTo().alert();
		a1.getText();
	}

	public static void sendKeysAlert(String value) {
		Alert a1 = driver.switchTo().alert();
		a1.sendKeys(value);
	}

	public static JavascriptExecutor js;

	public static void jsSendKeys(String stringvalue, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("args[0].setAttribute('value','stringvalue)", element);
	}

	public static void jsGetText(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Object o = js.executeScript("args[0].getAttribute('value')", element);
		String value = (String) o;
		System.out.println(value);
	}

	public static void jsclick(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("args[0].click();", element);
	}

	public static void scrolldown(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", element);
	}

	public static void scrollUP(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(false)", element);
	}

	public static String readCellValue(int sheet, int row, int cell) throws IOException {

		File f = new File("C:\\Users\\sha\\eclipse-workspace 2\\FrameWorkPrac\\excel\\practice data.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fis);
		Sheet s = w.getSheetAt(sheet);
		Row r = s.getRow(row);
		Cell c = r.getCell(cell);

		int cellType = c.getCellType();
		String value;
		if (cellType == 1) {
			value = c.getStringCellValue();
//			System.out.println("string cellValue");
		}

		else if (DateUtil.isCellDateFormatted(c)) {
			Date dateCellValue = c.getDateCellValue();
			SimpleDateFormat df = new SimpleDateFormat("M/dd/yyyy");
			value = df.format(dateCellValue);
//			System.out.println("date cell value");

		} else {
			double numericCellValue = c.getNumericCellValue();
			long l = (long) numericCellValue;
			value = String.valueOf(l);
//			System.out.println("numerical cellvalue");

		}
		return value;

	}
}