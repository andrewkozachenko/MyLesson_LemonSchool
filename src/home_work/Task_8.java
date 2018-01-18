package home_work;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task_8 {

    public static void main(String [] args) throws IOException {

        int a;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите ваше число!");
        String nums = reader.readLine();
        a = Integer.parseInt(nums);
        int b = a%2;

        if(b == 0){
            System.out.println("Число четное!");
        }
        else
            System.out.println("Число не четное!");
    }
}
