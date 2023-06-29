package uk.co.library.testng;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

/**
 * Created by Bhavesh
 */
@Listeners(TestNGListeners.class)
public class TestNGListenersDemo {

    @Test
    public void test1() {
        System.out.println("I am inside Test1");
    }

    @Test
    public void test2() {
        System.out.println("test 2");
        Assert.fail();
    }

    @Test
    public void test3() {
        System.out.println("test 3");
        throw new SkipException("Skipped test");
    }

}
