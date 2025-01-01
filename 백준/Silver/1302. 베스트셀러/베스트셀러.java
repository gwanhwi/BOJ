import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        HashMap<String,Integer> map = new HashMap<>();
        for(int i=0;i<N;i++){
            String str = br.readLine();
            map.put(str,map.getOrDefault(str,0)+1);
        }
        int maxValue=0;
        String answer="";
        for(Map.Entry<String,Integer> entry : map.entrySet()){
            String key = entry.getKey();
            int value = entry.getValue();
            if(value>maxValue){
                maxValue=value;
                answer=key;
            }
            if(value == maxValue){
                if(answer.compareTo(key)>0) answer=key;
            }
        }
        System.out.println(answer);
    }
}