package Bubble_sort;

import java.util.Arrays;

public class Bubble1 {
    public static void main(String[] args) {
        int arr[]={5,3,6,8,7,2,4,9,10,3};
        for(int i=0;i<arr.length;i++){
            for(int j=1;j<arr.length/2-i;j++){
                if(arr[j-1]>arr[j]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
                for(int j=arr.length/2;j<arr.length-i;j++){
                if(arr[j-1]>arr[j]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
            System.out.println(Arrays.toString(arr));
        }
        
    }
    
}
