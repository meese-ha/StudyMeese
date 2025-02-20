using System;

public class Solution {
    public int solution(int n, int w, int num) {
        int answer = 0;
        int max = 1;
        int mini = 0;
        int minj = 0;
        double d = Convert.ToDouble(n) / Convert.ToDouble(w);
        int height = (int)Math.Ceiling(d);
        
        int[,] arr = new int[height,w];
        
        for(int i=0; i<height; i++)
        {
            if(max <= n)
            {
                if(i%2 == 1 && i != 0)
                {
                    for(int j=w-1; j>=0; j--)
                    {
                        if(max <= n)
                        {
                            arr[i,j] = max;
                            max++;                            
                        }
                    }
                    
                    
                }
                else {
                    for(int j=0; j<w; j++)
                    {
                        if(max <= n)
                        {
                            arr[i,j] = max;
                            max++;                            
                        }
                    }
                }

            }
        }
        
        
        
        for (int i = 0; i < arr.GetLength(0); i++)
            {
                for (int j = 0; j < arr.GetLength(1); j++)
                { 
                    if(arr[i,j] == num)
                    {
                        mini = i;
                        minj = j;
                    }
                }
            }
        
        for (int i = mini; i < height; i++)
            {
                if(arr[i,minj] != 0)
                {
                    answer++;
                }
            }


        
        
      
        return answer;
    }
}