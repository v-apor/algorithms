// Problem: Find the factorial of a given number

import java.util.Scanner;
class Factorial{

    public static int fact(int num){
        if(num == 0) return 1;
        else return num * fact(num-1);
    }

    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int num = sObj.nextInt();
        System.out.println(fact(num));
    }
}