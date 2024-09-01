class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        answer[0]=-1;
        for(int i=1;i<s.length();i++){
            int count = -1;
            for(int j=i-1; j>=0;j--){
                if(s.charAt(i) == s.charAt(j)){
                    count=i-j;
                    break;
                }
            }
            answer[i]=count;
        }
        return answer;
    }
}