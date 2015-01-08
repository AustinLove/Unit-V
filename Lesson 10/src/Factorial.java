import TerminalIO.*;

public class Factorial {
    static int result;
    
    public static void main(String[] args) {
        KeyboardReader k = new KeyboardReader();
        int n = k.readInt("Enter the Factorial, Maxiumum 15-> ");
        
        while(true){
            if(n>0&&n<16){
                result = factorial(n);
                break;
            }
            else{
                System.out.println("Incorrect Factorial, Must be betwen 1 and 15");
                n = k.readInt();
            }
        }
        System.out.println("Factorial Output: " +result);
    }
    public static int factorial(int n){
        if(n==1)
            return 1;
        else return n*factorial(n-1);
    }
    
}
