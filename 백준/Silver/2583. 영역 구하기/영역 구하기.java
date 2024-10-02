import java.io.*;
import java.util.*;
import java.lang.*;

public class Main {
    static boolean[][] arr;
    static int M;
    static int N;
    static int[] xmove = {0, 0, -1, 1};
    static int[] ymove = {-1, 1, 0, 0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int count = 0;
        LinkedList<Integer> answer = new LinkedList<>();
        arr = new boolean[M][N];
        for (int i = 0; i < K; i++) {
            st = new StringTokenizer(br.readLine());
            int lx = Integer.parseInt(st.nextToken());
            int ly = Integer.parseInt(st.nextToken());
            int rx = Integer.parseInt(st.nextToken());
            int ry = Integer.parseInt(st.nextToken());
            for (int j = ly; j < ry; j++) {
                for (int k = lx; k < rx; k++) {
                    arr[j][k] = true;
                }
            }
        }
        for (int j = 0; j < M; j++) {
            for (int k = 0; k < N; k++) {
                if (!arr[j][k]) {
                    answer.add(bfs(j, k));
                    count++;
                }
            }
        }
        Collections.sort(answer);
        System.out.println(count);
        for (int i = 0; i < answer.size(); i++) {
            System.out.print(answer.get(i) + " ");
        }
    }

    public static int bfs(int row, int col) {
        int count = 0;
        Queue<int[]> que = new LinkedList<>();
        que.add(new int[]{row, col});
        while (!que.isEmpty()) {
            int[] pos = que.poll();
            int y = pos[0];
            int x = pos[1];
            if(arr[y][x])continue;
            arr[y][x] = true;
            count++;
            for (int i = 0; i < 4; i++) {
                int nextY = y + ymove[i];
                int nextX = x + xmove[i];
                if (nextY >= 0 && nextY < M && nextX >= 0 && nextX < N && !arr[nextY][nextX]) {
                    que.add(new int[]{nextY, nextX});
                }
            }
        }
        return count;
    }
}