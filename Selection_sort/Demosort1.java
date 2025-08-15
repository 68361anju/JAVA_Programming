package Selection_sort;

public class Demosort1 {
        public static void main(String[] args){
        int[] arr = {2,5,3,7,8,9,14,15,7,3,6};
        int max = 1;
        int count = 1;
        for(int i=0;i<arr.length-1;i++){
              if(arr[i]<arr[i+1]) {
                count++;
                if(count>max){
                    max=count;
                                     
                }
              }
              else{
                count=1;
              }
        }
        System.out.println(max);
           }}

