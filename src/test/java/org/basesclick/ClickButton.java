package org.basesclick;

import org.bases.Web;

public class ClickButton {
     private IClick iClick;


     public ClickButton(IClick iClick)
     {
         this.iClick=iClick;
     }


    public void clickButtons(Web web)
    {
        iClick.click(web);
    }
}
