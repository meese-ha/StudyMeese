import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        int A = in.nextInt();              
        
        for(int i=0; i<A; i++){            
            int B = in.nextInt();        
            String C = in.next();
            
            for(int j=0; j<C.length(); j++){
                char ch = C.charAt(j);
                for(int k=0; k<B; k++){
                    System.out.print(ch);
                }
                
            }
             System.out.println();
            
        }
        
    }
    
}