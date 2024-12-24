import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        List<Integer> list = new ArrayList<>();
        list.add(A);
        list.add(B);
        int count=1;
        while(count<N){
            Collections.sort(list);
            if(list.get(0)%2==1 && list.get(1)==(list.get(0)+1)){
                break;
            }
            list.add((int)Math.ceil((double)list.get(0)/2));
            list.add((int)Math.ceil((double)list.get(1)/2));
            list.remove(0);
            list.remove(0);

            count++;
        }
        System.out.println(count);
    }
}