import java.util.Scanner;

public class ElementSearch {
    public static void main(String[] args) {
        int n,ele,f=0;
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        n=Sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the array");
        for(int i=0;i<n;i++){
            a[i]=Sc.nextInt();
        }
        System.out.println("Enter the element to search:");
        ele=Sc.nextInt();
        for(int i=0;i<n;i++){
            if(a[i]==ele){
                f=1;
                break;

            }
        }
        if (f==1) {
            System.out.println("Element found");
        }
        else
        System.out.println("Element not found");
    }
}
