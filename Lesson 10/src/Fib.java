import TerminalIO.*;

public class Fib {
    static int result;
    
    public static void main(String[] args) {
        KeyboardReader k = new KeyboardReader();
        int n = k.readInt("Enter the Number, Maximum is 15-> ");
        
        while(true){
            if(n>0&&n<16){
                result = fibonnaci(n);
                break;
            }
            else{
                System.out.println("Incorrect Fibonnaci Numero, Must be betwen 1 and 15 ");
                n = k.readInt();
            }
        }
        System.out.println("Fibonnaci Output " +result);
    }
    public static int fibonnaci(int n){
        if(n<=2) return 1;
        else return fibonnaci(n-1)+fibonnaci(n-2);
    }
    
}
