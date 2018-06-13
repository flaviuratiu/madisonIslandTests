package org.fasttrackit.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import static org.fasttrackit.DriverFactory.getDriver;

public class TestUtils {

    public static void mouseOverAndClickLast(By... locators) {
        Actions actions = new Actions(getDriver());
        for (int i = 0; i < locators.length; i++) {
                if (i < locators.length - 1) {
                actions.moveToElement(getDriver().findElement(locators[i]))
                        .perform();
                System.out.println("Executed mouse over on " + locators[i]);
            } else {
                actions.click(getDriver().findElement(locators[i]))
                        .perform();
                System.out.println("Clicked " + locators[i] +
                        " element revealed after mouse over.");
            }
        }
    }
}
