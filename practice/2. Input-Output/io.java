import java.util.Scanner;

public class io {
    public static void main(String[] args) {
        Scanner $scan = new Scanner(System.in);
        final float PI = 3.14f;
        
        System.out.print("Enter radius: ");
        float radius = $scan.nextFloat();

        System.out.println("Area is: " + (PI * radius * radius));
    }
}
