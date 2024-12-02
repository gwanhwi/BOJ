import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int M = Integer.parseInt(br.readLine());
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<M;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            String operation =  st.nextToken();

            int x = -1;
            if(st.hasMoreTokens()) x=Integer.parseInt(st.nextToken());
            if(operation.equals("add")) set.add(x);
            else if(operation.equals("remove")) {
                if(set.contains(x)) set.remove(x);
            }
            else if(operation.equals("check")) {
                if(set.contains(x)) sb.append(1).append("\n");
                else sb.append(0).append("\n");
            }
            else if(operation.equals("toggle")) {
                if(set.contains(x)) set.remove(x);
                else set.add(x);
            }
            else if(operation.equals("all")) {
                set.clear();
                for(int j=1;j<=20;j++) set.add(j);
            }
            else if(operation.equals("empty")) set.clear();
        }
        System.out.println(sb);
    }
}