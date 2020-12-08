// Given a string, print all the subsets of it

import java.util.Scanner;
class Subsets{

    public static void getSubset(String s, String curr, int index){
        if(index == s.length()){
            System.out.print(curr + " ");
            return;
        }
        getSubset(s, curr, index+1);
        getSubset(s, curr+s.charAt(index), index+1);
    }

    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        String s = sObj.nextLine();
        getSubset(s, "", 0);
    }
}