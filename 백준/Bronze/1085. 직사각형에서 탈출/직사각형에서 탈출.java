import java.io.*;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x= Integer.parseInt(st.nextToken());
        int y=Integer.parseInt(st.nextToken());
        int w=Integer.parseInt(st.nextToken());
        int h=Integer.parseInt(st.nextToken());
        int answer=x;

            if(w-x < answer)
                answer=w-x;
            if(y<answer)
                answer=y;
            if(h-y < answer)
                answer=h-y;
        System.out.println(answer);
    }
}