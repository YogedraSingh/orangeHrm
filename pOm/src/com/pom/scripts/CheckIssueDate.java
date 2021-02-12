package com.pom.scripts;

import com.pom.classes.ActiHomePage;
import com.pom.classes.ActiTimeLoginPage;
import com.pom.classes.LiscencePage;
import com.pom.generic.BaseClass;

public class CheckIssueDate extends BaseClass 
{
public static void main(String[] args)
{
OpenBrowser("chrome");
openTheApplication();

ActiTimeLoginPage lp=new ActiTimeLoginPage(driver);
lp.login();

ActiHomePage etp = new ActiHomePage(driver);
etp.clickonSetting();
etp.clickonLiscence();

LiscencePage lsp = new LiscencePage(driver);
lsp.getIssueDate();
lsp.getProductEdition();
lsp.verifyIssueDate("Jul 14, 2017");
lsp.verifyProductEdition("actiTIME 2017.4");
etp.cliclonLogout();
closeTheBrowser();


}
}
