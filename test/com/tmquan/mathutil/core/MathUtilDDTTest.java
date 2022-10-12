/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tmquan.mathutil.core;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static com.tmquan.mathutil.core.MathUtil.*;

/**
 *
 * @author QUAN
 */
@RunWith(value = Parameterized.class)
public class MathUtilDDTTest {

    //Prepare array data
    @Parameterized.Parameters
    public static Object[][] initData() {
        int a[] = {5, 10, 15, 20, 25};
        int b[][] = {{1, 0}, {1, 1}, {2, 2}, {6, 3}, {24, 4}, {120, 5}, {720, 6}};
        int c[][] = {{1, 0}, 
                     {1, 1}, 
                     {2, 2}, 
                     {6, 3}, 
                     {24, 4}, 
                     {120, 5}, 
                     {720, 6}
                    };
        return new Integer[][] {{1, 0}, 
                                {1, 1}, 
                                {2, 2}, 
                                {6, 3}, 
                                {24, 4}, 
                                {120, 5}, 
                                {720, 6}
                               };
    } //Use Wrapper for numbers, Ex: Integer
    
    @Parameterized.Parameter(value = 0)
    public long expected;

    @Parameterized.Parameter(value = 1)
    public int n;
    
    @Test
    public void testFactorialGivenRightArgumentReturnWell() {
        assertEquals(expected, MathUtil.getFactorial(n));
    }
}

//This class contains code used for test main code in class MathUtil, function getFactorial() to check if it's run correctly
//This class is called TEST SCRIPT
//The purpose of this class is to test some situation of using app,
//get specific data to see if the result is the same as expected
//A test script will have TEST CASE, each case is for each situation used app
//This code here in MathUtilTest is bad smell, the same code is written again in every test case
//Assert.assertEquals(120, MathUtil.getFactorial(n)
//It's not good if we do this with a big list of test cases (100 cases for example)
//If we can split all these datas to 1 place, then just pick these datas each into just 1 code above 
// => clean code, saw the general of how many test cases and is it enough cases
//Write test script like this is called:
// - PARAMETERIZED: Get data in 1 place, initialize a val and pick each of them to compare
// - DDT (Data-Driven-Testing): Write code in style slice datas using JUNIT PW, use for to testing each cases
//To use DDT, we need:
// - 
