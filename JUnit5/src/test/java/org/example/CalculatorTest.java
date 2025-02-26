package org.example;


import org.junit.jupiter.api.*;
import org.junit.jupiter.params.shadow.com.univocity.parsers.annotations.Nested;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CalculatorTest {
    private int i=0;

    @BeforeAll
    public static void beforeClass()
    {
        System.out.println("before every mtd in tcs.");
    }

    @BeforeEach
    public  void dummy()
    {
        i=0;
        System.out.println("before every .");
    }

    @AfterEach
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

        int [] arr1={2,3,4};
        int [] arr2={2,3,4};
//        Assertions.assertArrayEquals(arr1,arr2);
        String s1="rahul";
        String s2="rahul";
//        Assertions.assertSame(s1,s2);
        List<Integer> a1= Arrays.asList(2,4,6);
        List<Integer> a2=Arrays.asList(2,4,6);
        Assertions.assertIterableEquals(a1,a2);

        Assertions.assertThrows(RuntimeException.class,()->{
            throw new IOException("exception is coming");
        });
        //Assertions.assertEquals(8,res,"wrong msg");

    }

    @Test
    @Disabled
    public void subTest()
    {
        System.out.println("sub mtd in tcs.");
        int res=Calculator.sub(2,6);
        Assertions.assertEquals(-4,res);
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
        Assertions.assertEquals(12,res);
    }

    @Test
    public void divTest()
    {
        System.out.println("div mtd in tcs.");
        int res=Calculator.div(2,6);
        Assertions.assertEquals(0,res);
    }

    @AfterAll
    public static void afterClass()
    {
        System.out.println("After every mtd in tcs.");
    }
}
