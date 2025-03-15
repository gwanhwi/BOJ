import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<N;i++){
            list.add(Integer.parseInt(br.readLine()));
        }
        Collections.sort(list, Collections.reverseOrder());
        long sum =0;
        for(int i=0;i<list.size();i++){
            if(list.get(i)-i >=0){
                sum+=list.get(i)-i;
            }
            else {
                break;
            }
        }
        System.out.println(sum);
    }
}