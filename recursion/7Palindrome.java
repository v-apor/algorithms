// Problem: Check if a string is palindrome

import java.util.Scanner;
class Palindrome{

    public static boolean isPali(String s, int left, int right){
        //System.out.println("checking: " + left + " and " + right);
        if(s.charAt(left) != s.charAt(right)) return false;
        else if(left >= right) return true;
        //else return isPali(s, left++, right--);   NOTE: Never use post ++ -- operator!!!
        else return isPali(s, left+1, right-1);
    }

    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        String s = sObj.nextLine();
        System.out.println(isPali(s, 0, s.length()-1));
    }
}