// Problem: Find the factorial of a given number (Tail Recursive)

import java.util.Scanner;
class FactorialTail{

    public static int fact(int num, int val){
        if(num <= 1) return val;
        else return fact(num-1, val*num);
    }

    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int num = sObj.nextInt();
        System.out.println(fact(num, 1));
    }
}