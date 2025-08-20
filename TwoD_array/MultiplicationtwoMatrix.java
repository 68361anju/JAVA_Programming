public class MultiplicationtwoMatrix {
    

//row*column
    public static void main(String[] args) {
        int a[][] = {{1, 2, 3}, {4, 5, 6}}; //p*q
        int b[][] = {{7, 8}, {9,10},{11,12}}; //m*n
        int rowsA = a.length;  //p
        int colsA = a[0].length; //q
        int rowsB = b.length; //m
        int colsB = b[0].length; //n
        int c[][] = new int[a.length][b[0].length]; //p*n

        // if(rowsA != colsB ){
        //     return false;
        // }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                for(int k= 0; k< a[0].length;k++ )
                c[i][j] += a[i][k] * b[k][j];
            }
        }
        for (int i = 0; i <  a.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                System.out.print(c[i][j] + "  ");
            }
            System.out.println();

        }

    }
}

