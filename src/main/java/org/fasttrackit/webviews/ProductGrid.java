package org.fasttrackit.webviews;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;


public class ProductGrid {

    @FindBy(css = ".product-info .product-name a")
    private List<WebElement> productNameContainers;

    @FindBy(css = "select[title='Sort By']")
    private WebElement sortBySelectList;

    public List<WebElement> getProductNameContainers() {
        return productNameContainers;
    }

    // Returning Select object instead of WebElement to make
    // interactions with the drop-down list easier
    public Select getSortBySelectList() {
        return new Select(sortBySelectList);
    }
}
