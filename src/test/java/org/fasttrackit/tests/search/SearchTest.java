package org.fasttrackit.tests.search;

import org.fasttrackit.steps.HeaderSteps;
import org.fasttrackit.steps.ProductGridSteps;
import org.fasttrackit.tests.TestBase;
import org.fasttrackit.tests.TestUtils;
import org.fasttrackit.webviews.ProductGrid;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import static org.fasttrackit.DriverFactory.getDriver;


public class SearchTest extends TestBase {

    @Test
    public void searchWithOneKeywordTest() {
        String keyword = "vase";
        HeaderSteps headerSteps = new HeaderSteps();
        headerSteps.search(keyword);

        ProductGridSteps productGridSteps = new ProductGridSteps();
        productGridSteps.assertThatAllProductNamesContain(keyword);
    }

    @Test
    public void mouseOverAndDropDownListsDemo() throws InterruptedException {
        TestUtils.mouseOverAndClickLast(
                By.linkText("WOMEN"), By.linkText("New Arrivals"));

        ProductGrid productGrid =
                PageFactory.initElements(getDriver(), ProductGrid.class);

        productGrid.getSortBySelectList().selectByVisibleText("Name");
    }

}
