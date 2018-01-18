package school.lemon.Degtyar;


import java.util.Scanner;

public class SplitDate {
    private static String str = "23.04.1996";
    public static void main( String[] args )  {
    /*    Scanner in = new Scanner(System.in);
        String str = in.nextLine();*/

        System.out.println(str);
        String[] res = str.split("\\.");
        for (String s:res){
            System.out.println(s);
        }
        
    }
}
