
public class Shapes {
    public void area(int b,int h){
        double area = 0.5*b*h;
    System.out.println("Area of triangle: "+area);
    }

    public void area(int r){
        double area=3.14*r*r;
        System.out.println("Area of Circle: "+area);
    }


    public static void main(String[] args) {
        Shapes s = new Shapes();
        s.area(5);
        s.area(12, 6);

    }
}
