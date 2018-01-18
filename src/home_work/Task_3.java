import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task_3 {
    public static void main(String[] args) throws IOException {

        double a;
        double b;
        double c = 0.5;
        double d;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите дробное число число: ");

        String num = reader.readLine();
        a = Double.parseDouble(num);
        b = a%1;
        d = a - b;
        if (b<c){
            a = a-b;
            System.out.println(a);
        }else
            System.out.println(d+1);


    }
}
