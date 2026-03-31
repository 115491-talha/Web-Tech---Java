import java.util.Scanner;

public class io {
    public static void main(String[] args) {
        Scanner $scan = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = $scan.nextInt();

        System.out.println("Square is: " + (number * number));
    }
}
