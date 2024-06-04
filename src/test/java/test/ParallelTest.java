package test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ParallelTest {

    @BeforeClass
    public void setUpClass() {
        System.out.println("BeforeClass: " + Thread.currentThread().threadId());
    }

    @BeforeMethod
    public void setUpMethod() {
        System.out.println("BeforeMethod: " + Thread.currentThread().threadId());
    }

    @Test
    public void test1() {
        System.out.println("Test1: " + Thread.currentThread().threadId());
    }

    @Test
    public void test2() {
        System.out.println("Test2: " + Thread.currentThread().threadId());
    }

    @Test
    public void test3() {
        System.out.println("Test3: " + Thread.currentThread().threadId());
    }

    @Test
    public void test4() {
        System.out.println("Test4: " + Thread.currentThread().threadId());
    }

    @Test
    public void test5() {
        System.out.println("Test5: " + Thread.currentThread().threadId());
    }
}
