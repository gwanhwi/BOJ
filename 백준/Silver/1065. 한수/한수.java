import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int count=0;
        for(int i=1;i<=N;i++){
            String str = Integer.toString(i);
            if(str.length()==1){
                count++;
                continue;
            }
            boolean isHansoo=true;
            int num1 =str.charAt(0)-'0';
            int num2 =str.charAt(1)-'0';
            int between = num2-num1;
            for(int j=1;j<str.length()-1;j++){
                num1 =str.charAt(j)-'0';
                num2 =str.charAt(j+1)-'0';
                if(num2-num1 == between){
                    continue;
                }
                else{
                    isHansoo=false;
                }
            }
            if(isHansoo) count++;
        }
        System.out.println(count);
    }
}