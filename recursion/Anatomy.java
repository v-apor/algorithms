public class Anatomy{

    public static String recCall(int counter){
        if(counter > 5){
            return "Done!";
        }
        System.out.println(counter);
        counter++;
        return recCall(counter);
    }

    public static void main(String[] args){
        System.out.println(recCall(1));
    }
}