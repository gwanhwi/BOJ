import java.util.*;
class Solution {
    public int solution(String[] friends, String[] gifts) {
        int answer = 0;
        
        HashMap<String, Integer> giftScoreMap = new HashMap<String, Integer>();
        HashMap<String, Integer> itemMap = new HashMap<String, Integer>();
        for(String str : friends){
            itemMap.put(str,0);
            giftScoreMap.put(str,0);
        }
        
        int score=0;
        for(int i=0; i<friends.length; i++){
            for(int j=0; j<gifts.length; j++){
                if(friends[i].equals(gifts[j].split(" ")[0])) // 구분자 " "인데 ""로 해서 오류났었음
                    score++;
                else if(friends[i].equals(gifts[j].split(" ")[1])) // string은 == 말고 equals로 비교하자
                    score--;
            }
            giftScoreMap.put(friends[i], score);
            score=0;
        }
        
        for(int i=0; i<friends.length-1; i++){
            for(int j=i+1; j<friends.length; j++){
                int s1cnt=0;
                int s2cnt=0;
                String s1 = friends[i] + " " + friends[j];
                String s2 = friends[j] + " " + friends[i];
                
                for(String str : gifts){
                    if(str.equals(s1)){
                        s1cnt++;
                    }
                    if(str.equals(s2)){
                        s2cnt++;                        
                    }
                }
                
                if(s1cnt>0 || s2cnt>0){ //주고받은 기록 있을 때
                    if(s1cnt>s2cnt){
                        itemMap.put(friends[i], itemMap.get(friends[i])+1);
                    }
                    else if(s1cnt<s2cnt){
                        itemMap.put(friends[j], itemMap.get(friends[j])+1);
                    }
                    else{//주고받은 수 같을때
                        if(giftScoreMap.get(friends[i]) > giftScoreMap.get(friends[j])){
                            itemMap.put(friends[i], itemMap.get(friends[i])+1);
                        }
                        else if(giftScoreMap.get(friends[i]) < giftScoreMap.get(friends[j])){
                            itemMap.put(friends[j], itemMap.get(friends[j])+1);
                        }
                    }
                }
                else{ //주고받은 기록 없을 때
                    if(giftScoreMap.get(friends[i]) > giftScoreMap.get(friends[j])){
                        itemMap.put(friends[i], itemMap.get(friends[i])+1);
                    }
                    else if(giftScoreMap.get(friends[i]) < giftScoreMap.get(friends[j])){
                        itemMap.put(friends[j], itemMap.get(friends[j])+1);
                    }
                }
            }
        }
        for(String str : friends){
            if(itemMap.get(str)>answer)
                answer= itemMap.get(str);
        }
        return answer;
    }
}