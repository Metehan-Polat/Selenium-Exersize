package org.basesclick;

import org.bases.Web;
import org.openqa.selenium.By;

public class HomeClick implements IClick {


    @Override
    public void click(Web web) {
        web.element=web.driver.findElement(By.xpath("//*[text()=' Home']"));
    web.element.click();
    }
}
