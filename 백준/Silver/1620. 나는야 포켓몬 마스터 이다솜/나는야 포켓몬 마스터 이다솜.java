import java.io.*;
import java.lang.reflect.Array;
import java.util.*;
import java.lang.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        String[] book = new String[N];
        HashMap<String,Integer> map=new HashMap<>();
        for(int i=0;i<N;i++){
            book[i]=br.readLine();
            map.put(book[i],i+1);
        }
        for(int i=0;i<M;i++){
            String question=br.readLine();
            String answer="";
            boolean isdigit=true;
            for(int j=0;j<question.length();j++){
                if(!Character.isDigit(question.charAt(j))){
                    isdigit=false;
                }
            }
            if(isdigit) answer=book[Integer.parseInt(question)-1];
            else answer=map.get(question).toString();
            System.out.println(answer);
        }

    }
}