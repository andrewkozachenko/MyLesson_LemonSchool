import java.util.Scanner;

public class Task_14 {

    public static void main(String [] args){

        double rate = 27.10;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество гривен:");
        double uah = in.nextDouble();
        double conv = uah/rate;

        System.out.println("По курсу это равно :$" + conv);
    }
}
