import java.util.Scanner;

public class matrixSym {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of matrices");
        int size =  sc.nextInt();
        int a[][] = new int[size][size] ;
        int f=0;
        System.out.println("Enter matrix");
        for(int i=0; i<size; i++){
            for(int j=0; j<size;j++){
                a[i][j] = sc.nextInt();
            }
        }
        for(int i=0; i<size; i++){
            for(int j=0; j<size;j++){
                if (a[i][j] != a[j][i]) {
                    f=1;
                    break;
                }
            }
        }
        if(f==0) System.out.println("Symmetric");
        else System.out.println("not Symmetric");


    }
    
}
