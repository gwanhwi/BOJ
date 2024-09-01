import java.util.*;
class Solution {
    public int[] solution(int k, int[] score) {
        int[] rank = new int[k];
        int[] answer = new int[score.length];
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i=0;i<score.length;i++){
            if(i<k){
                list.add(score[i]);
                Collections.sort(list);
                answer[i]=list.get(0);
            }
            else{
                if(i==k){
                    for(int j=0;j<k;j++){
                        rank[j]=list.get(j);
                    }
                }
                if(rank[0]<score[i]){
                    rank[0]=score[i];
                    Arrays.sort(rank);
                }
                answer[i]=rank[0];
            }
        }
        return answer;
    }
}