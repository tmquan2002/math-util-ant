package com.tmquan.mathutil.core;

import org.junit.Assert;
import org.junit.Test;

public class MathUtilTest {

    @Test
    public void tryAssertion() {
        Assert.assertEquals(0, 0);
    }

    @Test
    public void testFactorialGivenRightArgumentReturnsWell() {
        Assert.assertEquals(1, MathUtil.getFactorial(0));
        Assert.assertEquals(1, MathUtil.getFactorial(1));
        Assert.assertEquals(2, MathUtil.getFactorial(2));
        Assert.assertEquals(120, MathUtil.getFactorial(5));
    }

    @Test
    public void testFactorialGivenWrongArgumentThrowsException() {
        Assert.assertThrows(IllegalArgumentException.class, () -> MathUtil.getFactorial(-1));
    }
}
