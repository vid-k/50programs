package com.test;

import com.basic.DivisibleBy1b;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Divisibleby1bTest {

    @DataProvider (name="by5")
    public Object[][] getby5() {
        Object[][] data = {{5}, {10000}};
        return data;
    }

    @DataProvider (name="by3")
    public Object[][] getby3() {
        Object[][] data ={{3}, {9999}};
        return data;
    }

    @DataProvider (name="by3and5")
    public Object[][] getby3and5() {
        Object[][] data ={{15}, {15075}};
        return data;
    }

    @DataProvider (name="notby3or5")
    public Object[][] getNonDivisible() {
        Object[][] data ={{0}, {1}, {2}, {4}, {1198}};
        return data;
    }

    @Test (dataProvider = "by5")
    public void by5(int num) {
        String ret = DivisibleBy1b.findDivisible(num);
        Assert.assertEquals(ret, "pong");
    }

    @Test (dataProvider = "by3")
    public void by3(int num) {
        String ret = DivisibleBy1b.findDivisible(num);
        Assert.assertEquals(ret, "ping");
    }

    @Test (dataProvider = "by3and5")
    public void by3and5(int num) {
        String ret = DivisibleBy1b.findDivisible(num);
        Assert.assertEquals(ret, "ping pong");
    }

    @Test (dataProvider = "notby3or5")
    public void testbyNotDivisible(int num) {
        String ret = DivisibleBy1b.findDivisible(num);
        Assert.assertEquals(ret, null);
    }
}
