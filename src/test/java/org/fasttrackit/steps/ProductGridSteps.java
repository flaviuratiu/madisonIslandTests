package org.fasttrackit.steps;

import org.fasttrackit.DriverFactory;
import org.fasttrackit.webviews.ProductGrid;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

public class ProductGridSteps {

    public void assertThatAllProductNamesContain(String keyword) {
        ProductGrid productGrid = PageFactory.initElements(DriverFactory.getDriver(), ProductGrid.class);

        for (WebElement productNameContainer : productGrid.getProductNameContainers()) {
            String productName = productNameContainer.getText();

            System.out.println("Extracted product name: " + productName);

            assertThat("Some of the products do not contain the searched keyword.",
                    productName, containsString(keyword.toUpperCase())
            );
        }
    }
}
