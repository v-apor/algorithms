import java.util.Scanner;
public class Factorial{

    public static int factorial(int no){            //recursive approach    
        if(no == 0){                                // time O(N) b'cos of call for each function
            return 1;
        }
        return no * factorial(--no);
    }

    // public static int factorial(int no){     //non recursive approach    O(N)
    //     int result = 1;
    //     for(int i=2; i<=no; i++){
    //         result *= i;
    //     }
    //     return result;
    // }

    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int no = sObj.nextInt();
        System.out.println(factorial(no));
    }
}