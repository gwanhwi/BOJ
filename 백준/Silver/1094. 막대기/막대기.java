import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int X = Integer.parseInt(br.readLine());
        int sum=64;
        int minLen=64;
        int count=1;
        while(sum!=X){
            minLen=minLen/2;
            if(sum-minLen>=X)sum-=minLen;
            else count++;
        }
        System.out.println(count);
    }
}
