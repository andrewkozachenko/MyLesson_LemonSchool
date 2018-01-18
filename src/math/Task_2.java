package math;

import java.util.Scanner;
public class Task_2 {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите значение!");
        String s = scan.nextLine();

        double d = Double.parseDouble(s);

        double radian = Math.toRadians(d);
        double cos = Math.cos(radian);
        double sin = Math.sin(radian);
        System.out.println("Значение в радианах равно: " + radian);
        System.out.println("Косинус равен: " + cos);
        System.out.println("Синус равен: " + sin);

    }

}
