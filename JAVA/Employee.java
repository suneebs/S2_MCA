
public class Employee {
    int empid,salary;
    String name,address;
    Employee(int id,int s,String a,String n){
        empid=id;
        salary=s;
        address=a;
        name=n;
    }

}

class Teacher extends Employee{
    String dept, sub;
    Teacher(int id,int sa,String a,String n,String d,String s){
        super(id,sa,a,n);
        dept=d;
        sub=s;
    }
    void display(){
        System.out.println(" Empid:"+empid);
        System.out.println(" Name:"+name);
        System.out.println(" Address:"+address);
        System.out.println(" Department:"+dept);
        System.out.println(" Subject:"+sub);
    }

    public static void main(String[] args) {
        Teacher t= new Teacher(101, 25000, "paris", "Peter", "MCA", "maths");
        t.display();
    }
}
