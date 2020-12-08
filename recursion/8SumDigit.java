// Problem: Find the sum of digits of a given number using recursion.

import java.util.Scanner;

class SumDigit{

    public static int getSum(int num){
        if(num/10 == 0) return num;
        else return num%10 + getSum(num/10);
    }   

    // Tail Recursive Approach
    // public static int getSum(int num, int sum){
    //     if(num/10 == 0) return num + sum;
    //     else {
    //         sum += num%10;
    //         return getSum(num/10, sum);
    //     }
    // }   

    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int num = sObj.nextInt();

        System.out.println(getSum(num));

        // Tail Recursive Approach
        // System.out.println(getSum(num, 0));
    }
}