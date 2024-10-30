package testng.annotations;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGAnnotationTest3 {

    @Test
    public void test2() {
        System.out.println("test2");
    }

    @Test
    public void test1() {
        System.out.println("test1");

    }

    @BeforeMethod
    public void setUp() {
        System.out.println("before method");
    }

    @AfterMethod
    public void tearDown() {
        System.out.println("after method");
    }
}
