import java.util.Scanner;

class pro{
    int pcode;
    String pname;
    double price;

    public void readdata(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter product code:");
        this.pcode = sc.nextInt();
        System.out.println("Enter product name:");
        this.pname = sc.next();
        System.out.println("Enter product price:");
        this.price = sc.nextDouble();
        
    }

}

public class product {
    public static void main(String[] args) {
        pro p1 =  new pro();
        pro p2 =  new pro();
        pro p3 =  new pro();
        p1.readdata();
        p2.readdata();
        p3.readdata();
        
        if (p1.price > p2.price && p1.price > p3.price) {
            System.out.println(p1.pname + " is costly");
        }
        else if (p2.price > p1.price && p2.price > p3.price)
        System.out.println(p2.pname + " is costly");
        else
        System.out.println(p3.pname + " is costly");

    }
}
