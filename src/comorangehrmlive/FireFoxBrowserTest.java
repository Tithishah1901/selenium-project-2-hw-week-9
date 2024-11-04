package comorangehrmlive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class FireFoxBrowserTest {
    public static void main(String[] args) {
        String baseUrl = "https://opensource-demo.orangehrmlive.com";
        // set up Firefox browser
        WebDriver driver = new FirefoxDriver();
        // Open URL
        driver.get(baseUrl);

        // We give Implicit wait to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));


        //Print the title of the page
        String title = driver.getTitle();
        System.out.println(title);

        //Print the current URL
        String currentUrl = driver.getCurrentUrl();
        System.out.println("The current url " + currentUrl);

        //Print the page source
        System.out.println("The page Source : " + driver.getPageSource());

        //Click on forgot password link
        WebElement forgotPasswordLink = driver.findElement(By.className("orangehrm-login-forgot"));
        forgotPasswordLink.click();

        // Print the current URL
        System.out.println("Current URL after clicking 'Forgot your password?': " + driver.getCurrentUrl());

        //Navigate back to login page
        driver.navigate().back();

        //Refresh the page
        driver.navigate().refresh();

        //Enter the email in email filed
        WebElement userNameFiled = driver.findElement(By.name("username"));
        userNameFiled.sendKeys("Admin");

        //Enter the password in password filed
        WebElement passwordFiled = driver.findElement(By.name("password"));
        passwordFiled.sendKeys("admin123");

        //Click on login button
        WebElement loginLink = driver.findElement(By.xpath("//button[text()=' Login ']"));
        loginLink.click();

        //close browser
        driver.quit();


    }

}
