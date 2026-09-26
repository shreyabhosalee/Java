import java.util.*;

public class Vote {

    public static void eligible(int a) {

        if (a >= 18) {
            System.out.println("Person is eligible to vote.");
        } else {
            System.out.println("Person is not eligible to vote.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your age:");
        int a = sc.nextInt();

        eligible(a);
    }
}