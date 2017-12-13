package pkg1;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import com.sun.glass.events.KeyEvent;

public class Robotclass {

	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.co.in/");
		Thread.sleep(100);
		Actions act=new Actions(driver);
	   act.sendKeys(Keys.CONTROL+"p").perform();
		Thread.sleep(100);
		Robot rb=new Robot();
		Thread.sleep(100);
		rb.keyPress(KeyEvent.VK_ESCAPE);
		Thread.sleep(100);
		rb.keyRelease(KeyEvent.VK_ESCAPE);

	}

}
