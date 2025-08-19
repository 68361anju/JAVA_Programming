
public class prodeven {

    public static void main(String[] args) {
        int a[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for (int i = 0; i < a.length; i++) {
            int prod = 1;
            for (int j = 0; j < a.length; j++) {
                if (a[i][j] % 2 == 0) {
                    prod *= a[i][j];
                }
            }
            System.out.print(prod + " ");
        }
        
    }
}
