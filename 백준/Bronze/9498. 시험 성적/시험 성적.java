import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        int A = in.nextInt();
        
        
        if(90 <= A)
        {
            System.out.println("A");
        } else if (80 <= A)
        {
            System.out.println("B");
        } else if (70 <= A)
        {
            System.out.println("C");
        } else if (60 <= A)
        {
            System.out.println("D");
        }else {
            System.out.println("F");
        }
        
        
    }
}