// Problem: Print from 1 to n
// This is tail recursion (i.e, recursive call at the end), in this the compiler optimises to use goto statements and need not save states

import java.util.Scanner;
class PrintTail{

    public static void func(int num, int k){
        if(num <= 0) return;
        else{
            System.out.println(k);
            func(num-1, k+1);
        }
    }

    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int num = sObj.nextInt();
        func(num, 1);
    }
}