package math;

import java.util.Arrays;
import java.util.Scanner;

public class Task_9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку:");
        String s = in.nextLine();
        byte[] byteArray = s.getBytes();
        System.out.println("Строку в массив байт : " + Arrays.toString(byteArray));
        String string = new String(byteArray);
        System.out.println("Байты в строку : " + string);

    }
}
