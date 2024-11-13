import javax.swing.*;
import java.io.*;
import java.lang.reflect.Array;
import java.util.*;
import java.lang.*;
public class Main {
    static int[][] move = {{0,0,-1,1},{1,-1,0,0}};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        //StringTokenizer st = new StringTokenizer(br.readLine());
        String str = br.readLine();
        HashMap<Character, Integer> map= new HashMap<>();
        for(char c : str.toCharArray()){
            map.put(c, map.getOrDefault(c,0)+1);
        }
        char[] charArr= str.toCharArray();
        Arrays.sort(charArr);

        boolean hasMidValue=false;
        boolean isImpossible=false;
        char midValue=0;
        for(char c : charArr){
            if(map.get(c)%2==1) {
                if(!hasMidValue) {
                    hasMidValue=true;
                    midValue=c;
                    for(int i=0;i<(map.get(c)-1)/2;i++){
                        sb.append(c);
                    }
                }
                else if(midValue==c){
                    continue;
                }
                else {
                    isImpossible=true;
                    break;
                }
            }
            else{
                if(map.get(c)>=2){
                    sb.append(c);
                    map.put(c,map.get(c)-2);
                }
            }
        }

        StringBuilder answer = new StringBuilder();
        if(hasMidValue) answer.append(sb).append(midValue).append(sb.reverse());
        else answer.append(sb).append(sb.reverse());
        if(isImpossible) System.out.println("I'm Sorry Hansoo");
        else System.out.println(answer);
    }
}
