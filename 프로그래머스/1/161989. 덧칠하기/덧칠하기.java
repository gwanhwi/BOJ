import java.util.*;
//indent 줄이면서 최적화해서 다시 풀어보기
class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        boolean[] isPaint=new boolean[n+1];
        Arrays.fill(isPaint,true);
        for(int i=0;i<section.length;i++){
            isPaint[section[i]]=false;
        }
        for(int i=1;i<=n;i++){
            if(!isPaint[i]){
                for(int j=0;j<m;j++){
                    if(i+j<=n)
                        isPaint[i+j]=true;
                }
                answer++;
            }
        }
        return answer;
    }
}