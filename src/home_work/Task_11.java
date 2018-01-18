import java.util.Scanner;

public class Task_11 {
    static int [] el = new int[10];

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число!");
        Integer num = in.nextInt();



        el[0] = 0;
        el[1] = 1;
        el[2] = 2;
        el[3] = 3;
        el[4] = 4;
        el[5] = 5;
        el[6] = 6;
        el[7] = 7;
        el[8] = 8;
        el[9] = 9;

        for (int i=0; i<el.length; i++){
            System.out.println(num +"*" + i + "=" + num * el[i]);
        }
    }
}
