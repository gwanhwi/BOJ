class Solution {//1:00
    public int solution(int[] bandage, int health, int[][] attacks) {
        int maxHealth=health;
        int t=bandage[0];//시전시간
        int x=bandage[1];//초당 회복량
        int y=bandage[2];//추가 회복량
        int index=0;
        int count=0; //연속성공
        for(int i=1;i<=attacks[attacks.length-1][0];i++){
            if(i==attacks[index][0]){//공격시간일때
                health-=attacks[index][1];
                if(health<=0) return -1;
                if(index<attacks.length-1) index++;
                count=0;
            }
            else{
                health+=x;
                count++;
                if(count==t) {
                    health+=y;
                    count=0;
                }
                if(health>=maxHealth) health=maxHealth;
            }
        }
        return health;
    }
}