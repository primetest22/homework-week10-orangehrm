package project_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class FireFoxTest {

    public static void main(String[] args) {

        String baseUrl = "https://opensource-demo.orangehrmlive.com/";

        System.setProperty("webdriver.gecko.driver","driver/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        driver.get(baseUrl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        System.out.println("PAGE TITLE: " + driver.getTitle());
        System.out.println("CURRENT URL: " + driver.getCurrentUrl());
        System.out.println("PAGE SOURCE: " + driver.getPageSource());

        WebElement email = driver.findElement(By.id("txtUsername"));
        email.sendKeys("primetest@gmail.com");

        WebElement password = driver.findElement(By.name("txtPassword"));
        password.sendKeys("orange");

        driver.close();


    }

}
