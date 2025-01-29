import java.util.*;

public class Main{
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        
        int[] arr = new int[] { 1,1,2,2,2,8 }; 
        
        for(int i=0; i<6; i++){
            int temp = in.nextInt();
            int anw = arr[i]-temp;
            System.out.print(anw+" ");
        }
        
        
    }
}