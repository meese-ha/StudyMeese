import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        
        for(int i=0; i<num; i++){
            String str = in.next();
            int leng = str.length()-1;
            
            char str1 = str.charAt(0);
            char str2 = str.charAt(leng);
            
            System.out.print(str1);
            System.out.println(str2);
            
        }
        
        
    }
}