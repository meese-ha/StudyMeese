using System;

public class Solution {
    public int solution(int[] schedules, int[,] timelogs, int startday) {
        int answer = 0;
        int person = 0;
        
        for(int i=0; i<timelogs.GetLength(0); i++)
        {
           int time = schedules[i]+10;
            
            if(time%100 >= 60){
                time += 100;
                time -= 60;
            }
            
            person = 0;
            
            for(int j=0; j<7; j++)
            {                
            
                if(startday >= 6)
                {
                    startday = startday == 6 ? 7 : 1; 
                    continue;
                    
                } 
                else 
                {
                     if(time >= timelogs[i,j] )
                     {
                         person++;
                     } 
                                     
                }
                
                startday++;        
            }            
            
            
            if(person == 5)
            {
                answer++;
            }          

        }
        
        return answer;
    }
}