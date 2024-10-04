import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        
//         ArrayList<Integer> list = new ArrayList<>();
//         list.add(arr[0]);
//         for(int i=1;i<arr.length;i++){
//             if(arr[i] != arr[i-1] )
//                 list.add(arr[i]);
//         }
//         int[] answer = new int[list.size()];
//         for(int i=0;i<list.size();i++){
//             answer[i]=list.get(i).intValue();
//         }

//         return answer;
        Deque<Integer> deque= new ArrayDeque<>();
        for(int i=0;i<arr.length;i++){
            if(deque.size()==0 || deque.peekLast()!=arr[i])
                deque.offerLast(arr[i]);
        }
        int[] answer = new int[deque.size()];
        for(int i=0;!deque.isEmpty();i++){
            answer[i]= deque.pollFirst();
        }
        return answer;
    }
}