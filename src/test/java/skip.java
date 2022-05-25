
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.*;

public class skip {
    private WebDriver driver;

    private By SignInButton = By.cssSelector("ul.sign_up_btn >li>a");
    private By continuewith = By.cssSelector("div.potentialidplist>div:nth-child(1)>a:nth-child(1)");
    private By Email = By.cssSelector("input#identifierId");
    private By Next = By.cssSelector("#identifierNext > div > button");
    private By Password = By.cssSelector("");

    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "C:\\edge\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://maharatech.gov.eg/");
    }
    @Test
    public void SigninButton(){
        driver.findElement(SignInButton).click();
    }
    @Test(dependsOnMethods = "SigninButton")
    public void setContinuewith(){
        driver.findElement(continuewith).click();
    }
    @Test(dependsOnMethods = "setContinuewith")
    public void setEmail(){
        driver.findElement(Email).sendKeys("ahmedmohamed660000@gmail.com");
    }

  @Test(dependsOnMethods = "setEmail")
    public void Next(){
        driver.findElement(Next).click();
  }
}
