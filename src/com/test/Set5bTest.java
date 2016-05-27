package com.test;

import com.basic.Set5b;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Set5bTest {

    @Test
    public void duplicateExists() {
        int arr[] = {10, 20, 30, 10, 6, 8, 10};
        Assert.assertEquals(Set5b.findDuplicates(arr), true);
    }

    @Test
    public void duplicateDoesNotExist() {
        int arr[] = {20, 30, 2, 6, 87, 69, 4};
        Assert.assertEquals(Set5b.findDuplicates(arr), false);
    }
}
