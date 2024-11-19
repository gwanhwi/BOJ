import java.io.*;
import java.util.*;
import java.lang.*;
public class Main {
    static boolean[] isStartTeam;
    static List<Integer> startTeamList;
    static List<Integer> linkTeamList;
    static int minValue=Integer.MAX_VALUE;
    static int[][] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        //StringBuilder sb = new StringBuilder();
        //StringTokenizer st = new StringTokenizer(br.readLine());
        int N=Integer.parseInt(br.readLine());
        arr =new int[N][N];
        isStartTeam=new boolean[N];

        for(int i=0;i<N;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0;j<N;j++){
                arr[i][j]=Integer.parseInt(st.nextToken());
            }
        }
        combination(N,N/2,0);
        System.out.println(minValue);
    }
    public static void combination(int n,int r,int start){
        if(r==0){
            int startTeamStat=0;
            int linkTeamStat=0;
            startTeamList=new ArrayList<>();
            linkTeamList=new ArrayList<>();
            for(int i=0;i<n;i++) {
                if (isStartTeam[i]) startTeamList.add(i);
                else linkTeamList.add(i);
            }
            for(int i=0;i<n/2 -1;i++){
                for(int j=i+1;j<n/2;j++){
                    int a = startTeamList.get(i);
                    int b = startTeamList.get(j);
                    startTeamStat+=arr[a][b]+arr[b][a];
                    a = linkTeamList.get(i);
                    b = linkTeamList.get(j);
                    linkTeamStat+=arr[a][b]+arr[b][a];
                }
            }
            minValue=Math.min(minValue,Math.abs(startTeamStat-linkTeamStat));
        }
        for(int i=start;i<n;i++){
            isStartTeam[i]=true;
            combination(n,r-1,i+1);
            isStartTeam[i]=false;
        }
    }
}
