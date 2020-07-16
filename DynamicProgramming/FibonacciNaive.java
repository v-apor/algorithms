// So this is the typical solution to get fibonacci series; recursive method,
// although the code looks pretty cool, it's highly inefficent, time O(2^n) ughhhh!!!

// If we plot a tree of recursive calls we can see that there are multiple calls for same,
// input. Hence, we can store it in memory and then simply retrieve it when called;

// eg getFibo(8) = getFibo(7) + getFibo(6)
//    getFibo(7) = getFibo(6) + getFibo(5)    +> this getFibo(6) can be used above!!

// This paradigm of storing some stuffs for reducing time of execution is called Dynamic Programming
// Now for DP way of getting Fibonacci checkout "FibonacciDP.java"

import java.util.Scanner;
public class FibonacciNaive{
    // fibo: 0, 1, 1, 2, 3, 5, 8, 13, 21....

    public static int getFibo(int n){
        if(n < 2) return n;
        return getFibo(n-2) + getFibo(n-1);
    }


    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        System.out.println(getFibo(sObj.nextInt() - 1));
    }
}