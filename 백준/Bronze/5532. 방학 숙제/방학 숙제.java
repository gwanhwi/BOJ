import java.io.*;
import java.util.*;

class Main {
    static List<Long> list = new ArrayList<>();
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int L = Integer.parseInt(br.readLine());
        int A = Integer.parseInt(br.readLine());
        int B= Integer.parseInt(br.readLine());
        int C= Integer.parseInt(br.readLine());
        int D= Integer.parseInt(br.readLine());
        int answer = L- Math.max((int)Math.ceil(B*1.0/D),(int)Math.ceil(A*1.0/C));
        System.out.println(answer);
    }
}