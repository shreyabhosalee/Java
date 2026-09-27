import java.util.*;

public class Average {
    public static double printAvgNo(int a , int b , int c){
double avg = (a+b+c) / 3.0;
return avg;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three nos: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        double avg = printAvgNo(a, b, c);
        System.out.println("Average is:" + avg);
    }
}
