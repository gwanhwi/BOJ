import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] s = br.readLine().toCharArray();
        int n = s.length;
        char[] t = s.clone();
        Arrays.sort(t);
        String ans = "0";
        do {
            String cur = new String(s);
            String next = new String(t);
            if (next.compareTo(cur) > 0) {
                ans = next;
                break;
            }
        } while (nextPermutation(t));
        System.out.println(ans);
    }

    private static boolean nextPermutation(char[] a) {
        int i = a.length - 1;
        while (i > 0 && a[i-1] >= a[i]) i--;
        if (i == 0) return false;
        int j = a.length - 1;
        while (a[i-1] >= a[j]) j--;
        swap(a, i-1, j);
        j = a.length - 1;
        while (i < j) swap(a, i++, j--);
        return true;
    }

    private static void swap(char[] a, int i, int j) {
        char tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }
}
