// Problem: Tower of Hanoi Duh... (There are 3 towers A, B and C. Move blocks from tower A to tower C, where smaller block can't be below larger block)

import java.util.Scanner;

class Tower{

    public static void getSteps(int n, char source, char intermediate, char destination){
        if(n==1){
            System.out.println("Move block " + n + " from " + source + " to " + destination);
            return;
        }
        getSteps(n-1, source, destination, intermediate);
        System.out.println("Move block " + n + " from " + source + " to " + destination);
        getSteps(n-1, intermediate, source, destination);
    }

    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int n = sObj.nextInt();
        getSteps(n, 'A', 'B', 'C');
    }
}