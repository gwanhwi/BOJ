import java.io.*;
import java.util.*;
public class Main {
    static int N;
    static int[] arr;
    static boolean[] checked;
    static int max=0;
    static List<Integer> list;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        N = Integer.parseInt(br.readLine());
        arr= new int[N];
        checked=new boolean[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        list = new ArrayList<>();
        getSum(0);
        System.out.println(max);
    }
    public static void getSum(int depth){
        if(N==depth){
            int sum=0;
            for(int i=0;i<list.size()-1;i++){
                int s = list.get(i) - list.get(i+1);
                if(s<0) s*= -1;
                sum+=s;
            }
            max=Math.max(max, sum);
            return;
        }
        for(int i=0;i<N;i++){
            if(checked[i])continue;
            list.add(arr[i]);
            checked[i]=true;
            getSum(depth+1);
            checked[i]=false;
            list.remove(list.size()-1);
        }
    }
}