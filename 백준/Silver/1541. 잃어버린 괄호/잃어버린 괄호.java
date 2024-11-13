import java.io.*;
import java.lang.reflect.Array;
import java.util.*;
import java.lang.*;
public class Main {
    static int[][] move = {{0,0,-1,1},{1,-1,0,0}};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        //StringTokenizer st = new StringTokenizer(br.readLine());
        //int N = Integer.parseInt(br.readLine());
        String str = br.readLine();
        String[] minusArr = str.split("-");
        int sum=0;
        for(int i=0;i<minusArr.length;i++){
            String[] plusArr = minusArr[i].split("\\+");
            for(String plus : plusArr){
                if(i==0) sum+= Integer.parseInt(plus);
                else sum-=Integer.parseInt(plus);
            }
        }
        System.out.println(sum);
    }
}
