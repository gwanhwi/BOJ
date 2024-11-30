import java.io.*;
import java.util.*;

class Main {
    static int N;
    static int[] fruits;
    static Map<Integer,Integer> map;
    static int max=0;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        fruits= new int[N];
        map = new HashMap<>();
        for(int i=0;i<N;i++){
            fruits[i] = Integer.parseInt(st.nextToken());
        }
        removeFruit();
        System.out.println(max);
    }
    public static void removeFruit(){
        int left=0;
        for(int right=0;right<N;right++){
            map.put(fruits[right],map.getOrDefault(fruits[right],0)+1);
            while(map.size()>2){
                map.put(fruits[left],map.get(fruits[left])-1);
                if(map.get(fruits[left])==0) map.remove(fruits[left]);
                left++;
            }

            max= Math.max(max,right-left+1);
        }
    }
}