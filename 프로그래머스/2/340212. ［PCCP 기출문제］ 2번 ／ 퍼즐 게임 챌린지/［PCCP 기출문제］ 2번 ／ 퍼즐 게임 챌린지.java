class Solution {//9:30~
    public int solution(int[] diffs, int[] times, long limit) {
        int answer= find(diffs,times, limit,1,100);
        if(answer>100)
            answer=find(diffs,times, limit, answer-100,1);
        return answer;
    }
    public int find(int[] diffs, int[] times, long limit,int level,int weight){
        long total_time = 0;
        int n=diffs.length;
        long time_cur=0;
        long time_prev=0;
        for(int i=0;i<n;i++){
            int fail= diffs[i]-level; //틀리는 횟수
            time_cur=times[i];
            
            if(fail>0){ //틀리는 경우
                total_time += (time_cur+time_prev) * fail + time_cur;
            }
            else{
                total_time += time_cur;
            }
            time_prev=time_cur;
        }
        if(total_time<=limit) {
            return level;
        }
        return find(diffs,times, limit,level+weight,weight);
    }
}