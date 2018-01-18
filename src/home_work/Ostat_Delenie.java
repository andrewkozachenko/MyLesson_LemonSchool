package home_work;

import java.util.Scanner;

public class Ostat_Delenie {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите числа:");
        int a = in.nextInt();
        int b = in.nextInt();

        int ab = a%b;
        int ba = b%a;

        System.out.println("Остаток от деления " + a + " на " + b + ": " + ab);
        System.out.println("Остаток от деления " + b + " на " + a + ": " + ba);
    }
}
