import java.io.*;
import java.util.*;
import java.lang.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N=Integer.parseInt(st.nextToken());
        int M=Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());//0:북, 1:동, 2:남, 3:서
        int[][] arr = new int[N][M];
        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<M;j++){
                arr[i][j]=Integer.parseInt(st.nextToken());
            }
        }
        int[][] move ={{1,-1,0,0},{0,0,1,-1}};
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[] {r,c});
        int count=0;
        while(!queue.isEmpty()){
            int[] now = queue.poll();
            int nowRow=now[0];
            int nowCol=now[1];
            if(arr[nowRow][nowCol]==0) count++;
            arr[nowRow][nowCol]=3; //3은 청소된 방

            boolean hasDirtyRoom=false;
            int nextRow=-1;
            int nextCol=-1;
            for(int i=0;i<4;i++){
                nextRow=nowRow+move[0][i];
                nextCol=nowCol+move[1][i];
                if(nextRow<0 || nextRow>=N || nextCol<0 || nextCol>=M || arr[nextRow][nextCol]==1)continue;
                if(arr[nextRow][nextCol]==0){ //빈 칸이 있는 경우
                    hasDirtyRoom=true;
                }
            }
            if(hasDirtyRoom){ // 빈 칸이 있는 경우
                do {
                    d = (d + 3) % 4;
                    switch (d) {
                        case 0:
                            nextRow = nowRow - 1;
                            nextCol = nowCol;
                            break;
                        case 1:
                            nextRow = nowRow;
                            nextCol = nowCol + 1;
                            break;
                        case 2:
                            nextRow = nowRow + 1;
                            nextCol = nowCol;
                            break;
                        case 3:
                            nextRow = nowRow;
                            nextCol = nowCol - 1;
                            break;
                    }
                } while (arr[nextRow][nextCol]!=0);
            }
            else {// 빈 칸이 없는 경우
                switch (d){
                    case 0:
                        nextRow=nowRow+1;
                        nextCol=nowCol;
                        break;
                    case 1:
                        nextRow=nowRow;
                        nextCol=nowCol-1;
                        break;
                    case 2:
                        nextRow=nowRow-1;
                        nextCol=nowCol;
                        break;
                    case 3:
                        nextRow=nowRow;
                        nextCol=nowCol+1;
                        break;
                }
            }

            if(nextRow<0 || nextRow>=N || nextCol<0 || nextCol>=M || arr[nextRow][nextCol]==1){
                break;
            }
            else{
                queue.offer(new int[] {nextRow, nextCol});
            }
        }
        System.out.println(count);
    }
}
