package org.example;

import org.junit.*;
import org.junit.Test;

public class CalculatorTest {
    private int i=0;
    @BeforeClass
    public static void beforeClass()
    {
        System.out.println("before every mtd in tcs.");
    }
    @Before
    public  void dummy()
    {
        i=0;
        System.out.println("before every .");
    }
    @After
    public  void dummyAfter()
    {
        System.out.println("after every ."+i);
    }
    @Test
    public void addTest()
    {
        for(int j=0;j<=50;j++)
        {
            i++;
        }
        System.out.println("add mtd in tcs.");
        System.out.println("value of i in add."+i);
        int res=Calculator.add(2,6);
        Assert.assertEquals(8,res);
    }
    @Test
    public void subTest()
    {
        System.out.println("sub mtd in tcs.");
        int res=Calculator.sub(2,6);
        Assert.assertEquals(-4,res);
    }
    @Test
    public void mulTest()
    {
        for(int j=0;j<=177;j++)
        {
            i++;
        }
        System.out.println("mul mtd in tcs.");
        System.out.println("value of i in add."+i);
        int res=Calculator.mul(2,6);
        Assert.assertEquals(12,res);
    }
    @Test
    public void divTest()
    {
        System.out.println("div mtd in tcs.");
        int res=Calculator.div(2,6);
        Assert.assertEquals(0,res);
    }
    @AfterClass
    public static void afterClass()
    {
        System.out.println("After every mtd in tcs.");
    }
}
