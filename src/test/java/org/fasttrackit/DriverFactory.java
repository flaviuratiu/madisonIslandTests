package org.fasttrackit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

public class DriverFactory {

    private static WebDriver driver;

    public static void initDriver() {
        // Reading parameter provided from command line
        // For example: mvn test -Dbrowser=firefox
        String browser = System.getProperty("browser", "chrome");

        switch (browser) {
            default:
                System.out.println("Using default browser: Chrome");
            case "chrome":
                // todo: move driver paths to config file
                System.setProperty("webdriver.chrome.driver", "C:\\TrainingProjects\\madisonIslandTests\\src\\test\\resources\\drivers\\chromedriver.exe");
                driver = new ChromeDriver();
                break;
            case "firefox":
                System.setProperty("webdriver.gecko.driver", "C:\\TrainingProjects\\madisonIslandTests\\src\\test\\resources\\drivers\\geckodriver.exe");
                driver = new FirefoxDriver();
                break;
            case "ie":
                System.setProperty("webdriver.ie.driver", "C:\\TrainingProjects\\madisonIslandTests\\src\\test\\resources\\drivers\\IEDriverServer.exe");
                driver = new InternetExplorerDriver();
                break;

        }

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    public static WebDriver getDriver() {
        return driver;
    }
}
