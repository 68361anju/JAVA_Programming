package Selection_sort;

public class Demosort1 {
    public static void main(String[] args) {
        int[] arr = {2, 5, 3, 7, 8, 9, 14, 15, 7, 3, 6};
        
        int max = 1;       // length of longest increasing subarray
        int count = 1;     // current streak length
        int startIndex = 0; // start index of longest subarray
        int currentStart = 0; // start index of current streak
        
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                count++;
                if (count > max) {
                    max = count;
                    startIndex = currentStart; // update start index
                }
            } else {
                count = 1;
                currentStart = i + 1; // new streak starts here
            }
        }

        System.out.println("Length of longest increasing subarray: " + max);
        System.out.println("Starting index: " + startIndex);
        
        // Printing the subarray
        System.out.print("Subarray: ");
        for (int k = startIndex; k < startIndex + max; k++) {
            System.out.print(arr[k] + " ");
        }
    }
}
