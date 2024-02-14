import java.util.Scanner;

class complexSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the real part of number 1: ");
        int a1,a2,i1,i2;
        a1=sc.nextInt();
        System.out.print("Enter the imaginary part of number 1: ");
        i1= sc.nextInt();
        System.out.print("Enter the real part of number 2: ");
        a2 = sc.nextInt();
        System.out.print("Enter the imaginary part of number 2: ");
        i2 = sc.nextInt();
        int c1= a1+a2;
        int c2=i1+i2;
        System.out.println("sum of 2 complex numbers is : "+ c1 + " + i"+c2);
    }
}