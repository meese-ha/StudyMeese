using System;
using System.Collections.Generic;
using System.Linq;

public class Solution {
    
    public int GetTime(string str)
    {
        string[] strs = str.Split(":");
        int minute = int.Parse(strs[1]);
        minute += int.Parse(strs[0])*60; 
        
        return minute;
    }
    
    public string solution(string video_len, string pos, string op_start, string op_end, string[] commands) {
        string answer = "";   
        
       int video = GetTime(video_len);
       int now = GetTime(pos);
       int start = GetTime(op_start);
       int end = GetTime(op_end);
        
        for(int i=0; i<commands.Length; i++)
        {

             if(start <= now && now <= end)
            {
                  now = end;                 
            }
            
            
            if(commands[i] == "next")
                now += 10;         
            else 
                now -= 10;
                
            if(now <  10)
                now = 0;
            else if(now > video)
                now = video;
            
            if(start <= now && now <= end)
                now = end;
        }
        
        
        int h = (now / 60);
        int m = (now % 60);
        
        
        answer = h.ToString("D2")  + ":" + m.ToString("D2"); 
        
        
        return answer;
    }
    
    

    
}