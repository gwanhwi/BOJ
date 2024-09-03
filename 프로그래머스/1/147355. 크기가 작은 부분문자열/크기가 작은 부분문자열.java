import java.util.*;
class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        long pInt=Long.parseLong(p);        
        for(int i=0;i<t.length()-p.length()+1;i++){
            long substr=Long.parseLong(t.substring(i,i+p.length()));
            if(substr <= pInt){
                answer++;
            }
        }
        return answer;
    }
}