package Selection_sort;

public class Avoiding {

    public static void main(String[] args) {
        int arr[] = {4, 3, 2, 1, 5, -1, 0, 3, 6, 2};
        int v[] = new int[arr.length];
        int t = 5;
        for (int i = 0; i < arr.length - 1; i++) {
            int c = 1;
            if (v[i] != 1) {
                for (int j = i + 1; j < arr.length-1; j++) {
                    if (arr[i] == arr[j]) {
                        c++;
                        v[j] = 1;

                    }
                    if (arr[i] + arr[j] == t) {
                    System.out.println(arr[i] + " " + arr[j]);
                }

                }
                
            }
        }

    }

}

