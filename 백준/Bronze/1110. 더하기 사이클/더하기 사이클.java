import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int cycle=0;
        int nextN = N;
        while(true) {
            cycle++;
            if(nextN<0) nextN*=10;
            int leftNum = nextN/10;
            int rightNum = nextN%10;
            int sum = leftNum + rightNum;
            int sumRightNum = sum%10;
            nextN = rightNum*10 + sumRightNum;
            if(nextN == N) break;
        }
        System.out.println(cycle);
    }
}