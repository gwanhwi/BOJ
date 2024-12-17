import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());
        int S = A*B*C;
        int[] arr = new int[10];
        String toStr = Integer.toString(S);
        for(int i=0;i<toStr.length();i++){
            int num = Integer.parseInt(Character.toString(toStr.charAt(i)));
            arr[num]++;
        }
        for(int i=0;i<10;i++){
            sb.append(arr[i]).append("\n");
        }
        System.out.println(sb);
    }
}
