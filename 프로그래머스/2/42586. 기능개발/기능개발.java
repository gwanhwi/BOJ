import java.util.*;
//25분
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> list = new ArrayList<>();
        boolean[] clear = new boolean[progresses.length];
        int count=0;
        int idx=0;
        while(idx<progresses.length){
            for(int i=0;i<progresses.length;i++){
                progresses[i]+=speeds[i];
                if(progresses[i]>=100){
                    clear[i]=true;
                }
            }
            if(clear[idx]){
                while(clear[idx]){
                    count++;
                    idx++;
                    if(idx==clear.length)break;
                }
                list.add(count);
                count=0;
            }
        }
        int[] answer = new int[list.size()];
        for(int i=0;i<list.size();i++)
            answer[i]=list.get(i);
        return answer;
    }
}