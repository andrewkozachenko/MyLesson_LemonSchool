import java.util.Scanner;

public class Task_13 {

    public static void main(String[] args){

        int hours = 24;
        int minutes = 1440;
        int seconds = 86400;

        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество суток:");
        int day = in.nextInt();
        int day1 = hours * day;
        int day2 = minutes * day;
        int day3 = seconds * day;
        System.out.println("Количество часов в " + day + " сутках равно:" + day1);
        System.out.println("Количество минут в " + day + " сутках равно:" + day2);
        System.out.println("Количество секунд в " + day + " сутках равно:" + day3);
    }
}
