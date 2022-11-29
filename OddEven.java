import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        int n;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number ");
        n = s.nextInt();
        if (n % 2 == 0) {
            System.out.println("The number is even:  " + n);
        } else {
            System.out.println("The number is odd " + n);
        }
    }
}
