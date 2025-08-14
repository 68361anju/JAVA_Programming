package Bubble_sort;

import java.util.Arrays;

public class Bubblesort {
public static void main(String[] args) {
    int arr[]={3,4,2,5,1};
    for(int i=0;i<arr.length;i++){
        for(int j=1;j<arr.length-i;j++){
            if(arr[j-1]>arr[j]){
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
            }
            System.err.println(Arrays.toString(arr));
        }
        System.err.println(Arrays.toString(arr));
    }


    
}

    
}
