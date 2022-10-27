package org.contactUs;

import org.bases.Web;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class ContactUs {

    public void contactUsButton(Web web)
    {
    web.driver.findElement(By.xpath("//a[@href='/contact_us']")).click();

    }

    public void getInTouch(Web web)
    {
        String a="GET IN TOUCH";
        web.element=web.driver.findElement(By.xpath("//*[text()='Get In Touch']"));
        String b=web.element.getText();
        Assert.assertEquals(b,a);
    }
    public void nameEmailSub(Web web) throws InterruptedException {
        web.element=web.driver.findElement(By.xpath("//input[@name='name']"));
        web.actions=new Actions(web.driver);
        web.actions.click(web.element).sendKeys("Metehan Polat").sendKeys(Keys.TAB).sendKeys("Metehan"+Math.random()+"@gmail.com").sendKeys(Keys.TAB)
                .sendKeys("Polatt").sendKeys(Keys.TAB).sendKeys("Thanks").sendKeys(Keys.TAB).perform();

        Thread.sleep(1000);
    web.driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:/Users/mmete/Desktop/Bos.png");
   Thread.sleep(4000);
    }
    public void touchSubmit(Web web) throws InterruptedException {
        web.driver.findElement(By.xpath("//input[@type='submit']")).click();
        web.driver.switchTo().alert().accept();
        Thread.sleep(3000);
    }
    public void successMessage(Web web)
    {

        web.element=web.driver.findElement(By.xpath("Success! Your details have been submitted successfully."));
        String b=web.element.getText();
        String a="Success! Your details have been submitted successfully.";
        Assert.assertEquals(a,b);
    }
}
