package org.basesclick;

import org.bases.Web;
import org.openqa.selenium.By;

public class ApiTestClick implements IClick {

    @Override
    public void click(Web web) {


        web.driver.findElement(By.xpath("//a[@href='/api_list']")).click();
    }
}
