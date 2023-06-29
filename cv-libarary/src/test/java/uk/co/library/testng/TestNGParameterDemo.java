package uk.co.library.testng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * Created by Bhavesh
 */
public class TestNGParameterDemo {

    @Test @Parameters({"name","surname"})
    public void test( String name, String surname){
        System.out.println(name);
        System.out.println(surname);

    }
}
