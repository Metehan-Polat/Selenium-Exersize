package org.loggedASUsername;
import org.bases.*;
import org.openqa.selenium.By;
import org.testng.Assert;

public class LoggerAsUsername {
    public void logUser(Web web)
    {
        web.element=web.driver.findElement(By.partialLinkText(" Logged in as "));
        String a=web.element.getText();
        String b="Logged in as Metehan Polat";
        System.out.println(a);


    }
}
