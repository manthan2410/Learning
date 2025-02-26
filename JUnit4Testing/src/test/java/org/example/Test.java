package org.example;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;

public class Test {

    @BeforeClass
    public static void beforeClass()
    {
      System.out.println("before every mtd in tcs.");
    }

    @org.junit.Test
    public  void add()
    {
        System.out.println("before every mtd in tcs.");
        Assert.assertEquals(2,2);
    }

}
