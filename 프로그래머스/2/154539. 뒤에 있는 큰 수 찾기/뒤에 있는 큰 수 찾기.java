import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
        //뒤에서부터 max값 비교하면서 내려오면 O(N)
        int[] answer = new int[numbers.length];
        int max=-1;
        Stack<Integer> stack = new Stack<>();
        for(int i=numbers.length-1;i>=0;i--){
            if(numbers[i]<max){
                while(!stack.isEmpty()){
                    int top = stack.pop();
                    if(numbers[i]<top) {
                        answer[i]=top;
                        stack.push(top);
                        break;
                    }
                }
                
            }
            else{
                answer[i]=-1;
                max=numbers[i];
            }
            stack.push(numbers[i]);
        }
        return answer;
    }
}