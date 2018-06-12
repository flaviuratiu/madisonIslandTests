package org.fasttrackit.tests.search;

import org.fasttrackit.steps.HeaderSteps;
import org.fasttrackit.steps.ProductGridSteps;
import org.fasttrackit.tests.TestBase;
import org.junit.Test;

public class SearchTest extends TestBase {

    @Test
    public void searchWithOneKeywordTest() {
        String keyword = "vase";
        HeaderSteps headerSteps = new HeaderSteps();
        headerSteps.search(keyword);

        ProductGridSteps productGridSteps = new ProductGridSteps();
        productGridSteps.assertThatAllProductNamesContain(keyword);
    }

}
