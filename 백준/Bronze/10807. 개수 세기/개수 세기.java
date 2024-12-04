import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        int A = in.nextInt();
        int cnt = 0;
        int[] arr = new int[A];
        
        for(int i=0; i<A; i++){
            arr[i] = in.nextInt();
        }
        
            int C = in.nextInt();
        
        for(int j=0; j<arr.length; j++){
            if( C == arr[j]) {
                cnt++;
            }
        }
        
        System.out.println(cnt);
    }
}