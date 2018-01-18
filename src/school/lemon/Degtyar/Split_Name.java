package school.lemon.Degtyar;

public class Split_Name {
    private static String name = "Богдан Дегтярь";

    public static void main( String[] args ) {

        String[] res = name.split(" ");
        for (String w:res){
            System.out.println(w + " " + w.length() + " символов ");
        }
    }
}
