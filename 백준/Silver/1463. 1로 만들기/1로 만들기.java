import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr=new int[1000001];
        arr[1]=0;
        arr[2]=1;
        arr[3]=1;
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=4;i<=1000000;i++){
            if(i%3==0){
                list.add(arr[i/3]+1);
            }
            if(i%2==0){
                list.add(arr[i/2]+1);
            }
            list.add(arr[i-1]+1);
            arr[i]=Collections.min(list);
            list.clear();
        }
        System.out.println(arr[n]);
    }
}