package com.mycomp.testdriven;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class ArrayUtilsTest {

    @InjectMocks
    public ArrayUtils arrayUtils;


    @Test
    public void reverseArrayTest(){
        //ArrayUtils arrayUtils = new ArrayUtils();
        int[] num = {1,2,3};
        List<Integer> expectedList = new ArrayList<>();
        expectedList.add(3);
        expectedList.add(2);
        expectedList.add(1);
        List<Integer> actualList = arrayUtils.reverseArray(num);
        Assert.assertEquals(expectedList,actualList);
    }

    @Test
    public void reverseArrayWhenArrayEmptyTest(){
        int[] num = {};
        List<Integer> list = arrayUtils.reverseArray(num);
        Assert.assertTrue(list.isEmpty());
    }


    @Test
    public void reverseArrayWhenArrayNullTest(){
        IllegalArgumentException exception = Assert.assertThrows(IllegalArgumentException.class, () -> arrayUtils.reverseArray(null));
        Assert.assertEquals("Array Cannot Be Null",exception.getMessage());
    }

    @Test
    public void maxElementInArray(){
        int[] num = {23,87,90,1,789};
        int maxNumber = arrayUtils.maxNumber(num);
        Assert.assertEquals(789,maxNumber);
    }

    @Test
    public void noElementsInArray(){
        int[] num = {};
        RuntimeException exception = Assert.assertThrows(RuntimeException.class,()-> arrayUtils.maxNumber(num));
        Assert.assertEquals("Array not having any value",exception.getMessage());
    }

    @Test
    public void nullInArray(){
        IllegalArgumentException exception = Assert.assertThrows(IllegalArgumentException.class,()-> arrayUtils.maxNumber(null));
        Assert.assertEquals("Invalid Array",exception.getMessage());
    }
}