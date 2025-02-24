import java.io.*;
import java.util.*;
public class Main {
    static int[][] bingo;
    static boolean[][] checked;
    static int bingoCount;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        bingo = new int[5][5];
        checked=new boolean[5][5];
        for(int i=0;i<5;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0;j<5;j++){
                bingo[i][j]=Integer.parseInt(st.nextToken());
            }
        }
        int count=0;
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<5;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0;j<5;j++){
                q.offer(Integer.parseInt(st.nextToken()));
            }
        }
        while(!q.isEmpty()){
            bingoCount=0;
            int num = q.poll();
            count++;
            checkBingo(num);
            if(bingoCount>=3){
                break;
            }
        }
        System.out.println(count);
    }
    public static void checkBingo(int n){
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                if(bingo[i][j]==n){
                    checked[i][j]=true;
                    break;
                }
            }
        }
        for(int i=0;i<5;i++){
            boolean isBingo=true;
            for(int j=0;j<5;j++){
                if(checked[i][j]==false){
                    isBingo=false;
                }
            }
            if(isBingo==true) bingoCount++;
            isBingo=true;
            for(int j=0;j<5;j++){
                if(checked[j][i]==false){
                    isBingo=false;
                }
            }
            if(isBingo==true) bingoCount++;
        }
        boolean isBingo=true;
        for(int i=0;i<5;i++){
            if(checked[i][i]==false){
                isBingo=false;
            }
        }
        if(isBingo==true) bingoCount++;
        isBingo=true;
        for(int i=0;i<5;i++){
            if(checked[4-i][i]==false){
                isBingo=false;
            }
        }
        if(isBingo==true) bingoCount++;
    }
}