import java.io.*;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int ans=0;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i= 0;i<N;i++){
            list.clear();
            int num=i;
            while(num>0){
                list.add(num%10);
                num/=10;
            }
            for(int j=0;j<list.size();j++){
                ans+=list.get(j);
            }
            ans+=i;
            if(ans==N) {
                ans=i;
                break;
            }
            ans=0;
        }
        System.out.println(ans);

    }
}