package org.loginYourAccount;

import org.bases.Web;
import org.openqa.selenium.By;
import org.testng.Assert;

public class LoginYourAccount {

    public void loginAccount(Web web)
    {
        web.element=web.driver.findElement(By.xpath("//*[text()='Login to your account']"));
        String a=web.element.getText();
        String b="Login to your account";
        Assert.assertEquals(b,a);

    }

    public void email(Web web)
    {
        web.element=web.driver.findElement(By.xpath("//input[@data-qa='login-email']"));
        web.element.sendKeys("mmetehan"+Math.random()+"@gmail.com");

    }

    public void password(Web web)
    {
        web.element=web.driver.findElement(By.xpath("//input[@data-qa='login-password']"));
        web.element.sendKeys("Mm189...");

    }
    public void loginButton(Web web)
    {
        web.element=web.driver.findElement(By.xpath("//button[@data-qa='login-button']"));
        web.element.click();

    }

    public void failemail(Web web)
    {
        web.element=web.driver.findElement(By.xpath("//input[@data-qa='login-email']"));
        web.element.sendKeys("aasdasd@gmail.com");

    }

    public void failpassword(Web web)
    {
        web.element=web.driver.findElement(By.xpath("//input[@data-qa='login-password']"));
        web.element.sendKeys("asdasd");

    }

    public void error(Web web)
    {
        web.element=web.driver.findElement(By.xpath("//*[text()='Your email or password is incorrect!']"));
        String a=web.element.getText();
        String b="Your email or password is incorrect!";
        Assert.assertEquals(b,a);

    }


}
