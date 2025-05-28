package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Parabank {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.edgedriver().setup();
     
        WebDriver driver=new EdgeDriver();
        driver.get("https://parabank.parasoft.com/");
        Thread.sleep(3000);
        driver.findElement(By.xpath("[@name=\"user-name\"]")).sendKeys("kshitijmore2020@gmail.com");
        Thread.sleep(3000);
        driver.findElement(By.className("input")).sendKeys("123456");
        Thread.sleep(3000);
        driver.close();
	}

}
