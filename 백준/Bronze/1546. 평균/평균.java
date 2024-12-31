import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        int num = in.nextInt();
        double[] arr = new double[num];
		double avg, max = 0,sum = 0;
        
        for(int i=0; i<num; i++){
            arr[i] = in.nextInt(); 
            
            if(arr[i]>max) 
				max = arr[i]; 
        }
        
        
        for(int i=0; i<num; i++){
            sum += (arr[i]/max) * 100;            
        }
        
        in.close();
        
        avg = sum/num;
        System.out.println(avg);
        
        
    }
}