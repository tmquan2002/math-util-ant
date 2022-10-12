/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tmquan.mathutil.main;

import com.tmquan.mathutil.core.MathUtil;

/**
 *
 * @author QUAN
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("This message comes from main() method");
        System.out.println("This jar file is built based on ANT co-operating with JUnit");
        tryTDDFirst();
    }
    
    //Demo how TDD was done
    //Write code parallel with write test
    //Test  Driven  Development
    public static void tryTDDFirst(){
        //Test case #1:
        //input n = 0; expected = 0! = 1, actual = ?
        long expected = 1;
        long actual = MathUtil.getFactorial(0);
        //Test is to compare these 2 valiable
        System.out.println("0! Status | expected: " + expected +
                                      " | actual: " + actual);
        //Test case #2:
        //input n = 2; expected = 2! = 2, actual = ?
        //Test is to compare these 2 valiable
        System.out.println("2! Status | expected: 2" +
                                      " | actual: " + MathUtil.getFactorial(2));
        //Test case #3: n = 5
            System.out.println("5! Status | expected: 120" +
                                      " | actual: " + MathUtil.getFactorial(5));
        //Test case #4: n = 22
        System.out.println("22! Status | expected: Invalid n, n must be between 0 and 20" +
                                      " | actual: ");
        MathUtil.getFactorial(22);
    }
    
}
