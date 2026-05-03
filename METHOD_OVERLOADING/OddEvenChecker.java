package METHOD_OVERLOADING;

public class OddEvenChecker {
    public static void KiemTrachanle(int n){
        if(n%2==0){
            System.err.println("so " +n+ " la so le!");
        } else{
            System.err.println("So " +n+ " la so chan!");
        }
    }
    public static void main(String[] args) {
        KiemTrachanle(19);
        KiemTrachanle(10);
        KiemTrachanle(5);
        KiemTrachanle(6);
        KiemTrachanle(0);
    }
    
}
