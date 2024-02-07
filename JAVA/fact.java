import java.util.*;

public class fact {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.print("Enter the number: ");
        int fact=1,n;
        n= s.nextInt();
        for(int i=1; i<=n; i++){
            fact = fact*i;
        }
        System.out.println("Factorial is "+fact);

    }
}
