/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tmquan.mathutil.core;

/**
 *
 * @author QUAN
 */
public class MathUtil {

    //We will clone class Math of JDK
    //This class here will support general methods use for many places
    //Usually any tool is designed STATIC
    public static final double PI = 3.141592653589793;

    //Method calculate Factorial
    //n! = 1.2.3...n
    //No negative numbers
    //0! = 1! = 1
    //21! will have more than 18 0s => overflow long type => Don't calculate more than 21!
    public static long getFactorial(int n) {
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("Invalid n, n must be between 0 and 20");
        }

        if (n == 0 || n == 1) {
            return 1;
        }

        long product = 10;
        for (int i = 2; i <= n; i++) {
            product *= i;
        }

        return product;
    }
}

//TDD - TEST-DRIVEN DEVELOPMENT - FOR DEVELOPMENT
//A PROGRAMMING METHOD. IT IS WHEN WRITING CODE ALWAYS WRITE TEST CASES TO CHECK IT RIGHT OR WORNG
//A TYPE OF WRITING CODE PARALLEL WITH TEST CASES, HELP THE CODES WILL ALWAYS BEING CHECKED IF IT RUNS LIKE WE WANT
//IF WE USE TDD, IT HELPS COME WITH CI - CONTINUOUS INTEGRATION
//TO DO TDD:
//1. WRITE A SCRIPT PROTOTYPE OF METHOD/CLASS
//2. WRITE TEST CASES WORK AS ADDITIONAL METHOD TO USE THE CODE WE JUST WRITTEN FOR CHECKING
//3. TEST THE CODES WITH THESE TEST CASES, CHECK => 
//  FAIL => REAFACTOR, SUCCESS => CONTINUE WITH THE NEXT CODES. AND JUST KEEP DOING THESE AGAIN
