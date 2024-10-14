import java.io.*;
import java.lang.reflect.Array;
import java.util.*;
import java.lang.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        String str = br.readLine();
        String answer = "";
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '*' || str.charAt(i) == '/') {
                while(!stack.isEmpty() && (stack.peek()=='*' || stack.peek()=='/' )){
                    answer+=stack.pop();
                }
                stack.push(str.charAt(i));
            }
            else if (str.charAt(i) == '-' || str.charAt(i) == '+') {
                while(!stack.isEmpty() && (stack.peek()=='*' || stack.peek()=='/' || stack.peek()=='-' || stack.peek()=='+')){
                    answer+=stack.pop();
                }
                stack.push(str.charAt(i));
            }
            else if (str.charAt(i) == '(') {
                stack.push(str.charAt(i));
            }
            else if (str.charAt(i) == ')') {
                while (stack.peek() != '(')
                    answer += stack.pop();
                stack.pop();
            }
            else {
                answer += str.charAt(i);
            }
        }
        while (!stack.isEmpty()) answer += stack.pop();
        System.out.println(answer);

    }

}