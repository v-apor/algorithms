// Problem: Print the nth Fibonacci number

import java.util.Scanner;
class Fibonacci{

    public static int fibo(int num){
        if(num<=2) return num-1;
        else return fibo(num-1) + fibo(num-2);
    }

    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int num = sObj.nextInt();
        System.out.println(fibo(num));
    }
}