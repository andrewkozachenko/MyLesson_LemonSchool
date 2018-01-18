package home_work;

import java.util.Scanner;

public class Task_6 {

    static  int [] mas = new int[5];

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        System.out.println("Введите номер елемента:");
        int num = in.nextInt();
        if(num>=0&&num<5) {
            mas[0] = 10;
            mas[1] = 12;
            mas[2] = 16;
            mas[3] = 28;
            mas[4] = 34;

            System.out.print("Элемент " + num + " увеличен на 10%:");
            System.out.println(mas[num] + mas[num] * 0.2);
        }
        else System.out.println("Вы указали не верный номер елемента!!!");

    }
}
