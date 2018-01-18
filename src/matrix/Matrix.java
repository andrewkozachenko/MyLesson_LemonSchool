package matrix;

public class Matrix {
    private static int a = 0, b = 0, c = 0, d = 0, k = 0, l = 0;
    private static int[] column = new int[ 16 ];
    private static int[] row = new int[ 16 ];
    private static int[][] matrix = new int[ 3 ][ 4 ];

    public static void main( String[] args ) {
        matrix();
        quantity(rowline(matrix),columnline(matrix));
    }

    public static int[][] matrix() {
        matrix[ 0 ][ 0 ] = 0;
        matrix[ 0 ][ 1 ] = 1;
        matrix[ 0 ][ 2 ] = 0;
        matrix[ 0 ][ 3 ] = 1;
        matrix[ 1 ][ 0 ] = 1;
        matrix[ 1 ][ 1 ] = 0;
        matrix[ 1 ][ 2 ] = 0;
        matrix[ 1 ][ 3 ] = 1;
        matrix[ 2 ][ 0 ] = 1;
        matrix[ 2 ][ 1 ] = 0;
        matrix[ 2 ][ 2 ] = 1;
        matrix[ 2 ][ 3 ] = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matrix[ i ][ j ] + "\t");

            }
            System.out.println();

        }
        return matrix;
    }

    public static int rowline(int[][] matrix){
        for (int j = 0; j < 4; j++) {
            for (int i = 0; i < 3; i++) {
                row[ l ] = matrix[i][j];
                l++;
            }
            row[l] = 0;
            l++;
        }

        System.out.println();
        for(l=0; l < row.length; l++) {
            if (row[l] == 1) a++;
            if (l + 1 == row.length || row[l] != 1) {
                if (a > b) {
                    b = a;

                    if (a>3)b=3;
                }

                a = 0;
            }
        }
        return b;
    }

    public static int columnline(int[][] matrix){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                column[ k ] = matrix[i][j];
                k++;
            }
            column[k] = 0;
            k++;
        }
        for(k=0; k < column.length; k++) {
            if (column[k] == 1) c++;
            if (k + 1 == column.length || column[k] != 1) {
                if (c > d) {
                    d = c;

                    if (c>4)d=4;
                }
                c = 0;
            }
        }
        return d;
    }

    public static int quantity( int b, int d){
        if(b>d){
            System.out.println(b);
        }else
            System.out.println(d);
        return b;
    }


}