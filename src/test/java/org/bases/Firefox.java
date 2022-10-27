package org.bases;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox extends Browser {

    @Override
    void set(Web web) {
        WebDriverManager.firefoxdriver().setup();
        web.driver=new FirefoxDriver();

    }
}
