import java.util.Scanner;

public class Task_8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Vvedite nabor simvolov");
        String s = in.nextLine();
        System.out.println("Vvedite simvol kotory nujno udalit'");
        String f = in.nextLine();
        String repl;
        repl = s.replace(f, "");
        System.out.println(repl);

    }

}
