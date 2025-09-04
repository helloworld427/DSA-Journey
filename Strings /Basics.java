import java.util.Scanner;

public class Basics {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // String name = new String("john"); // made outside of string pool in heap memory
        // name = "cena"; // made inside of string pool in heap memory and now name points to cena and
                        // john is garbage collected;

        
        // String just a wrapper class around char[] with methods
        // System.out.println(name[3]); error as string is immutable for Security
        // String Pool / Memory efficiency ,Thread safety

        /*
         * Normal heap objects:
         * Created using new.
         * Managed by Garbage Collector (GC).  
         * 
         * String Pool objects:
         * not immediately garbage collected
         */

        // comparision
        /*
         * String name1 = "karan";
         * String name2 = "karan";
         * String name3 = "Karan";
         * String name4 = new String("karan");
         * String name5 = new String("karan");
         * 
         * System.out.println(name1 == name2); //true
         * System.out.println(name1 == name3); //false
         * System.out.println(name4 == name1); //false
         * System.out.println(name4 == name5); //false
         * 
         * System.out.println(name1.equals(name2)); //true
         * System.out.println(name1.equals(name3)); //false
         * System.out.println(name4.equals(name1)); //true
         * System.out.println(name4.equals(name5)); //true
         */

         //Sout always first call tostring method before printing anything 
         //toString() : Default version for objects= ClassName@Hashcode . but for string it returns string. 
        //  System.out.println(new int[]{1,2,3}+"karan");  //[I@55f96302

        // Java does not support operator overloading (except for + with strings).

        // String series = "";
        // char ch;

        // for(int i=0; i<26; i++)
        // {
        //     ch = (char)('a'+i);
        //     series = series + ch;
        // }
        // System.out.println(series);  //time complexity is O(n_squared);


        //StringBuilder

    //     StringBuilder sb = new StringBuilder();
    //     for(int i=0; i<26; i++)
    //     {
    //         ch = (char)('a'+i);
    //         sb.append(ch);
    //     }
    //     System.out.println(sb.toString()); 
    }
}