import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        int A = in.nextInt();
        int arr[] = new int[A];
        
        for(int i=0; i<A; i++){
            arr[i] = in.nextInt();
        }
        
        int max = arr[0];
        int min = arr[0];
        
        for(int j=0; j<arr.length; j++){            
            if(arr[j] > max){
              max = arr[j];
            }    
        }
        
        for(int j=0; j<arr.length; j++){            
            if(arr[j] < min){
               min = arr[j];                
            }     
        }
            
        System.out.println(min+" "+max);
        
    }
}