// Problem: Print from 1 to n
// Note that this is not tail recursion (where recursion is last statement of a function) hence slower
// see 5PrintTail for tail recursive version

import java.util.Scanner;
class Print{

    public static void func(int num){
        if(num <= 0) return;
        else{
            func(num-1);
            System.out.println(num);
        }
    }

    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int num = sObj.nextInt();
        func(num);
    }
}