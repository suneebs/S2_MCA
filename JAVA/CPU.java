public class CPU {
    int price;
    class Processor{
        int core;
        String manufacturer;
        Processor(int nc,String mf){
            core=nc;
            manufacturer=mf;
        }

        void display(){
            System.out.println("Processor info");
            System.out.println("no of cores : "+core);
            System.out.println("manufacturer : "+manufacturer);
        }
    }

    static class RAM{
        int mem;
        String manufacturer;
        RAM(int nc,String mf){
            mem=nc;
            manufacturer=mf;
        }

        void display(){
            System.out.println("RAM info");
            System.out.println("mamory : "+mem+" GB");
            System.out.println("manufacturer : "+manufacturer);
        }
    }

    public static void main(String[] args){
        RAM ob = new RAM(8,"intel");
        ob.display();
        CPU c= new CPU();
        System.out.println();
        CPU.Processor p =c.new Processor(8, "SAMSUNG");
        p.display();
    }
}


