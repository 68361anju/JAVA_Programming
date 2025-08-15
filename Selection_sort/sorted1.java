package Selection_sort;

public class sorted1 {

    public static void main(String[] args) {
        int arr[] = {4,1,3,5,0,2,3,2,6,3 };
        int Target = 5;
        for (int i = 0; i < arr.length - 1; i++) {

            if (arr[i] + arr[i + 1] == Target) {
                System.out.println(arr[i] + ", " + arr[i + 1]);
            }

        }
    }
}
