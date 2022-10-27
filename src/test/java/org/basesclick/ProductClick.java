package org.basesclick;

import org.bases.Web;
import org.openqa.selenium.By;

public class ProductClick implements IClick {

    @Override
    public void click(Web web) {
        web.driver.findElement(By.xpath("//a[@href='/products']")).click();

    }
}
