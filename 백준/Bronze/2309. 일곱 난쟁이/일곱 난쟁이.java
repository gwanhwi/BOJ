import java.io.*;
import java.util.*;

public class Main {
    static int[] arr;
    static boolean[] checked;
    static List<Integer> answer;
    static boolean hasAnswer=false;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        arr = new int[9];
        checked = new boolean[9];
        answer=new ArrayList<>();
        for(int i=0;i<9;i++){
            arr[i]=Integer.parseInt(br.readLine());
        }
        comb(0,0);
        Collections.sort(answer);
        for(int i=0;i<answer.size();i++) sb.append(answer.get(i)).append("\n");
        System.out.println(sb);
    }
    public static void comb(int r, int sum){
        if(hasAnswer) return;
        if(r==7){
            if(sum==100) {
                for(int i=0;i<9;i++){
                    if(checked[i])answer.add(arr[i]);
                }
                hasAnswer=true;
            }
            return;
        }
        for(int i=0;i<9;i++){
            if(checked[i]) continue;
            checked[i]=true;
            comb(r+1, sum+arr[i]);
            checked[i]=false;
        }
    }
}