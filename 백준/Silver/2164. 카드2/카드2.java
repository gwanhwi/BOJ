import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        Queue<Integer> queue=new LinkedList<>();
        for(int i=0;i<n;i++){
            queue.offer(i+1);
        }
        while(queue.size()>1){
            queue.remove();
            queue.add(queue.remove());
        }
        System.out.println(queue.poll());
    }
}
