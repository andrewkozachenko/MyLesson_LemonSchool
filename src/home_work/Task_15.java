import java.util.Scanner;

public class Task_15 {

    public static void main(String[] args){

        double s ;
        double p ;
        double h ;

        Scanner in = new Scanner(System.in);
        System.out.println("Введите длину первого катета:");
        double leg1 = in.nextDouble();
        System.out.println("Введите длину второго катета:");
        double leg2 = in.nextDouble();
         s = leg1*leg2/2;
         h = Math.sqrt(leg1*leg1+leg2*leg2);
         p = leg1+leg2+h;

        System.out.println("Площадь треугольника равна:" + s);
        System.out.println("Периметр треугольника равен:" + p);
        System.out.println("Гипотенуза треугольника равна:" + h);

    }
}
