import java.util.Scanner;
public class Fibonacci{

    // public static int getFibonacci(int position){           // Actually this sucks recursion here costs O(2^N)
    //     if(position < 3){                                    
    //         return position-1;
    //     }
    //     return getFibonacci(position-1) + getFibonacci(position-2);
    // }

    public static int getFibonacci(int position){           // This takes O(N)
        int[] sequence = new int[position>=2?position:2];
        sequence[0] = 0; sequence[1] = 1;
        for(int i=2; i<position; i++){
            sequence[i] = sequence[i-1] + sequence[i-2];
        }
        return sequence[position-1];
    }

    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int position = sObj.nextInt();
        System.out.println(getFibonacci(position));
    }
}