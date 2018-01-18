import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task_4 {
    public static void main(String[] args) throws IOException {
        int a;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите трёхзначное число:");
        String num = reader.readLine();
        a = Integer.parseInt(num);
        int sum = 0;
        int b;

        b = a%10;
        sum = sum + b;

        a = a/10;

        b = a%10;
        sum = sum + b;

        a = a/10;

        b = a%10;
        sum = sum + b;

        System.out.println(sum);
    }
}
