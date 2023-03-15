import java.io.*;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1=new StringTokenizer(br.readLine());
        StringTokenizer st2=new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st1.nextToken());
        int m=Integer.parseInt(st1.nextToken());
        ArrayList<Integer> list=new ArrayList<>();
        int len=st2.countTokens();
        for(int i=0;i<len;i++){
            list.add(Integer.parseInt(st2.nextToken()));
        }
        int ans=0;
        for(int i=0;i<list.size()-2;i++){
            for(int j=i+1;j<list.size()-1;j++){
                for(int k=j+1;k<list.size();k++){
                    if(m>=list.get(i)+list.get(j)+list.get(k)
                    && list.get(i)+list.get(j)+list.get(k)>ans)
                        ans=list.get(i)+list.get(j)+list.get(k);
                }
            }
        }
        System.out.println(ans);
    }
}