import java.util.*;

public class Greatest {
    public static int printGreatest(int a, int b){
      if(a > b){
        return a;
      }
      else{
        return b;
      }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers  : ");
        int a = sc.nextInt();
            int b = sc.nextInt();
                    int result = printGreatest(a, b);

        System.out.println("Greatest number is: " + result);


    }
}
