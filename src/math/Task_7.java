package math;

import java.util.Scanner;

public class Task_7{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите набор символов:");
        String s = in.nextLine();
        if (isPalindrome(s) == true) {
            System.out.println("Строка является палиндромом");
        }else
            System.out.println("Строка не является палиндромом");
    }
        public static Boolean isPalindrome(String s) {
            return s.equals((new StringBuilder(s)).reverse().toString());
        }

}
