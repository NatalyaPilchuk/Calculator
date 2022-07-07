import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Calculate {
    @Test
    public void starvationTest() {
        //Open new Chrome browser
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //Open url calculator
        driver.get("https://healthunify.com/bmicalculator/");
        //Input weight
        driver.findElement(By.name("wg")).sendKeys("30");
        //Input height
        driver.findElement(By.name("ht")).sendKeys("170");
        //Click "Calculate"
        driver.findElement(By.cssSelector("[value=Calculate]")).click();
        // Add check
        String message = driver.findElement(By.name("desc")).getAttribute("value");
        Assert.assertFalse(message.isEmpty());

    }

    @Test
    public void underWeightTest() {
        //Open new Chrome browser
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //Open url calculator
        driver.get("https://healthunify.com/bmicalculator/");
        //Input weight
        driver.findElement(By.name("wg")).sendKeys("45");
        //Input height
        driver.findElement(By.name("ht")).sendKeys("170");
        //Click "Calculate"
        driver.findElement(By.cssSelector("[value=Calculate]")).click();
        // Add check
        String message = driver.findElement(By.name("desc")).getAttribute("value");
        Assert.assertFalse(message.isEmpty());

    }

    @Test
    public void normalTest() {
        //Open new Chrome browser
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //Open url calculator
        driver.get("https://healthunify.com/bmicalculator/");
        //Input weight
        driver.findElement(By.name("wg")).sendKeys("55");
        //Input height
        driver.findElement(By.name("ht")).sendKeys("170");
        //Click "Calculate"
        driver.findElement(By.cssSelector("[value=Calculate]")).click();
        // Add check
        String message = driver.findElement(By.name("desc")).getAttribute("value");
        Assert.assertFalse(message.isEmpty());

    }

    @Test
    public void overWeightTest() {
        //Open new Chrome browser
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //Open url calculator
        driver.get("https://healthunify.com/bmicalculator/");
        //Input weight
        driver.findElement(By.name("wg")).sendKeys("80");
        //Input height
        driver.findElement(By.name("ht")).sendKeys("170");
        //Click "Calculate"
        driver.findElement(By.cssSelector("[value=Calculate]")).click();
        // Add check
        String message = driver.findElement(By.name("desc")).getAttribute("value");
        Assert.assertFalse(message.isEmpty());

    }

    @Test
    public void obeseTest() {
        //Open new Chrome browser
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //Open url calculator
        driver.get("https://healthunify.com/bmicalculator/");
        //Input weight
        driver.findElement(By.name("wg")).sendKeys("100");
        //Input height
        driver.findElement(By.name("ht")).sendKeys("170");
        //Click "Calculate"
        driver.findElement(By.cssSelector("[value=Calculate]")).click();
        // Add check
        String message = driver.findElement(By.name("desc")).getAttribute("value");
        Assert.assertFalse(message.isEmpty());

    }

}
