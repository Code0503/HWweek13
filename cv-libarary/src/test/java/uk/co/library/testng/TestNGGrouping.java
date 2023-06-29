package uk.co.library.testng;

import org.testng.annotations.Test;

/**
 * Created by Bhavesh
 */
public class TestNGGrouping {

    @Test (groups = "sanity")
    public void loginTest1() {
        System.out.println("Running test - loginTest1");
    }

    @Test (groups = "smoke")
    public void loginTest2() {
        System.out.println("Running test - loginTest2");
    }

    @Test (groups = "regression")
    public void loginTest3() {
        System.out.println("Running test - loginTest3");
    }

    @Test(groups = {"smoke","sanity"})
    public void loginTest4() {
        System.out.println("Running test - loginTest4");
    }

    @Test(groups = {"smoke","regression"})
    public void regressionTest1() {
        System.out.println("Running test - regressionTest1");
    }

    @Test(groups = {"regression","sanity"})
    public void computerTest1() {
        System.out.println("Running test - computerTest1");
    }

    @Test(groups = {"smoke","sanity","regression"})
    public void computerTest2() {
        System.out.println("Running test - computerTest2");
    }
}
