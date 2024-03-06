import java.util.*;

public class Str {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the String");
        String str=sc.nextLine();
        System.out.println("original string: "+str);
        
        int l = str.length();
        System.out.println("Length of the string is: "+l);

        String upper=str.toUpperCase();
        System.out.println("Upper case of the string is: "+upper);

        String lower=str.toLowerCase();
        System.out.println("Lower case of the string is: "+lower);

        String str2="Welcome, ";
        System.out.println(str2.concat(str));

       System.out.println( str2.replace('e', 'a'));

       System.out.println("It contains peter? "+str.contains("peter"));

       System.out.println(str.trim());

    }
}
