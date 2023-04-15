package Dana;

import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {
    WebDriver driver;
    @Given("open the browser and launch HRMS application")
    public void open_the_browser_and_launch_hrms_application() {
        driver=new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");

        System.out.println("How are you ne var you ");
        System.out.println("abracadabra");

    }

    }

