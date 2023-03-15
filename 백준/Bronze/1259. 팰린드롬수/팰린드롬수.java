import java.io.*;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String answer="";
        while(true){
            answer="yes";
            String str=br.readLine();
            int len = str.length();
            if(str.equals("0"))
                break;
            for(int i=0; i<len/2;i++){
                if(str.charAt(i) != str.charAt(len-i-1))
                    answer="no";
            }
            System.out.println(answer);
        }

    }
}