import java.util.Scanner;

class fibo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter range:");
        int x=s.nextInt();

    int first=0,second=1;
    for(int i=0; i<x;i++){
        System.out.println(first);
        int next=first+second;
        first =second;
        second=next;
    }
    }
}
