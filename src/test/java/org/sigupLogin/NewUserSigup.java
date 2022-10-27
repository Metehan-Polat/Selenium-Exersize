package org.sigupLogin;

import org.bases.Web;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class NewUserSigup {
    public void userSigup(Web web)
    {

        web.element=web.driver.findElement(By.xpath("//input[@data-qa='signup-name']"));
        web.actions=new Actions(web.driver);
        web.actions.click(web.element);
        web.actions.sendKeys("Metehan Polat").sendKeys(Keys.TAB).sendKeys("mmetehan"+Math.random()+"@gmail.com").perform();

        web.driver.findElement(By.xpath("//button[@data-qa='signup-button']")).click();
    }

    public void enterAccountInfo(Web web)
    {
        web.element=web.driver.findElement(By.xpath("//*[text()='Enter Account Information']"));
        String a=web.element.getText();
        String b="ENTER ACCOUNT INFORMATION";
        Assert.assertEquals(b,a);

    }
}
