import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        int A = in.nextInt();
        String str = "";
        in.close();
        
        for(int i=0; i<A/4; i++){
            str += "long ";
        }
        
        System.out.println(str + "int");
        
    }
}