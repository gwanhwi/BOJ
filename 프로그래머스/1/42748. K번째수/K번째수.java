import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        ArrayList<Integer> arrList = new ArrayList<>();
        for(int i=0;i<commands.length;i++){
            for(int j=commands[i][0]-1;j<commands[i][1];j++){
                arrList.add(array[j]);
            }
            Collections.sort(arrList);
            answer[i]=arrList.get(commands[i][2]-1);
            arrList.clear();
        }
        return answer;
    }
}