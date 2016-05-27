package com.test;

import com.basic.Arraylist5a;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class Arraylist5aTest {

    ArrayList<String> expectedarr = new ArrayList<String>();

    @BeforeClass
    public void BeforeClass() {
        expectedarr.add("San Francisco");
        expectedarr.add("Houston");
        expectedarr.add("Reno");
        expectedarr.add("New York");
    }

    @Test
    public void createArray(){
        ArrayList<String> actualarr = Arraylist5a.createArrayList();
        Assert.assertEquals(actualarr, expectedarr);
    }

    @Test (dependsOnMethods = "createArray")
    public void searchArrayPositive1() {
        Assert.assertEquals(Arraylist5a.searchArrayList(Arraylist5a.createArrayList(),"San Francisco"), 3);
    }


    @Test (dependsOnMethods = "createArray")
    public void searchArrayPositive2() {
        Assert.assertEquals(Arraylist5a.searchArrayList(Arraylist5a.createArrayList(),"Reno"), 2);
    }

    @Test (dependsOnMethods = "createArray")
    public void searchArrayNegative() {
        int neg = Arraylist5a.searchArrayList(Arraylist5a.createArrayList(),"Madagascar");
        Assert.assertFalse(neg>=0);
    }
}
