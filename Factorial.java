import java.util.*;

public class Factorial {
    public static void printFact(int n){

    //loop
    if(n<0){
        System.out.println("Invalid Number.");
        return;
    }
    int factorial = 1;

    for (int i=n; i>=1; i--){
         factorial = factorial * i;
    }

    System.out.println(factorial);
    return;
    }

   public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter a number:");

int n = sc.nextInt();
printFact(n);
   } 
}
