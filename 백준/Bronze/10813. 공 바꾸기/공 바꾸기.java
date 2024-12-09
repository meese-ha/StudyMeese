import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        int N = in.nextInt();
        int M = in.nextInt();
        
        int[] arr = new int[N];
        
        for(int k=0; k<N; k++){
            arr[k] = k+1;
        }
    
        for(int k=0; k<M; k++){
            int i = in.nextInt();
            int j = in.nextInt();
            
            int A = 0;
            int B = 0;
            
            A = arr[i-1];
            B = arr[j-1];
            
            arr[j-1] = A;
            arr[i-1] = B;            
            
        }
        
        
        for(int k=0; k<N; k++){
            System.out.print(arr[k] + " ");
        }
    }
}