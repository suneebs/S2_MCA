import java.util.*;

public class prime {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.print("Enter the number: ");
        int val = s.nextInt();
        int f=0;
        for(int i=2; i< (val/2); i++){
            if (val%i ==0) {
                f=1;
            }
        }
        if (f==0) {
            System.out.println(val + " is prime");
        }else
        System.out.println(val + " is not prime");
    }
}

