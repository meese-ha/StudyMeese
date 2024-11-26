import java.util.*;

public class Main{
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        
        in.close();
        int i=1;
        int j=1;
        int k=1;
        
        for(i=1; i<=A; i++){
            
            for(j=1; j<=A-i; j++){
                   System.out.print(" ");               
            }               
            for(k=1; k<=i; k++){  
                System.out.print("*");              

            }  
            System.out.println();               
        }    
        
        
    }
}