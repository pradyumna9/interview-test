package com.mycomp.string;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;


public class ReverseOfAStringTest {
    private ReverseOfAString reverseOfAString;

    @Before
    public void setup() {
        reverseOfAString = new ReverseOfAString();
    }

    @Test
    public void test() {
        String reverseOfPrefix = reverseOfAString.reverseOfPrefix("pradyumna", 'd');
        String reverseOfPrefixTraditional = reverseOfAString.reverseOfPrefixTraditional("pradyumna", 'd');
        Assert.assertEquals("darpyumna", reverseOfPrefix);
        Assert.assertEquals("darpyumna", reverseOfPrefixTraditional);

    }

    @Test
    public void testWithNoChars() {
        String reverseOfPrefix = reverseOfAString.reverseOfPrefix("pradyumna", 'x');
        String reverseOfPrefixTraditional = reverseOfAString.reverseOfPrefixTraditional("pradyumna", 'x');
        Assert.assertEquals("pradyumna", reverseOfPrefix);
        Assert.assertEquals("pradyumna", reverseOfPrefixTraditional);

    }


}