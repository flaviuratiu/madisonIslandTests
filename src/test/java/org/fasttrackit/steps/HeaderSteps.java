package org.fasttrackit.steps;

import org.fasttrackit.DriverFactory;
import org.fasttrackit.webviews.Header;
import org.openqa.selenium.support.PageFactory;

public class HeaderSteps {

    public void search(String keyword) {
        Header header = PageFactory.initElements(DriverFactory.getDriver(), Header.class);
        header.search(keyword);
    }
}
