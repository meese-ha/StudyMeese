import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        int N = in.nextInt();
        int[] arr = new int[N];
        int M = in.nextInt();
        
        for(int i=0; i<N; i++){
            arr[i] = 0;
        }
        
        for(int g=0; g<M; g++){
            int i = in.nextInt();
            int j = in.nextInt();
            int k = in.nextInt();
            
            for(int h=i-1; h<=j-1; h++){
                arr[h] = k;
            }
        }
        
        
        for(int i=0; i<N; i++){
            System.out.print(arr[i] + " ");
        }
        
    }
}