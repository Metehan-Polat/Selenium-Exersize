package org.sigupLogin;
import org.bases.* ;
import org.openqa.selenium.By;

public class SigupLogin {


    public void sigupLog(Web web)
    {
        web.driver.findElement(By.xpath("//a[@href='/login']")).click();

    }
}
