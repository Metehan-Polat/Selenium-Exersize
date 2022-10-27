package org.basesclick;

import org.bases.Web;
import org.openqa.selenium.By;

public class TestCasesClick implements IClick {

    @Override
    public void click(Web web) {
        web.driver.findElement(By.xpath("//*[text()='Test Cases']")).click();
    }
}
