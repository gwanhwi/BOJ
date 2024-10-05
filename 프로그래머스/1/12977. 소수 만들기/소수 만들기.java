class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int numLen=nums.length;
        for(int i=0;i<numLen;i++){
            for(int j=i+1;j<numLen;j++){
                for(int k=j+1;k<numLen;k++){
                    int sum= nums[i]+nums[j]+nums[k];
                    if(sosu(sum)) answer++;
                }
            }
        }

        return answer;
    }
    public boolean sosu(int num){
        for(int i=2;i<num;i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}