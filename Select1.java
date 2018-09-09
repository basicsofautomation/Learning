package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Select1 {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Project BDD\\learning\\src\\test\\java\\resource\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.firstcry.com/");
        driver.manage().window().maximize();
     //   driver.findElement(By.xpath("//span[text()='Register']")).click();
        driver.switchTo().frame("");

        driver.findElement(By.xpath("//input[@class='welcome_email_form emailautocomplete']")).sendKeys("sati2ashish@gmail.com");




    }
}
