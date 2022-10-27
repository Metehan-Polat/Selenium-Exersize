package org.LogOut;
import org.bases.*;
import org.openqa.selenium.By;

public class LogOut {

    public void Logout(Web web)
    {
        web.driver.findElement(By.xpath("//a[@href='/logout']")).click();
    }
}
