package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Frames {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Project BDD\\learning\\src\\test\\java\\resource\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://toolsqa.wpengine.com/iframe-practice-page/");
        driver.manage().window().maximize();

        List<WebElement> list =driver.findElements(By.tagName("iFrame"));
        System.out.println(list.size());
         driver.switchTo().frame(1);
        System.out.println("++++++++++"+driver.getTitle());

    }
}
