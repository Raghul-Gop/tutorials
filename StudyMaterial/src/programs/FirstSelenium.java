package programs;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver wbd=new FirefoxDriver();
		wbd.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		wbd.get("http://automationpractice.com/index.php");
		List<WebElement> l=wbd.findElements(By.xpath("//a[@title='Blouse']"));
		Iterator<WebElement> ite=l.iterator();
		while(ite.hasNext()){
			WebElement we= (WebElement) ite.next();
			String s=we.getText();
			System.out.println(s);
		}

	}

}
