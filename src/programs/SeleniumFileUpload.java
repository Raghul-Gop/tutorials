package programs;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumFileUpload {
	static WebDriver driver=new FirefoxDriver();
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	
		driver.get("https://10.126.172.12/");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("roZes123");
		driver.findElement(By.xpath("//div[@class='loginButton']/descendant::button[@id='loginPage_loginSubmit']")).click();
		customWaitForPageLoad("//div[contains(text(),'System Summary')]");
		System.out.println("Handling the Alert !!!");
		driver.findElement(By.xpath("//div[@class='modal-content']/descendant::button[contains(text(),'OK')]")).click();
		customWait("//div[@class='modal-content']/descendant::button[contains(text(),'No')]");
		System.out.println("Handling the Alert !!!");
		driver.findElement(By.xpath("//div[@class='modal-content']/descendant::button[contains(text(),'No')]")).click();
		
		//driver.findElement(By.xpath("//a[@data-item-id='administration']")).click();
		Actions action=new Actions(driver);
		WebElement we=driver.findElement(By.xpath("//a[@data-item-id='administration']"));
		action.moveToElement(we).build().perform();
		driver.findElement(By.xpath("//a[contains(text(),'Identity Source Sequences')]/preceding::a[contains(text(),'Identities')]")).click();
		customWaitForPageLoad("//div[contains(text(),'Endpoint List')]");
		driver.findElement(By.xpath("//a[contains(text(),'Users')]")).click();
		customWaitForPageLoad("//div[contains(text(),'Network Access')]");
		customWaitForPageLoad("//span[contains(text(),'Import')]");
		driver.findElement(By.xpath("//span[contains(text(),'Import')]")).click();
		driver.findElement(By.xpath("//input[@id='userImportFile']")).click();
		Runtime.getRuntime().exec("C:\\Users\\ragopi\\Desktop\\AutoIT\\FileUpload.exe");
		
		
	}
	
	public static void customWait(String xPath){
		WebDriverWait wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xPath)));
		System.out.println("Alert found!!! ");
	}
	public static void customWaitForPageLoad(String xPath){
		WebDriverWait wait = new  WebDriverWait(driver, 20);
		System.out.println("Waiting for Page load");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xPath)));
	}
}
