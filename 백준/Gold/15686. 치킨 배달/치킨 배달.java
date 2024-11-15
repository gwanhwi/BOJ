import java.io.*;
import java.util.*;
import java.lang.*;
public class Main {
    static int[][] city;
    static int chickenDistanceSum;
    static List<int[]> peoplePos;
    static List<int[]> chickenPos;
    static int N;
    static int M;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        //StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        city = new int[N][N];
        peoplePos = new ArrayList<>();
        chickenPos = new ArrayList<>();
        for(int i=0;i<N;i++){
            st=new StringTokenizer(br.readLine());
            for(int j=0;j<N;j++){
                city[i][j]=Integer.parseInt(st.nextToken());
                if(city[i][j]==1){
                    peoplePos.add((new int[] {i,j}));
                }
                else if(city[i][j]==2){
                    chickenPos.add((new int[] {i,j}));
                }
            }
        }
        chickenDistanceSum=Integer.MAX_VALUE;
        combination(M,0,0);
        System.out.println(chickenDistanceSum);
    }
    public static void combination(int c,int depth, int idx){
        if(c==depth){
            int sum=0;
            for(int i=0;i<peoplePos.size();i++){
                int tmp=Integer.MAX_VALUE;
                for(int k=0;k<chickenPos.size();k++){
                    if(city[chickenPos.get(k)[0]][chickenPos.get(k)[1]]==3){
                        tmp= Math.min(tmp,(Math.abs(peoplePos.get(i)[0]-chickenPos.get(k)[0]) + Math.abs(peoplePos.get(i)[1]-chickenPos.get(k)[1])));
                    }
                }
                sum+=tmp;
            }
            chickenDistanceSum=Math.min(chickenDistanceSum,sum);
            return;
        }
        for(int i=idx;i<chickenPos.size();i++){
            if(city[chickenPos.get(i)[0]][chickenPos.get(i)[1]]==3) continue;
            city[chickenPos.get(i)[0]][chickenPos.get(i)[1]]=3;
            combination(c,depth+1,i+1);
            city[chickenPos.get(i)[0]][chickenPos.get(i)[1]]=2;
        }
    }
}
