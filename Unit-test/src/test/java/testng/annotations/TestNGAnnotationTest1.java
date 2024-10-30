package testng.annotations;

import org.testng.annotations.Test;

public class TestNGAnnotationTest1 {

    public static void main(String[] args) {
        System.out.println("Hello TestNG");
        print();

        TestNGAnnotationTest1 a = new TestNGAnnotationTest1();
        a.print2();

    }

    public static void print(){

        System.out.println("print 1");


    }

    @Test
    public void print2(){
        System.out.println("print2");

    }

    @Test
    public void print3() {
        System.out.println("print3");
    }
}
