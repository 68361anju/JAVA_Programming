package Selection_sort;

public class Avoidsort {
    public static void main(String[] args) {
        int arr[] = {4,1,3,5,0,2,3,2,6,-1};
        int v[] = new int[arr.length];
        int t = 5;
        for (int i = 0; i < arr.length - 1; i++) {
            int c = 1;
            if (v[i] != 1) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j] ) {
                        c++;
                        v[j] = 1;
                 
                                      
                    }
                                if(arr[i]+arr[j]==t){
                        System.err.println(arr[i]+"  "+arr[j]);
                        
                    }
                   

                }
                
               
                           
            }
           
            

        }
        

    }
    
}
