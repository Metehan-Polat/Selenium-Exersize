package org.basesclick;

import org.bases.Web;
import org.openqa.selenium.By;

public class ContactUsClick implements IClick {

    @Override
    public void click(Web web) {
        web.driver.findElement(By.xpath("//a[@href='/contact_us']")).click();
    }
}
