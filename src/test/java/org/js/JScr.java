package org.js;

import org.bases.Web;
import org.openqa.selenium.JavascriptExecutor;

public class JScr {

    public void jsScroll(Web web)
    {

        JavascriptExecutor jse = (JavascriptExecutor)web.driver;
        jse.executeScript("window.scrollBy(0,250)");
    }

    public void jsScrollElement(Web web)
    {
        JavascriptExecutor js = (JavascriptExecutor)web.driver;
        js.executeScript("arguments[0].scrollIntoView();", web.element);
    }
    public void jsScrollHeight(Web web)
    {
        JavascriptExecutor js = (JavascriptExecutor) web.driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
    }

}
