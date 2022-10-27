package org.allProducts;

import org.bases.Web;
import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class AllProduct {

    public void allProSuccess(Web web)

    {
        String a="ALL PRODUCTS";
        web.element=web.driver.findElement(By.xpath("//*[text()='All Products']"));
        String b=web.element.getText();
        Assert.assertEquals(a,b);

    }
    public void firstProClick(Web web)
    {
        web.driver.findElement(By.xpath("//a[@href='/product_details/1']")).click();
    }

    public void firstProDetails(Web web)
    {
        String a="Blue Top";
        String b="Category: Women > Tops";
        String c="Rs. 500";


        web.element=web.driver.findElement(By.xpath("//*[text()='Blue Top']"));
        String d=web.element.getText();

        web.element=web.driver.findElement(By.xpath("//*[text()='Category: Women > Tops']"));
        String e=web.element.getText();

        web.element=web.driver.findElement(By.xpath("//*[text()='Rs. 500']"));
        String f=web.element.getText();

        Assert.assertEquals(a,d);
        Assert.assertEquals(b,e);
        Assert.assertEquals(c,f);

    }
    public void searchProduct(Web web)
    {
        web.element =web.driver.findElement(By.xpath("//input[@id='search_product']"));
        web.element.sendKeys("Summer White Top");

    }
    public void searchProButton(Web web)
    {
    web.driver.findElement(By.xpath("//button[@id='submit_search']"));
    }

    public void searchedProductsVisible(Web web)
    {
        String a="SEARCHED PRODUCTS";
        web.element=web.driver.findElement(By.xpath("//*[text()='Searched Products']"));
        String b=web.element.getText();
        Assert.assertEquals(b,a);
    }

    public void firstProductAddToCartClick(Web web)
    {
        web.driver.findElement(By.xpath("//a[@data-product-id='1']")).click();
    }

    public void contınueShopping(Web web)
    {
        web.driver.findElement(By.xpath("//*[text()='Continue Shopping']")).click();
    }


    public void secondProductAddToCartClick(Web web)
    {
        web.driver.findElement(By.xpath("//a[@data-product-id='2']")).click();
    }
    public void viewCart(Web web)
    {
      web.driver.findElement(By.xpath("//*[@id='cartModal']/div/div/div[2]/p[2]/a")).click();
    }

    public void bothProd(Web web)
    {
        List<WebElement> prolist=web.driver.findElements(By.xpath("//tr[@id]"));
        int a=prolist.size();
        System.out.println(a);
        int b=2;
        Assert.assertEquals(a,b);
    }
}
