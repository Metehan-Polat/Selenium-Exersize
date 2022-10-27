package org.bases;

public class Cross {

    Browser bro;
    public void compare(String browser,Web web)
    {
        if (browser.equals("Chrome"))
        {   bro=new Chrome();
            bro.set(web);
        }
        else

        {  bro=new Firefox();
            bro.set(web);

        }
    }
}
