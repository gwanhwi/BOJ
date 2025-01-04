import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        Set<Integer> set = new HashSet<>();
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<a;i++) {
            set.add(Integer.parseInt(st.nextToken()));

        }
        st = new StringTokenizer(br.readLine());
        int intersectionCount=0;
        for(int i=0;i<b;i++){
            int n = Integer.parseInt(st.nextToken());
            if(set.contains(n)) intersectionCount++;
        }

        System.out.println(a+b-2*intersectionCount);
    }
}