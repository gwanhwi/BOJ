import java.io.*;
import java.util.*;

public class Main {
    static final char[] ORDER = {'A','C','G','T'};
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        String[] dna = new String[N];
        for (int i = 0; i < N; i++) dna[i] = br.readLine().trim();

        StringBuilder consensus = new StringBuilder();
        int distance = 0;

        for (int col = 0; col < M; col++) {
            int[] cnt = new int[4]; // A,C,G,T
            for (int row = 0; row < N; row++) {
                char c = dna[row].charAt(col);
                cnt[idx(c)]++;
            }

            int bestIdx = 0;
            for (int i = 1; i < 4; i++) {
                if (cnt[i] > cnt[bestIdx]) bestIdx = i;
            }
            char bestChar = ORDER[bestIdx];
            consensus.append(bestChar);

            distance += (N - cnt[bestIdx]);
        }

        System.out.println(consensus.toString());
        System.out.println(distance);
    }

    static int idx(char c) {
        switch (c) {
            case 'A': return 0;
            case 'C': return 1;
            case 'G': return 2;
            case 'T': return 3;
            default:  return -1;
        }
    }
}
