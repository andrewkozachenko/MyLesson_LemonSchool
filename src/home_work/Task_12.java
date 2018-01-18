import java.util.Scanner;

public class Task_12 {

    public static void main(String[] args){

        Scanner distance = new Scanner(System.in);
        System.out.println("Введите расстояние:");
        int num1 = distance.nextInt();
        Scanner time = new Scanner(System.in);
        System.out.println("Введите время:");
        int num2 = time.nextInt();

        int speed;
        speed=num1/num2;

        System.out.println("Скорость должна быть: " + speed + " км/ч");


    }
}
