import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task_5 {
    public static void main(String[] args) throws IOException {
        int weight;
        int earth = 100;
        int moon = 17 ;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите ваш вес:");
        String num = reader.readLine();
        weight = Integer.parseInt(num);
        double moonweight;
        moonweight = weight*moon/earth;
        System.out.println("Ваш вес на луне: " + moonweight);
    }
}
