import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestMyPage {
    private final String PATH = "file:///C:/Users/user/IdeaProjects/Calculator/src/test/resources/index.html";

    @Test
    public void isWelcomeDisplayed() {
        //open Chrome browser
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //open url of My Page
        driver.get(PATH);
        //find "Welcome, Stranger!"
        driver.findElement(By.name("welcome_stranger"));
        //Add check
        WebElement element = driver.findElement(By.name("welcome_stranger"));
        boolean isElementDisplayed = element.isDisplayed();
        driver.quit();
        Assert.assertTrue(isElementDisplayed, "Element is not displayed");
    }

    @Test
    public void isDropDownListDisplayed() {
        //open Chrome browser
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //open url of My Page
        driver.get(PATH);
        //find drop-down list
        driver.findElement(By.name("bands"));
        //Add check
        WebElement element = driver.findElement(By.name("bands"));
        boolean isElementDisplayed = element.isDisplayed();
        driver.quit();
        Assert.assertTrue(isElementDisplayed, "Element is not displayed");
    }

    @Test
    public void isButtonDisplayed() {
        //open Chrome browser
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //open url of My Page
        driver.get(PATH);
        //find button
        driver.findElement(By.name("button"));
        //Add check
        WebElement element = driver.findElement(By.name("button"));
        boolean isElementDisplayed = element.isDisplayed();
        driver.quit();
        Assert.assertTrue(isElementDisplayed, "Element is not displayed");
    }

    @Test
    public void isMyNameDisplayed() {
        //open Chrome browser
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //open url of My Page
        driver.get(PATH);
        //find line "My name is Natalya"
        driver.findElement(By.name("my_name"));
        //Add check
        WebElement element = driver.findElement(By.name("my_name"));
        String myName = element.getText();
        boolean isNameContains = myName.contains("Natalya");
        driver.quit();
        Assert.assertTrue(isNameContains, "There is'nt such name");
    }

    @Test
    public void isOpenedNecessaryResource() {
        //open Chrome browser
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //open url of My Page
        driver.get(PATH);
        //find link and click it
        driver.findElement(By.name("link")).click();
        //Add check
        WebElement element = driver.findElement(By.id("navbtn_references"));
        boolean isElementDisplayed = element.isDisplayed();
        driver.quit();
        Assert.assertTrue(isElementDisplayed, "Element is not displayed");
    }

    @Test
    public void isImageContainText() {
        //open Chrome browser
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //open url of My Page
        driver.get(PATH);
        //find picture
        driver.findElement(By.name("image"));
        //Add check
        String element = driver.findElement(By.name("image")).getAttribute("alt");
        boolean isTextContain=element.contains("oops, you found it");
        driver.quit();
        Assert.assertTrue(isTextContain, "There is'nt such text");

    }
}