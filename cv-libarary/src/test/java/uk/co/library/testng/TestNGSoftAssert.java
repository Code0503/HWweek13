package uk.co.library.testng;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

/**
 * Created by Bhavesh
 */
public class TestNGSoftAssert {

    @Test
    public void testSum() {
        int a=10;
        int b= 20;
        int result= a+b;
        System.out.println("------running test-----");
        Assert.assertTrue(result==30);
        System.out.println("--------------------------------------------------------");
        Assert.assertTrue(result==30);
        System.out.println("end");

    }

    @Test
    public void testSum1() {

        SoftAssert softAssert = new SoftAssert();
        int a=10;
        int b= 20;
        int result= a+b;
        System.out.println("------running test-----");
        softAssert.assertTrue(result==20,"result is 20");
        System.out.println("--------------------------------------------------------");
        softAssert.assertTrue(result==40,"result is 40");
        System.out.println("end");
        softAssert.assertAll();


    }
}
