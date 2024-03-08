package com.hrms.testscript;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrms.lib.General;

public class TC_002 {
	   //public static void main(String args[]) {
    @Test
    public void tc002() {
        //Test Steps
    DOMConfigurator.configure("log4j.xml");
    General g = new General();
    g.openApplication();
    g.login();
    g.enterFrame();
    g.addNewEmp();
    g.exitFrame();
    g.logout();
    g.closeApplication();

}

}
