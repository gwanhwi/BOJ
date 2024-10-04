import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        //25분소요. 생각나는대로 구현했을 때
        // List<Integer> list = new ArrayList<>();
        // boolean[] clear = new boolean[progresses.length];
        // int count=0;
        // int idx=0;
        // while(idx<progresses.length){
        //     for(int i=0;i<progresses.length;i++){
        //         progresses[i]+=speeds[i];
        //         if(progresses[i]>=100){
        //             clear[i]=true;
        //         }
        //     }
        //     if(clear[idx]){
        //         while(clear[idx]){
        //             count++;
        //             idx++;
        //             if(idx==clear.length)break;
        //         }
        //         list.add(count);
        //         count=0;
        //     }
        // }
        // int[] answer = new int[list.size()];
        // for(int i=0;i<list.size();i++)
        //     answer[i]=list.get(i);
        // return answer;
        
        //큐 사용 9:44
        Queue<int[]> que= new LinkedList<>();
        int count=0;
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<progresses.length;i++){
            que.offer(new int[] {progresses[i], speeds[i]});
        }
        while(!que.isEmpty()){
            for(int i=0;i<que.size();i++){ //하루 프로세스 시작
                que.offer(new int[] {que.peek()[0]+que.peek()[1],que.peek()[1]});
                que.poll();
            }//하루 프로세스 끝
            while(!que.isEmpty() &&que.peek()[0]>=100){
                que.poll();
                count++;
            }
            if(count>0){
                list.add(count);
                count=0;
            }
        }
        int[] answer = new int[list.size()];
        for(int i=0;i<list.size();i++){
            answer[i]=list.get(i);
        }
        return answer;
    }
}