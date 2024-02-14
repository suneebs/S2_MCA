import java.util.Scanner;

public class matrixAdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of matrices");
        int size =  sc.nextInt();
        int a[][] = new int[size][size] ;
        int b[][] = new int[size][size] ;
        System.out.println("Enter first array");
        for(int i=0; i<size; i++){
            for(int j=0; j<size;j++){
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter second array");
        for(int i=0; i<size; i++){
            for(int j=0; j<size;j++){
                b[i][j] = sc.nextInt();
            }
        }

        for(int i=0; i<size; i++){
            for(int j=0; j<size;j++){
                a[i][j] += b[i][j];
            }
        }
        
        System.out.println("Sum is:");

        for(int i=0; i<size; i++){
            for(int j=0; j<size;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
