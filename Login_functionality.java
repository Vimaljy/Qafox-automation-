package qafox_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_functionality {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		
		WebElement email=driver.findElement(By.name("email"));
		email.sendKeys("vimaljoy332@gmail.com");
		WebElement pass=driver.findElement(By.name("password"));
		pass.sendKeys("DX2S@LeLmZGi5#");
		WebElement login=driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input"));
		login.click();
		
		
		

	}

}
