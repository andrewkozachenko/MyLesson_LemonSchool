import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task_9 {

    public static void main(String[] args) throws IOException {

        double i;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите ваче число:");
        String num = reader.readLine();
        i = Double.parseDouble(num);

        if(i%1==0){
            System.out.println("Число целое! ");
        }
        else
            System.out.println("Число не целое!");
    }
}
