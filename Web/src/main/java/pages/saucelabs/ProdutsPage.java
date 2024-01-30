package pages.saucelabs;

import infra.BasePage;
import org.openqa.selenium.By;

public class ProdutsPage extends BasePage {
    //Products screen locators
    /*
    // UI validation locators, Functional, integration ,Negative scenarios
    // Functional
     1. Add to cart
     2. Sorting dropdown
     3. Name_Sort(A-Z)
     4. Name_Sort(Z-A)
     5. Price_Sort(Low-high)
     6. Price_Sort(High-Low)
     7. Product label
     8. Main menu
     9. Menu_All item
     10. Menu_Logout
     11. Reset App state - Remove button is still displaying after resetting the shopping cart .it is a bug.
                          - create a jira ticket for that.



     */

    private static By sort_dropdown = By.className("product_sort_container");

    public void sortTheProducts_with_Price_High_To_Low(String sortingOrder){
        selectDropDownOptionWithVisibleText(sort_dropdown,sortingOrder);
    }



}
