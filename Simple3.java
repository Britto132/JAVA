
import java.util.Scanner;

public class Simple3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scanner.nextInt();
        if(num>0){
            System.err.println("The number is Positive");
        }
        else
        System.out.println("The Number is Negative");

    }
    
}
