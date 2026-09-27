import java.util.*;

public class Mul {
    public static int calMulti(int a, int b) {
        int multi = a * b;
        return multi;
    }

    public static void main() {
        Scanner sc = new Scanner(System.in);
                 System.out.println("Enter two numbers:");

        int a = sc.nextInt();
        int b = sc.nextInt();
        int multi = calMulti(a, b);
        System.out.println("Multiplication of 2 nos is :" + multi );
    }
}
