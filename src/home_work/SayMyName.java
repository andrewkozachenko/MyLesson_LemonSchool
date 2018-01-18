/**
 *  import -  это ключевое слово в Java и  инструмент который позволяет вам получить доступ,
 *  другими словами загрузить к себе в программу API, которое было написано другими программистами
 */

import java.util.Scanner;

public class SayMyName {

    public static void main(String[] args) {
        /* считывает входящий поток с консоли, в котором вы вводите с клавиатуры */
        Scanner in = new Scanner(System.in);

        System.out.print("Введите ваше имя: ");//Выводит сообщение в консоль, так же как вы выводили Hello World!

        String name = in.nextLine();//получаем с потока строку которую вы ввели

        System.out.println("Hello" + name + "!!");//выводим имя
    }

}
