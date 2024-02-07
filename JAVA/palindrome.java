import java.util.Scanner;

class palindrome {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int rev=0,rem;
        System.out.print("Enter a number: ");
        int val = s.nextInt();
        int num=val;
        while(val>0){
            rem=val%10;
            rev=rev*10+rem;
            val= val/10;
        }

        if(rev == num)
            System.out.println("palindrome");
        else
            System.out.println("not a palindrome");
    }
}