// Problem: To get intuition of flow in recursive function

import java.util.Scanner;
class CallTest{

    public static void func(int num){
        if(num < 1) return;
        else{
            System.out.println(num);        
            func(num-1);
            System.out.println(num);
        }
    }

    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        func(4);
    }
}