package org.bases;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Chrome extends Browser{

    @Override
    void set(Web web) {
        WebDriverManager.chromedriver().setup();
        web.driver=new ChromeDriver();
        web.driver.manage().window().maximize();
        web.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }
}
