import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task_7 {

    public static void main(String [] args) throws IOException {
        int a;
        int b;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите первое число:");
            String nums1 = reader.readLine();
            a = Integer.parseInt(nums1);
        System.out.println("Введите второе число:");
            String nums2 = reader.readLine();
            b = Integer.parseInt(nums2);

            if(a>b){
                System.out.println("Число:" + a + " больше!");
            }
            else
                if (a<b){
                    System.out.println("Число:" + b + " больше!");
                }
                else
                    System.out.println("Числа: " + a + " и " + b + " равны!");

    }
}
