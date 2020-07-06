public class OverflowTest{

    public static void recCall(){
        recCall();
    }

    public static void main(String[] args){
        recCall();
    }
}