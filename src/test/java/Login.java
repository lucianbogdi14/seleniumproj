import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

    public void login() {

    WebDriver driver = new ChromeDriver();
        driver.get("http://testfasttrackit.info/selenium-test/");

        driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label")).click();
        driver.findElement(By.cssSelector("#header-account > div > ul > li.last > a")).click();
        driver.findElement(By.cssSelector("#email")).sendKeys("lebronluci14@gmail.com");
        driver.findElement(By.cssSelector("#pass")).sendKeys("Lucian1");
        driver.findElement(By.cssSelector("#send2 > span > span")).click();
        driver.quit();
}}
