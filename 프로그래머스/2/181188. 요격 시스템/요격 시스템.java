import java.util.*;
class Solution {
    public int solution(int[][] targets) {
        // Arrays.sort(targets,new Comparator<int[][]>(){
        //     @override
        //     public int compare(o1[][], o2[][]){
        //         return o1
        //     }
        // })
        Arrays.sort(targets,new Comparator<int[]>(){
            @Override
            public int compare(int[] o1, int[] o2){
                if(o1[0]==o2[0]) return o1[1]-o2[1];
                return o1[0]-o2[0];
            }
        });
        List<int[]> list = new ArrayList<>();
        list.add(new int[] {targets[0][0],targets[0][1]});
        int count=1;
        for(int i=1;i<targets.length;i++){
            int[] beforeRange = list.get(list.size()-1);
            if(targets[i][0]<beforeRange[1]){
                if(targets[i][1] < beforeRange[1]){
                    list.set(list.size()-1,new int[] {targets[i][0],targets[i][1]});
                }
                else{
                    list.set(list.size()-1,new int[] {targets[i][0],beforeRange[1]});
                }
            }
            else{
                list.add(new int[] {targets[i][0],targets[i][1]});
                count++;
            }
        }
        return count;
    }
}