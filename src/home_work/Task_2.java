package home_work;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int a = number;
        int b = a%10;
        int c = (a/10)%10;
        System.out.println(a+b+c);
    }
}
