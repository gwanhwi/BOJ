import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int count=0;
        for(int i=0;i<N;i++){
            String str=br.readLine();
            Stack<Character> stack = new Stack<>();
            for(int j=0;j<str.length();j++){
                char c = str.charAt(j);
                if(!stack.isEmpty() && stack.peek() ==c){
                    stack.pop();
                }
                else{
                    stack.push(c);
                }
            }
            if(stack.isEmpty()) count++;
        }
        System.out.println(count);
    }
}