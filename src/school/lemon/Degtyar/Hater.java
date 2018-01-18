package school.lemon.Degtyar;

public class Hater {
    private static String name = "Сергей Зверев";

    public static void main( String[] args ) {
        String a = null;
        String[] res = name.split(" ");
        for (String w:res){
            System.out.println(w + " " + w.length() + " символов ");

        }
            System.out.println(res[0].replace("е","у").replace('г','х'));
            System.out.println(res[1].replace("З","Х"));

    }

}
