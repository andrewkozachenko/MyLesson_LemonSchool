import java.util.Scanner;

public class Task_16 {

    public static void main(String[] args){

        double cons1 = 1.8;
        double cons2 = 32;
        double f;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите температуру в Цельсиях");
        double c = in.nextDouble();

        f = cons1*c + cons2;
        System.out.println("Температура в Фаренгейтах:" + f);
    }
}
