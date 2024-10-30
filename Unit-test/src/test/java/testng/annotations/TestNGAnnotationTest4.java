package testng.annotations;

import org.testng.annotations.*;

public class TestNGAnnotationTest4 {

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

    @BeforeClass
    public void beforeClass() {
        System.out.println("before class");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("after class");
    }
}
