import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        Set<Character> set = new HashSet<>();
        for(int i=0;i<N;i++){
            String str = br.readLine();
            boolean hasKey=false;
            String[] strSplitSpace = str.split(" ");
            for(int j=0;j<strSplitSpace.length;j++){
                if(!set.contains(Character.toLowerCase(strSplitSpace[j].charAt(0)))){
                    set.add(Character.toLowerCase(strSplitSpace[j].charAt(0)));
                    hasKey=true;
                    for(int k=0;k<j;k++) sb.append(strSplitSpace[k]).append(" ");
                    sb.append("[").append(strSplitSpace[j].charAt(0)).append("]").append(strSplitSpace[j].substring(1,strSplitSpace[j].length())).append(" ");
                    for(int k=j+1;k<strSplitSpace.length;k++) sb.append(strSplitSpace[k]).append(" ");
                    sb.append("\n");
                    break;
                }
            }
            if(hasKey) continue;
            for(int j=0;j<str.length();j++){
                if(str.charAt(j)==' ') continue;
                if(!set.contains(Character.toLowerCase(str.charAt(j)))){
                    set.add(Character.toLowerCase(str.charAt(j)));
                    hasKey=true;
                    sb.append(str.substring(0,j)).append("[").append(str.charAt(j)).append("]").append(str.substring(j+1,str.length())).append("\n");
                    break;
                }
            }
            if(!hasKey) sb.append(str).append("\n");
        }
        System.out.println(sb);
    }
}