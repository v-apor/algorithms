// Problem: Find the max number of cuts that can be made of length a, b or c from rope of size n

import java.util.Scanner;

class RopeCut{

    public static int getMax(int a, int b, int c){
        if(a>=b && a>=c) return a;
        else if(b>=a && b>=c) return b;
        else return c;
    }

    public static int noCuts(int n, int a, int b, int c){
        if(n<0) return -1;
        else return 1 + getMax(noCuts(n-a, a, b, c), noCuts(n-b, a, b, c), noCuts(n-c, a, b, c));
    }   


    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int n = sObj.nextInt();
        int a = sObj.nextInt();
        int b = sObj.nextInt();
        int c = sObj.nextInt();
        System.out.println(noCuts(n, a, b, c));
    }
}