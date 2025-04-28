package qafox_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Register {

	public static void main(String[] args) {
		
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
			
			
			WebElement register=driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/div/a"));
			register.click();
			
			WebElement firstname=driver.findElement(By.name("firstname"));
			firstname.sendKeys("Vimal");
			WebElement lastname=driver.findElement(By.name("lastname"));
			lastname.sendKeys("Joy");
			WebElement email=driver.findElement(By.name("email"));
			email.sendKeys("vimaljoy332@gmail.com");
			WebElement phone=driver.findElement(By.name("telephone"));
			phone.sendKeys("9188420255");
			WebElement pass=driver.findElement(By.name("password"));
			pass.sendKeys("DX2S@LeLmZGi5#");
			WebElement confpass=driver.findElement(By.name("confirm"));
			confpass.sendKeys("DX2S@LeLmZGi5#");
			WebElement news=driver.findElement(By.xpath("//*[@id=\"content\"]/form/fieldset[3]/div/div/label[2]/input"));
			news.click();
			WebElement privacy=driver.findElement(By.name("agree"));
			privacy.click();
			WebElement Contin=driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[2]"));
			Contin.click();
			
			
			
			

	}

}
