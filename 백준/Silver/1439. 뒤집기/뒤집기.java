import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String S = br.readLine();
        List<Integer> list = new ArrayList<>();
        int num = S.charAt(0)-'0';
        list.add(num);

        for(int i=1;i<S.length();i++){
            int n = S.charAt(i)-'0';
            if(n == num) continue;
            else{
                num=n;
                list.add(n);
            }
        }
        int oneToZeroCount=0;
        int zeroToOneCount=0;
        for(int i=0;i<list.size();i++){
            if(list.get(i)==0){
                zeroToOneCount++;
            }
            if(list.get(i)==1){
                oneToZeroCount++;
            }
        }
        System.out.println(Math.min(zeroToOneCount,oneToZeroCount));
    }
}