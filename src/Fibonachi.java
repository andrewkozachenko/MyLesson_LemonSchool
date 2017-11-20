import java.util.Scanner;

public class Fibonachi {


    static int fib(int id) {

         if (id == 1) {
            return 1;
        } else if (id == 2) {
            return 1;
        } else {
            return fib(id - 1) + fib(id - 2);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите кол-во чисел:");
        int n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print(fib(i) + ", ");
        }
    }
}

