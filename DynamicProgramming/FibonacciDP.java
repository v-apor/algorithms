// lil background can be found at "FibonacciNaive.java"
// for real comparision try running FibonacciNaive and FibonacciDP for 44+ as input
// a lot of observable difference in time taken for execution

import java.util.Scanner;
import java.util.HashMap;
public class FibonacciDP{
    // fibo: 0, 1, 1, 2, 3, 5, 8, 13, 21....

    // we're using hashmap as cache, to store intermediate fibonacci results
    static HashMap<Integer,Integer> cache = new HashMap<Integer, Integer>();

    public static int getFibo(int n){
        if(cache.containsKey(n)) return cache.get(n);
        if(n < 2) return n;
        int result = getFibo(n-1) + getFibo(n-2);
        cache.put(n, result);
        return result;
    }

    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        System.out.println(getFibo(sObj.nextInt() - 1));
    }
}