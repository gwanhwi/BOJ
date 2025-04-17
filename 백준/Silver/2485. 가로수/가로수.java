import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        for(int i=0;i<N;i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        List<Integer> distance = new ArrayList<>();
        for(int i=1;i<N;i++){
            distance.add(arr[i]-arr[i-1]);
        }
        int termDistance=GCD(distance.get(0), distance.get(1));
        for(int i=2;i<distance.size();i++){
            termDistance = GCD(termDistance,distance.get(i));
        }
        int answer = (arr[N-1]-arr[0])/termDistance +1 - arr.length;
        System.out.println(answer);
    }
    public static int GCD(int a, int b) {
        if(a%b ==0) return b;
        return GCD(b,a%b);
    }
}