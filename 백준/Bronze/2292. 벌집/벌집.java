import java.io.*;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static int func(int num,int count, int beforeCut){
        int cutline=beforeCut+ count *6;
        if(cutline>=num)
            return count;
        else
            return func(num,count+1,cutline);

    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int ans = func(N,0,1);
        System.out.println(ans+1);
    }
}