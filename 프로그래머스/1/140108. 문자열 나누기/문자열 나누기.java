class Solution {
    public int solution(String s) {
        int answer = 0;
        int count;
        while(s.length() > 0){
            count=1;
            int index=-1;
            char firstChar=s.charAt(0);
            for(int i=1;i<s.length();i++){
                if(firstChar == s.charAt(i)) count++;
                else count--;
                if(count==0){
                    answer++;
                    s=s.substring(i+1,s.length());
                    break;
                }
                if(i==s.length()-1){
                    answer++;
                    s="";
                }
            }
            if(s.length()==1){
                answer++;
                break;
            }
        }
        return answer;
    }
}