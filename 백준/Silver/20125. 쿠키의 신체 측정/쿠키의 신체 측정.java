import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        char[][] board = new char[N][N];
        for (int i = 0; i < N; i++) {
            board[i] = br.readLine().toCharArray();
        }

        int heartX = -1, heartY = -1;
        for (int i = 1; i < N - 1; i++) {
            for (int j = 1; j < N - 1; j++) {
                if (board[i][j] == '*'
                    && board[i-1][j] == '*'
                    && board[i+1][j] == '*'
                    && board[i][j-1] == '*'
                    && board[i][j+1] == '*') {
                    heartX = i;
                    heartY = j;
                    break;
                }
            }
            if (heartX != -1) break;
        }

        int leftArm = 0;
        for (int y = heartY - 1; y >= 0 && board[heartX][y] == '*'; y--) leftArm++;

        int rightArm = 0;
        for (int y = heartY + 1; y < N && board[heartX][y] == '*'; y++) rightArm++;

        int waist = 0;
        int waistEndX = heartX;
        for (int x = heartX + 1; x < N && board[x][heartY] == '*'; x++) {
            waist++;
            waistEndX = x;
        }

        int leftLeg = 0;
        for (int x = waistEndX + 1; x < N && heartY - 1 >= 0 && board[x][heartY - 1] == '*'; x++) {
            leftLeg++;
        }

        int rightLeg = 0;
        for (int x = waistEndX + 1; x < N && heartY + 1 < N && board[x][heartY + 1] == '*'; x++) {
            rightLeg++;
        }

        System.out.println((heartX + 1) + " " + (heartY + 1));
        System.out.println(leftArm + " " + rightArm + " " + waist + " " + leftLeg + " " + rightLeg);
    }
}
