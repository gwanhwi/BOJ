import java.io.*;
import java.util.*;
class Main {
    static int[][] move = {{1,-1,0,0},{0,0,1,-1}};
    static int M;
    static int N;
    static int[][] arr;
    static boolean[][] visited;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        arr = new int[N][M];
        visited=new boolean[N][M];
        List<int[]> list = new ArrayList<>();
        boolean isAllTomatoDone=true;
        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<M;j++){
                arr[i][j]=Integer.parseInt(st.nextToken());
                if(arr[i][j]==1) list.add(new int[]{i,j});
                if(arr[i][j]==0) isAllTomatoDone=false;
            }//1: 익은 토마토, 0: 안익은 토마토, -1: 토마토 안 들어있음
        }

        if(isAllTomatoDone) System.out.println("0");
        else{
            int count = bfs(list);
            for(int i=0;i<N;i++){
                for(int j=0;j<M;j++){
                    if(arr[i][j]==0) {
                        System.out.println("-1");//모두 익지 못한상태
                        return;
                    }
                }
            }
            System.out.print(count);
        }
    }
    public static int bfs(List<int[]> list){
        int count=0;
        Queue<int[]> queue = new LinkedList<>();
        for(int[] pos : list){
            visited[pos[0]][pos[1]]=true;
            queue.offer(new int[] {pos[0],pos[1]});
        }
        while(!queue.isEmpty()){
            count++;
            int qSize = queue.size();
            for(int i=0;i<qSize;i++) {
                int[] now = queue.poll();
                int nowRow = now[0];
                int nowCol = now[1];
                for (int j = 0; j < 4; j++) {
                    int nextRow = nowRow + move[0][j];
                    int nextCol = nowCol + move[1][j];
                    if (nextRow < 0 || nextRow >= N || nextCol < 0 || nextCol >= M) continue;
                    if (arr[nextRow][nextCol] == -1 || visited[nextRow][nextCol]) continue;
                    visited[nextRow][nextCol] = true;
                    arr[nextRow][nextCol] = 1;
                    queue.offer(new int[]{nextRow, nextCol});
                }
            }
        }
        return count-1; // 처음 상태를 1일차로 계산한 것이 count값
    }
}