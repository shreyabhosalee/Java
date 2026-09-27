import java.util.*;

public class Radius {
    public static double circumference(double r){
        double c = (2 * 3.14 * r);
        return c  ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a radius :");
        double r = sc.nextDouble();

        double result = circumference(r);

        System.out.println("Circumfernce of circle is:" + result);

    }
}
