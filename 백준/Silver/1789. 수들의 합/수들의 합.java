import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        long S = Long.parseLong(br.readLine());
        int count=1;
        S-=count;
        while(count<S){
            count++;
            S-=count;
        }
        System.out.println(count);
    }
}