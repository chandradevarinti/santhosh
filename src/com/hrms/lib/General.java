package com.hrms.lib;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import com.hrms.utiliy.Log;
import org.openqa.selenium.By;

public class General extends Global {
	  //To provide all re-usable fun:/methods realted to whole application
    public void openApplication() {
    driver = new FirefoxDriver();
    driver.navigate().to(url);
    System.out.println("Application opened"); //console
Reporter.log("Application opened"); //html report
Log.info(" Application Opened"); //logfile
    }
    public void closeApplication() {
    driver.quit();
    System.out.println("Application closed");
    Log.info("Application closed ");
    }
    public void login() {
    driver.findElement(By.name(txt_Username)).sendKeys(un);
    driver.findElement(By.name(txt_password)).sendKeys(pw);
    driver.findElement(By.name(btn_login)).click();
    System.out.println("Login completed");
    Log.info("Login completed ");
    }
    public void logout() {
    driver.findElement(By.linkText(link_logout)).click();
    System.out.println("logout completed");
    Log.info("Logout completed ");
    }
    public void enterFrame() {
    driver.switchTo().frame(frm_empinfo);
    System.out.println("Entered into frame");
    Log.info("entered into frame ");
    }
    public void exitFrame() {
    driver.switchTo().defaultContent();
    System.out.println("Exit from frame");
    Log.info(" exit from frame");
    }
    public void addNewEmp() {
    driver.findElement(By.xpath(btn_Add)).click();    
    driver.findElement(By.name(txt_efn)).sendKeys(efn);
    driver.findElement(By.name(txt_eln)).sendKeys(eln);
    driver.findElement(By.id(btn_save)).click();
    System.out.println("New emp added");
    Log.info("Add emp ");
    
    }
}
