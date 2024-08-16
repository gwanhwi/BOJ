import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        HashMap<String,Integer> map = new HashMap<>();
        int count=0;
        ArrayList<String> answer = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            map.put(br.readLine(),0);
        }
        for (int i = 0; i < m; i++) {
            String str = br.readLine();
            if(map.containsKey(str)){
                answer.add(str);
                count++;
            }
        }
        Collections.sort(answer);
        bw.write(Integer.toString(count));
        bw.newLine();
        for(int i=0;i<answer.size();i++){
            bw.write(answer.get(i));
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}