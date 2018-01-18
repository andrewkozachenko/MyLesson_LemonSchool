import java.util.Scanner;

public class SymbolTest {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int b = in.nextInt();
        for (int i = 0; i <b; i++){
            char c = (char)(Math.random()*26 + 'a');
            System.out.print(c  + ": ");
            switch (c){
                case 'a': case 'e': case 'i':
                case 'o': case 'u':
                    System.out.println("Hlasnaya");
                    break;
                case 'y': case 'w':
                    System.out.println("Inogda hlasnaya");
                    break;
                    default:
                        System.out.println("Sohlasnaya");
            }
        }
    }

}
