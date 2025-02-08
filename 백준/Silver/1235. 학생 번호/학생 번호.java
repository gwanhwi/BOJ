import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        String[] number = new String[N];
        for(int i=0;i<N;i++){
            number[i]=br.readLine();
        }
        int strLen=number[0].length();
        int answer=0;
        for(int i=strLen-1;i>=0;i--){
            HashMap<String, Integer> map = new HashMap<>();
            boolean isClear=true;
            for(int j=0;j<N;j++){
                String str = number[j].substring(i,strLen);
                if(map.containsKey(str)){
                    isClear=false;
                    break;
                }
                map.put(str,1);
            }
            if(isClear){
                answer=strLen-i;
                break;
            }
        }
        System.out.println(answer);
    }
}