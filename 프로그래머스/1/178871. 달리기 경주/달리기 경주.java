import java.util.*;
class Solution {
    public String[] solution(String[] players, String[] callings) {
        HashMap<String,Integer> map = new HashMap<>();
        for(int i=0;i<players.length;i++){
            map.put(players[i],i);
        }
        for(int i=0;i<callings.length;i++){
            int index = map.get(callings[i]);
            String temp=players[index];
            players[index]=players[index-1];
            players[index-1]= temp;
            map.put(players[index],index);
            map.put(players[index-1],index-1);
        }
        return players;
    }
}