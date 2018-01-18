import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task_1 {
    public static void main(String[] args) throws IOException {
        int a;
        int b;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите первое число:");
        String num1 = reader.readLine();
            a = Integer.parseInt(num1);
        System.out.println("Введите второе число:");
        String num2 = reader.readLine();
            b = Integer.parseInt(num2);

        int c = a%b;
        int d = (a-c)/b;

        System.out.println(a+"/"+b+"="+d+" и "+c+" остаток!");
    }
}
