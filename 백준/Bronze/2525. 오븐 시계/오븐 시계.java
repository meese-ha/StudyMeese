import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        int A = in.nextInt();
        int B = in.nextInt();
        int C = in.nextInt();
        
        int Min = A * 60 + B;
        int T = Min + C;
        
        int H = (T/60)%24;
        int M = T %60;
        
        System.out.println(H+" "+M);
        
        
        
        
        
    }
}