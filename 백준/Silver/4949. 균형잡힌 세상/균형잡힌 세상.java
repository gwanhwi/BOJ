import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //int n=Integer.parseInt(br.readLine());
        //StringTokenizer st=new StringTokenizer(br.readLine());
        String str = "";
        Stack<Character> stack = new Stack<>();
        while ((str = br.readLine()) != null) {
            if(str.charAt(0)=='.')
                break;
            //StringBuilder sb = new StringBuilder();
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == '(' || str.charAt(i) == '[')
                    stack.push(str.charAt(i));
                if(str.charAt(i) == ')'){
                    if(stack.empty() || stack.peek()!='(')
                               stack.push('n');
                    else stack.pop();
                }
                if(str.charAt(i) == ']'){
                    if(stack.empty() || stack.peek()!='[')
                        stack.push('n');
                    else stack.pop();
                }
            }
            if (str.charAt(str.length() - 1) != '.')
                continue;

            if (stack.isEmpty())
                System.out.println("yes");
            else System.out.println("no");
            //System.out.println(sb);
            stack.clear();
        }
    }
}
