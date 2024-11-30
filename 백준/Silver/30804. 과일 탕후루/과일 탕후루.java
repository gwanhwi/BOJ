import java.io.*;
import java.util.*;

class Main {
    static int N;
    static int[] S;
    static Set<Integer> set;
    static Map<Integer,Integer> map;
    static int max=0;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        S= new int[N];
        set = new HashSet<>();
        map = new HashMap<>();
        for(int i=0;i<N;i++){
            int fruit = Integer.parseInt(st.nextToken());
            S[i]=fruit;
        }
        removeFruit();
        System.out.println(max);
    }
    public static void removeFruit(){
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<N;i++){
            map.put(S[i], map.getOrDefault(S[i],0)+1);
            q.offer(S[i]);
            set.add(S[i]);
            while(set.size()>2){
                int removeFruit=q.poll();
                map.put(removeFruit,map.get(removeFruit)-1);
                if(map.get(removeFruit)==0) set.remove(removeFruit);
            }
            max=Math.max(max,q.size());
        }
    }
}