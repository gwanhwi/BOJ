import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int[][]arr = new int[N][M];
        int maxHeight=0;
        int minHeight=Integer.MAX_VALUE;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<M;j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
                maxHeight = Math.max(maxHeight,arr[i][j]);
                minHeight = Math.min(minHeight,arr[i][j]);
                map.put(arr[i][j],map.getOrDefault(arr[i][j],0)+1);
            }
        }
        int answerTime=Integer.MAX_VALUE;
        int answerHeight=0;
        for(int height=maxHeight;height>=minHeight;height--){
            int time=0;
            int bag=B;
            for(Map.Entry<Integer,Integer> entry : map.entrySet()){
                int h = entry.getKey();
                int hCount = entry.getValue();
                if(h>height){
                    time+= 2*(h-height)*hCount;
                    bag+=(h-height)*hCount;
                }
                else if(h<height){
                    time+= (height-h)*hCount;
                    bag-=(height-h)*hCount;
                }
            }
            if(bag<0) continue;
            if(time<answerTime) {
                answerTime=time;
                answerHeight=height;
            }
        }
        sb.append(answerTime).append(" ").append(answerHeight);
        System.out.println(sb);
    }
}