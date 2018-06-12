package org.fasttrackit.tests;

import org.fasttrackit.DriverFactory;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class TestBase {

    @Before
    public void setup() {
        DriverFactory.initDriver();
        DriverFactory.getDriver().get("https://fasttrackit.org/selenium-test");
    }

    @After
    public void tearDown() {
        DriverFactory.getDriver().quit();
    }
}
