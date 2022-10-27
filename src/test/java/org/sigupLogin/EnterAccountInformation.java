package org.sigupLogin;
import org.bases.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class EnterAccountInformation {
public void enterAccount(Web web) throws InterruptedException {
    web.element=web.driver.findElement(By.xpath("//input[@id='id_gender1']"));
    web.actions=new Actions(web.driver);
    web.actions.click(web.element).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys("Mm189...").perform();

    web.element=web.driver.findElement(By.xpath("//select[@id='days']"));
    web.select=new Select(web.element);
    web.select.selectByValue("12");

    web.element=web.driver.findElement(By.xpath("//select[@id='months']"));
    web.select=new Select(web.element);
    web.select.selectByValue("12");

    web.element=web.driver.findElement(By.xpath("//select[@id='years']"));
    web.select=new Select(web.element);
    web.select.selectByValue("1996");

    Thread.sleep(3000);
    web.element=web.driver.findElement(By.xpath("//input[@name='newsletter']"));
    web.element.click();

    web.element=web.driver.findElement(By.xpath("//input[@name='optin']"));
    web.element.click();
    Thread.sleep(3000);

    web.element=web.driver.findElement(By.xpath("//input[@data-qa='first_name']"));
    web.actions=new Actions(web.driver);
    web.actions.click(web.element).sendKeys("Metehan").sendKeys(Keys.TAB).sendKeys("Polat")
            .sendKeys(Keys.TAB).sendKeys("Poll").sendKeys(Keys.TAB).sendKeys("Sivas").sendKeys(Keys.TAB).sendKeys("Sivas").perform();
    Thread.sleep(2000);


    web.element=web.driver.findElement(By.xpath("//select[@id='country']"));
    web.select=new Select(web.element);
    web.select.selectByValue("Canada");


    web.element=web.driver.findElement(By.xpath("//input[@data-qa='state']"));
    web.actions=new Actions(web.driver);
    web.actions.click(web.element).sendKeys("Sivas").sendKeys(Keys.TAB).sendKeys("Sivas").sendKeys(Keys.TAB).sendKeys("38110")
            .sendKeys(Keys.TAB).sendKeys("5383946351").perform();
    Thread.sleep(2000);

    web.driver.findElement(By.xpath("//button[@data-qa='create-account']")).click();

}

public void accountCreated(Web web)
{
    web.element=web.driver.findElement(By.xpath("//b"));
    String a=web.element.getText();
    String b="ACCOUNT CREATED!";
    Assert.assertEquals(b,a);
}

public void contınue(Web web)
{
    web.driver.findElement(By.xpath("//a[@data-qa='continue-button']")).click();
}


}
