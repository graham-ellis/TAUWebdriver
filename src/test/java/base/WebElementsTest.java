package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementsTest {
    private WebDriver driver;

    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        //driver.manage().window().fullscreen();
        System.out.print(driver.getTitle() + "\n");
        //locate element by linkText using the findElementBy method
        //new WebElement Class called inputslink (as Variable) and find linktext called Inputs
        WebElement inputsLink = driver.findElement(By.linkText("Inputs"));
        //call the click method
        inputsLink.click();
        System.out.println(driver.getCurrentUrl());

        driver.quit();
    }

    public static void main(String args[]){
        WebElementsTest test = new WebElementsTest();
        test.setUp();
    }



}
