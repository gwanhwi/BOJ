import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int ia = 0; ia < t; ia++) {
            StringBuilder sb = new StringBuilder();

            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());
            LinkedList<int[]> list = new LinkedList<>();
            for (int j = 0; j < n; j++) {
                list.add(new int[]{j, Integer.parseInt(st.nextToken())});
            }

            int count=0;

            while(!list.isEmpty()){
                for(int i=0;i<n;i++){
                    for(int j=1;j<n;j++){
                        if(list.peek()[1]<list.get(j)[1]){
                            list.add(list.pop());
                            break;
                        }
                    }
                }
                if(list.peek()[0] ==m)
                    break;
                list.pop();
                n--;
                count++;
            }
            count++;
            sb.append(count);
            System.out.println(sb);
        }
    }

}
