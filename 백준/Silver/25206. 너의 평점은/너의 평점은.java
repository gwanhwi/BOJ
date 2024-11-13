import java.io.*;
import java.lang.reflect.Array;
import java.util.*;
import java.lang.*;
public class Main {
    static int[][] move = {{0,0,-1,1},{1,-1,0,0}};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        //StringTokenizer st = new StringTokenizer(br.readLine());
        //int N = Integer.parseInt(br.readLine());
        HashMap<String, Double> map = new HashMap<>();
        map.put("A+",4.5);
        map.put("A0",4.0);
        map.put("B+",3.5);
        map.put("B0",3.0);
        map.put("C+",2.5);
        map.put("C0",2.0);
        map.put("D+",1.5);
        map.put("D0",1.0);
        map.put("F",0.0);
        double sum=0.0;
        int creditCount=0;
        for(int i=0;i<20;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            st.nextToken();
            double credit=Double.parseDouble(st.nextToken());
            String grade = st.nextToken();
            if(grade.equals("P")) continue;
            sum+=credit * map.get(grade);
            creditCount+=credit;
        }
        System.out.println(sum/creditCount);
    }
}
