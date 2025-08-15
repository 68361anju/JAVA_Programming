package Selection_sort;

public class select1 {
    public static void main(String[] args) {
        int arr[]={4,3,2,1,5,-1,0,2,6,3};
        int Target=5;
        for(int i=0;i<arr.length-1;i++){
                 for(int j=1;j<arr.length;j++){
                    if(arr[i]+arr[j]== Target){
                        System.out.println(arr[i]+", "+arr[j]);
                    }

        }

        
    }
}
}
