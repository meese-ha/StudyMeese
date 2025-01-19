import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        String A = in.next();
        String B = in.next();
        
        in.close();
        
        char[] ch = new char[3];
        char[] ch2 = new char[3];
        int n = 0;
        
        for(int i=2; i>=0; i--){
             ch[i] = A.charAt(n);
             ch2[i] = B.charAt(n);
             n++;
        }
        
        String temp = new String(ch);
        String temp2 = new String(ch2);
        
        int g = Integer.parseInt(temp);
        int h = Integer.parseInt(temp2);
        
        System.out.print(g>h?g:h);
        
        
    }
}