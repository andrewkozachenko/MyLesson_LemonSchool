package home_work;

public class SumABC {

    public static void main(String[] args) {

        int c = 365;
        int s;
        int sum;
        s = c%10;
        c/=10;
        sum = s;
        s = c%10;
        sum +=s;
        c = (c - s)/10;
        sum += c;
        System.out.println(sum);

    }
}
