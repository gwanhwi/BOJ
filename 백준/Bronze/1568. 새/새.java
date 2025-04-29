import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int time=0;
        int count=1;
        while (N>0) {
            if(N<count) count=1;
            N-=count;
            count++;
            time++;
        }
        System.out.println(time);
    }
}