package qafox_automation;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Add_to_cart {

	public static void main(String[] args) throws InterruptedException, AWTException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/index.php?route=common/home");
		
	    Thread.sleep(1000);
		WebElement apple=driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[3]/div/div[2]/h4/a"));
		apple.click();
		
		WebElement radio=driver.findElement(By.name("option[218]"));
		radio.click();
		WebElement checkbox=driver.findElement(By.name("option[223][]"));
		checkbox.click();
		WebElement text=driver.findElement(By.name("option[208]"));
		text.clear();
		text.sendKeys("Vimaljy");
		Select colour=new Select(driver.findElement(By.name("option[217]")));
		colour.selectByIndex(1);
		WebElement textarea=driver.findElement(By.xpath("//*[@id=\"input-option209\"]"));
		textarea.sendKeys("Hii Apple");
		
		WebElement upload=driver.findElement(By.xpath("//*[@id=\"button-upload222\"]"));
		upload.click();
		Thread.sleep(2000);
		StringSelection str=new StringSelection("C:\\Automation\\My Resume.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
		Robot robo=new Robot();
		robo.keyPress(KeyEvent.VK_CONTROL);
		robo.keyPress(KeyEvent.VK_V);
		robo.keyRelease(KeyEvent.VK_CONTROL);
		robo.keyRelease(KeyEvent.VK_V);
		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		WebElement date=driver.findElement(By.name("option[219]"));
		date.sendKeys("2025-04-22");
		WebElement time=driver.findElement(By.name("option[221]"));
		time.sendKeys("10:07");
		WebElement dateandtime=driver.findElement(By.name("option[220]"));
		dateandtime.sendKeys("2025-04-22 10:7");
		WebElement quantity=driver.findElement(By.name("quantity"));
		quantity.clear();
		quantity.sendKeys("2");
		WebElement cart=driver.findElement(By.xpath("//*[@id=\"button-cart\"]"));
		cart.click();
		WebElement view=driver.findElement(By.xpath("//*[@id=\"cart\"]/button"));
		view.click();
		WebElement viewcart=driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[5]/a/span"));
		viewcart.click();
		WebElement checkout=driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div[2]/a"));
		checkout.click();
		
		

	}

}
