package org.subscription;

import org.bases.Web;
import org.openqa.selenium.By;
import org.testng.Assert;

public class Subscription {

    public void subsc(Web web)
    {
        web.element=web.driver.findElement(By.xpath("//input[@id='susbscribe_email']"));
        web.element.sendKeys("mmetehanpolat"+Math.random()+"@gmail.com");
    }

    public void subscButton(Web web)
    {
       web.driver.findElement(By.xpath("//button[@id='subscribe']")).click();
    }

    public void successAlert(Web web)
    {
        String a="You have been successfully subscribed!";
        web.element=web.driver.findElement(By.xpath("//*[text()='You have been successfully subscribed!']"));
        String b=web.element.getText();
        Assert.assertEquals(a,b);
    }
}
