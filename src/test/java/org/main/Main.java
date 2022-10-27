package org.main;


import org.LogOut.LogOut;
import org.allProducts.AllProduct;
import org.bases.* ;
import org.basesclick.*;
import org.contactUs.ContactUs;
import org.js.JScr;
import org.loggedASUsername.LoggerAsUsername;
import org.loginYourAccount.LoginYourAccount;
import org.sigupLogin.EnterAccountInformation;
import org.sigupLogin.NewUserSigup;
import org.sigupLogin.SigupLogin;
import org.subscription.Subscription;
import org.testng.annotations.*;


public class Main {
        Web web=new Web();
        ClickButton clickButton;
        Cross cross=new Cross();
        Get get=new Get();
        SigupLogin sigupLogin=new SigupLogin();
        NewUserSigup newUserSigup=new NewUserSigup();
        EnterAccountInformation enterAccountInformation=new EnterAccountInformation();

        LoggerAsUsername loggerAsUsername=new LoggerAsUsername();
        LogOut logOut=new LogOut();
        ContactUs contactUs=new ContactUs();

        AllProduct allProduct=new AllProduct();
        LoginYourAccount loginYourAccount=new LoginYourAccount();

        Subscription subscription=new Subscription();
        JScr jScr=new JScr();


        @BeforeClass
        @Parameters("browser")
        public void setUp(@Optional("browser")String browser )
    {
        this.cross.compare(browser,web);

    }

    //JS
    @Test
    public void jsElement()
    {
        jScr.jsScrollElement(web);

    }
    @Test
    public void jsScrollHeigh()
    {
        jScr.jsScrollHeight(web);

    }


    //Subscription
    @Test
    public void subsc()
    {
        subscription.subsc(web);
        subscription.subscButton(web);
        subscription.successAlert(web);
    }

    //ClickMain
    @Test
    public void homeClick()
    {
        clickButton=new ClickButton(new HomeClick());
        clickButton.clickButtons(web);
    }
    @Test
    public void ProductClick()
    {
        clickButton=new ClickButton(new ProductClick());
        clickButton.clickButtons(web);
    }
    @Test
    public void ApiTestClick()
    {
        clickButton=new ClickButton(new ApiTestClick());
        clickButton.clickButtons(web);
    }
    @Test
    public void contactUsClick()
    {
        clickButton=new ClickButton(new ContactUsClick());
        clickButton.clickButtons(web);
    }
    @Test
    public void cartClick()
    {
        clickButton=new ClickButton(new CartClick());
        clickButton.clickButtons(web);
    }
    @Test
    public void TestCaseClick()
    {
        clickButton=new ClickButton(new TestCasesClick());
        clickButton.clickButtons(web);
    }
    //ClickMain

    //GetUrl
    @Test
    public void getUrl()
    {
       get.getUrl(web);
    }

    //Sigup
    @Test
    public void userSignup() throws InterruptedException {
        sigupLogin.sigupLog(web);


    }
    @Test
    public void enterAccount()
    {
        newUserSigup.userSigup(web);
        newUserSigup.enterAccountInfo(web);
    }

    @Test
    public void logYourAccount()
    {
        loginYourAccount.loginAccount(web);
    }

    @Test
    public void logYourEmailAddress()
    {
        loginYourAccount.email(web);
        loginYourAccount.password(web);
    }
    @Test
    public void faillogYourEmailAddress()
    {
        loginYourAccount.failemail(web);
        loginYourAccount.failpassword(web);
    }
    @Test
    public void loginButton()
    {
        loginYourAccount.loginButton(web);

    }
    @Test
    public void contactUsButGetInTouch()
    {
        contactUs.contactUsButton(web);
        contactUs.getInTouch(web);
    }
    @Test
    public void nameTouchSub() throws InterruptedException {
        contactUs.nameEmailSub(web);
        contactUs.touchSubmit(web);
        contactUs.successMessage(web);
    }


    @Test
    public void setEnterAccountInformation() throws InterruptedException {
       enterAccountInformation.enterAccount(web);
       enterAccountInformation.accountCreated(web);
       enterAccountInformation.contınue(web);
   }
   @Test
   public void logandUsername()
   {
       loggerAsUsername.logUser(web);
   }

   @Test
   public void logOut()
   {
       logOut.Logout(web);
   }

   //Product
   @Test
   public void allProdu()
   {
       allProduct.allProSuccess(web);

   }
   @Test
   public void fistProduct()
   {
       allProduct.firstProClick(web);

   }
   @Test
   public void firstProductAddToCartC()
   {
       allProduct.firstProductAddToCartClick(web);

   }
    @Test
    public void continueShop()
    {
        allProduct.contınueShopping(web);
    }

    @Test
    public void firstProductDetails()
    {
        allProduct.firstProDetails(web);
    }
    @Test
    public void secondProductAddToCartC()
    {
        allProduct.secondProductAddToCartClick(web);
    }
    @Test
    public void viewwCart()
    {
        allProduct.viewCart(web);
    }
    @Test
    public void bothProd()
    {
        allProduct.bothProd(web);
    }


    @Test
   public void searchPro()
   {
       allProduct.searchProduct(web);
   }
   @Test
   public void proSeachButton()
   {
       allProduct.searchProButton(web);
   }
   @Test
   public void searchProVerify()
   {
       allProduct.searchedProductsVisible(web);
   }

    @Test
    public void productButton()
    {
        clickButton=new ClickButton(new ProductClick());
        clickButton.clickButtons(web);
    }



    @AfterClass
    public void tearDown()
    {
        web.driver.close();
    }
}
